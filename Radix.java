import java.util.*;
@SuppressWarnings("unchecked")
public class Radix{
   public static void radixsort(int[]data){ // if length of bucket 0 + buctket 10  == length of data STOP
     MyLinkedList[]Buckets = new MyLinkedList[20];
     MyLinkedList zero = new MyLinkedList();
     Buckets[0] = zero;
     MyLinkedList one = new MyLinkedList();
     Buckets[1] = one;
     MyLinkedList two = new MyLinkedList();
     Buckets[2] = two;
     MyLinkedList three = new MyLinkedList();
     Buckets[3] = three;     
      }
   public static void main(String[] args) {
     int[] data = {0,1,2,3,4,5,6,7,8,9};
     radixsort(data);

   }
}
