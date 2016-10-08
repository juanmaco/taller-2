import processing.core.PImage;
import processing.core.PApplet;

public class Personaje {
private PApplet app;
	public float x;
	public float y;
	public PImage imagen;
	
	public Personaje(PApplet app, float x, float y, PImage imagen) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.imagen = imagen;
	}
	public void pintar(){
		app.image(imagen,x,y);
	}
	public void mover(){
		x=app.mouseX;
		y=app.mouseY;
		if(app.mouseX>879){
			x=879;
		}
		if(app.mouseY<113){
			y=113;
		}
		if(app.mouseY>664){
			y=664;
		}
		
	}
public float getx(){
	return x;
}
public float gety(){
	return y;
}
}
