package ums;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
   //     List<Employee> employees = Arrays.asList(
     //           new Employee(2, "mike", 9000),
      //          new Employee(1, "sweta" , 8000),
      //          new Employee(3, "ritu", 7000)
       // );
     //   List<Employee> newEmployees = employees.stream().
      //          filter(e->e.getSalary()>7000)
      //          .collect(Collectors.toList());

    //    for(Employee employee : newEmployees){
     //       System.out.println(employee.getName());
     //       System.out.println(employee.getSalary());
     //       System.out.println(employee.getId());
      //  }

        // consumers : consumer is taking input  but produces  no output

      //  Consumer<String> val = x-> System.out.println(x); // consumer is taking input  but produces  no output
        //    val.accept("hello");

                    //SUPPLIER : supplier does not take input but produces output
        Supplier<String> val = ()-> "Hello world";
        String s = val.get();
        System.out.println(s);

    }

}
