//Знакомство с объектами
class Car{
	int pass; //Количество пассажиров с водителем
	int V; //Емкость бака в литрах
	double rash; //расход топлива л/100км
}

class Pr008{
	public static void main(String args[]){
		Car bmw = new Car();
		bmw.pass = 5;
		bmw.V =  80;
		bmw.rash = 12.5;
		System.out.println("\nИнформация о bmw x5: ");
		
		System.out.println("Количество пассажиров bmw x5: " + bmw.pass);
		System.out.println("Объем бака у bmw x5" + bmw.V + " л.");
		System.out.println("Расход топлива у bmw x5" + bmw.rash + "л/100км");
		
		System.out.println("\nИнформация о mercedes slc 43: ");
		
		Car mercedes = new Car();
		mercedes.pass = 2;
		mercedes.V =  60;
		mercedes.rash = 10.2;
		System.out.println("Количество пассажиров mercedes: " + mercedes.pass);
		System.out.println("Объем бака у mercedes" + mercedes.V + " л.");
		System.out.println("Расход топлива у mercedes" + mercedes.rash + "л/100км");

	}
}
