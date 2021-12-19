package usecases;

public class Employeewagebuilder_using_oops {

	public static final int IS_PART_TIME =1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;
	
	public static int computeempwage(String company,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH) {
		
		// TODO Auto-generated method stub
		
		int empHrs=0;
		int empWage=0;
	    int totalEmpWage = 0;
	    int totalEmpHrs = 0;
	    int totalWorkingDays = 0;
	   
	    while(totalEmpHrs<=MAX_HRS_IN_MONTH &&
	    		totalWorkingDays< NUM_OF_WORKING_DAYS)
	    	totalWorkingDays++;
		int empcheck = (int) Math.floor( Math.random() * 10 ) % 3;
		switch (empcheck) {
		case IS_PART_TIME:
			empHrs=4;
			break;
		case IS_FULL_TIME:
			empHrs=8;
			break;
			default:
				empHrs=0;
		}

		totalEmpHrs += empHrs;
		System.out.println("Day#:" + totalWorkingDays + "Emp Hr:" +empHrs);
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
	    System.out.println("Total Empwage:" + totalEmpWage);
	    return totalEmpWage;
	}
	    public static void main (String[] args) {
	    	computeempwage("Dmart",20,8,5);
	    	computeempwage("Reliance",10,5,8);
	    }
	
}
	   


