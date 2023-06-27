package com.jspiders.musicplayer.main;
import java.util.Scanner;
import com.jspiders.musicplayer.operations.SongOperations;
public class MusicPlayer {
	Scanner s1=new Scanner(System.in);
	SongOperations operations=new SongOperations();
	int option;
public static void main(String[] args) {
	MusicPlayer m1=new MusicPlayer();
	int option =m1.menu();
	for(int i=option;i!=4;) {
		m1.menu();
	}
	
}
	
public int menu() {
	operations.inbuiltSongs();
	System.out.println("!!!.....MENU.....!!!\n 1.Play Song\n 2.Add/Remove Song\n 3.Edit Song \n 4.Exit");
	option=s1.nextInt();
	switch(option) {
	case 1:{
		System.out.println("!!!.....MENU.....!!!\n 1.Play All Song\n 2.Play Random Songs\n 3.Choose To Play \n 4.Go Back!!!");
		
		 option=s1.nextInt();
		switch(option) {
		case 1:{
			operations.playAllSongs();
		}
		break;
		case 2:{
			operations.playRandomSongs();
		}
		break;
		case 3:{
			operations.chooseSong();
		}
		break;
		case 4:{
			menu();
		}
		break;
		default:{
			System.out.println("Please provide the valid input!!!\n");
			menu();
		}
		}
		
	}
	break;
	case 2:{
		System.out.println("!!!.....MENU.....!!!\n 1.Add Songs\n 2.Remove Songs\n 3.Go Back!!!");
		
		 option=s1.nextInt();
		switch(option) {
		case 1:{
			operations.addSongs();
		}
		break;
		case 2:{
			operations.removeSongs();
		}
		break;
		case 3:{
			menu();
		}
		break;
		default:{
			System.out.println("Please provide the valid input!!!");
			menu();
		}
		}
		
	}
	break;
	case 3:{
		System.out.println("Select Songs to Edit");
		operations.editSong();	
	}
	break;
	case 4:{
		System.out.println("Thank you for using our service...!!!");
	}
	break;
	default:{
		System.out.println("Please provide the valid input!!!");
		menu();
	}
	
	
}
	return option;
}

}
		




