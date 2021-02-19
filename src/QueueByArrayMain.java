public class QueueByArrayMain {
  public static void main(String[] args) {
    QueueByArray obj = new QueueByArray(3);
    obj.enqueue(10);
    obj.enqueue(20);
    obj.enqueue(30);
    //obj.enqueue(40);
    obj.traverse();
    obj.dequeue();
    System.out.println("===========");
    obj.traverse();
  }
}
