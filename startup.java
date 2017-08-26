import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class startup extends Openworld implements ActionListener{
		int width = 1000;
		int height = 1000;
public static void main(String args[]) throws IOException{
	new	startup();
	//JButton
	JButton button1 = new JButton("start");
	
}
public startup() throws IOException{
	String start = "";
	//note to program when wyatt makes the intro program a JFrame for it and then do the whole would you like to start thing
	start = JOptionPane.showInputDialog("would you like to start");
	if(start.equals("yes")){
	     Openworld open = new Openworld();
		 open.run();
	
	}
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
}
}