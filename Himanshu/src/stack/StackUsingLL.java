package stack;


public class StackUsingLL<T>{
        T data;
     StackUsingLL<T> head;
     StackUsingLL<T> next;
   private int size;
   StackUsingLL(){
       this.head=null;
       size=0;
   }
   StackUsingLL(T data){
       this.data=data;
       this.next=null;


   }


    int size(){
        return size;
    }
    boolean isEmpty(){
        return(size==0);

    }
    T top()   {
       try {
           if (size == 0) {
           }
       } catch(Exception e){

       }
        return head.data;

    }
    void push(T element) {
        StackUsingLL<T> newNode=new StackUsingLL<>(element);
        newNode.next=head;
        head=newNode;
        size++;
    }
    T  pop () throws StackEmptyException{
        if(size==0){
            throw new StackEmptyException();
        }
        T temp=head.data;
        head=head.next;
        size--;
        return temp;
    }

    public static void main(String[] args) throws StackEmptyException {
  StackUsingLL<Integer> stack=new StackUsingLL<>();

  stack.push(20);
  stack.push(15);
  stack.push(10);
  try {
      System.out.println(stack.pop());
  }catch(Exception e){
      System.out.println("Himanshu");
        }

            System.out.println(stack.top());


        System.out.println(stack.size());
        System.out.println(stack.isEmpty());


    }
}
