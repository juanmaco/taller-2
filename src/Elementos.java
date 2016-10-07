import processing.core.PApplet;
import processing.core.PImage;

public abstract class Elementos {
	public float x;
	public float y;
	public PApplet app;
public PImage imagen;
	public Elementos(float x, float y,PImage imagen) {
		this.x = x;
		this.y = y;
		this.imagen=imagen;
	}


}
