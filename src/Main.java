import processing.core.PApplet;

public class Main extends PApplet {
public Logica app;
	public void setup(){
		app= new Logica(this);
		size(1200,700);
	}
	public void draw(){
	app.pintar();
	app.mover();
	}
	public void mousePressed(){
	app.click();	
	}
}
