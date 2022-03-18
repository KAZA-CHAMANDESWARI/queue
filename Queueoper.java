import java.util.*;  
public class Queueoper{  
public static void main(String[] args) {   
Queue<Integer> deque = new ArrayDeque<Integer>();  
deque.add(13);  
deque.add(15);  
deque.add(16);
deque.add(25);
deque.add(45);
deque.add(65);
System.out.println(deque+"\n");
System.out.println(deque.remove());
System.out.println(deque.remove());
System.out.println(deque);

}  
}  