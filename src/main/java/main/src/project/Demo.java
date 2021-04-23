package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static project.Input.INPUT;
import static project.Numbers.fibonacci;
import static project.Input.numberOfInteger;
import static project.Output.OUTPUT;

public class Demo {
    private static final Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) throws Exception {
        if (args.length > 0)
            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "-i":
                       // INPUT = args[i + 1];
                        logger.info("Selected input file name: " + INPUT);
                        break;
                    case "-o":
                        //OUTPUT = i;
                        logger.info("Selected output file name: " + OUTPUT);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + args[i]);
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
        Output.main(args);
    }

    public static void start1() throws Exception{
        fibonacci(numberOfInteger);
        Reverse.reverseFibonacci(fibonacci(numberOfInteger), numberOfInteger);
    }
}
