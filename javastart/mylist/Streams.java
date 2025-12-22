package mylist;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {

    public static void main(String args[]) {
       List<Integer> list = Arrays.asList(3,1,2,6,4);
       Predicate<Integer> p = n -> n%2==0;
       long c=list.stream().filter(p).count();
        System.out.println(c);

    }
    
}
