# iPhone simulator

This is simple java project which start/stop iphone simulator with concrete application.

This project can be useful when you are using it together with [Monkey talk](http://www.gorillalogic.com/monkeytalk) for your integration tests.

### How to use it

Configure your simulator path and app name through **SimulatorConfig** and start/stop executor.

#### Example

		SimulatorConfig config = new SimulatorConfig();
		config.setAppName("Test");
		config.setAppPath("/Users/mikel/workspace/test");
		IphoneSimExecutor executor = IphoneSimExecutor.getInstance(config);
		executor.start();


