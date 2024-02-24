package com.rating.service.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.service.entity.Rating;
import com.rating.service.repository.RatingRepository;
import com.rating.service.service.RatingService;
@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public  Rating createRating(Rating rating) {
		 String ratingID=UUID.randomUUID().toString();
		 rating.setRatingId(ratingID);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {

		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> findByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> findByHotalId(String hotalId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotalId(hotalId);
	}

//	@Override
//	public List<Rating> getRatingByUserId(String userID) {
//		
//		return ratingRepository.findByUserId(userID);
//	}
//
//	@Override
//	public List<Rating> getRatingByHotalId(String hotalId) {
//		
//		return ratingRepository.findByHotalId(hotalId);
//	}

}
