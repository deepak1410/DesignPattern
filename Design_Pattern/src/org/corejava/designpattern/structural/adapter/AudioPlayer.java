package org.corejava.designpattern.structural.adapter;

public class AudioPlayer implements MediaPlayer{

	@Override
	public void play(String fileType, String fileName) {
		if("mp3".equalsIgnoreCase(fileType)) {
			System.out.println("Playing Mp3 file" + fileName + "with AudioPlayer");
		} else if("Mp4".equalsIgnoreCase(fileType) || "FLV".equalsIgnoreCase(fileType)) {
			System.out.println("Playing " + fileName + " using MediaAdapter");
			MediaAdapter mediaAdapter = new MediaAdapter();
			mediaAdapter.play(fileType, fileName);
		} else {
			System.out.println("Audio Player desn't support " + fileType + " format.");
		}
		
	}

}
