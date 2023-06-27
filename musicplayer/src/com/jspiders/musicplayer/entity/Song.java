package com.jspiders.musicplayer.entity;

public class Song {
private int id;
private String title;
private double duration;
private String Singer;

public String getTitle(){
	return title;

}

public void setTitle(String title) {
	this.title=title;
	System.out.println("title is changed sucesfully...!!!");
}
public double getDuration() {
	return duration;
}
public void setDuration(double duration) {
	this.duration= duration;
	System.out.println("duration is changed sucesfully...!!!");
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
	System.out.println("id is changed sucesfully...!!!");
}

public String getSinger() {
	return Singer;
}

public void setSinger(String moviename) {
	this.Singer = moviename;
	System.out.println("Movie name is changed sucesfully...!!!");
}
public Song(int id,String title,double duration,String Singer){
	this.id=id;
	this.title=title;
	this.duration=duration;
	this.Singer=Singer;
	
}
public Song(){
	
}

@Override
public String toString() {
	return (id+ ". " + title + " " + duration + " min - "+ Singer);
}


}
