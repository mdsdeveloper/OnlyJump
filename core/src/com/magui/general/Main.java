package com.magui.general;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.magui.storage.General;
import com.magui.storage.Menu;
import com.magui.storage.Running;

public class Main extends ApplicationAdapter {

	Texture img;
	public static float time;
	public static Ball ball;
	public Texture imgBall, imgLine;
	public static Line line;

	@Override
	public void create () {
		imgBall = new Texture("ball.png");
		imgBall.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		imgLine = new Texture("backGround/linea1.png");
		imgLine.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

		General.load();
		Running.load();
		com.magui.storage.Splash.load();
		Menu.load();
		ball = new Ball(imgBall,General.w/4,General.h/2 - General.h/4 - 10, General.w/10,General.w/10);
		line = new Line(imgLine,General.w - 10,General.h/2 - General.h/4,General.w,General.h);


		time = 100;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		General.batch.begin();

		switch(General.estado){
			case splash:
			//	Splash.draw();
				break;
			case menu:
		//		com.magui.draw.Menu.draw();
				break;
			case running:
				com.magui.upDate.Running.upDate();
				com.magui.draw.Running.draw();
				break;
			case preGameover:
				break;
			case pause:
				break;
			case gameOver:
				break;

		};

		General.batch.end();
	}
}
