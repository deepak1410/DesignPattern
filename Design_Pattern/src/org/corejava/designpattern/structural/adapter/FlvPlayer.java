package org.corejava.designpattern.structural.adapter;

public class FlvPlayer implements AdvanceMediaPlayer {

	@Override
	public void playMedia(String fileName) {
		System.out.println("Playing FLV Media: " + fileName);
	}

	
}
