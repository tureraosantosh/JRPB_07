package basic;

public class Student {
	
	private Long id;
	private String name;
	private Integer mark;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String name, Integer mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	
	

}
