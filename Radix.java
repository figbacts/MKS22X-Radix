import java.util.*;
@SuppressWarnings("unchecked")
public class Radix{
   public static void radixsort(int[]data){ // if length of bucket 0 + buctket 10  == length of data STOP
     MyLinkedList []Buckets = new MyLinkedList[10];
     MyLinkedList zero = new MyLinkedList();
     Buckets[0] = zero;
     MyLinkedList one = new MyLinkedList();
     Buckets[1] = one;
     MyLinkedList two = new MyLinkedList();
     Buckets[2] = two;
     MyLinkedList three = new MyLinkedList();
     Buckets[3] = three;
     MyLinkedList four = new MyLinkedList();
     Buckets[4] = four;
     MyLinkedList five = new MyLinkedList();
     Buckets[5] = five;
     MyLinkedList six = new MyLinkedList();
     Buckets[6] = six;
     MyLinkedList seven = new MyLinkedList();
     Buckets[7] = seven;
     MyLinkedList eight = new MyLinkedList();
     Buckets[8] = eight;
     MyLinkedList nine = new MyLinkedList();
     Buckets[9] = nine;
     MyLinkedList ary = new MyLinkedList();
     for(int i = 0; i < data.length; i ++){
       ary.add(data[i]);
     }
     //System.out.println(ary);
     int power = 1;
     int counter = 0;
     int times = 0;
     Object holder;
     //while(Buckets[0].size() != data.length){
      // for(int k =0 ; k <10; k ++){
      //   Buckets[k].clear();
       //}
       while (times != 2){
       while (counter != 10){
         holder = ary.removeFront();
        if (((int)holder / power)% 10 == 0){
          Buckets[0].add(holder);
          System.out.println(Buckets[0]);
        }
        if (((int)holder / power)% 10 == 1){
          Buckets[1].add(holder);
          System.out.println(Buckets[1]);
        }
        if (((int)holder / power)% 10 == 2){
          Buckets[2].add(holder);
          System.out.println(Buckets[2]);
        }
        if (((int)holder / power)% 10 == 3){
          Buckets[3].add(holder);
          System.out.println(Buckets[3]);
        }
        if (((int)holder / power)% 10 == 4){
          Buckets[4].add(holder);
          System.out.println(Buckets[4]);
        }
        if (((int)holder / power)% 10 == 5){
          Buckets[5].add(holder);
          System.out.println(Buckets[5]);
        }
        if (((int)holder / power)% 10 == 6){
          Buckets[6].add(holder);
          System.out.println(Buckets[6]);
        }
        if (((int)holder / power)% 10 == 7){
          Buckets[7].add(holder);
          System.out.println(Buckets[7]);
        }
        if (((int)holder / power)% 10 == 8){
          Buckets[8].add(holder);
          System.out.println(Buckets[8]);
        }
        if (((int)holder / power)% 10 == 9){
          Buckets[9].add(holder);
          System.out.println(Buckets[9]);
        }
        counter ++;
     }
    ary.clear();
    for (int j =0; j < 10; j ++){
      if (Buckets[j].size() != 0){
        ary.extend(Buckets[j]);
        Buckets[j].clear();
      }
 }
    System.out.println(ary);
    power = power * 10;
    times ++;
    counter = 0;
  //}
}
}
   public static void main(String[] args) {
     int[] data = {12,21,33,54,65,76,87,89,98,10};
     radixsort(data);

   }
}
