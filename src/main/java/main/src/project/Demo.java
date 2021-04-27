package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

import static project.Input.*;
import static project.Numbers.countFib;
import static project.Numbers.fibonacci;
import static project.Output.OUTPUT;

public class Demo {
    private static final Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) throws Exception {
        if (args.length > 0)
            for (String arg : args) {
                switch (arg) {
                    case "-i":
                        logger.info("Selected input file name: " + INPUT);
                        break;
                    case "-o":
                        logger.info("Selected output file name: " + OUTPUT);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + arg);
                }
            }
        else {
            logger.info("File not find");
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
    }
}
