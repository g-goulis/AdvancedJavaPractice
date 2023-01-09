package DataStructures;

import java.util.LinkedList;

/**
 * Collections Framework:
 * ======================
 *
 * Set:
 *  - No Duplicate
 *  - Unordered
 *
 * List:
 *  - Allows Duplicates
 *  - Order is significant, non-random order
 *
 * Queue:
 *  - FIFO
 *  -
 *
 * Non-Collections:
 * ================
 *
 * Map:
 *  - Key Value Pairs
 *  -
 */
public class Main {
    public static void main(String args[]){

        /**
         * Linked List Example:
         */

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add(1, "C");

        System.out.println(list);

        list.remove("B");

        System.out.println(list);
    }
}
