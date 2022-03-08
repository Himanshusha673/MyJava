import java.util.Scanner;
public class Node
        <T>{
        T data;
        Node<T> next;

        Node(T data) {
            this.data=data;
            next=null;
        }
        public static Node<Integer> TakeInput(){
            Scanner sc=new Scanner(System.in);
            int data=sc.nextInt();
            Node<Integer> head=null;
            Node<Integer> tail=null;
            while(data!=-1){
                Node<Integer> currentNode=new Node<>(data);
                if(head==null){
                    head=currentNode;
                    tail=currentNode;
                }else{
                    tail.next=currentNode;
                    tail=tail.next;
                }
                data=sc.nextInt();
            }
            return head;
    }
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void search(int i, Node<Integer> head){
          int count=0;
          Node<Integer> temp =head;
          while(count<i&&temp!=null){
              if(count==i-1) {
                  System.out.println("your Searched value is---->>>>");
                  System.out.println(temp.data);
                  return;
              }
              else{
                  count++;
                  temp=temp.next;
              }
          }
        System.out.println("enter a valid position");
    }
    public static Node<Integer> insertNode(Node<Integer> head, int data, int pos){
            int count=1;
            Node<Integer> temp=head;
            Node<Integer> newNode=new Node<>(data);
            if(pos==1) {
                newNode.next = head;
                return newNode;
            }
            else{
                while(count<pos-1){
                    count++;
                    temp=temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;
                return head;
            }
    }
    public static Node<Integer> deleteNode(Node<Integer> head,int pos)

    {
        if (pos==1){
            return head=head.next;
        }

        int count=1;
        Node<Integer>temp=head;
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        return head;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Eneter values in Linked list and eneter '-1' at end for stop filling");
        Node<Integer> head = TakeInput();
        System.out.println("Do you want to continue press-->'Y'/'N'");
        char c = s.next().charAt(0);
        if (c == 'y' || c == 'Y') {

            do {
                System.out.println("press 1: For search a Number In Linked list");
                System.out.println("press 2: For Insert a Node");
                System.out.println("press 3: For Delete a Node");
                System.out.println("press 4: For print your LinkedList");
                System.out.println("press 5: for exit");
                int i = s.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Enter the position no. on which you want to search a element in linked list");
                        int b = s.nextInt();
                        search(b, head);
                        break;
                    case 2:
                        System.out.println("enter a no.which you want to insert");
                        int d = s.nextInt();
                        System.out.println("Enter a position on which you want to place " + d);
                        int pos = s.nextInt();
                        head = insertNode(head, d, pos);
                        System.out.println("now your value " + d + " is inserted at" + pos + " positon");
                        System.out.println("do you want to print yout updated list press;'y' for print and 'N' not Print");
                        char ch = s.next().charAt(0);
                        if (ch == 'y' || ch == 'Y') {
                            print(head);
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("Enter the position no. of Node which you want to delete");
                        int position = s.nextInt();
                        head=deleteNode(head, position);
                        System.out.println();
                        break;
                    case 4:
                        print(head);
                        break;
                    case 5:
                        System.out.println("THANKYOU FOR USING HIMANSHU'S PROGRAMM");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter an invalid choice \n\n THANKYOU FOR USING HIMANSHU PROGRAMM");
                        return;
                }

            } while (true);
        }
        else{
            return;
        }
    }
}
