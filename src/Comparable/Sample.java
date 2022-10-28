package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample {

    int age;
    String name;

    @Override
    public String toString() {
        return "Sample{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Sample(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Sample() {
    }

    //
//    @Override
//    public int compareTo(Sample o) {
//      return name.compareTo(o.name);
//    }
 public static void main(String[] args) {

        Sample s = new Sample();
        s.call();


 }
    void call(){
            
        List<Sample> list = new ArrayList<>();
        list.add(new Sample(23,"geetha"));
        list.add(new Sample(21,"mega"));
        list.add(new Sample(32,"sam"));

        Collections.sort(list,new Test().reversed());
       
        System.out.println(list);
        
         Collections.sort(list,new Test());

        System.out.println(list);
}

class Test implements Comparator<Sample>{

    @Override
    public int compare(Sample o1, Sample o2) {
        return o1.age-o2.age;
    }
}

class Test1 implements Comparator<Sample>{

    @Override
    public int compare(Sample o1, Sample o2) {
        return o1.name.compareTo(o2.name);
    }
}}
