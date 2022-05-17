package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		
		EcommApp user = new EcommApp();
		//1. use case 1
		user.login("test@gmail.com","test123")
			.search("Macbook")
				.addToCart("Macbook")
					.doPayment("1234", 000)
						.generateOrderId()
							.logout();
		
		//use case 2:
		user.login("test@gmail.com", "test123")
			.addToCart("Macbook")
				.doPayment("123456")
					.generateOrderId()
						.logout();
		
		//use case 3:
		user.login()
			.addToCart("Puma Shoes")
				.logout();
		
		// use case4:
		user.login("abc@gmail.com", "abc123")
			.search("Iphone13", 4)
				.logout();
		
		// use case5:
		
		user.login("tom@gmail.com","tom123")
			.logout();
				
		
	}

}
