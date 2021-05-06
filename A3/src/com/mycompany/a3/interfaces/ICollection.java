package com.mycompany.a3.interfaces;

import com.mycompany.a3.GameObject;

public interface ICollection
{
	public void add(GameObject object);
	public IIterator getIterator();
}
