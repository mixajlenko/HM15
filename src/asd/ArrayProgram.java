package asd;




import java.util.Scanner;


public class ArrayProgram {
String arr;

    Person person = new Person();
    Scanner scanner = new Scanner(System.in);

    boolean m = true;

    public void logic() {

        while (m) {
            System.out.print("Введите команду:" + "\n" + "add" + "\n" + "print array" + "\n" + "exit" + "\n");
            String sig = scanner.nextLine();

            switch (sig) {

                case ("add"): {
                    add();
                    break;
                }
                case ("print array"): {
                    printArray();
                    break;
                }
                case ("exit"): {

                    exit();
                    break;
                }
            }
        }
    }


    public void add() {

        System.out.println("Введите имя персоны");
        String name = scanner.nextLine();
        person.name = name;


        System.out.println("Введите длину списка его друзей");
        int i = scanner.nextInt();
        scanner.nextLine();
        person.i = i;

        person.add1();

        Person[] arrayPerson = new Person[10];
        for (int g = 0; g < 10; g++) {
            arrayPerson[0] = new Person();


            System.out.println(arrayPerson[g]);

        }

    }

    public void printArray() {
        System.out.println("Введите имя для поиска");





}


        public void exit () {
            System.out.println("Вы точно хотите выйти? (yes/no)");
            String f = scanner.nextLine();
            switch (f) {
                case ("yes") :
                    m = false;
                    break;

                case ("no") :
                    m = true;
                    break;
                    default:
                        System.out.println("Недопустимый ответ, попробуйте еще раз");
                        exit();
            }



    }


}




