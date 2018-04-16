package Composition;

public class Person {
	private Job job;

	public Person() {
		this.job = new Job();
		job.setSalary(1000);
	}
	
	public long getSalary() {
        return job.getSalary();
    }
	

}
