
public class UserManager {
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c�: " + user.getEmail() + " mail adresiyle sisteme kay�t oldu.");
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " \"Ger�ek Hayattaki Gibi ��ret\", Kodlama.io'ya Ho�geldiniz.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " G�le G�le Kendine �yi Bak, Tekrar gelmeyi Unutma!!!");
	}
	
	// Instructor
	
	
	
	
}
