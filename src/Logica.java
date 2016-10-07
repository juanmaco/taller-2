import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	public PApplet app;
	private int pantalla = 0;
	public PImage inicio, ins, ins2, fondo, person,runaf,runaa,rrayo,robs,rnat;
	public Personaje per;
	public ArrayList<Rfuego> rf;
	public ArrayList<Ragua> ra;
	public ArrayList<Rrayo> rr;
	public ArrayList<Roscura> ro;
	public ArrayList<Rnat> rn;
	
	public Logica(PApplet app) {
		this.app = app;
		inicio = app.loadImage("../data/fondo.png");
		ins = app.loadImage("../data/ins.png");
		ins2 = app.loadImage("../data/ins2.png");
		fondo = app.loadImage("../data/fondoj.png");
		person = app.loadImage("../data/brujo.png");
		runaf = app.loadImage("../data/rfue.png");
		runaa = app.loadImage("../data/ragua.png");
		rrayo = app.loadImage("../data/rrayo.png");
		robs = app.loadImage("../data/robs.png");
		rnat = app.loadImage("../data/rnat.png");
		per = new Personaje(app, 0, 0, person);
		rf= new ArrayList<Rfuego>();
		for(int i=0; i<4; i++){
			rf.add(new Rfuego(app,app.random(10,879),app.random(113,664),runaf));
		}
		ra= new ArrayList<Ragua>();
		for(int i=0; i<2; i++){
			ra.add(new Ragua(app,app.random(10,879),app.random(113,664),runaa));
		}
		rr= new ArrayList<Rrayo>();
		for(int i=0; i<3; i++){
			rr.add(new Rrayo(app,app.random(10,879),app.random(113,664),rrayo));
		}
		ro= new ArrayList<Roscura>();
		for(int i=0; i<1; i++){
			ro.add(new Roscura(app,app.random(10,879),app.random(113,664),robs));
		}
		rn= new ArrayList<Rnat>();
		for(int i=0; i<2; i++){
			rn.add(new Rnat(app,app.random(10,879),app.random(113,664),rnat));
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
			for(int i=0; i<3; i++){
				rr.get(i).pintar();
			}
			for(int i=0; i<1; i++){
				ro.get(i).pintar();
			}
			for(int i=0; i<2; i++){
				rn.get(i).pintar();
			}
			app.imageMode(app.CENTER);
			per.pintar();
		}
	}

	public void mover() {
		per.mover();
		for(int i=0; i<2; i++){
			ra.get(i).mover();
		}
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
