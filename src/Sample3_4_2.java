
public class Sample3_4_2 {

	public static void main(String[] args) {
		Car4_2 car1;
		car1 = new Car4_2();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}
}

//Car類別
class Car4_2{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
