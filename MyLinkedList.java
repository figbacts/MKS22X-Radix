@SuppressWarnings("unchecked")
class MyLinkedList<E>{
  class Node{
 private E data;
 private Node next,prev;
 public Node(Node prev2, E number, Node next2){
   prev = prev2;
   data = number;
   next = next2;
 }
 public Node next(){
   return next;
 }
 public Node prev(){
   return prev;
 }
 public void setNext(Node other){
   next = other;
 }
 public void setPrev(Node other){
   prev = other;
 }
 public E getData(){
   return data;
 }
 public E setData(E i){
   data = i;
   return data;
 }
 public String toString(){
   return data +"";
 }
}
 private int size;
 private Node start,end;
 public MyLinkedList(){
   start = new Node(null, null, null);
   end = new Node (null,null,null);
 }
 public int size(){
   return size;
 }
 public boolean add(E value){
   if(size == 0){
     Node add = new Node(null,value,null);
     start.setNext(add);
     end.setPrev(add);
     size += 1;
    return true;
   }
   if (size != 0){
   Node pre = end.prev();
   Node add = new Node(pre, value, null);
   pre.setNext(add);
   end.setPrev(add);
   size += 1;
   return true;
 }
 return false;
 }

 public String toString(){
   if (size == 0){
     return "[]";
   }
   String ans = "[";
   Node current = start.next();
   while (current.next() != null){
   ans = ans + current.getData() + ", ";
   current = current.next();
    }
    ans = ans + current.getData()+ "]";
    return ans;
 }

public E remove(){
    E ans = start.next().getData();
    Node current = start.next().next();
    current.setPrev(null);
    start.setNext(current);
    size -= 1;
    return ans;
}
public E removeFront(){
  Node current = start.next();
  start.setNext(current.next());
  current.next().setPrev(start);
  return current.getData();
}
public void clear(){
Node blank = new Node(null,null,null);
start.setNext(blank);
end.setPrev(blank);
}
public void extend(MyLinkedList other){
     //in O(1) runtime, move the elements from other onto the end of this
     //The size of other is reduced to 0
     //The size of this is now the combined sizes of both original lists
  end.prev().setNext(other.start.next());
  other.start.setPrev(end.prev());
  end.setPrev(other.end.prev());
  size = size + other.size();
  other = this;
}

}
