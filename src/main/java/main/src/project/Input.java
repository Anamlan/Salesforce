package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Input {
    private static final Logger logger = LogManager.getRootLogger();
    public static final Path INPUT = Paths.get("source.txt");
    static int count = 0;
    static List<Integer> newList = null;

    public static int countInt() throws IOException {
        List<String> apk = Files.lines(Paths.get("source.txt")).collect(Collectors.toList());
        List<Integer> favss = new ArrayList<>();
        apk = apk.stream().map(s -> s.replaceAll("\\D+", ""))
                .collect(Collectors.toList());

        newList = new ArrayList<Integer>(apk.size()) ;
        for (String myInt : apk){
            newList.add(Integer.valueOf(myInt));
        }
        return count;
    }
//    public static Integer countInt() {
//        String numberOfElements = null;
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader(String.valueOf(INPUT)));
//            int inputNumbers = Integer.parseInt(String.valueOf(reader.read()));
//        } catch (FileNotFoundException e) {
//            logger.info("input file" + e);
//        } catch (IOException e) {
//            logger.error("error message: " + e.getMessage());
//        }
//        System.out.println(reader + " 23");
//        Scanner scan = new Scanner(reader);
//        while (scan.hasNextLine()) {
//            scan.skip("[^0-9]+");
//            numberOfElements = scan.nextLine();
//            count++;
//        }
//        System.out.println(numberOfElements + " hier new");
//        return count;
//    }
}
