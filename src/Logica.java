import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	public PApplet app;
	private int pantalla = 0;
	public PImage inicio, ins, ins2, fondo, person,runaf,runaa;
	public Personaje per;
	public ArrayList<Rfuego> rf;
	public ArrayList<Ragua> ra;
	

	public Logica(PApplet app) {
		this.app = app;
		inicio = app.loadImage("../data/fondo.png");
		ins = app.loadImage("../data/ins.png");
		ins2 = app.loadImage("../data/ins2.png");
		fondo = app.loadImage("../data/fondoj.png");
		person = app.loadImage("../data/brujo.png");
		runaf = app.loadImage("../data/rfue.png");
		runaa = app.loadImage("../data/ragua.png");
		per = new Personaje(app, 0, 0, person);
		rf= new ArrayList<Rfuego>();
		for(int i=0; i<4; i++){
			rf.add(new Rfuego(app,app.random(10,879),app.random(113,664),runaf));
		}
		ra= new ArrayList<Ragua>();
		for(int i=0; i<2; i++){
			ra.add(new Ragua(app,app.random(10,879),app.random(113,664),runaa));
		}
	}

	public void pintar() {
		switch (pantalla) {
		case 0:
			app.image(inicio, 0, 0);
			break;
		case 1:
			app.image(ins, 0, 0);
			break;
		case 2:
			app.image(ins2, 0, 0);
			break;
		case 3:
			app.imageMode(app.CORNER);
			app.image(fondo, 0, 0);
			for(int i=0; i<4; i++){
				rf.get(i).pintar();
			}
			for(int i=0; i<2; i++){
				ra.get(i).pintar();
			}
			app.imageMode(app.CENTER);
			per.pintar();
		}
	}

	public void mover() {
		per.mover();
	}

	public void click() {
		if (app.mouseX > 1007 && app.mouseX < 1170 && app.mouseY > 42 && app.mouseY < 95 && pantalla == 2) {
			pantalla = 3;
		}
		System.out.println("x " + app.mouseX + "Y " + app.mouseY);
		if (app.mouseX > 462 && app.mouseX < 782 && app.mouseY > 499 && app.mouseY < 561 && pantalla == 0) {
			pantalla = 1;
		}
		if (app.mouseX > 1007 && app.mouseX < 1170 && app.mouseY > 42 && app.mouseY < 95 && pantalla == 1) {
			pantalla = 2;
		}

		if (app.mouseX > 42 && app.mouseX < 243 && app.mouseY > 40 && app.mouseY < 107 && pantalla == 1) {
			pantalla = 0;
		}
		if (app.mouseX > 42 && app.mouseX < 243 && app.mouseY > 40 && app.mouseY < 107 && pantalla == 2) {
			pantalla = 1;
		}
		if (app.mouseX > 42 && app.mouseX < 243 && app.mouseY > 40 && app.mouseY < 107 && pantalla == 3) {
			pantalla = 0;
		}
	}
}
