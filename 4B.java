import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
enum LogLevel {
    INFO, DEBUG, ERROR;
}
interface Command {
    void execute(String message);
}class LogCommand implements Command {
    private LogLevel level;
    private LogHandler handler;

    public LogCommand(LogLevel level, LogHandler handler) {
        this.level = level;
        this.handler = handler;
    }

    @Override
    public void execute(String message) {
        handler.handleRequest(level, message);
    }
}

abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(LogLevel level, String message);
}
class InfoHandler extends LogHandler {
    @Override
    public void handleRequest(LogLevel level, String message) {
        if (level == LogLevel.INFO) {
            System.out.println("[INFO]: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level, message);
        }
    }
}

class DebugHandler extends LogHandler {
    @Override
    public void handleRequest(LogLevel level, String message) {
        if (level == LogLevel.DEBUG) {
            System.out.println("[DEBUG]: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level, message);
        }
    }
}

class ErrorHandler extends LogHandler {
    @Override
    public void handleRequest(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            System.out.println("[ERROR]: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level, message);
        }
    }
}
class Logger {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void processCommands() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            iterator.next().execute("Processing log message");
        }
    }
}
public class LoggingSystem {
    public static void main(String[] args) {
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);
        Logger logger = new Logger();
        logger.addCommand(new LogCommand(LogLevel.INFO, infoHandler));
        logger.addCommand(new LogCommand(LogLevel.DEBUG, infoHandler));
        logger.addCommand(new LogCommand(LogLevel.ERROR, infoHandler));
        logger.processCommands();
    }
}