import java.util.*;

interface Printable{
    void print();
}



public class Person implements Printable {
    public String name, student_name;

    public String getName(){return name;}
    public Person(String name){
        this.name=name;

    }

    public  void print(){
        System.out.printf("%s \n", name);
    }

    public void display(){
        System.out.println("Name:"+name);
    }






}
