

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {        /*просит пользователя выбрать блюдо и добавляет его в список.*/
        writeMessage(Dish.allDishesToString());
        List<Dish> list = new ArrayList<>();
        while (true){
            String dishSelection = ConsoleHelper.readString();
            if(dishSelection.equals("exit")) return list;
            else if(dishSelection.equals("Fish")) list.add(Dish.Fish);
            else if(dishSelection.equals("Steak")) list.add(Dish.Steak);
            else if(dishSelection.equals("Soup")) list.add(Dish.Soup);
            else if(dishSelection.equals("Juice")) list.add(Dish.Juice);
            else if(dishSelection.equals("Water")) list.add(Dish.Water);
            else ConsoleHelper.writeMessage("Такого блюда нет");
        }

    }
}