package subStackFrames;
import java.lang.*;
class tool{
	int size;
	int weight;
	public void method1(){
		int s=43;
		
	}
   public void method2(){
		int s=33;
		s=s+2;
		 Thread.dumpStack();
		
	}
	public void print(){
		System.out.println("hello");
	}
	public tool(){
	 	 Thread.dumpStack();
	}
}
class IntBox {
	public int i;
	public IntBox(){}
	
	public IntBox(int x){
		this.i=x;
	}
	static void doNothing(int x){
		x=2;
	}
	
	public void set2(IntBox ib){
		this.i=2;
	}
	static void set3(IntBox ib){
		ib.i=3;
	}
	static void badSet4(IntBox ib){
		ib=new IntBox(4);
		Thread.dumpStack();
		ib.i=4;
		Thread.dumpStack();
	}
}


public class StackFrames   {
	public static void main(String[] args){
		tool a = new tool();
		a.method2();
		System.out.println("===========================");
		IntBox box = new IntBox();
		System.out.println(box.i);
		box.set3(box);
		System.out.println(box.i);
		box.set2(box);
		System.out.println(box.i);
		box.badSet4(box);
		System.out.println(box.i);
}}
