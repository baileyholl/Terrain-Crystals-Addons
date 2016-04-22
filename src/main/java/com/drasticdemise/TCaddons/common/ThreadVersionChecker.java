package com.drasticdemise.TCaddons.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ThreadVersionChecker extends Thread{
	public ThreadVersionChecker() {
		setName("Extra Terrain Crystals Checking Thread");
		setDaemon(true);
		start();
	}

	@Override
	public void run() {
		try {
			URL url = new URL(TCAddons.URL);
			BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
			VersionChecker.version = r.readLine();
			r.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
