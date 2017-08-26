import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Openworld extends JPanel implements ActionListener,KeyListener{
	private class AL implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	private static final Component g = null;
	Timer am = new Timer(5, this);
	Timer monsterencounter = new Timer(40,new AL());
	public int healthpotions = 0;
	public int mana = 100;
	public int jakehealth = 100;
	public int backpackspace = 100;
	public int packspacetooken = 0;
	public int chrishealth = 100;
	//H0-3ZF's health
	public int Audreyhealth = 1000000;
	public int money = 0;
	int x;
	int y;
	int velx;
	int velY;
	private Image backround;
	//dude that is running 
	private Image standard;
	private Image standing;
	private Image dude2;
	Image amir;
	//Openworld frame
	public void run()throws IOException{
		  Openworld control = new Openworld();
		  JFrame frame = new JFrame("Overtext.");
		  frame.setSize(10000,10000);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.getContentPane().add(control);
	      frame.setLocationByPlatform(true);
	      frame.setVisible(true);
	      new store();
		//  Sounds sound = new Sounds();
	
		//	try {
		//		sound.playSound();
		//	} catch (IOException e) {
		//		// TODO Auto-generated catch block
		//		e.printStackTrace();
		//	}
	}
	//contructer
	public Openworld(){
		am.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		repaint();
		x = x + velx;
		y = y + velY;
		System.out.print("x:");
		System.out.println(x);
		System.out.print("y:");
		System.out.println(y);
		if(backpackspace < packspacetooken){
			JOptionPane.showMessageDialog(null,"backpack is full");
			packspacetooken = packspacetooken - 1;
		}
		if(packspacetooken == backpackspace){
			JOptionPane.showMessageDialog(null, "Your backpack is now full");
		}

	}
	//Calling of the store:
	//store stores = new store();
	//stores.running(healthpotions, backpackspace, packspacetooken);
	
	
	
	//controlls of the program
	@Override
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		if(c == KeyEvent.VK_W){
			velY = -1;
			velx = 0;
			y = y - 1;
		}
		if(c == KeyEvent.VK_D){
			velx = 1;
			velY = 0;
			dude2 = standard;
			x = x + 1;
		}
		if(c == KeyEvent.VK_S){
			velx = 0;
			velY = 1;
			y = y + 1;
		}
		if(c == KeyEvent.VK_A){
			velx = -1;
			velY = 0;
			x = x - 1;
		}
		if(c == KeyEvent.VK_UP){
			velY = -1;
			velx = 0;
		}
		if(c == KeyEvent.VK_RIGHT){
			velx = 1;
			velY = 0;
		}
		if(c == KeyEvent.VK_DOWN){
			velx = 0;
			velY = 1;
		}
		if(c == KeyEvent.VK_LEFT){
			velx = -1;
			velY = 0;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		velY = 0;
		velx = 0;
		dude2 = standing;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
				x = x + velx;
				y = y + velY;
				repaint();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setOpaque(true);
        ImageIcon ii = new ImageIcon(this.getClass().getResource("backround.gif"));
	    backround = ii.getImage();
	    Graphics2D g2g = (Graphics2D)g;
	    g2g.drawImage(backround, 0, 0,this);  
	    ImageIcon iia = new ImageIcon(this.getClass().getResource("running.gif"));
	    standard = iia.getImage();
	    Graphics2D g2g2 = (Graphics2D)g;
	    ImageIcon iib = new ImageIcon(this.getClass().getResource("funny.gif"));
	    standing = iib.getImage();
	    Graphics2D g2g5 = (Graphics2D)g;
	    g2g.drawImage(dude2, x, y,this); 
	}

}

