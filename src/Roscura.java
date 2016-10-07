import processing.core.PApplet;
import processing.core.PVector;
import processing.core.PImage;

public class Roscura extends Runa{

	public Roscura(PApplet app, float x, float y, PImage imagen) {
		super(app, x, y, imagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		app.image(imagen,x,y);
		
	}

	@Override
	public void mover() {
		direccion= new PVector(app.mouseX-x,app.mouseY-y);
		
	}

}