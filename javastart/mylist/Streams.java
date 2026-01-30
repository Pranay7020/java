package mylist;

import java.util.stream.IntStream;

public class Streams {

    public static void main(String args[]) {
      IntStream.rangeClosed(1,10).map(n->n+1).forEach(System.out::print)
      
      ;

    }
}     

    
