package lession12_myArrayList;

/**
* Realization function add and remove  in class MyArrayList
* @author ARTUR
* @since JDK 13.0.2
*/

import java.util.Arrays;

public class MyArrayList {
	Object[] element;

	int count = 0;
	int capacity = 5;

	public MyArrayList() {
		this.element = new Object[count];
	}

	public Object[] getElementData() {
		return element;
	}

	public Object[] getElement() {
		return element;
	}

	public void setElement(Object[] element) {
		this.element = element;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void add(Object object) {
		System.out.println("Add element ... ,count=" + (count+1) + ",capacity=" + capacity);

		if (count < element.length) {
			element[count] = object;
			count++;
		} else {

			Object[] newElement = new Object[count + 1];
			for (int i = 0; i < element.length; i++) {
				newElement[i] = element[i];
			}
			if (capacity <= count) {
				capacity = (int) (capacity * 1.6);
				System.out.println("capasity * 1.6");
				element = new Object[capacity];
			} else {
				element = new Object[capacity];
			}

			for (int i = 0; i < newElement.length; i++) {
				element[i] = newElement[i];
			}
			element[count] = object;
			count++;

		}
	}

	public void remove(int index) throws Exception {

		if (index < 0)
			throw new Exception("error: index cannot be <0");

		if (index >= element.length) {
			throw new Exception("error: index > length array");
		} else {
			for (int i = index; i < element.length - 1; i++) {
				element[i] = element[i + 1];
			}
			element[element.length - 1] = null;
			count = count - 1;
		}
	}

	public void removeNull() {
	}

	@Override
	public String toString() {
		int newSize = 0;
		Object[] temp = new Object[newSize];
		for (int i = 0; i < element.length; i++) {
			if (element[i] == null) {
				newSize = i;
				break;
			}
		}
		temp = new Object[newSize];

		for (int i = 0; i < newSize; i++) {
			temp[i] = element[i];
		}
		element = new Object[newSize];
		for (int i = 0; i < newSize; i++) {
			element[i] = temp[i];
		}
		return Arrays.toString(element);
	}
}
