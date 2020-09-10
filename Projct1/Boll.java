package Projct1;
import java.lang.*;
public class Boll{
        private String color;
        private int deameter;

        public Boll(String n, int a){
            color = n;
            deameter = a;
        }
        public Boll(String n){
            color = n;
            deameter = 0;
        }
        public Boll() {
            color = "red";
            deameter = 0;
        }
        public void setDeameter(int age){
            this.deameter = deameter;
        }
        public void setName(String color){
            this.color = color;
        }
        public String getColor(String color){
            return color;
        }
        public int getDeameter(){
            return deameter;
        }
        public String toString (){
            return this.color+", deaeter "+this.deameter;
        }
        public void intoHumanDeameter (){
            System.out.println(color+"wiht deameter "+deameter*7+"cm");
        }
    }

