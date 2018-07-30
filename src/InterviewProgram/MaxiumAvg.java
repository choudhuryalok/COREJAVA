package InterviewProgram;

import java.util.HashMap;
import java.util.Map;

class student{
	String name;
	int marks;
	
	student(String name , int marks)
	{
		this.name=name;
		this.marks=marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class MaxiumAvg {

	public static void main(String[] args) {
		student s1= new student("xxx", 30);
		student s2= new student("abc", 50);
		student s3= new student("xxx", 70);
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("xxx", 30);
		map.put("abc",50);
		map.put("xxx",70);
		
		for(String str:map.keySet())
		{
			if(map.containsKey(str))
			{
				System.out.println("value : " +map.get(str));
			}
			else {
				System.out.println("average of :"+str+" : " +map.get(str));
			}
		
		}
	}

}
