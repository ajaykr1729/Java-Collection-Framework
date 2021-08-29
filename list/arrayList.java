package list;
import java.util.*;
import java.util.stream.Stream;

public class arrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr1=new ArrayList<>();
       arr1.add("Kolkata");
       arr1.add("Patna");
       arr1.add("Ranchi");
       arr1.add("Udisha");
       arr1.add("Mumbai");
       arr1.add("Mumbai");
         

//		for(Integer x:arr1)
//			System.out.println(x);
        
       // arr1.forEach(System.out::println);
//       arr1.forEach(e->System.out.println(e));
//        Stream<String> filtered=arr1.stream().distinct().sorted();
//       filtered.forEach(System.out::println);
        
       List<Student> students=new ArrayList<Student>();
       students.add(new Student(4,"hira",23));
       students.add(new Student(1,"ajay",22));
       students.add(new Student(5,"jack",23));
       students.add(new Student(2,"pintu",21));
       students.add(new Student(7,"raju",23));
       students.add(new Student(3,"binod",23));
       students.add(new Student(9,"chintu",22));
       students.add(new Student(6,"mohit",21));
       Stream<Student> filtered=students.stream().sorted((s1,s2)->{
    	   if(s1.getAge()==s2.getAge())
    	   return s1.getName().compareTo(s2.getName());
    	   else 
    		   return s1.getAge()-s2.getAge();
       });
       filtered.forEach(System.out::println);
       
       
       

	}

}



class Student{
	private int id;
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
}
