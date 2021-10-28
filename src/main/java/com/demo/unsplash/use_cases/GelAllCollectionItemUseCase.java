package com.demo.unsplash.use_cases;

import java.util.List;

import com.demo.unsplash.domain.entity.CollectionItem;

public interface GelAllCollectionItemUseCase {
	public List<CollectionItem> all(String filter);
}
