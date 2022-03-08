package Queues;


public class QueueUsingArrays {
    private int []data;
    private int front;
    private int rear;
    private int size;
    class QueueEmptyException extends Exception{

    }class QueueFullException extends Exception{

    }
    public QueueUsingArrays(){
        data=new int[10];
        front=-1;
        rear=-1;
        size=0;
    }
    public QueueUsingArrays(int length){
        data=new int[length];
        front=-1;
        rear=-1;
        size=0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return(size==0);
    }
    int front(){
       try {
           if (size == 0) {
               throw new QueueEmptyException();
           }
       }catch(QueueEmptyException e){
           System.out.println("There is no wlwment inside the Queue");
           e.printStackTrace();
       }
       return data[front];

    }
    void enqueue(int element){
        try {
            if (size == data.length) {
                throw new QueueFullException();
            }
        }catch(QueueFullException e){
            System.out.println("Queue is full");
        }
        if(size==0){
            front=0;
        }
        size++;
        rear=(rear+1)% data.length;
        data[rear]=element;
    }
    int dequeue()throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        size--;
        int temp=data[front];
        front=(front+1)%data.length;
        //condition when all elements are filled and dequed and now we want to
        //insert a value then this time front and rear both represent 0 nowt -1 so we need to resset it
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }

    public static void main(String[] args)throws QueueEmptyException {
        QueueUsingArrays queue=new QueueUsingArrays();
        for(int i=1;i<=5;i++){
            queue.enqueue(i);
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.front());
        System.out.println("NOw remaining queue is");
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }


    }
}
