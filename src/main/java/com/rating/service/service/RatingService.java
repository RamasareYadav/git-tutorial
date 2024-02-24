package com.rating.service.service;

import java.util.List;

import com.rating.service.entity.Rating;

public interface RatingService {
	
	Rating createRating(Rating rating);
	
	List<Rating> getAllRating();
	
    List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotalId(String hotalId);

}
