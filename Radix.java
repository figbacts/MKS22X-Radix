import java.util.*;
@SuppressWarnings("unchecked")
public class Radix{
   public static void radixsort(int[]data){ // if length of bucket 0 + buctket 10  == length of data STOP
     MyLinkedList []Buckets = new MyLinkedList[20];
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
     MyLinkedList ten = new MyLinkedList();
     Buckets[10] = ten;
     MyLinkedList oneteen = new MyLinkedList();
     Buckets[11] = oneteen;
     MyLinkedList twoteen = new MyLinkedList();
     Buckets[12] = twoteen;
     MyLinkedList threeteen = new MyLinkedList();
     Buckets[13] = threeteen;
     MyLinkedList fourteen = new MyLinkedList();
     Buckets[14] = fourteen;
     MyLinkedList fiveteen = new MyLinkedList();
     Buckets[15] = fiveteen;
     MyLinkedList sixteen = new MyLinkedList();
     Buckets[16] = sixteen;
     MyLinkedList seventeen = new MyLinkedList();
     Buckets[17] = seventeen;
     MyLinkedList eightteen = new MyLinkedList();
     Buckets[18] = eightteen;
     MyLinkedList nineteen = new MyLinkedList();
     Buckets[19] = nineteen;
     MyLinkedList ary = new MyLinkedList();
     for(int i = 0; i < data.length; i ++){
       ary.add(data[i]);
     }
     //System.out.println(ary);
     int power = 1;
     int counter = 0;
     //int times = 0;
     Object holder;
     int place;
     //while(Buckets[0].size() != data.length){
      // for(int k =0 ; k <10; k ++){
      //   Buckets[k].clear();
       //}
       while (Buckets[9].size() + Buckets[10].size()!= data.length){
         for(int k =0 ; k <20; k ++){
            Buckets[k].clear();
          }

       while (counter != 10){
         holder = ary.removeFront();
         //System.out.println(power);
         place = (int)holder / power % 10;
         if((int)holder <0){
           if (place == 0){
             Buckets[9].add(holder);
             //System.out.println(Buckets[0]);
           }
           if (place == -1){
             Buckets[8].add(holder);
             //System.out.println(Buckets[1]);
           }
           if (place == -2){
             Buckets[7].add(holder);
             //System.out.println(Buckets[2]);
           }
           if (place == -3){
             Buckets[6].add(holder);
             //System.out.println(Buckets[3]);
           }
           if (place == -4){
             Buckets[5].add(holder);
             //System.out.println(Buckets[4]);
           }
           if (place== -5){
             Buckets[4].add(holder);
             //System.out.println(Buckets[5]);
           }
           if (place == -6){
             Buckets[3].add(holder);
             //System.out.println(Buckets[6]);
           }
           if (place== -7){
             Buckets[2].add(holder);
             //System.out.println(Buckets[7]);
           }
           if (place== -8){
             Buckets[1].add(holder);
             //System.out.println(Buckets[8]);
           }
           if (place== -9){
             Buckets[0].add(holder);
             //System.out.println(Buckets[9]);
           }
         }
         else {
        if (place == 0){
          Buckets[10].add(holder);
          //System.out.println(Buckets[0]);
        }
        if (place == 1){
          Buckets[11].add(holder);
          //System.out.println(Buckets[1]);
        }
        if (place == 2){
          Buckets[12].add(holder);
          //System.out.println(Buckets[2]);
        }
        if (place == 3){
          Buckets[13].add(holder);
          //System.out.println(Buckets[3]);
        }
        if (place == 4){
          Buckets[14].add(holder);
          //System.out.println(Buckets[4]);
        }
        if (place== 5){
          Buckets[15].add(holder);
          //System.out.println(Buckets[5]);
        }
        if (place == 6){
          Buckets[16].add(holder);
          //System.out.println(Buckets[6]);
        }
        if (place== 7){
          Buckets[17].add(holder);
          //System.out.println(Buckets[7]);
        }
        if (place== 8){
          Buckets[18].add(holder);
          //System.out.println(Buckets[8]);
        }
        if (place== 9){
          Buckets[19].add(holder);
          //System.out.println(Buckets[9]);
        }
     }
     counter ++;
   }
    ary.clear();
    for (int j =0; j < 20; j ++){
      if (Buckets[j].size() != 0){
        //System.out.println(Buckets[j]);
        ary.extend(Buckets[j]);
        //Buckets[j].clear();
      }
}
    //System.out.println(ary);
    power = power * 10;
    counter = 0;
    //System.out.println(ary);
  //}
}
//System.out.println(ary);
}
   public static void main(String[] args) {
     int[] data = {12,21,33,54,65,76,87,89,-98,10};
     radixsort(data);

   }
}
