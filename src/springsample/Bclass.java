package springsample;

public class Bclass implements ABCType {

	private String message;
	public Bclass() {
		// TODO Auto-generated constructor stub
		System.out.println("Into class B");
	}
	
	public void setMessage(String message){
		this.message=message;
	}

	public void getIdentity(){
		System.out.println("I am class B");
	}
}
