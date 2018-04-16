package SuperclassSubclass;

public class TestPerson {
	public static void main(String[] args) {
	      /* Test Student class */
	      Student s1 = new Student("Mou", "1 Happy Ave");
	      s1.addCourseGrade("CSE101", 97);
	      s1.addCourseGrade("CSE102", 68);
	      s1.printGrades();
	      System.out.println("Average is " + s1.getAverageGrade());
	      
	      /* Test Teacher class */
	      Teacher t1 = new Teacher("Rabby", "8 sunset way");
	      System.out.println(t1);
	      String[] courses = {"CSE101", "CSE102", "CSE101"};
	      for (String course: courses) {
	         if (t1.addCourse(course)) {
	            System.out.println(course + " added.");
	         } else {
	            System.out.println(course + " cannot be added.");
	         }
	      }
	      for (String course: courses) {
	         if (t1.removeCourse(course)) {
	            System.out.println(course + " removed.");
	         } else {
	            System.out.println(course + " cannot be removed.");
	         }
	      }
	   }

}
