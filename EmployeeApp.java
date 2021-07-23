package com.Himanshu.ProblemPractice;
class Employee{
	String name;
	String ssn;
	String dept;
	int salary;
	Employee() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String ssn, String dept, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
public class EmployeeApp {
	Employee getEmployeeInfo(String str) 
	{
		
		String name="";
        String ssn="";
        String dept="";
        int salary=0;
        int length=str.length();
        int start=0;
            int end=0;
        for(int i=0;i<length;i++)
        {
            char c=str.charAt(i);
            
            switch(c)
            {
                case '@':
                    end=i;
                    name=str.substring(start,end);
                    start=end;
                    break;
                case '-':
                    end=i;
                    ssn=str.substring(start+1,end);
                    start=end;
                    break;
                case '#':
                    end=i;
                    dept=str.substring(start+1,end);
                    start=end;
                    break;
            }
        }
        salary=Integer.parseInt(str.substring(end+1,length));
        Employee employee=new Employee(name,ssn,dept,salary);
		return employee;
	}
	String getEmployeeLevel(Employee e) 
	{

		int ssn=Integer.parseInt(e.ssn);
		String level="";
		if(ssn>=1&&ssn<=10)
			level="L1";
		else if(ssn>=61&&ssn<=120)
			level="L2";
		else if(ssn>=121&&ssn<=180)
			level="L3";
		else
			level="L4";
		return level;					
	}
	public static void main(String[] args) {
		
		EmployeeApp e=new EmployeeApp();
		System.out.println(e.getEmployeeInfo("abc@4356-uuuii#98"));
		System.out.println(e.getEmployeeLevel(new Employee("abc","4356","uuuii",9889)));
	}

}
