package test.thread;

public class Utility {

	public String substr(String str){
		return str.substring(2,4);
	}
	public int compare(Employee e1,Employee e2){
		
		return e1.names.compareTo(e2.names);
	}
}

class Employee{
	String names;

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}
	
}
