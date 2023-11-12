package collectionsFrameWork;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Queue {
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<String>();
        //adding elements:
        dq.add("Prabhat");
        dq.add("is");
        dq.add("a");
        dq.add("nice ");
        dq.add("guy");

        //print:
        System.out.println("Printing the queue");
        System.out.println(dq);

//        //Adding element first:
        System.out.println("Adding Element in first");
        dq.addFirst("Hey");
//
//        //print:
        System.out.println("Printing the queue");
        System.out.println(dq);
//
//        //Adding element last:
        System.out.println("Adding element in last");
        dq.addLast("really");

//        //print:
        System.out.println("Printing the queue");
        System.out.println(dq);

//        //Removing from first:
        System.out.println("Removing element from first");
            dq.removeFirst();
//
//        //print:
        System.out.println("Printing the queue");
        System.out.println(dq);
//
//        //removing from last:
        System.out.println("Removing element from last");
        dq.removeLast();
//
//        //print:
        System.out.println("Printing the queue");
        System.out.println(dq);
//
//        ///Itrating the queue :
//        System.out.println("Printing the queue by iteration");
//        for (Iterator itr = dq.iterator();
//             itr.hasNext();){
//            System.out.print(itr.hasNext()+" ");
//        }
//        System.out.println();
//        //Iterating from descending Order:
//        System.out.println("Printing the queue by iteration in descending order");
//        for (Iterator itr1 = dq.descendingIterator();
//        itr1.hasNext();){
//            System.out.print(itr1.hasNext()+" ");
//        }
//        System.out.println();


    }

}
