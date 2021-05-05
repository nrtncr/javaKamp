package gun2Odev;

public class Egitmen {
	private int teacherId;
	private String name;
	private String detail;
	private String courses;
	
	public Egitmen() {
		
	}
	
	public Egitmen(int teacherId,String name,String detail,String courses) {
		this.courses =courses;
		this.detail = detail;
		this.name = name;
		this.teacherId = teacherId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	
	
	
}
