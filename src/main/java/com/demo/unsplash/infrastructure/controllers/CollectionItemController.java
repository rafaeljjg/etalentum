package com.demo.unsplash.infrastructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.unsplash.domain.entity.CollectionItem;
import com.demo.unsplash.use_cases.GelAllCollectionItemUseCase;


@RestController
public class CollectionItemController {

	
	@Autowired
	private GelAllCollectionItemUseCase gelAllCollectionItemUseCase;
	
	@GetMapping("/collection/all")
	public List<CollectionItem> all(String filter){
		
		return gelAllCollectionItemUseCase.all(filter);
	}
	
}
