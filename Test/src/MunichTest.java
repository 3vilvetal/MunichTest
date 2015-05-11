import java.util.ArrayList;


public class MunichTest {
	
	/**
	 * Create new array
	 */
	public ArrayList<Integer> array = new ArrayList<Integer>();
	
	/**
	 * Main class for demo
	 * @param args
	 */
	public static void main (String args[]) {
		MunichTest test = new MunichTest();
		
		//add few values for test
		test.addElement(4);
		test.addElement(5);
		test.addElement(3);
		
		//1-st element is max value before circle
		int max = test.getElement(0);
		
		//find the max value in the array
		for (int i = 0; i < test.getSize(); i++) {
			if (max < test.getElement(i)) max = test.getElement(i);
		}
		System.out.println(max);
	}
	
	/**
	 * Add new element to array
	 * @param element
	 */
	public void addElement(int element) {
		array.add(element);
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

}
