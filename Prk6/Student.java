package Prk6;
import java.lang.*;
class Student {
    private Integer ide;
     private String  Name;
      private String  Surname;
     private Integer age;
    public Integer getIde() { return ide; }
     public void setIde(Integer ide) { this.ide = ide; }
      public String getName() { return Name; }
     public void setName(String name) { this.Name = name; }
    public String getSurdname() { return Surname; }
     public void setSurname(String surname) { this.Surname = surname; }
      public Integer getAge() { return age; }
     public void setAge(Integer age) { this.age = age; }
    public String toString() {
        return "Student{ " +
                "ID: " + ide +
                ", Name: '" + Name + '\'' +
                ", Surname: '" + Surname + '\'' +
                ", age: " + age +
                " }"; }
    static String[] firstnames = new String[] { "Tommy", "Liz", "Ann", "Max", "Andrew", "Ben" };
     static String[] lastnames  = new String[] { "Mason", "Den", "Arnold" };
    public static Student[] getSamples() {
        var students = new Student[10];
         for (int i = 0; i < 10; i++) {
            var student = new Student();
             student.setName(firstnames[i % firstnames.length]);
              student.setSurname(lastnames[i % lastnames.length]);
             student.setAge(16 + i);
            student.setIde(i + 1);
             students[i] = student; }
         return students; }
}
