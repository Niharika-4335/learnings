package learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee{
    private Integer id;
    private String name;

    public Employees(String name,int id) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return id + " "+name;
    }

    // to string
    public static void main(String xyz[]) {


        List<Employees> list=new ArrayList<>();
        list.add(new Employees("niharika",1));
        list.add(new Employees("xya",2));
        list.add(new Employees("uygfy",3));
        list.add(new Employees("hjgsdcy",4));
        list.add(new Employees("uygsdcyusd",5));
        list.add(new Employees("hsgvcgds",6));
        Comparator<Employees> emp1=(emp2,emp3)->{return emp2.getName().compareTo(emp3.getName());};
        Collections.sort(list,emp1);
        for(Employees emp:list){
            System.out.println(emp);
        }
    }
}
