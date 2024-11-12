package io.github.patrikalm;

import java.util.*;

public class CollectionExercises {

    public static void main(String[] args) {

    ex12();

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

        for (String weekday : week) {

            System.out.println(weekday);
        }
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

        Iterator itr = week.iterator();

        System.out.println();
        System.out.println("Here is the whole week from the ArrayList: ");

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

        Iterator itrSub = subWeek.iterator();

        System.out.println();
        System.out.println("Here is subpart of the week: ");

        while (itrSub.hasNext()) {

            System.out.println(itrSub.next());
        }
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

        System.out.println();
        System.out.println("Here is the whole week from the HashSet: ");

        Iterator itr = week.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }

    public static void ex6() {
        Set<String> week = new HashSet<>();

        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        List<String> arrayListWeek = new ArrayList<>();

        arrayListWeek.addAll(week);

        System.out.println();
        System.out.println("Here is the HashSet week: " + week);
        System.out.println();
        System.out.println("Here is the ArrayList week: " + arrayListWeek);

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

        Collections.sort(sortedNames, String.CASE_INSENSITIVE_ORDER);

        System.out.println();
        System.out.println("Here is a sorted Arraylist: ");

        Iterator itr = sortedNames.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }

    public static void ex8() {

        Set<String> randomNames = new HashSet<>();

        randomNames.add("Torbjörn");
        randomNames.add("Karl");
        randomNames.add("Henrik");
        randomNames.add("Johan");
        randomNames.add("Edmund");

        System.out.println("Here is the HashSet and not sorted: " + randomNames);

        Set<String> sortedNames = new TreeSet<>();

        sortedNames.addAll(randomNames);



        System.out.println("Here is the TreeSet and sorted: " + sortedNames);

    }

    public static void ex9() {

        HashMap<Integer, String> carBrands = new HashMap<>();

        carBrands.put(1,"Volvo");
        carBrands.put(2,"BMW");
        carBrands.put(3,"Ford");
        carBrands.put(4,"Nissan");
        carBrands.put(5,"Tesla");

        Iterator itr = carBrands.entrySet().iterator();

        System.out.println();
        System.out.println("Here is the map with car brands: ");

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }


    }

    public static void ex10() {

        HashMap<Integer, String> carIdBrands = new HashMap<>();

        carIdBrands.put(10, "Jeep");
        carIdBrands.put(11, "Hyundai");
        carIdBrands.put(12, "KIA");
        carIdBrands.put(13, "VolkWagen");
        carIdBrands.put(14, "Chevrolet");
        carIdBrands.put(15, "Peugeot");

        System.out.println();
        System.out.println("Here is the map with car brands, with the key only: ");

        Iterator itr = carIdBrands.keySet().iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

    }

    public static void ex11() {

        HashMap<Integer, String> carIdBrands = new HashMap<>();

        carIdBrands.put(10, "Jeep");
        carIdBrands.put(11, "Hyundai");
        carIdBrands.put(12, "KIA");
        carIdBrands.put(13, "VolkWagen");
        carIdBrands.put(14, "Chevrolet");
        carIdBrands.put(15, "Peugeot");

        System.out.println();
        System.out.println("Here is the map with car brands, with the values only: ");

        Iterator itr = carIdBrands.values().iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

    }

    public static void ex12() {

        HashMap<Integer, Car> carIdBrands = new HashMap<>();

        carIdBrands.put(10, new Car(1, "Jeep", "Cherokee"));
        carIdBrands.put(11, new Car(2, "Hyundai", "Santa Fe"));
        carIdBrands.put(12, new Car(3, "KIA", "Sportage"));
        carIdBrands.put(13, new Car(4,"VolkWagen", "Passat"));
        carIdBrands.put(14, new Car(5,"Chevrolet", "Camaro"));
        carIdBrands.put(15, new Car(6,"Peugeot", "407"));

        System.out.println();
        System.out.println("Here is the map with car brands, with the key only: ");

        Iterator itr = carIdBrands.keySet().iterator();

        while (itr.hasNext()) {

            System.out.println((itr.next()));
        }

    }
}
