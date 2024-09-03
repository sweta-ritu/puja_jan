
import java.util.Arrays;
import java.util.List;

import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    // Predicate = It takes an input &  produces a boolean value o/p
    public static void main(String[] args) {
        // Predicate<Integer> Val = x->x%2 == 0;
        //   boolean x = Val.test(100); // true
        //  boolean x = Val.test(101);// false
        //System.out.println(x);

        //  Predicate<Integer> Val = n->n%2!=0; //For integer type
        //   boolean result = Val.test(100);

        //  Predicate<String> Val = str->str.equals("mike");// String value
        //  boolean result = Val.test("adam");
        //  System.out.println(result);

        // List<Integer> data= Arrays.asList(10,20,26,45,32,100);
        //List<Integer> newData=data.stream().filter(n->n%2!=0).collect(Collectors.toList()) // for integer
        // System.out.println(newData);
        //  List <String> data = Arrays.asList("mike","stalline","mike","adam");
        //  List<String>  newData =
        //        data.stream().filter(s -> s.equals("mike")) // filet is used only predicate
        //startsWith ("m") = mike,madam
        //endsWith("m") = madam,adam
        // stream() is a method commonly used to convert collections or arrays into streams
        //    .collect(Collectors.toList());            // filter is used because filter elements
        //System.out.println(newData.size());// how many times we wriiten mike


        // function Functional Interface = It takes an input & produces o/p
       // Function<Integer, Integer> val = x -> x * x;
        //Integer result = val.apply(10);
        //System.out.println(result);

        List<Integer> data = Arrays.asList(10,20,13,20,23);
        List<Integer> newData =
                data.stream().map(x-> x*x). // map is using only functon functional interface
                    collect(Collectors.toList());
        System.out.println(newData);
    }
}
