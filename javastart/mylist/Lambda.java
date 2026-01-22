package mylist;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String args[]){
        Consumer<String> c1 = c -> System.out.println("hi "+c);
        c1.accept("LTI");

        BiConsumer<Integer, Integer> bi = (a,b) -> {
            int n = a*b ; 
            System.out.println(n);
        };

        bi.accept(2, 5);



        BiConsumer<Integer, Integer> bi1 = (a,b) -> { int n = a+b;
            System.out.println(n);
        };
        bi1.accept(3,6);

        Consumer<String> c = s -> System.out.println("hii " +s);
        c.accept("Nikita");

        Predicate<Integer> p = n -> n==0;
        
        System.out.println(p.test(0));

        
    }
}
