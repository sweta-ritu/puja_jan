package ums;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C {
    public static void main(String[] args) {
    //    List<String> names = Arrays.asList("john","paul","george","ringo","john","paul");
        //Map<String, List<String>> newList =

     //   Map<String, Long> newData =
    //    names.stream().collect(Collectors.groupingBy(
    //            name -> name, Collectors.counting()
    //    ));
     //   System.out.println(newData);


        List<Student> students = Arrays.asList(
                new Student(1,"mike",1000),
                new Student(2,"sweta",2000),
                new Student(3,"ritu",1000)
        );
        Map<Integer,Long > newStu = students.stream().collect(Collectors.groupingBy
                (stu -> stu.getFees(), Collectors.counting()
                ));
        System.out.println(newStu);



    }
}
