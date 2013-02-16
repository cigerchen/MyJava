package subStackFrames;


public class RecursiveTest {
	public  static final int solo=4;
	public  int Recurv(int i){
		i++;
		Thread.dumpStack();
		if (i<solo){return Recurv(i);}
		else{return i;}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         RecursiveTest rt = new RecursiveTest();
         rt.Recurv(1);
	}

}
