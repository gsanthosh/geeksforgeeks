/**
 * 
 */
package com.santhosh.geeksforgeeks.queue;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author santhosh
 *
 */
/*
The task is to design and implement methods of an LRU cache. The class has two methods get and set which are defined as follows.
get(x)   : Gets the value of the key x if the key exists in the cache otherwise returns -1
set(x,y) : inserts the value if the key x is not already present. If the cache reaches its capacity it should invalidate the least recently used item before inserting the new item.
In the constructor of the class the size of the cache should be intitialized.
 
Input:
The first line of input contain an integer T denoting the no of test cases. Then T test case follow. Each test case contains 3 lines. The first line of input contains an integer N denoting the capacity of the cache and then in the next line is an integer Q denoting the no of queries Then Q queries follow. A Query can be of two types
1. SET x y : sets the value of the key x with value y
2. GET x : gets the key of x if present else returns -1.

Output:
For each test case in a new line output will be space separated values of the query.

Constraints:
1<=T<=100
1<=N<=10
1<=Q<=100

Example(To be used only for expected output):
Input
2
2
2
SET 1 2 GET 1
2
7
SET 1 2 SET 2 3 SET 1 5 SET 4 5 SET 6 7 GET 4 GET 1

Output
2
5 -1
*/
class LRUCache {
    
	private LinkedList<CacheElement> queue =new LinkedList<>();
	private final int size;
	private HashMap<Integer,CacheElement> hashTable=new HashMap<>();
     
    /*Inititalize an LRU cache with size N */
    public LRUCache(int n) {
       size=n;
    }

	/*
	 * Returns the value of the key x if present else returns -1
	 */
	public int get(int x) {
       //Your code here
		CacheElement valueElement=hashTable.get(x);
		if(valueElement==null) {
			return -1;
		}
		valueElement.lastAccessed=new Date().getTime();
		queue.remove(valueElement);
		queue.add(valueElement);
		valueElement.queuePosition=queue.size();
		return valueElement.value;
    }

	/* Sets the key x with value y in the LRU cache */
	public void set(int x, int y) {
		CacheElement valueElement=hashTable.get(x);
		if(valueElement==null) {
			if(queue.size()==size) {
				valueElement=queue.remove();
				hashTable.remove(valueElement.key);
			}
			CacheElement insertedValue=new CacheElement(x, y);
			insertedValue.queuePosition=queue.size();
			queue.add(insertedValue);
			hashTable.put(x,insertedValue);
		}
		else {
			valueElement.value=y;
			valueElement.lastAccessed=new Date().getTime();
			queue.remove(valueElement);
			queue.add(valueElement);
			valueElement.queuePosition=queue.size();
		}
	}
	class CacheElement
	{
        int key;
        int value;
        int queuePosition;
        long lastAccessed=new Date().getTime(); 
		public CacheElement(int key, int value) {
			this.key = key;
			this.value = value;
			lastAccessed=new Date().getTime();
		}
	}
}

