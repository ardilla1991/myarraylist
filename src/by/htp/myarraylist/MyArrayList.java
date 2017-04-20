package by.htp.myarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyArrayList<T> implements List{
	
	private Object[] arrayMy = (T[]) new Object[10];
	private int size;
	ArrayList a = new ArrayList();
	private static final int NUM_EL = 5;
	
	public boolean add(Object el) {
		ensureCapacity(size + 1);
		arrayMy[size++] = el;
		
		return true;
	}
	
	public void add(int pos, Object el) {
		ensureCapacity(size + 1);
		System.arraycopy(arrayMy, pos, arrayMy, pos + 1, size - pos);
		arrayMy[pos] = el;
		size++;
	}
	
	private void ensureCapacity(int newSize) 
	{
		if ( newSize > arrayMy.length ) {
			increaseArraySize();
		}	
	}

	private void increaseArraySize() {
		Object[] oldArray = arrayMy;
		Object[] arrayMy = new Object[this.arrayMy.length + NUM_EL];
		/*for (int i = 0; i < arrayMy.size; i++){
			serv[i] = arrayMy[i];
		}
		arrayMy = serv;*/
		System.arraycopy(arrayMy, 0, oldArray, 0, size);
	}
	
	public Object get(int pos) {
		if (pos > size || pos < 0)
			 throw new IndexOutOfBoundsException();
		return arrayMy[pos];
	}	

	public Stream parallelStream() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeIf(Predicate arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Stream stream() {
		// TODO Auto-generated method stub
		return null;
	}

	public void forEach(Consumer arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int arg0, Collection arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void replaceAll(UnaryOperator arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object set(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void sort(Comparator arg0) {
		// TODO Auto-generated method stub
		
	}

	public Spliterator spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public List subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
