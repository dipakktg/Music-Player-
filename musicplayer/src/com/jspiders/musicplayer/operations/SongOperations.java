package com.jspiders.musicplayer.operations;
import java.util.Scanner;
import java.util.ArrayList;

import com.jspiders.musicplayer.entity.Song;
public class SongOperations {
	Scanner scanner =new Scanner(System.in);
	ArrayList<Song> playList=new ArrayList<Song>();
	int num;
	
	public void playAllSongs(){
		System.out.println(playList.get(0).getTitle()+" Is now playing");
}
	public void inbuiltSongs(){
		Song song1= new Song(1,"Intentions",2.33,"Justin Bieber");
		Song song2= new Song(2,"Stereo Hearts",3.44,"Adam Levine");
		playList.add(song1);
		playList.add(song2);
	}
	public void playRandomSongs(){
		num=  (int) (Math.random()*10);
		for(int i=num;i>playList.size()-1;) {
			i=(int) (Math.random()*10);
			num=i;
		}
			System.out.println(playList.get(num).getTitle()+" Is now playing");	
	}
		
	public void chooseSong(){
		viewAllSongs();
		System.out.println("Select the sr.no to play the song....!!");
		num=scanner.nextInt();
		System.out.println(playList.get(num).getTitle()+" Is now playing");
}
	public void addSongs(){
		System.out.println("Provide the name for the song");
		 String title=scanner.nextLine();
		int id= playList.size()+1;
		System.out.println("Provide the duration for the song");
		double duration=scanner.nextDouble();
		System.out.println("Provide the albumname for the song");
		String moviename=scanner.next();
		Song song= new Song(id,title,duration,moviename);
		System.out.println("Your Song has been Sucessfully added to Playlist");
		System.out.println(song);
		playList.add(song);
		
	}
	public void removeSongs() {
		viewAllSongs();
		System.out.println("Select the sr.no of the song you want to remove....!!");
		num=scanner.nextInt()-1;
		playList.remove(num);
		System.out.println("The song has been removed sucsessfully....!!!");
	}
	public void viewAllSongs(){
		for(Object song :playList) {
			System.out.println(song);
		}
	}
	public void editSong() {
		viewAllSongs();
		System.out.println("Select the sr.no of the song you want to edit....!!");
		num=scanner.nextInt()-1;
		System.out.println("!!!.....MENU.....!!!\n 1.Edit Song Srno \n 2.Edit Song Name\n 3.Edit Song Duration \n 4.Edit Song Artist");
		int option=scanner.nextInt();
		switch(option) {
		case 1:{
			System.out.println("enter new srno you want to provide...!!!");
			playList.get(num).setId(scanner.nextInt());
			System.out.println("Song Srno been changed sucessfully....!!!");
		}
		break;
		case 2:{
			System.out.println("enter new Song Name...!!!");
			playList.get(num).setTitle(scanner.nextLine());
			System.out.println("Song Name has been changed sucessfully....!!!");
		}
		break;
		case 3:{
			System.out.println("enter the Duration...!!!");
			playList.get(num).setDuration(scanner.nextDouble());
			System.out.println("Song Duration has been changed sucessfully....!!!");
		}
		break;
		case 4:{
			System.out.println("enter new Singer Name...!!!");
			playList.get(num).setSinger(scanner.nextLine());
			System.out.println("Song Singer Name has been changed sucessfully....!!!");
		}
		}
			
	}
}
