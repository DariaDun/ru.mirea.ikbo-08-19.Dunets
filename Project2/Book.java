package Project2;
import java.lang.*;
public class Book {
    private String name;
    private int pages;
    public Book (String n, int a){
        name = n;
        pages = a;
    }
    public Book(String n){
        name = n;
        pages = 0;
    }
    public Book () {
        name = "Romeo and Juliet";
        pages = 0;
    }
    public void setPages (int pages){
        this.pages = pages;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName  (String name){
        return name;
    }
    public int getPages (){
        return pages;
    }
    public String toString (){
        return this.name+", with "+this.pages;
    }
    public void intoHumanDeameter (){
        System.out.println(name+" has "+pages*7+"pages");
    }
}
