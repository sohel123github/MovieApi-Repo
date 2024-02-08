package com.movieapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movieapi.dao.MovieDao;
import com.movieapi.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieDao movieDao;
	
//	private static List<Movie> list = new ArrayList<>();
//	
//	static {
//		list.add(new Movie(1, "The Secrete Of Times", "Raj"));
//		list.add(new Movie(2, "Dangal", "Karan"));
//		list.add(new Movie(3, "Jawan", "Abhay"));
//	}
	
	
	@Override
	public List<Movie> AllMovies() {
		return (List<Movie>) movieDao.findAll();
	}
	
	@Override
	public Movie MovieById(int id) {
		return this.movieDao.findById(id);
	}
	
	@Override
	public void UpdateMovie(Movie movie, int id) {
		movie.setId(id);
		this.movieDao.save(movie);
	}
	
	@Override
	public Movie AddMovie(Movie movie) {
		Movie m = this.movieDao.save(movie);
		return m;
	}
	
	@Override
	public void DeleteMovie(int id) {
		this.movieDao.deleteById(id);
		}
	
	public static void main(String[] args) {
	
	


		
		
}
}
