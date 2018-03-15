
import java.util.ArrayList;

public class CarLogic {

    public ArrayList sortCarByName(String name, Car... car) {

        ArrayList<Car> list = new ArrayList<Car>();
        for (int i = 0; i < car.length; i++) {
            if (car[i].getName().equals(name)) {
                list.add(car[i]);
            }
        } return list;
    }

    public ArrayList sortCarByModel(String model, int year, Car... car){
        int currentYear = 2018;
        ArrayList<Car> list = new ArrayList<Car>();
        for (int i = 0; i < car.length; i++) {
            if (car[i].getModel().equals(model) && (currentYear - car[i].getYear()) > year){
                list.add(car[i]);
            }
        } return list;
    }

    public ArrayList sortCarByYear(int year, int price, Car... car){
        ArrayList<Car> list = new ArrayList<Car>();
        for (int i = 0; i < car.length; i++) {
            if (car[i].getYear() == year && car[i].getPrice() > price){
                list.add(car[i]);
            }
        } return list;
    }
}


