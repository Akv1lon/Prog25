//Конструкторы
class MyClass {
	int x;

	MyClass(){
		x = 10;
	}
}
class MyClass2 {
	int x;
//Конструктор с параметрами
	MyClass2(int i){
		x = i;
	}
}

class Pr009 {
	public static void main(String args[]){
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();

		System.out.println("Значение x внутри t1: " + t1.x + "\nЗначение x внутри t2: " + t2.x);
		MyClass2 t3 = new MyClass2(10);
		MyClass2 t4 = new MyClass2(88);

		System.out.println("Значение x внутри t1: " + t3.x + "\nЗначение x внутри t4: " + t4.x );
		Car bmw = new Car(5,80,12.5);
		Car mercedes = new Car(2, 60, 10.2);
		
		System.out.println("BMW X5 перевозит " + bmw.pass + " пассажиров на " + bmw.range() + " км"); 
		System.out.println("mercedes slc 43 перевозит " + mercedes.pass + " пассажиров на " + mercedes.range() + " км"); 
	}
}
