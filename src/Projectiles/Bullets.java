package Projectiles;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import Game.GamePanel;
import Game.MapObject;
import Game.Player;
import Graphics.ImageManager;

public class Bullets extends MapObject {

	private int damage = 1;
	
	
	public Bullets(Player p, int x, int y) {
		
		super(x,y);
		sprite = ImageManager.laser[p.getLevel()];
		angle = p.getAngle();
		dx = Math.cos(Math.toRadians(angle)- Math.PI/2)*8;
		dy = Math.sin(Math.toRadians(angle)- Math.PI/2)*8;
		w = sprite.getWidth();
		h = sprite.getHeight();
		cw = w - 5;
		ch = h - 20;

	}
	
	public void Update(){
		super.update();
		
	}
	
	public void draw(Graphics2D g){
		
		if(damage > 0){
			rotate((int)(Math.abs(angle)/angle), angle, g);
		}
	}
	
	public void hit(){damage--;}
	
	public void setDamage(int d){
		damage = d;
	}
	public int getDamage() {
		return damage;
	}
	public BufferedImage getSprite(){return sprite;}


}
