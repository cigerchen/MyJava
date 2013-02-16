package subStackFrames;

public class BinarySearch {

	/**
	 * @param args
	 */
	// search a SORTed array, for value "FindMe"
	// if found, return the array index;
	// if not return "FAILURE"
	
	//Recursion base cases:
	// 1. FindMe=middle, return index, end ;
	// 2. Sub-array of length zero, return failure;
	public static final int FAILURE = -1;
// search 1--10,6--10,>>>8,9,10>>8(+1),9,10(-1)>>>9,9,9(not found)>>>9(+1),9,9(-1)>>>left>right return failure
	private static int bsearch(int[]i,int left,int right,int findMe){
		if(left>right){return FAILURE;}
		int mid = (left+right)/2;
		if(findMe==i[mid]){
			return i[mid];
		}else if (findMe<i[mid]){
			return bsearch(i,left,mid-1,findMe);
		}else {
			return bsearch(i,mid+1,right,findMe);
		}
		
	}
	public static int bsearch(int[]i,int findMe){
		return bsearch(i,0,i.length-1,findMe);
	}
	// Michael T. Goodrich and Roberto Tamassia, Data Structures and Algorithms in Java,
	// bsearch log(2)N
	// for more about logrithm ,read G&T 4.1.2,4.1.7
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
