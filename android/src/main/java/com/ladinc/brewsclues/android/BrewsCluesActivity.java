package com.ladinc.brewsclues.android;

import com.ladinc.brewsclues.core.BrewsClues;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class BrewsCluesActivity extends AndroidApplication {

	@Override
	public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
			initialize(new BrewsClues(), config);
	}
}
