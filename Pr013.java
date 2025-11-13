class StaticDemo {
	int x;
//Статические переменные
	static int y;
	static int val = 1024;

	int sum(){
		return x + y;
	}
	
//Статический метод
	static int valDiv2(){
		return val/2;
	}
/*
Статические методы могут использовать только статические переменные
Статические переменных могут использовать только статические методы
*/
}
class StaticBlock{
	static double rootOf2;
	static double rootOf3;
	int a;
	static {
		System.out.println("\nВнутри статического блока");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
	}
	StaticBlock(String msg) {
		a = 200;
		System.out.println(msg + " Значение а - " + a);
		System.out.println("Значение rootOf в конструкторе: " + StaticBlock.rootOf2);
	}
}
class Pr013{
	public static void main(String args[]){
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();


		ob1.x = 10;
		ob2.x = 20;
		System.out.println("ob1.x и ob2.x не зависят друг от друга");	
		System.out.println("ob1.x = " + ob1.x + "\nob2.x = " + ob2.x);
		System.out.println("\nСтатическая переменная является общей для ob1 и ob2");
		StaticDemo.y = 11;

		System.out.println("ob1.sum() = " + ob1.sum());
		System.out.println("ob2.sum() = " + ob2.sum());
		
		StaticDemo.y = 112;
		System.out.println("\nob1.sum() = " + ob1.sum());
		System.out.println("ob2.sum() = " + ob2.sum());

		System.out.println("\nval = " + StaticDemo.val);
		System.out.println("Значение от valDiv2 = " + StaticDemo.valDiv2());
		
		StaticDemo.val = 4;
		System.out.println("val = " + StaticDemo.val);
		System.out.println("Значение от valDiv2 = " + StaticDemo.valDiv2());

		//Демонстрация статического блока
		StaticBlock ob = new StaticBlock("Внутри конструктора");

		System.out.println("Квадратный корень из 2: " + StaticBlock.rootOf2);
		System.out.println("Квадратный корень из 3: " + StaticBlock.rootOf3);

	}
}
