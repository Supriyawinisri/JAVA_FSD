package comm.example.employeelist;

import java.util.Date;

public class AgeComparator implements Comparable<Object> {

	private Integer id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private Integer age;
	private Integer salary;
	
	public AgeComparator(Integer id, String name, String department, Date dateOfJoining, Integer age, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getSalary() {
		return salary;
	}
	
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "AgeComparator [id=" + id + ", name=" + name + ", department=" + department + ", dateOfJoining="
				+ dateOfJoining + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		AgeComparator ageCom = (AgeComparator)o;
		if(this.getAge() == ageCom.getAge()) {
			if(this.getDateOfJoining().compareTo(ageCom.getDateOfJoining()) == 0) {
				return 0;
			}
			else if(this.getDateOfJoining().compareTo(ageCom.getDateOfJoining()) > 0) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else if(this.getAge() > ageCom.getAge()) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
