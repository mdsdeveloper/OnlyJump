package com.magui.general;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.magui.draw.Splash;
import com.magui.storage.General;
import com.magui.storage.Menu;

public class Main extends ApplicationAdapter {

	Texture img;
	public static float time;

	@Override
	public void create () {
		General.load();
		com.magui.storage.Splash.load();
		Menu.load();

		time = 100;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		General.batch.begin();

		switch(General.estado){
			case splash:
				Splash.draw();
				break;
			case menu:
				com.magui.draw.Menu.draw();
				break;
			case running:
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
