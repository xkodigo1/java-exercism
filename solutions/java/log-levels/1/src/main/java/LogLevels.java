public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":") + 2).trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String level = logLine.substring(start + 1, end).toLowerCase();
        return level;
    }

    public static String reformat(String logLine) {
        String extracted = logLine.substring(logLine.indexOf(":") + 2).trim();
        String level = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
        return extracted + " (" + level + ")";
        
    }
}
