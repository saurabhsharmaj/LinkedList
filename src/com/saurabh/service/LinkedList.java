package com.saurabh.service;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

import com.saurabh.model.Node;

public class LinkedList {

	private Node item;
	private AtomicInteger size =new AtomicInteger(0);
	
	public int size() {
		return size.get();
	}

	public boolean isEmpty() {
		return size.get()==0?true:false;
	}

	public boolean contains(Object o) {
		return false;
	}

	public Iterator<Node> iterator() {
		return null;
	}

	public Node[] toArray() throws Exception {
		if(size.get()==0)
			throw new Exception("List is empty.");
		Node [] nodes = new Node[size.get()];
		int index =0;
		Node home = item;
		do{
		  nodes[index++]=home;
		}while((home=home.getNext()) !=null);
		return nodes;
	}
	
	public Node getNode(int pos) throws Exception {
		if(size.get()==0)
			throw new Exception("List is empty.");
		int index =0;
		Node home = item;
		do{
		  if(index++==pos-1) {
			  return home;
		  }
		}while((home=home.getNext()) !=null);
		return null;
	}

	public boolean add(Node e) throws Exception {
		if (item == null) {
			item = e;
			size.getAndIncrement();
		} else {
			Node lastNode = getLastNode(item);
			lastNode.setNext(e);
			size.getAndIncrement();
		}
		return true;
	}

	private Node getLastNode(Node item) throws Exception {
		if(size.get()==0)
			throw new Exception("List is empty.");
		if(item.getNext() == null)
			return item;
		else
			return getLastNode(item.getNext());
		
	}

	public boolean remove(Node item) {
		return false;
	}

	public void clear() {
		item=null;
		size =new AtomicInteger(0);
	}

	public Node remove(int index) {
		return null;
	}

	public void printAll() throws Exception {
		if(size.get()==0)
			throw new Exception("List is empty.");
		Node home = item;
		do{
			System.out.println(home.getValue()+"\t");
		}while((home=home.getNext()) !=null);
	}

	public void removeLast() throws Exception {
		Node secondLastNode = getNode(size.get()-1);
		secondLastNode.setNext(null);
		size.getAndDecrement();
	}
}
