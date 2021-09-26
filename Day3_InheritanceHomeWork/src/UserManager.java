
public class UserManager {
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý: " + user.getEmail() + " mail adresiyle sisteme kayýt oldu.");
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " \"Gerçek Hayattaki Gibi Öðret\", Kodlama.io'ya Hoþgeldiniz.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Güle Güle Kendine Ýyi Bak, Tekrar gelmeyi Unutma!!!");
	}
	
	// Instructor
	
	
	
	
}
