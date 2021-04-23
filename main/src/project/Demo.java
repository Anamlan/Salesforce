package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

import static project.Input.INPUT;
import static project.Output.OUTPUT;

public class Demo {
    private static final Logger logger = LogManager.getRootLogger();
    private static Object fileName;

    public static void main(String[] args) throws FileNotFoundException {

        if (args.length > 0)
            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "-i":
                        INPUT = args[i + 1];
                        logger.info("Selected input file name: " + INPUT);
                        break;
                    case "-o":
                        OUTPUT = args[i + 1];
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
//       try {
//           start2(data, (String) fileName);
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
    }

//    private static void start2(ArrayList<String> data, String fileName) throws Exception {
//       // Output.toFile(data, OUTPUT);
//      //  Output.output(String.valueOf(reverseOrder(fibonacci(1, 1, 21))));
//        System.out.println(CheckArray.convertText(INPUT));
//    }

    public static void start1() throws Exception{
     //   Numbers.reverseOrder(fibonacci(1, 1, 21));
        CheckArray.convertText(INPUT);
    //    Output.output(INPUT);
    }
}
