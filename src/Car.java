/**
 * Created by RefRein on 13.03.2018.
 */
public class Car {

    private int id;
    private String name;
    private String model;
    private int year;
    private String color;
    private int price;
    private int number;

    public Car(int id, String name, String model,
               int year, String color, int price, int number) {

        this.id = id;
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "id:\t\t" + id + "\nname:\t" + name + "\nmodel:\t" + model
                + "\nyear:\t" + year + "\ncolor:\t" + color + "\nprice:\t" + price
                + "\nnumber:\t" + number + "\n";
    }

}
