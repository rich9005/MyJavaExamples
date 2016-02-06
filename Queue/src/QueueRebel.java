
public class QueueRebel {
Object [] theQueue;
int rear;
int front;

void Queue(int capacity){
	theQueue = new Object[capacity];
	front = 0;
	rear = -1;
}
void Queue(){
	theQueue = new Object[5];
}


boolean isEmpty(){
	if (rear < front)
		return true;
	else
		return false;
}

boolean isFull(){
	if (rear == theQueue.length)
		return true;
	else
		return false;
		
}
void enqueue (Object x)
{
	if(isFull())
		System.out.println("queue is full");
		else
		{
			rear = rear + 1;
			theQueue[rear] = x;
			System.out.println("element inserted" +theQueue[rear]);
		}
}

void dequeue(){
	if(isEmpty())
		System.out.print("Queue is Empty");
	else
	{
		System.out.println("FRoNT has gone" +theQueue[front]);
		front = front + 1;
		
	}
}

public static void main (String[] args)
{
	QueueRebel qr = new QueueRebel();
	qr.Queue();
	qr.enqueue(3);
}
}
