// implementation of Queue
// by array  linear queue
// just wrote a comment
public class QueueByArray {
  int arr[];
  int beginning;
  int top;
  //int size;
  public QueueByArray(int size)
  {
    //this.size = size;
    arr= new int[size];
    beginning = -1;
    top = -1;
  }
  public boolean isEmpty()
  {
    if(top == -1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public boolean isFull()
  {
    if(top== arr.length-1)
    {
      return true;
    }
    else
      return false;
  }

  public  void enqueue(int value)
  {
    if(isFull())
    {
      System.out.println("overflow condition");
    }
    else if(isEmpty())
    {
        beginning = 0;
        top++;
        arr[beginning]= value;
    }
    else
    {
        top++;
        arr[top]= value;
    }
  }
  public void dequeue()
  {
    if(isEmpty())
    {
      System.out.println("underflow");
    }
    else
    {
      System.out.println(arr[beginning]);
      arr[beginning]= 0;
        beginning++;
    }
    if(beginning>top)
    {
      beginning = top = -1;
    }
  }
  public void peekinqueue() {
    if (isEmpty()) {
      System.out.println("empty");
    } else {
      System.out.println(arr[top]);
    }
  }
  public void deletequeue()
  {
    arr= null;
    System.out.println("Queue Deleted");
  }
  public void traverse()
  {
    for(int i =0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
















}
