import java.util.ArrayList;


public class MunichTest {
	
	/**
	 * Create new array
	 */
	public ArrayList<Integer> array = new ArrayList<Integer>();
	public int max = Integer.MIN_VALUE;
	
	/**
	 * Main class for demo
	 * @param args
	 */
	public static void main (String args[]) {
		MunichTest test = new MunichTest();
		
		//add few values for test
		test.addElement(-4);
		test.addElement(-5);
		test.addElement(-3);
		
		System.out.println(test.getMaxElement());
	}
	
	/**
	 * Add new element to array
	 * @param element
	 */
	public void addElement(int element) {
		array.add(element);
		checkMaxElement(element);
	}
	
	/**
	 * Get element by index
	 * @param index
	 * @return
	 */
	public int getElement(int index) {
		return array.get(index);
	}
	
	/**
	 * Get the size of the array
	 * @return
	 */
	public int getSize() {
		return array.size();
	}
	
	/**
	 * Get max value from array
	 * @param array
	 * @return
	 */
	public int getMax(ArrayList<Integer> array) {
		int max = array.get(0); //1-st element is max value before circle
		for (int i = 0; i < array.size(); i++) { //find the max value in the array
			if (max < array.get(i)) max = array.get(i);
		}
		return max;
	}
	
	/**
	 * Define max element
	 * @return
	 */
	public void checkMaxElement(int number) {
		if (max < number) max = number;
	}
	
	/**
	 * Return max element
	 * @return
	 */
	public int getMaxElement() {
		return max;
	}

}
