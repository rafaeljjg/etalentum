package com.demo.unsplash.use_cases;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.demo.unsplash.domain.entity.CollectionItem;
import com.demo.unsplash.infrastructure.rest.respository.CollectionItemRestRepository;

@Service
public class GelAllCollectionItemUseCaseImpl implements GelAllCollectionItemUseCase{

	
	@Value("${unsplash.client_id}")
	private String unsplashClientId;
	
	@Autowired
	private CollectionItemRestRepository collectionItemRestRepository;
	
	@Override
	public List<CollectionItem> all(String _filter) {
	
		List<CollectionItem> list = collectionItemRestRepository.all(unsplashClientId);		
		
		return list.stream().filter(f->
			compareString(f.id, _filter)||		
			compareString(f.title, _filter)||
			compareString(f.description, _filter)||
			compareString(f.cover_photo.id, _filter)
				).collect(Collectors.toList());
	}

	
	private boolean compareString(String itemList, String filter) {
		itemList = (itemList==null)?"":itemList;
		filter = (filter==null)?"":filter;
		
		return itemList.contains(filter);
	}
	
}
