package com.movieapi.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.movieapi.entity.Movie;

@Repository
public interface MovieDao extends CrudRepository<Movie, String> {

	Movie findById(int id);

	void deleteById(int id);

}
