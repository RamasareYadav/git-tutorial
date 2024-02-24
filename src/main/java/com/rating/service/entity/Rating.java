package com.rating.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="RATING")
public class Rating {
    
	@Id
	private String ratingId;
	private String userId;
	private String hotalId;
	private int rating;
	private String feedback; 
}
