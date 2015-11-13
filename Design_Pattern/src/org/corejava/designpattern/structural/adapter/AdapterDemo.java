package org.corejava.designpattern.structural.adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "club can't handle me.mp3");
		audioPlayer.play("flv", "saturday saturday.flv");
		audioPlayer.play("mp4", "just dance.mp4");
		audioPlayer.play("mov", "don't matter.mov");

	}

}
