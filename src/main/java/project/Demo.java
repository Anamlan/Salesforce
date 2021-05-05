package project;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;

import static project.Input.INPUT;
import static project.Input.countInt;
import static project.Numbers.countFib;
import static project.Numbers.fibonacci;
import static project.Output.OUTPUT;

public class Demo {
    private static final Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) {
    	String log4jConfPath = "resources/log4j.properties";
    	PropertyConfigurator.configure(log4jConfPath);
        if (args.length > 0)
            for (String arg : args) {
                switch (arg) {
                    case "-i":
                        for (int i = 1; i < args.length; i++)
                            logger.info("Selected input file name: " + INPUT);
                        break;
                    case "-o":
                        for (int i=1; i<args.length; i++) {
                            args[i] = args[i].replace("\\t", "\t");
                            args[i] = args[i].replace("\\n", "\n");
                            logger.info("Selected output file name: " + OUTPUT);
                        } break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + arg);
                }
            }
        try {
            start1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Output.main(String.valueOf(OUTPUT));
    }

    public static void start1() throws IOException {
        fibonacci(countInt());
        Reverse.reverseFibonacci(fibonacci(countFib), countFib);
        Reverse.countFibonacci(fibonacci(countFib), countFib);
    }
}
