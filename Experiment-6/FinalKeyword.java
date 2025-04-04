final class Logger {
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}
/* 
class ExtendedLogger extends Logger {  
    void logMessage(String message) {
        System.out.println("Extended Log: " + message);
    }
}
    */
public class FinalKeyword {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("This is a log message.");
    }
}
