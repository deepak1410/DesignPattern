package org.corejava.designpattern.structural.adapter;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playMedia(String fileName) {
		System.out.println("Playing mp4 media: " + fileName);
		
	}

}
