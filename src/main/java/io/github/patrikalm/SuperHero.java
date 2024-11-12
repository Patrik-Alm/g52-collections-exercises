package io.github.patrikalm;

public class SuperHero {


    int id;

    String name;

    int age;


    public SuperHero(int id, String name, int age) {

        setId(id);
        setName(name);
        setAge(age);

    }

    public int getId() {

        return id;
    }

    private void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    private void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    private void setAge(int age) {

        this.age = age;
    }



    public int compareTo(SuperHero superHero) {

        if (age > superHero.age) {
            return 1;
        } else if ( age < superHero.age) {
            return -1;
        }
        return 0;
    }



}