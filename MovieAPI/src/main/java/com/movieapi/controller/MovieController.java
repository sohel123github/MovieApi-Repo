package com.movieapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieapi.entity.Movie;
import com.movieapi.service.MovieServiceImpl;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	private MovieServiceImpl movieServiceImpl;
	
	@GetMapping("/movies")
	public List<Movie> getMovies(){
		return movieServiceImpl.AllMovies();
	}
	
	@GetMapping("/movie/{id}")
	public Movie getMovie(@PathVariable ("id") int id) {
		return movieServiceImpl.MovieById(id);
	}
	
	@PutMapping("/movie/{id}")
	public void updateMovie(@PathVariable ("id") int id, @RequestBody Movie movie) {
		this. movieServiceImpl.UpdateMovie(movie, id);
	}
	
	@PostMapping("/movie")
	public Movie addMovie(@RequestBody Movie m) {
		return this.movieServiceImpl.AddMovie(m);
	}
	
	@DeleteMapping("/movie/{id}")
	public void deleteMovie(@PathVariable ("id") int id) {
		 this.movieServiceImpl.DeleteMovie(id);
	}
	
	public static void main(String[] args) {
	
}
}
