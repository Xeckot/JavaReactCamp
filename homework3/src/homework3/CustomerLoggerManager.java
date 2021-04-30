package homework3;

public class CustomerLoggerManager {
	private BaseLogger logger;

	public CustomerLoggerManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void add() {
		System.out.println("M��teri eklendi.");
		this.logger.log("log mesaj�");
	}
}
