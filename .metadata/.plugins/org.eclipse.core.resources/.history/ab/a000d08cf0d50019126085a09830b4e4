package com.bridgelabz.data_structure;
import java.io.*;
import java.util.*;
public class P1UnOrderedList {
	
	static class Node
	{
		String data;
		Node next;
	}
	static Node head;
	public static P1UnOrderedList insert(String data)
	{
		P1UnOrderedList list = new P1UnOrderedList();
		Node newnode=new Node();
		newnode.data=data;
		
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newnode;
		}
		return list;
					
	}
	
	public static P1UnOrderedList deleteAt(int pos)
	{
		P1UnOrderedList list = new P1UnOrderedList();
		Node n=head;
		Node node=new Node();
		if(pos==0)
		{
			head=head.next;
		}
		else
		{
			for (int i = 0; i < pos-1; i++) {
				n=n.next;	
			}
			node=n.next;
			n.next=node.next;
		}
		return list;
	}
	
	public static void display(P1UnOrderedList list)
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of words you want to enter");
		int n=sc.nextInt();
		System.out.println("Enter the word to be searched");
		String search1=sc.nextLine();
		
		P1UnOrderedList list = new P1UnOrderedList();
		File f=new File("/home/user/Desktop/vishnu/input for programs/unOrdered.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String []s1=new String[n];
		String s="";
	
		while((s=br.readLine())!=null)
		{
			s1=s.split(" ");
		}
		
		for(int i=0;i<s1.length;i++)
		{
			list=list.insert(s1[i]);
		}
		//display(list);
		int x1=0;
		
		System.out.println(search1);
		
		Node node=P1UnOrderedList.head;
		for (int i = 0; i < 5; i++) {
			if((node.data).equals(search1))
			{
				list.deleteAt(i);
				x1=1;
				break;
			}
			else
			{
				node=node.next;
			}
		}
		if(x1==0)
		{
			list.insert(search1);
		}
		
		display(list);
	}

}
