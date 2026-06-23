public class Logger {
    //private static instance of Logger
    public static Logger instance ;
    // Making the constructor private
    private Logger() {
        // private constructor to prevent instantiation
        System.out.println("Logger instance created");
    }
    // Public method to access the single instance
    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    //Logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
