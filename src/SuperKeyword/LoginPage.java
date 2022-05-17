package SuperKeyword;

public class LoginPage extends Page {
	
	int timeOut=200;
	
	public LoginPage() {
//		System.out.println("Hi");
//		super(10,20); //can not have two super keywords in single constructor...
		super();  //should be the first statement in the constructor else error...
		//System.out.println("Login Page Const...");
	}
	
	public void loginInfo() {
		System.out.println("login info methods...");
		super.display(); //parent
		display(); //child
	}
	
	@Override
	public void display() {
		System.out.println("Login Page Display...");
		super.display();
		//display();
	}
	
	
	public void getTimeOut() {
		System.out.println(timeOut);
		System.out.println(super.timeOut);
	}
	

}
