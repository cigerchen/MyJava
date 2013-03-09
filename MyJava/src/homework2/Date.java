package homework2;
 
public class Date {
	 /* Put your private data fields here. */
	 private int day;
	 private int  month;
	 private int  year;
	 /** Constructs a Date object with null input.
	  * 
	  */
	 public  Date () {
		 
	 }
	  /** Constructs a Date object corresponding to the given string.
	   *  @param s should be a string of the form "month/day/year" where month must
	   *  be one or two digits, day must be one or two digits, and year must be
	   *  between 1 and 4 digits.  If s does not match these requirements or is not
	   *  a valid date, the program halts with an error message.
	   */
	  public Date(String s) {

	  }


  /** Checks whether the given year is a leap year.
  *  @param year is integer representing the year 
  *  @return true if and only if the input year is a leap year.
  */
	
 public static boolean isLeapYear(int year) {
	if (year%4>0){return false;}
	else if(year%100==0&&year%400>0){return false;}
	else{return true;}
   //check the input
   //error handling
   //
   }
/** Returns the number of days in a given month.
*  @param month is a month, numbered in the range 1...12.
*  @param year is the year in question, with no digits omitted.
*  @return the number of days in the given month.
*/
//public static int daysInMonth(int month, int year) {
//...
//}
 public static int daysInMonth(int month,int year){
	 int days=0;
	 boolean LeapYear=isLeapYear(year);
	 if (LeapYear){
		 switch(month)
		 {
		 case 1:days=31;break;
		 case 2:days=29;break;
		 case 3:days=31;break;
		 case 4:days=30;break;
		 case 5:days=31;break;
		 case 6:days=30;break;
		 case 7:days=31;break;
		 case 8:days=31;break;
		 case 9:days=30;break;
		 case 10:days=31;break;
		 case 11:days=30;break;
		 case 12:days=31;break;
		 default:days=0;break;//input error,throw an exception,will implement
		                      //this feature later
		 }
	         }
    else{ 
    switch(month){

	 case 1:days=31;break;
	 case 2:days=28;break;
	 case 3:days=31;break;
	 case 4:days=30;break;
	 case 5:days=31;break;
	 case 6:days=30;break;
	 case 7:days=31;break;
	 case 8:days=31;break;
	 case 9:days=30;break;
	 case 10:days=31;break;
	 case 11:days=30;break;
	 case 12:days=31;break;
	 default:days=0;break;//input error,throw an exception,will implement
	                      //this feature later
	 }
	 }
	 
	 
	 
	 //check leapyear
	 //if lear year
	 //if non-leap year
	 return days;
 }
///** Checks whether the given date is valid.
//*  @return true if and only if month/day/year constitute a valid date.
//*
//*  Years prior to A.D. 1 are NOT valid.
//*/
//public static boolean isValidDate(int month, int day, int year) {
//...
//}
 
 /**Checks whether the given date is valid.
  * Years prior to A.D. 1 are NOT valid.
  * @param  month between 1 and 12.
  *  @param day between 1 and 31 and should be valid against the
  *  year and corresponding month.
  *  @param year is always bigger than 0.
  * @return true if and only if month/day/year constitute a valid date.
  */
  public static boolean isValidDate(int month,int day, int year){
	  //check year is leap year
	  //check month
	  //check days agains month
	  //check integer ...no need ,since already restricted 
	  //
	  boolean yearIsValid=false,dayIsValid=false,monthIsValid=false;
	  //validate year
	  if( year>0 ){yearIsValid=true;}
	  
	  //validate day
	  if ((day<=daysInMonth(day,month)) &&(day>0)){
		   dayIsValid=true;
	  };
	  if((0<month) &&(month<13)){
		  monthIsValid=true;
	  }
	   if ((yearIsValid&&dayIsValid&&monthIsValid)==true){
		   return true;
	   }else{
		   return false;
	   }
  }
//Part II
//-------
//Define the internal state that a "Date" object needs to have by declaring some
//data fields (all private) within the Date class.  Define the basic constructor
//specified below.  A Date should be constructed only if the date is valid.  If
//a caller attempts to construct an invalid date, the program should halt after
//printing an error message of your choosing.  To halt the program, include the
//line:
//
//  System.exit(0);
//
//
//  /** Constructs a date with the given month, day and year.   If the date is
//   *  not valid, the entire program will halt with an error message.
//   *  @param month is a month, numbered in the range 1...12.
//   *  @param day is between 1 and the number of days in the given month.
//   *  @param year is the year in question, with no digits omitted.
//   */
//  public Date(int month, int day, int year) {
//    ...
//  }
    /** Constructs a date with the given month, day and year. If the date is not 
     *  not valid, the entire program will halt with and error message.
     *  @param month is a month, numbered in the range 1..12.
     *  @param day is between 1 and the number of days in the given month.
     *  @param year is the year in question, with no digits omitted, bigger than 0
     *  
     */
    public Date(int month, int day, int year){
    	//validate the date.
    	boolean isValid=false;
    	isValid = isValidDate(month,day,year);
    	if(isValid){
    		this.day=day;
    		this.month=month;
    		this.year=year;
    	}else{
    		System.out.println("The Date is not a valid one");
    		System.exit(0);
    	}
    }
      /** Returns a string representation of this date in the form month/day/year.
      *  The month, day, and year are expressed in full as integers; for example,
      *  12/7/2006 or 3/21/407.
      *  @return a String representation of this date.
      */
     public String toString() {
        String outString="";
        outString=""+month+"/"+day+"/"+year;
        return outString;
     }
     /** Determines whether this Date is before the Date d.
      *  @return true if and only if this Date is before d.
      */                                                   
     public boolean isBefore(Date d) {                     
    	 //validate d;
    	 //compare year
    	 //compare month
    	 //compare day
    	 return false;
     }                                                     
 public static void main(String[] args) {
		// TODO Auto-generated method stub
           Date myDate = new Date(1,1,0);
           System.out.println(myDate);
	}

}
