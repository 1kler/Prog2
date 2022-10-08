import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CSVReader {

    public void sortByYearAndMilage() throws FileNotFoundException {
        List<Ford> fordList = readFordsFromCSV();
        Collections.sort(fordList, new Comparator<Ford>() {
            @Override
            public int compare(Ford a1, Ford a2) {
                return a1.getYear() - a2.getYear();
            }
        });
        Collections.sort(fordList, new Comparator<Ford>() {
            @Override
            public int compare(Ford a1, Ford a2) {
                return a1.getMile() - a2.getMile();
            }
        });
        for (Ford ford : fordList) {
                System.out.println(ford);
        }
    }
    public void milageRange(int min, int max) throws FileNotFoundException {
        List<Ford> fordList = readFordsFromCSV();

        for (Ford ford : fordList) {
            if (ford.getMile() >= min && ford.getMile() <= max) {
                System.out.println(ford);
            }
        }
    }
    public void lessPrice(int price) throws FileNotFoundException {
        List<Ford> fordList = readFordsFromCSV();

        for (Ford ford : fordList) {
            if (ford.getPrice()<=price) {
                System.out.println(ford);
            }
        }
    }
    public void printFordsByYear(int year) throws FileNotFoundException {
        List<Ford> fordList = readFordsFromCSV();

        for (Ford ford : fordList) {
            if (ford.getYear() >= year) {
                System.out.println(ford);
            }
        }
    }

    private List<Ford> readFordsFromCSV() throws FileNotFoundException {
        List<Ford> result = new ArrayList<>();
        File file = new File("ford_escort.csv");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter("\n");
        if (scanner.hasNext()) {
            scanner.nextLine();
        }

        while (scanner.hasNext()) {
            result.add(convertToFord(scanner.nextLine()));
        }

        return result;
    }


    private Ford convertToFord(String line) {
        String[] fields = line.split(",\\s+");
        Ford ford = new Ford();
        ford.setYear(Integer.parseInt(fields[0]));
        ford.setMile(Integer.parseInt(fields[1]));
        ford.setPrice(Integer.parseInt(fields[2]));
        return ford;
    }
}
