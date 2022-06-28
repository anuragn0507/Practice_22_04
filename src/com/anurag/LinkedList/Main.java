package com.anurag.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(15);
//        list.insertFirst(8);
//        list.insertFirst(9);
//        list.insert(100,3);
//        list.insertLast(1);
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

          DLL dlist =new DLL();
          dlist.inserFirst(3);
          dlist.inserFirst(2);
          dlist.inserFirst(8);
          dlist.inserFirst(17);
//          dlist.revDisplay();
          dlist.insertLast(22);
          dlist.insert(17, 54);

          dlist.display();
          dlist.revDisplay();

    }
}
