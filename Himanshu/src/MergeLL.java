import java.util.Scanner;

public class MergeLL <T>{
     T data;
    MergeLL<T> next;

    MergeLL (T data){

        this.data=data;
        next=null;
    }
    public static void print(MergeLL<Integer> head) {
        MergeLL<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
    public static MergeLL<Integer> Merge(MergeLL<Integer> t1,MergeLL<Integer> t2){
        MergeLL<Integer> head=null;
        MergeLL<Integer> Tail= null;
        if(t1.data<=t2.data){
            head=t1;
            Tail=t1;
        } if(t2.data<t1.data){
            head=t2;
            Tail=t2;
        }
        while(t1!=null||t2!=null){
            if(t1.data<t2.data){
                t1.next=t2;
                Tail=t2;
                t1=t1.next;

            }else if(t2.data<t1.data){
                t2.next=t1;
                Tail=t1;
                t2=t2.next;

            }else{
                t1.next=t2;
                t1=t1.next;
                t2=t2.next;
            }
        }
        if(t1.next==null){
            t1.next=t2;
        }else{
            t2.next=t1;
        }
        return head;
    }
    public static MergeLL<Integer> TakeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        MergeLL<Integer> head=null;
        MergeLL<Integer> tail=null;
        while(data!=-1){
            MergeLL<Integer> currentNode=new MergeLL<>(data);
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
    public static void main(String[] args) {
        MergeLL <Integer>t1=TakeInput();
        MergeLL <Integer>t2=TakeInput();
        MergeLL<Integer> head=Merge(t1,t2);
        print(head);
    }
}
