package com.ladinc.brewsclues.html;

import com.ladinc.brewsclues.core.BrewsClues;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class BrewsCluesHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new BrewsClues();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
