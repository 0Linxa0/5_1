    import java.io.IOException;
    import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
            try {
                Service s = new Service();
                s.addStudent(new Student("Krzysztof", 20));
                s.addStudent(new Student("Janusz", 40));
                s.addStudent(new Student("Dawid", 54));

                Scanner sk = new Scanner(System.in);
                int wybor = -1;

                while (wybor != 0) {
                    System.out.println("\nMENU:");
                    System.out.println("1 - dodaj studenta");
                    System.out.println("2 - wyswietl studentow");
                    System.out.println("0 - wyjdz");
                    System.out.print("Wybor: ");

                    wybor = sk.nextInt();
                    sk.nextLine();

                    switch (wybor) {
                        case 1:
                            System.out.println("Wpisz imie:");
                            String name = sk.nextLine();
                            System.out.println("Wpisz wiek:");
                            int age = sk.nextInt();
                            sk.nextLine();
                            s.addStudent(new Student(name, age));
                            break;
                        case 2:
                        var students = s.getStudents(); for (Student current : students) { System.out.println(current.toString()); } break;
                        case 0:
                            System.out.println("Koniec programu.");
                            break;
                        default:
                            System.out.println("Nieznana opcja.");
                            break;
                    }
                }

            } catch (IOException e) {
                System.out.println("Błąd podczas pracy z plikiem: " + e.getMessage());
            }
        }
    }
