package io.github.patrikalm;


import java.util.*;

public class Main {
    public static void main(String[] args) {


        // Exercise 1
        /*
        List<String> week = new ArrayList<>();

        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        System.out.println(week.toString());
        */

        //Exercise 2
        /*
        List<String> week = new ArrayList<>();


        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        Iterator itr = week.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }*/

        //Exercise 3
        /*
        List<String> week = new ArrayList<>();


        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        week.add(3, "Thursday");

        Iterator itr = week.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }*/

        //Exercise 4
        /*
        List<String> week = new ArrayList<>();

        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        List<String> subWeek = new ArrayList<>();

        subWeek = week.subList(0,3);

        System.out.println(week);

        System.out.println(subWeek);
        */

        //Exercise 5
        /*Set<String> week = new HashSet<>();

        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        System.out.println(week);
         */

        //Exercise 6
        Set<String> week = new HashSet<>();

        week.add("Monday");
        week.add("Thursday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        List<String> arrayListWeek = new ArrayList<>();

        arrayListWeek.addAll(week);

        System.out.println(week);

        System.out.println(arrayListWeek);




    }
}