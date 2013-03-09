package homework2;

public class Main {

	/**
	 * @param args
	 */
	static boolean flg;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
          Date mydate=new Date(-2,-3,4);
          }
		catch (Exception e) {
			System.err.println(""+e.getMessage());
		}
		finally
		{ Date mydate= new Date();
		if (mydate==null){System.out.println("So,this is null, eah?");}
		else{
          flg=mydate.isLeapYear(2000);
          System.out.println(flg);
          flg=mydate.isLeapYear(1000);
          System.out.println(flg);
          flg=mydate.isLeapYear(2424);
          System.out.println(flg);
          flg=mydate.isLeapYear(1999);
          System.out.println(flg);
          flg=mydate.isLeapYear(300);
          System.out.println(flg);
          flg=mydate.isLeapYear('a');
          System.out.println(flg);
          System.out.println(mydate.daysInMonth(1, 1999));
          System.out.println(mydate.daysInMonth(-4,-9));
          System.out.println(mydate.isValidDate(13, 33, -2));
          System.out.println(mydate.isValidDate(1, 0, 2));
          }
		}
		
		}

}
