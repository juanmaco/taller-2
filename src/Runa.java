import processing.core.PVector;
import processing.core.PApplet;
import processing.core.PImage;

public abstract class Runa {
	public PApplet app;
	public float x;
	public float y;
	public PVector direccion;
	public PImage imagen;
	public Runa(PApplet app, float x, float y, PImage imagen) {
		super();
		this.app = app;
		this.x = x;
		this.y = y;
		this.imagen=imagen;
	}
	public abstract void pintar();
	public abstract void mover();
	
}
