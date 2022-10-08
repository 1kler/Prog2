public class Ford {
    private int year;
    private int mile;
    private int price;

    public Ford(){

    }
    public Ford(int year, int mile, int price) {
        this.year = year;
        this.mile = mile;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "year=" + year +
                ", mile=" + mile +
                ", price=" + price +
                '}';
    }
}
