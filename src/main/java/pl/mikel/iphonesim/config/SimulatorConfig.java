package pl.mikel.iphonesim.config;

/**
 * Iphone simulator configuration object
 * 
 * @author mikel
 *
 */
public class SimulatorConfig {
	
	private static final String DEFAULT_SIM_PATH = "/Applications/Xcode.app/Contents/Developer/Platforms/" +
			"iPhoneSimulator.platform/Developer/Applications/iPhone Simulator.app/Contents/MacOS/iPhone Simulator";
	
	private String simPath;
	private String appPath;
	private String appName;
	
	public SimulatorConfig() {
		simPath = DEFAULT_SIM_PATH;
	}
	
	public String getSimPath() {
		return simPath;
	}
	public void setSimPath(String simPath) {
		this.simPath = simPath;
	}
	public String getAppPath() {
		return appPath;
	}
	public void setAppPath(String appPath) {
		this.appPath = appPath;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
}