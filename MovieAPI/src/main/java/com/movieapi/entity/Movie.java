package com.movieapi.entity;

public class Movie {
	
	private int id;
	private String title;
	private String director;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	

	public Movie(int id, String title, String director) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + "]";
	}

	public static void main(String[] args) {
		
	}
}
