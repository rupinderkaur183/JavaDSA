package streams.employee;

public class Employee {
	private int id;
	private String name;
	private int age;
	private long Salary;
	private String gender;
	private String deptName;
	private String city;
	private int yearOfJoining;
	
	public Employee(int id, String name, int age, long salary, String gender, String deptName, String city,
			int yearOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Salary = salary;
		this.gender = gender;
		this.deptName = deptName;
		this.city = city;
		this.yearOfJoining = yearOfJoining;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", age=" + age + ", Salary=" + Salary + ", gender=" + gender
				+ ", deptName=" + deptName + ", city=" + city + ", yearOfJoining=" + yearOfJoining + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	
	
	

}
