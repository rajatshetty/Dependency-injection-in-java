package springsample;

public class Cclass implements ABCType {
	
	private String message;
	public Cclass() {
		// TODO Auto-generated constructor stub
		System.out.println("Into class C");
	}

	public void setMessage(String message){
		this.message=message;
	}
	
	public void getIdentity(){
		System.out.println("I am class C");
	}
}
