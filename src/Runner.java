import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
       /* ArrayList<Integer> list1 = new ArrayList<>();
        Integer a = 10;
        Integer b = 5;
        Integer c = 24;
        list1.add(a);
        list1.add(b);
        list1.add(c);
        System.out.println(list1);*/

        Car car1 = new Car("Mustang", 12500);
        Car car2 = new Car ("Camry", 8400);
        Car car3 = new Car ("bal", 2222);
        Car[] carArray =   {car1, car2 , car3};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carArray));
        System.out.println(carList);

    }
}
