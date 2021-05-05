package gun2Odev;

public class Kurs {
    private int courseId;
	private String name;
	private int completionRate;
	private String teacher;
	
	public Kurs(){
		
	}
	
	public Kurs(int courseId,String name,int comletionRate,String teacher) {
		this.courseId= courseId;
		this.name = name;
		this.completionRate = comletionRate;
		this.teacher = teacher;
	}
	
	public int getcourseId() {
		return courseId;
	}
	
	public void setcourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getcomletionRate() {
		return completionRate;
	}
	
	public void setcomletionRate(int comletionRate) {
		this.completionRate = comletionRate;
	}
	
	public String getteacher() {
		return teacher;
	}
	
	public void setteacher(String teacher) {
		this.teacher = teacher;
	}
	
}
