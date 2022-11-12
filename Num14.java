package SuppPractice;
import java.util.*;
/* Design a class named Queue for storing integers where elements are retrieved in a
first-in first-out fashion. The class should contain the following methods
bool isEmpty() checks if queue is empty or not
int getSize() return current number of elements in the queue
enqueue(int element) inserts an element into the queue
int dequeue(int element) removes one element from the queue. */

public class Num14 {
	protected int[] arr;
	protected int capacity;
	protected int start;
	protected int end;
	protected int index;
	protected int count;
	
	public Num14(int size) {
		this.arr = new int[size];
		this.capacity = size;
		this.start = 0;
		this.end = -1;
		this.index = 0;
		this.count = 0;
	}
	
	public boolean isEmpty( ) {
		return getSize() == 0;
	}
	
	public int getSize() {
		return arr.length;
	}
	
	public void enqueue(int element) {
		if (count >= this.capacity) {
			System.out.println("Capacity reached");
		}
		else {
			arr[count] = element;
			count++;
			
		}
	}
	
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		
		else {
			int[] r = new int[getSize() - 1];
			int j = 0;
			for (int i = 0; i < getSize(); i++) {
				if (i != 0) {
					r[j++] = arr[i];
				}
			}
			arr = r;
		}
	}
	
	public static void main(String[] args) {
		Num14 arr = new Num14(5);		
		

	}
}
