package com.demo.unsplash.infrastructure.rest.respository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.unsplash.domain.CollectionItemRepository;
import com.demo.unsplash.domain.entity.CollectionItem;

@FeignClient(name="service-unsplash",url = "https://api.unsplash.com")
public interface CollectionItemRestRepository extends CollectionItemRepository{

	@GetMapping("/collections")
	public List<CollectionItem> all(@RequestParam(value="client_id") String client_id);
	
	
}
