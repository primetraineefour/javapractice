package collection;

import java.util.ArrayList;

/**
 * Created by Jay
 */
public class ArryListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

//        System.out.println(list.size());

        //Iterating the list using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(2);
        for (int data : list ) {
            System.out.println(data);
        }


    }
}
