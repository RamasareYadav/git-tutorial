package com.rating.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.service.entity.Rating;
import com.rating.service.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	@Autowired
	private RatingService ratingService;

	@PostMapping("/ratingservice")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Rating>> getRatingAll() {
		return ResponseEntity.ok(ratingService.getAllRating());
	}

	@GetMapping("/getUserId/{userId}")
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable("userId") String userId) {
		return ResponseEntity.ok(ratingService.findByUserId(userId));
	}

	@GetMapping("/getByHotalId/{hotalId}")
	public ResponseEntity<List<Rating>> getBYHotalId(@PathVariable("hotalId") String hotalId) {
		return ResponseEntity.ok(ratingService.findByHotalId(hotalId));
	}
}
