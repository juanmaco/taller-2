import processing.core.PApplet;
import processing.core.PVector;
import processing.core.PImage;

public class Ragua extends Runa{
	public float vel;

	public Ragua(PApplet app, float x, float y, PImage imagen) {
		super(app, x, y, imagen);
		// TODO Auto-generated constructor stub
		vel=5;
	}

	@Override
	public void pintar() {
		app.image(imagen,x,y);
		
	}

	@Override
	//no usar aqui :v
	public void mover() {
		direccion= new PVector(app.mouseX-x,app.mouseY-y);
		direccion.normalize();
		x= x+direccion.x*vel;
		y= y+direccion.y*vel;
	}

}
