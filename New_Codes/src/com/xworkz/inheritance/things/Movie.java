package com.xworkz.inheritance.things;

public class Movie {

	   public String title;
	   public int releaseYear;
	   public String director;
	   public String hero;
	   public String duration;
	   public String genres;
	   
	   public Movie() {
		   System.out.println("non argument constructor....\n");
	   }
	   public Movie(String title) {
		   this.title=title;
		}
	   public Movie(String title,int releaseYear) {
		   this(title);
		   this.releaseYear=releaseYear;
	   }
	   public Movie(String title,int releaseYear,String director) {
		   this(title,releaseYear);
		   this.director=director;
	   }
	   public Movie(String title,int releaseYear,String director,String hero) {
		   this(title,releaseYear,director);
		   this.hero=hero;
	   }
	   public Movie(String title ,int releaseYear,String director,String hero,String duration) {
		   this(title,releaseYear,director,hero);
		   this.duration=duration;
	   }
	   public Movie(String title ,int releaseYear,String director,String hero,String duration,String genres) {
		   this(title,releaseYear,director,hero,duration);
		   this.genres=genres;
	   }
	   
	   public void init(String title,int releaseYear,String director,String hero,String duration,String genres) {
		   this.title=title;
		   this.releaseYear=releaseYear;
		   this.director=director;
		   this.hero=hero;
		   this.duration=duration;
		   this.genres=genres;
	   }
	   
	   public void display() {
		   System.out.println("display method running........");
		   
		   System.out.println("movie title :"+this.title);
		   System.out.println("relesing Year :"+this.releaseYear);
		   System.out.println("Movie Director :"+this.director);
		   System.out.println("Movie Hero :"+this.hero);
		   System.out.println("Movie duration :"+this.duration);
		   System.out.println("genres :"+genres);
	   }
		   
   




}

