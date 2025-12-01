    import java.io.IOException;
    import java.util.Scanner;
    import java.util.Collection;

    class Main {
        public static void main(String[] args) {
            try {
                Service s = new Service();
                s.addStudent(new Student("Krzysztof", 20, "23.02.2003"));
                s.addStudent(new Student("Janusz", 40, "23.02.2003"));
                s.addStudent(new Student("Dawid", 54, "23.02.2003"));

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
                            System.out.println("Wpisz datę urodzenia");
                            String data = sk.nextLine();
                            s.addStudent(new Student(name, age,data));
                            break;
                        case 2:
                        Collection<Student> students = s.getStudents(); 
                        for (Student current : students) { 
                            System.out.println(current.toString()); 
                        } 
                        break;
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
