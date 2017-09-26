package practice10;

public class Car {

	int seriaNo;
	String color;
	int gasoline;

	int run() {
		this.gasoline-=1;
		if(this.gasoline<0) {
			return -1;
		}
		
		int random= new java.util.Random().nextInt(15);
		return random+1;
		

	}


}


