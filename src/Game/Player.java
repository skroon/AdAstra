package Game;

import java.awt.Color;
import java.awt.Graphics2D;

import Graphics.ImageManager;

public class Player extends MapObject {
	
	int r;
	
	private double speed;
	private double x, y;
	private boolean lt = false, rt = false;
	
	
	public Player(ImageManager im) {
		
		super(288.5, 750, im);
		
		sprite = im.playerSprites[0];
		
		speed = 3.5;
		r = 20;
		x = 288.5;
		y = 750;
		
	}

	/*public void draw(Graphics2D g) {
		
		g.setColor(new Color(255,255,255));
		g.fillOval((int)x, (int)y, r, r);
		g.setColor(new Color(100,100,100));
		g.fillOval((int)x+r/4, (int)y+r/4, r/2, r/2);
		
	}*/

	public void update() {
		
		if(lt) {
			if((x - r) > 0) {
				x -= speed;
			} else {
				lt = false;
				x = 0 + r;
			}
		}
		
		if(rt) {
			if((x + r*2) < GamePanel.WIDTH) {
				x += speed;
			} else {
				rt = false;
				x = GamePanel.WIDTH - r*2;
			}
		}
		
	}
	
	public void setLt(boolean b) {lt = b;}
	public void setRt(boolean b) {rt = b;}

}
