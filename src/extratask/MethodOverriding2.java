package extratask;
class Sports{
	void players(){
		System.out.println("No Players");
	}
	void duration() {
		System.out.println("No Duration");
	}
}
class BasketBall extends Sports{
	void players(){
		System.out.println("BasketBall has 12 players");
	}
	void duration() {
		System.out.println("BasketBall match is 48 minutes");
	}
}
class FootBall extends Sports{
	void players(){
		System.out.println("FootBall has 11 players");
	}
	void duration() {
		System.out.println("FootBall match is 90 minutes");
	}
}
public class MethodOverriding2 {

	public static void main(String[] args) {
		Sports s = new Sports();
		s.players();
		s.duration();
		System.out.println("----------");
		s = new BasketBall();
		s.players();
		s.duration();
		System.out.println("----------");
		s = new FootBall();
		s.players();
		s.duration();
	}
}