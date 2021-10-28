package com.demo.unsplash.domain;

import java.util.List;

import com.demo.unsplash.domain.entity.CollectionItem;

public interface CollectionItemRepository {
	public List<CollectionItem> all(String filter);
}
