//Знакомство с объектами
class Car{
	int pass; //Количество пассажиров с водителем
	int V; //Емкость бака в литрах
	double rash; //расход топлива л/100км
	double range() { //Метод вычисления расстояния, которое автомобиль может проехать на полном баке
		return  ((double)V*100) / rash;
	}
}

class Pr008{
	public static void main(String args[]){
		double range;
		Car bmw = new Car();
		bmw.pass = 5;
		bmw.V =  80;
		bmw.rash = 12.5;
		System.out.println("\nИнформация о bmw x5: ");
		
		System.out.println("Количество пассажиров bmw x5: " + bmw.pass);
		System.out.println("Объем бака у bmw x5" + bmw.V + " л.");
		System.out.println("Расход топлива у bmw x5 " + bmw.rash + " л/100км");
		
		//Вызов метода внутри System.out.println()
		System.out.println("bmw x5 проедет на полном баке " + bmw.range() + " км");

		System.out.println("\nИнформация о mercedes slc 43: ");
		
		Car mercedes = new Car();
		mercedes.pass = 2;
		mercedes.V =  60;
		mercedes.rash = 10.2;
		System.out.println("Количество пассажиров mercedes: " + mercedes.pass);
		System.out.println("Объем бака у mercedes " + mercedes.V + " л.");
		System.out.println("Расход топлива у mercedes " + mercedes.rash + " л/100км");
		
		range = mercedes.range();	
		System.out.println("mercedes slc 43 проедет на полном баке " + range + " км");
		
		//Хранение значений в простых типах переменных
		int p1=50, p2=75;
		p1=p2;
		p2=100;
		System.out.println("p1 и p2: " + p1 + " " + p2);

		//Хранение значений в объектныз типах - копирование ссылки на объект, а не значений объекта
		Car bmw1, bmw2;
		bmw1 = bmw;
		bmw2 = mercedes;
		bmw1.rash = 14.5;
		System.out.println("Расход для bmw и bmw1 " + bmw.rash + " " + bmw1.rash);
		bmw2.rash = 9.99;
		System.out.println("Расход для bmw2 и mercedes: " + bmw2.rash + " " + mercedes.rash);
	}
}
