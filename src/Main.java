public class Main {
    public static void main(String[] args) {
        /*EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Email log mesaji.");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("Database log mesaji.");

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};

        for (BaseLogger logger : loggers){
            logger.log("Log mesaji...");
        }*/

        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.Add();
    }
}