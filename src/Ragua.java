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
	
	public void mover() {
		for(int i=0; i<4; i++){
			x+=speedX;
		    y+=speedY;
		    if (x<= 50 || x>=879) {
		      speedX*=-1;
		    }
		    if (y<=150 || y>=670) {
		      speedY*=-1;
			
		}

	}
	}

}
