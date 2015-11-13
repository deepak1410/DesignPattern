package org.corejava.designpattern.structural.adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvanceMediaPlayer advanceMediaPlayer = null;
	
	public AdvanceMediaPlayer getMediaType(String fileType) {
		if(fileType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer = new Mp4Player();
		} else if(fileType.equalsIgnoreCase("flv")) {
			advanceMediaPlayer = new FlvPlayer();
		}
		return advanceMediaPlayer;
	}

	@Override
	public void play(String fileType, String fileName) {
		getMediaType(fileType);
		if(advanceMediaPlayer != null) {
			advanceMediaPlayer.playMedia(fileName);
		} else {
			System.out.println("Unsupportive file type: " + fileType);
		}
		
		
	}

}
