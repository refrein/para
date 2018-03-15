/**
 * Created by RefRein on 13.03.2018.
 */
public class Runner {

    public static void main(String args[]) {

        Car a = new Car(2564, "Sparrow", "IG", 1993, "purple", 25692, 1234);
        Car b = new Car(3312, "Withdraw", "Blub", 2007, "yellow", 14999, 4321);
        Car c = new Car(2564, "Sparrow", "IG", 1993, "purple", 25692, 1234);
        Car d = new Car(3312, "Withdraw", "Blub", 2007, "yellow", 14999, 4321);
        Car e = new Car(2564, "Sparrow", "IG", 1993, "purple", 25692, 1234);
        Car f = new Car(3312, "Withdraw", "Blub", 2007, "yellow", 14999, 4321);
        Car g = new Car(2564, "Sparrow", "IG", 1993, "purple", 25692, 1234);
        Car h = new Car(3312, "Withdraw", "Blub", 2007, "yellow", 14999, 4321);
        Car i = new Car(2564, "Sparrow", "IG", 1993, "purple", 25692, 1234);
        Car j = new Car(3312, "Withdraw", "Blub", 2007, "yellow", 14999, 4320);

        CarLogic carLogic = new CarLogic();

        System.out.println("Task 1:\n"+carLogic.sortCarByModel("Blub", 2007, a,b,c,d,e,f,g,h,i,j));
        System.out.println("Task 2:\n"+carLogic.sortCarByName("Sparrow"));
        System.out.println("Task 3:\n"+carLogic.sortCarByYear(1993, 14999, a,b,c,d,e,f,g,h,i,j));
    }

}
