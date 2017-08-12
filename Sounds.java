import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Sounds {
	public void playSound() throws IOException 
	{

	    // get the sound file as a resource out of my jar file;
	    // the sound file must be in the same directory as this class file.
	    // the input stream portion of this recipe comes from a javaworld.com article.
	    InputStream inputStream = getClass().getResourceAsStream("My Hero Academia Opening 2 - Peace Sign 【English Dub Cover】Song by NateWantsToBattle.wav");
	    AudioStream audioStream = new AudioStream(inputStream);
	    AudioPlayer.player.start(audioStream);

	}
}
