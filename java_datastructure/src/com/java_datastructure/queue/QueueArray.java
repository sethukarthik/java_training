package com.java_datastructure.queue;

//Enqueue and Dequeue data from the Queue
class QueueArray {
	static final int SIZE = 3;
	int arr[] = new int[SIZE];
	
	int front = 0;
	int rear = 0;
	
	public void enqueue(int val) {
		if (rear == SIZE) {
			System.out.println("Queue size is full");
		}else {
			arr[rear] = val;
			rear++;
		}
	}
	
	public void dequeue() {
		if (front == rear) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Dequeue element: " + arr[front]);
			front++;
		}
	}

	//Initializing the Queue
	public static void main(String[] args) {
		QueueArray q = new QueueArray();
		// inserting element into the queue			
		System.out.println("Enqueuing element: " + 10);
		q.enqueue(10);
		System.out.println("Enqueuing element: " + 20);
		q.enqueue(20);
		System.out.println("Enqueuing element: " + 30);
		q.enqueue(30);
		// deleting element from the queue
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}
}
