package PepcodePractise;

import java.util.Scanner;

 public class ReverseLinkedList {
      static class NodeLinkedList<T> {
         T data;
         NodeLinkedList<T> next;
          static NodeLinkedList<Integer> head = null;
        static NodeLinkedList<Integer> tail = null;
       static int size=0;

         NodeLinkedList(T data) {
             this.data = data;
             next = null;
         }
          public static void print(NodeLinkedList<Integer> head) {
              NodeLinkedList<Integer> temp = head;
              while (temp != null) {
                  System.out.print(temp.data + " ");
                  temp = temp.next;
              }
          }

         public static NodeLinkedList<Integer> TakeInput() {
             Scanner s = new Scanner(System.in);

             System.out.println("Enter the values which you want to inset in linked list");
             int data = s.nextInt();
             while (data != -1) {
                 NodeLinkedList<Integer> currentNode = new NodeLinkedList<>(data);
                 size++;
                 if (head == null) {
                     head = currentNode;
                     tail = currentNode;
                 } else {
                     tail.next = currentNode;
                     tail = tail.next;
                     // or we can also do like this--> tail=currentNode;
                 }
                 data = s.nextInt();
             }
             return head;
         }

          public static NodeLinkedList<Integer> reverse() {
             if(size==0){
                 System.out.println("invalid input ll is empty");
                 return null;
             }else if(size==1){
                 System.out.println(head.data);
                 return head;
             }else{
                 
             }
          }
      }

     public static void main(String[] args) {
          NodeLinkedList<Integer> head= NodeLinkedList.TakeInput();
          NodeLinkedList.print(head);
          NodeLinkedList<Integer> newhead=NodeLinkedList.reverse();
     }
 }
