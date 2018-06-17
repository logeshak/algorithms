/**
 * 
 */
package sortingalgorithms;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Logesh K
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(selectionSort(Arrays.asList(6,8,9,1,2,5)));
	}

	private static List<Integer> selectionSort(List<Integer> list) {
		int replaceValue;
		int minIndex = 0;
		for(int i=0;i<list.size();i++) {
			minIndex = i;
			for(int j=i;j<list.size();j++) {
				if(list.get(j)<list.get(minIndex)) {
					minIndex = j;
				}
			}
			replaceValue = list.get(i);
			list.set(i, list.get(minIndex));
			list.set(minIndex, replaceValue);
		}
		return list;
	}

}
