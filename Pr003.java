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
	
		//Простые типы данных
		byte byte_var;
		System.out.println("Value byte_var:");
		for (int i=100; i<=150; i++) {
			byte_var=(byte)i;
			System.out.print(byte_var + ", ");
		}
		short short_var;
		System.out.println("Тип данных short - 16 битный, значения от -32 768 до 32 767");
		System.out.println("Тип данных int - 32 битный");
		System.out.println("Тип данных long - 64 битный");
		
		//Пример исользования типа данных long
		long long_var = 4000000000L;
		int int_var =2000000000;
		int_var = int_var*int_var;
		long_var = (long)int_var*int_var;
		System.out.println("int_var = " + int_var);
		System.out.println("long_var = " + long_var);
		//Вычисление гипотенузы при помощи метода Math.sqrt()	
		double a = 3.0, b = 4.0;
		
		double c = Math.sqrt(a*a + b*b);
				
		System.out.println("Гипотенуза = " + c);

		//Использование символьного типа данных
		char ch;
		ch = 'X';
		System.out.println("Значение ch: " + ch);
		
		int_var = (int)ch;
		System.out.println("int_var = " + int_var);
		
		ch++;	
		System.out.println("ch = " + ch);
		
		ch = 90;
		System.out.println("ch = " + ch);
		
		ch = 'А';
		for (int i = (int) ch; i < (int) 'А' + 66; i++) 
			System.out.print(ch++ + ", ");
		
		System.out.println();

	}
}
