/**
 * 
 */
package sortingalgorithms;

import java.util.Arrays;
import java.util.List;

/**
 * @author Logesh K
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(insertionSort(Arrays.asList(6,8,9,1,2,5)));
	}

	/**
	 * insertionSort method performs insertion sorting
	 * @param list
	 * @return list
	 */
	private static List<Integer> insertionSort(List<Integer> list) {
		int valueToInsert;
		int holePosition;
		for(int i=0;i<list.size();i++) {
			valueToInsert=list.get(i);
			holePosition = i;
			while(holePosition>0 && list.get(holePosition-1)>valueToInsert) {
				list.set(holePosition, list.get(holePosition-1));
				holePosition = holePosition-1;
			}
			list.set(holePosition, valueToInsert);
		}
		return list;
	}

}
