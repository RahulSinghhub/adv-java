package maptest;

public class Employee {

	private int custid;
	private String name;
	private Double marks;
	
	public Employee(int custid,String name,Double marks) {
		super();
		this.custid=custid;
		this.marks=marks;
		this.name=name;		
	}
	
	

	public int getCustid() {
		return custid;
	}



	public void setCustid(int custid) {
		this.custid = custid;
	}



	public Double getMarks() {
		return marks;
	}



	public void setMarks(Double marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Employee [custid=" + custid + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
