package extratask;

class Circket{
	Circket(int players){
		System.out.println("Circket Team Players are = "+players);
	}
}
class VolleyBall extends Circket{
	VolleyBall(int players){
		super(11);
		System.out.println("VolleyBall Team Players are = "+players);
	}
}
public class Game {

	public static void main(String[] args) {
		VolleyBall obj = new VolleyBall(7);
	}
}