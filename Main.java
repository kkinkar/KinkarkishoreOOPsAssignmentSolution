package com.greatlearning.department;

class SuperDepartment {
	
	public String departmentName() {
		String departmentName = "Super Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		String getTodaysWork = "No Work as of now";
		return getTodaysWork;
	}
	public String getWorkDeadline() {
		String getWorkDeadline = "Nil";
		return getWorkDeadline;
	}
	public String isTodayAHoliday() {
		String isTodayAHoliday = "Today is not holiday";
		return isTodayAHoliday;
	}
	
}

class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		String departmentName = "Admin department";
		return departmentName;
	}
	public String getTodaysWork() {
		String getTodaysWork = "Complete your documents Submission";
		return getTodaysWork;
	}
	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}
		
	
}

class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		String departmentName = "Hr department";
		return departmentName;
	}
	public String getTodaysWork() {
		String getTodaysWork = "Fill today's worksheet and mark your attendance";
		return getTodaysWork;
	}
	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}
	public String doActivity() {
		String doActivity = "team Lunch";
		return doActivity;
	}
}

class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		String departmentName = "Tech Department";
		return departmentName;
	}
	public String getTodaysWork() {
		String getTodaysWork = "Complete coding of module 1";
		return getTodaysWork;
	}
	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}
	public String getStackInformation() {
		String getStackInformation = "core java";
		return getStackInformation;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment obj1 = new AdminDepartment();
		HrDepartment obj2 = new HrDepartment();
		TechDepartment obj3 = new TechDepartment();
		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println(obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println(obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getStackInformation());
		System.out.println(obj3.isTodayAHoliday());
		
	}

}
