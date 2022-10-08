import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CSVReader csvReader = new CSVReader();
        csvReader.printFordsByYear(1995);
        System.out.println("-------------------");
        csvReader.milageRange(10,30);
        System.out.println("-------------------");
        csvReader.lessPrice(10000);
        System.out.println("-------------------");
        csvReader.sortByYearAndMilage();

    }
}
