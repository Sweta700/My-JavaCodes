import java.util.ArrayList;

public class ArrayLists {
public static void main(String[] args) {

   ArrayList<Integer>list = new ArrayList<>();
  //Add elememts
   list.add(1);
   list.add(2);
   list.add(4);
   System.out.println(list);

   //To get an element
   int element = list.get(0);  //0 is the idx
   System.out.println(element);

   //Add element in b/w
   list.add(2,3);
   System.out.println(list);

   //set element
   list.set(3,5);
   System.out.println(list);

   //delete
   list.remove(0);
   System.out.println(list);
   
   //size of list
   int size = list.size();
   System.out.println(size);

   //Loops on list
   for(int i=0;i<list.size();i++){
      System.out.print(list.get(i));
   }
      System.out.println(list);

}
}
