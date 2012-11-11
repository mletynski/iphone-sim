package pl.mikel.iphonesim.service;

import java.io.File;
import java.io.IOException;

import pl.mikel.iphonesim.config.SimulatorConfig;

/**
 * Iphone simulator executor
 * 
 * @author mikel
 *
 */
public class IphoneSimExecutor {
	
	public static final IphoneSimExecutor getInstance(SimulatorConfig pConfig) {
		return new IphoneSimExecutor(pConfig);
	}
	
	private SimulatorConfig config;
	
	private IphoneSimExecutor(SimulatorConfig pConfig) {
		config = pConfig;
	}
	
	/**
	 * Start simulator
	 */
	public void start() {
		StringBuilder appPath = new StringBuilder(config.getAppPath());
		appPath.append(File.separator).append(config.getAppName()).append(".app");
		appPath.append(File.separator).append(config.getAppName());
		
		String[] cmdarray = { 
				"open",
				"-a",
				config.getSimPath(),
				"--args",
				"-SimulateApplication",
				appPath.toString()
		};

		try {
			Runtime.getRuntime().exec(cmdarray);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Stop simulator
	 */
	public void stop() {
		String[] cmdarray = { 
				"osascript",
				"-e",
				"tell application \"iPhone Simulator\" to quit"
		};
			
		try {
			Runtime.getRuntime().exec(cmdarray);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}