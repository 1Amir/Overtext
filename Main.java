import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Main extends Canvas implements ActionListener{
			
public static void main(String args[]) throws IOException{
	new Main();
}
public Main(){
 
		//JLabel
		JLabel label1 = new JLabel("Overtext",JLabel.CENTER);		
		//JButton
			JButton start = new JButton("Start");
			start.setBounds(550, 500, 500, 80);
			start.addActionListener(this);
			JButton options = new JButton("Options");
			options.setBounds(550,600,500,80);
			options.addActionListener(new Options1());
		//JFrame		
			JFrame myFrame = new JFrame("Overtext");
			myFrame.setSize(300,400);
			myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			myFrame.add(start);
			myFrame.add(options);
			myFrame.add(label1);
			myFrame.setVisible(true);
			myFrame.setBackground(Color.RED);
}
private class Options1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
				String wantmusic = "";
				JOptionPane.showMessageDialog(null, "these are options");
				wantmusic = JOptionPane.showInputDialog("Do you want music?");
				if (wantmusic.equals("Y")){
					Sounds sound = new Sounds();
					try {
						sound.playSound();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (wantmusic.equals("N")){
					JOptionPane.showMessageDialog(null,"Alright then");
				}
	}
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String name = "";
	name = JOptionPane.showInputDialog(null, "Hello What is your name?");

}

}
