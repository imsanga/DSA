package JavaRefresher.Fnc_Arrays_Strings_Hash;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        // dynamic array
        ArrayList<Integer> arrlist = new ArrayList<>();
        // List<Integer> arrlist = new ArrayList<>();

        // create
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        for (int i : arrlist)
            System.out.println(i);

        // read
        System.out.println(arrlist.get(2));

        // update
        arrlist.set(2, 40);
        System.out.println(arrlist.get(2));

        // delete
        arrlist.remove(2);
        for (int i : arrlist)
            System.out.println(i);

        // size of arrlist
        System.out.println(arrlist.size());

        // clears entire list
        arrlist.clear();

        // for loop iteration
        for (int i = 0; i < arrlist.size(); i++) {
            System.out.println(arrlist.get(i));
        }

        // 2d arraylist
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(40);
        list2.add(50);
        list2.add(60);

        list2d.add(list2);
        list2d.add(list1);

        System.out.println(list2d);

        // for loop
        for (int i = 0; i < list2d.size(); i++) {
            for (int j = 0; j < list2d.get(i).size(); j++) {
                System.out.print(list2d.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // for each loop
        for (ArrayList<Integer> list : list2d) {
            for (int ele : list) {
                System.out.print(ele + " ");

            }
            System.out.println();
        }
    }
}
