package homework3;

public class CustomerLoggerManager {
	private BaseLogger logger;

	public CustomerLoggerManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void add() {
		System.out.println("Müþteri eklendi.");
		this.logger.log("log mesajý");
	}
}
