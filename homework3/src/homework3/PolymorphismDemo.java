package homework3;

public class PolymorphismDemo {

	public static void main(String[] args) {

		/*
		 * BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new
		 * EmailLogger(), new DatabaseLogger(), new ConsoleLogger() }; for (BaseLogger
		 * logger : loggers) { logger.Log("Log mesajý"); }
		 */

		CustomerLoggerManager customerManager = new CustomerLoggerManager(new FileLogger());
		customerManager.add();

	}

}
