package com.rating.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rating.service.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating,String>{

	//custom
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotalId(String hotalId);
}
