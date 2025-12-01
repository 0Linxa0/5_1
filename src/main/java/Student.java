public class Student {

  private String Name;
  private int Age;
  private String Datau;

  public Student(String name, int age, String data) {
    Name = name;
    Age = age;
    Datau = data;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetData() {return Datau;}

  public String toString() {
    return Name + " " + Integer.toString(Age) + " " + Datau;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", -1, "");
    return new Student(data[0], Integer.parseInt(data[1]), data[2]);
  }
}