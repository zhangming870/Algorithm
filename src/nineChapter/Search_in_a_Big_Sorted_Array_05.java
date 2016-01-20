package nineChapter;

public class Search_in_a_Big_Sorted_Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public int searchBigSortedArray(ArrayReader reader, int target) {
        // Algorithm:
        // 1. get the index that ArrayReader.get(index) >= target or == -1 in
        //    O(logk)
        // 2. Binary search the target between 0 and index
        
        int index = 1;
        while (reader.get(index - 1) < target && reader.get(index - 1) != -1) {
            index = index * 2;
        }
        
        int start = 0, end = index - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (reader.get(mid) < target && reader.get(mid) != -1) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (reader.get(start) == target) {
            return start;
        }
        
        if (reader.get(end) == target) {
            return end;
        }
        
        return -1;
    }
}

abstract class ArrayReader 
{
	// get the number at index, return -1 if not exists.
	public abstract int get(int index);
}
