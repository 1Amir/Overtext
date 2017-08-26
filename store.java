import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class store extends Openworld implements ActionListener,KeyListener{
	public int cost; 
		JPanel row1 = new JPanel();
		JLabel item1 = new JLabel("health potion",JLabel.RIGHT);
		JTextField costfield = new JTextField("0.00");
		JPanel row2 = new JPanel();
	//this will buy the health potion
	private class AL2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(money < cost){
				JOptionPane.showMessageDialog(null, "sorry you do not have enough money to buy this item");
			}
			if(money == cost || money > cost){
				JOptionPane.showMessageDialog(null, "You have bought the item");
			}
		}
		
	}
	public store(){
		JFrame store = new JFrame();
		store.setSize(550, 400);
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
			
	}
	
}
