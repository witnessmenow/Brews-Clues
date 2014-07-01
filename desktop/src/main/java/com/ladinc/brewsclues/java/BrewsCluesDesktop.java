package com.ladinc.brewsclues.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.ladinc.brewsclues.core.BrewsClues;

public class BrewsCluesDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new BrewsClues(), config);
	}
}
