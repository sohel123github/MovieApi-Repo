package com.movieapi.service;

import java.util.List;

import com.movieapi.entity.Movie;

public interface MovieService {
	
	public List<Movie> AllMovies();
	
	public Movie MovieById(int id);
	
	public void UpdateMovie(Movie movie, int id);
	
	public Movie AddMovie(Movie movie);
	
	public void DeleteMovie(int id);
	
	
	public static void main(String[] args) {
		
	}
}
