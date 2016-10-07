import processing.core.PImage;

public class Enemigo extends Elementos {
	public float vel;
	public Enemigo(float x, float y, PImage imagen) {
		super(x, y, imagen);
		this.vel=vel;
	}


	public void pintar() {
		app.image(imagen, x, y);
		
	}

	
	public void mover() {
		
		
	}

}
