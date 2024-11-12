package io.github.patrikalm;

import java.util.*;

public class CollectionExercises {

    public static void main(String[] args) {

    ex8();

    }


    public static void ex1() {
        List<String> week = new ArrayList<>();

        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        System.out.println(week.toString());
    }


    public static void ex2() {
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
        }
    }

    public static void ex3() {

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
        }
    }

    public static void ex4() {

        List<String> week = new ArrayList<>();

        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        List<String> subWeek = new ArrayList<>();

        subWeek = week.subList(0, 3);

        System.out.println(week);

        System.out.println(subWeek);
    }

    public static void ex5() {

        Set<String> week = new HashSet<>();


        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        System.out.println(week);
    }

    public static void ex6() {
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

    //Exercise 7
    public static void ex7() {

        Set<String> randomNames = new HashSet<>();

        randomNames.add("Bear");
        randomNames.add("John");
        randomNames.add("Ben");
        randomNames.add("Adam");
        randomNames.add("Cesar");

        System.out.println("Here is the set not sorted: " + randomNames);

        ArrayList<String> sortedNames = new ArrayList<>();

        sortedNames.addAll(randomNames);

        if


        System.out.println("Here is a sorted Arraylist: " + sortedNames);
    }

    public static void ex8() {

        Set<String> randomNames = new HashSet<>();

        randomNames.add("Torbjörn");
        randomNames.add("Karl");
        randomNames.add("Henrik");
        randomNames.add("Johan");
        randomNames.add("Edmund");

        Set<String> sortedNames = new TreeSet<>();

        sortedNames.addAll(randomNames);

        System.out.println("Here is the HashSet and not sorted: " + randomNames);

        System.out.println("Here is the TreeSet and sorted: " + sortedNames);

    }


}
