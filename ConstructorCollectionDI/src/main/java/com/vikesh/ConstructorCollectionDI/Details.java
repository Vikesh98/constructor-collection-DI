package com.vikesh.ConstructorCollectionDI;


import java.util.Iterator;
import java.util.List;

public class Details 
{
	private int id;
	private String name;
	private List<String> nickName;
	public  Details()
	{
		
	}
	public Details(int id,String name,List<String> nick)
	{
		super();
		this.id=id;
		this.name=name;
		this.nickName=nick;
	}
	public void display()
	{
		System.out.println(id+" "+name);
		Iterator<String> itr=nickName.iterator();
		while(itr.hasNext())
		System.out.println();
	}
}
