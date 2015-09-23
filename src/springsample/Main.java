package springsample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Aclass acl=(Aclass)context.getBean("Aclass");
		acl.obj.getIdentity();
	}
}
