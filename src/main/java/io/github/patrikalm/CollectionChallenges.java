package io.github.patrikalm;

import java.util.*;

public class CollectionChallenges {

    public static void main(String[] args) {

        ch4();
    }

    public static void ch1() {

        Set<String> week = new HashSet<>();

        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        Set<String> weekend = new HashSet<>();

        weekend.add("Saturday");
        weekend.add(("Sunday"));

        week.retainAll(weekend);

        Iterator itr = week.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

        }

    }

    public static void ch2() {

        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Lennart", "lennart.jakobsson@nowhere.se");
        contacts.put("Jakob", "jakob.lennartsson@nowhere.se");
        contacts.put("Tore", "tore.svensson@nowhere.se");
        contacts.put("Ulf", "ulf.Henningsson@nowhere.se");

        Set<String> keyMap = new HashSet<>();

        keyMap.addAll(contacts.keySet());

        Iterator itr = keyMap.iterator();

        System.out.println();
        System.out.println("Here is the key set: ");

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }

    public static void ch3() {

        List<SuperHero> superHeroes = new ArrayList<>();

        superHeroes.add(new SuperHero(1, "The Hulk", 45));
        superHeroes.add(new SuperHero(1, "Superman", 75));
        superHeroes.add(new SuperHero(1, "Batman", 35));
        superHeroes.add(new SuperHero(1, "Flash", 55));
        superHeroes.add(new SuperHero(1, "Spiderman", 25));

        System.out.println();
        System.out.println("Superheroes arraylist unsorted: ");

        for (SuperHero hero : superHeroes) {

            System.out.println("Id: " + hero.id + " Name: " + hero.name + " Age: " + hero.age);

        }

        superHeroes.sort(SuperHero::compareTo);

        System.out.println();
        System.out.println("Superheroes arraylist sorted: ");

        for (SuperHero hero : superHeroes) {

            System.out.println("Id: " + hero.id + " Name: " + hero.name + " Age: " + hero.age);

        }

    }

    public static void ch4() {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(7);

        Set<Integer> noDuplicateNumbers = new HashSet<>();

        noDuplicateNumbers.addAll(numbers);

        System.out.println();
        System.out.println("Here is the numbers without duplicates: ");

        Iterator itr = noDuplicateNumbers.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

    }

}
