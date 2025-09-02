class Pr003{
	public static void main(String args[]){
		//Объявление целых переменных
		int var1, var2 = 20;
		var1 = 10;
		//Объявление логической переменной
		boolean varb = true;
		//Объявление вещественных переменных
		double vard=10.5, vard2;
		//Проверка условий
		if (var1>var2){
			int var3 = 30;
			System.out.println(var3);
		}
		else {
			int var4 = 300;
			System.out.println(var4);
		}
		if (varb) {
			System.out.println(var1);
		}
		//Деление двух целых чисел 
		System.out.println("Деление var1 на var2:");
		System.out.println(var1/var2);
		//Перевод деления int в double
		vard2= (double)var1/var2;
		System.out.println("Деление var1 на var2 с переводом в double");
		System.out.println(vard2);
	}
}
