    import java.util.*;
    public class  NodeLinkedList <T> {
        T data;
        NodeLinkedList <T>  next;
        NodeLinkedList(T data){
            this.data=data;
            next=null;
        }
        public static void print(NodeLinkedList <Integer> head){
            NodeLinkedList <Integer> temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public static int length( NodeLinkedList <Integer> head){
            int count=0;
            while(head!=null){
                count++;
                head=head.next;
            }
            return count;

        }
        public static void deleteNode(NodeLinkedList<Integer> head,int pos){
            int count=1;
             NodeLinkedList<Integer>temp=head;
             while(count<pos-1){
                 temp=temp.next;
                 count++;
             }
             temp.next=temp.next.next;
        }
        public static NodeLinkedList<Integer> TakeInput(){
            Scanner s=new Scanner(System.in);
            NodeLinkedList<Integer> head = null;
            NodeLinkedList<Integer> tail = null;
            System.out.println("Enter the values which you want to inset in linked list");
            int data=s.nextInt();
            while(data!=-1){
                NodeLinkedList<Integer> currentNode=new NodeLinkedList<>(data);
                if(head==null){
                    head=currentNode;
                    tail=currentNode;
                }else{
                    tail.next=currentNode;
                    tail=tail.next;
                    // or we can also do like this--> tail=currentNode;
                }
                data=s.nextInt();
            }
            return head;
        }
        public static void main(String[]args){
            NodeLinkedList <Integer> head=TakeInput();
            System.out.println("your values inside the linked list is");
            System.out.println("Enter the value in which you want to search in a linked list");
            deleteNode(head,3);
            print(head);
            System.out.println("\nlength of this linkedlist is   "+length(head));
        }
    }



