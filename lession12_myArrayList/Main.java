package lession12_myArrayList;

/**
 * The Main class realization function add and remove in class MyArrayList
 * @author ARTUR
 * @since JDK 13.0.2
 */

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("new array created...");

		MyArrayList z = new MyArrayList();

		for (int i = 0; i < 20; i++) {
			z.add(i);
		}
		System.out.print(z);
		System.out.println(" count=" + z.count+", capacity="+z.capacity);
		z.add("10");
		System.out.print(z);
		System.out.println(" count=" + z.count+", capacity="+z.capacity);
		System.out.println("remove element #9...");
		z.remove(9);
		System.out.println("remove element #9...");
		z.remove(9);
		System.out.print(z);
		System.out.println(" count=" + z.count+", capacity="+z.capacity);
		System.out.println("remove element #0...");
		z.remove(0);
		System.out.println("remove element #0...");
		z.remove(0);
		System.out.print(z);
		System.out.println(" count=" + z.count+", capacity="+z.capacity);
		System.out.println("remove element count-1...");
		z.remove(z.count - 1);
		System.out.print(z);
		System.out.println(" count=" + z.count+", capacity="+z.capacity);
		z.add("100");
		System.out.print(z);
		System.out.println(" count=" + z.count+", capacity="+z.capacity);
	}

}
