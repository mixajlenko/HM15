package org.hillel.home_work15;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

@Analyzable("I`m here")
class ArrayProgram  {

    @Analyzable("I`m here")
    public ArrayProgram() {
    }

    @Analyzable("I`m here")
    private Person person = new Person();
    private Scanner scanner = new Scanner(System.in);
    private boolean lifeCycle = true;

    void logic() {
        while (lifeCycle) {
            System.out.print("Enter the command:" +
                    "\n" + "Add new person - a" +
                    "\n" + "Find person by name - s" +
                    "\n" + "Exit - e" + "\n");

            String sig = scanner.nextLine();
            switch (sig) {
                case ("a"):
                    add1();
                    break;

                case ("s"):
                   // printArray();
                    break;

                case ("e"):
                    exit();
                    break;

            }
        }
    }

    private void add1() {

        System.out.println("Enter the person's name");
        person.setName(scanner.nextLine());

        System.out.println("How much friends have this person");
        int i = scanner.nextInt();
        scanner.nextLine();

        String[] oldFriends = new String[i];

        for (int j = 0; j < oldFriends.length; j++) {
            System.out.println("Enter friend's name " + (j + 1));
            String friends = scanner.nextLine();
            oldFriends[j] = friends;
        }
        String[] temp = new String[oldFriends.length];
        System.arraycopy(oldFriends, 0, temp, 0, oldFriends.length);
        person.setAllFriends(temp);

        Person newCharacter = new Person(person.getAllFriends(), person.getName());

        if (person.getPersons() != null) {
            dynamic(newCharacter);

        } else {
            person.setPersons(new Person[1]);
            person.getPersons()[0] = newCharacter;
        }
        System.out.println("---------------Success---------------");
    }

    @Analyzable("I`m here")
    private void printArray(int x, double d) {
        System.out.println("Enter the name for search");
        String f = scanner.nextLine();
        for (int i = 0; i < person.getPersons().length; i++) {
            if (person.getPersons()[i].getName().equals(f)) { //ТУТ ВАЖНО!
                System.out.println("This person have " + person.getAllFriends().length + " friend/s.");
                System.out.print("Their names:");
                System.out.println(Arrays.toString(person.getPersons()[i].getAllFriends()));
                System.out.println("-------------------------------------");
            }
        }
    }
    @Analyzable("I`m here")
    private void exit() {
        System.out.println("Вы точно хотите выйти? (y/n)");
        String f = scanner.nextLine();
        switch (f) {
            case ("y"):
                lifeCycle = false;
                break;
            case ("n"):
                lifeCycle = true;
                break;
            default:
                System.out.println("Недопустимый ответ, попробуйте еще раз");
                exit();
        }
    }

    private void dynamic(Person p) {
        Person[] temp = new Person[person.getPersons().length + 1];
        System.arraycopy(person.getPersons(), 0, temp, 0, person.getPersons().length);
        temp[temp.length - 1] = p;
        person.setPersons(temp);
    }

}






