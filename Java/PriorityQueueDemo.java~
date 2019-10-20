

import java.lang.System;
import java.lang.String;
import java.util.*;
import java.io.*;


class Node
{
	int vertex;
	int priority;

}

class PriorityQueue
{

	
	
	int size;
	ArrayList<Node> nl;
	boolean found;
	int pos,max;

	BufferedReader br;

	PriorityQueue() throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n\nEnter the size of priority queue");
			max=Integer.parseInt(br.readLine().trim());
			
		nl=new ArrayList<Node>(max);

		Node nd=new Node();

		nl.add(nd);
		
		found=false;
		pos=0;		
	
	}


	void insertNode(int vertex,int priority)
	{
			Node nd=new Node();
			
			nd.vertex=vertex;
			nd.priority=priority;

			nl.add(nd);

			int parent,child,val;
			

			child=nl.size()-1;
			parent=child/2;
			val=priority;

			
			while( parent > 0 && nl.get(parent).priority > val )
			{
		
				nl.set(child,nl.get(parent));
				child=parent;
				parent=child/2;	
			}

			nl.set(child,nd);	
				
	}


	void deleteMin()
	{
		Node n1,n2;

		if(nl.size()==2)
		{
			n1=nl.remove(1);
			System.out.println("object removed:"+n1.vertex+" "+n1.priority);
			return;
		}


		n1=nl.get(1);
		nl.set(1,nl.get(nl.size()-1));
		n2=nl.remove(nl.size()-1);

		percolateDown(1);

		System.out.println("Minimum Node removed:("+n1.vertex+","+n1.priority+")");
	}

	void searchNode(Node node,int vertex,int parent)
	{


		int child;
		child=parent*2;

		if(node.vertex==vertex && !found)
		{
			System.out.println("Found at:"+parent);
			found=true;
			pos=parent;
			return; 
		}
	
		if( child < nl.size() && !found)
		{
			searchNode(nl.get(child),vertex,child);

			if(child+1 < nl.size() && !found)
				searchNode(nl.get(child+1),vertex,child+1);
		}

	}


	void increaseKey(int vertex,int update)
	{
		searchNode(nl.get(1),vertex,1);

		if(!found)
		{
			pos=0;
			return;
		}
		
		if(nl.get(pos).priority >= update)
		{
			found=false;
			pos=0;
			return;
		}

		nl.get(pos).priority=update;
		percolateDown(pos);
		
		found=false;
		pos=0;
		

	}

	void decreaseKey(int vertex,int update) 
	{
		searchNode(nl.get(1),vertex,1);

		if(!found)
		{
			pos=0;
			return;
		}

		
		if(nl.get(pos).priority <= update)
		{
			found=false;
			pos=0;
			return;
		}

		nl.get(pos).priority = update;	

		percolateUp(pos);
		
		pos=0;
		found=false;

	}

	void deleteNode(int vertex)
	{
		searchNode(nl.get(1),vertex,1);

		if(!found)
		{
			pos=0;
			return;
		}

		nl.set(pos,nl.get(nl.size()-1));
		nl.remove(nl.size()-1);


		int child,parent;

		
		

		if( pos < nl.size() && nl.get(pos).priority < nl.get(pos/2).priority )
		{
			percolateUp(pos);
			found=false;
			pos=0;
			return;
		}


		parent=pos;
		child=parent*2;


		

		if(child < nl.size() && nl.get(parent).priority > nl.get(child).priority )
		{
		
				if(child+1 < nl.size() && nl.get(child+1).priority < nl.get(child).priority)
					child++;

				Node temp=nl.get(parent);
				nl.set(parent,nl.get(child));
				nl.set(child,temp);

				percolateDown(child);

				found=false;
				pos=0;
				return;
			
		}
		
		found=false;
		pos=0;
	}


	void percolateDown(int i)
	{
		int parent,child,val;

			Node w=nl.get(i);
			val=w.priority;

			parent=i;
			child=2*i;


			while(child < nl.size())
			{
				if(child+1 < nl.size() && nl.get(child+1).priority < nl.get(child).priority)
					child++;
				
				if(nl.get(child).priority >= val)
					break;

				nl.set(parent,nl.get(child));
				
				parent=child;
				child=parent*2;

			} 


			nl.set(parent,w);
	}


	void percolateUp(int i)
	{
		int parent,child,val;

		Node w=nl.get(i);
		val=w.priority;

		child=i;
		parent=child/2;

		while( parent>0 && val < nl.get(parent).priority)
		{	
			nl.set(child,nl.get(parent));
			child=parent;
			parent=child/2;	

		}

		nl.set(child,w);

	}


	void display()
	{	
		ListIterator li= nl.listIterator();
		Node w;
		
		w=(Node)li.next();

		while(li.hasNext())
		{
			w=(Node)li.next();
			System.out.println("( "+w.vertex+","+w.priority+" )");

		}
	}

	void findNode(int vertex)
	{
		searchNode(nl.get(1),vertex,1);
		
		found=false;
		pos=0;
	}

	
}


class PriorityQueueDemo
{


	public static void main(String args[]) throws IOException
	{


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;

		int x,y,z;
		boolean yn=true;

	
		PriorityQueue pq=new PriorityQueue();


		while(yn)
		{
			System.out.println("\n\n\n         Menu                 ");
			System.out.println("\t1-Insert");
			System.out.println("\t2-Search");
			System.out.println("\t3-Delete Minimum");
			System.out.println("\t4-Increase Key");
			System.out.println("\t5-Decrease Key");
			System.out.println("\t6-Delete Node");
			System.out.println("\t7-Display");
			System.out.println("\t8-Exit");

			System.out.println("\n\nEnter your choice:");
				int choice=Integer.parseInt(br.readLine().trim());


			switch(choice)
			{

				case 1:System.out.println("Enter the vertex number and priority:\n");
				       str=br.readLine().trim();
				       st=new StringTokenizer(str," ");
				       x=Integer.parseInt(st.nextToken());
				       y=Integer.parseInt(st.nextToken());
				       pq.insertNode(x,y);
				       break;

				case 2:System.out.println("Enter the vertex number to search:\n");
				       x=Integer.parseInt(br.readLine().trim());
				       pq.findNode(x);
				       break;


				case 3:pq.deleteMin();
				       break;


				case 4:System.out.println("Enter the vertex number and  new higher priority value:\n");
				       str=br.readLine().trim();
				       st=new StringTokenizer(str," ");
				       x=Integer.parseInt(st.nextToken());
				       y=Integer.parseInt(st.nextToken());
				       pq.increaseKey(x,y);
				       break;


				case 5:System.out.println("Enter the vertex number and  new lower priority value:\n");
				       str=br.readLine().trim();
				       st=new StringTokenizer(str," ");
				       x=Integer.parseInt(st.nextToken());
				       y=Integer.parseInt(st.nextToken());
				       pq.decreaseKey(x,y);
				       break;


				case 6:System.out.println("Enter the  id of node to delete:\n");
				       x=Integer.parseInt(br.readLine().trim());
				       pq.deleteNode(x);
				       break;


				case 7:pq.display();
				       break;

				case 8:yn=false;
				       break;
			
				default:System.out.println("Invalid Choice\n\n");

			}


		}

	}
			

}


		
	


