package springsample;

public class Aclass  implements ABCType {
	public ABCType obj;
	private String message;
	
	public Aclass(ABCType obj) {
		// TODO Auto-generated constructor stub
		System.out.println("Into Class A");
		this.obj=obj;
	}
	
	public void setMessage(String message){
		this.message=message;
	}
	
	public void getMessage(){
		System.out.println(this.message);
	}
	
	public void getIdentity(){
		System.out.println("I am class B");
	}
}
