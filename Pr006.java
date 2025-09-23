//Управляющие операторы
class Pr006 {
	public static void main(String args[])
		throws java.io.IOException{
			char ch, temp;
			System.out.print("Введите символ - ");
			ch= (char) System.in.read();
			System.out.println("Введен символ - " + ch);
			temp = (char) System.in.read();

			//Угадывание значения символьной переменной
			char answer = 'D';
			System.out.println("Введите символ: ");
			ch = (char) System.in.read();
			//Демностраций if()
			if(ch==answer)
				System.out.println("Символы совпали");

			else {
				System.out.println("Не совпали - " + ch);
				if (ch<answer)
					System.out.println("Нужный символ ближе к концу");
				else 
					System.out.println("Нужный символ дальше от конца");
			}
			//Вложенный оператор if
			int i=10,j=15,k=15,a=0,b=77,c,d=88;
			c=0;
			if(i!=10){
				if(j<20) a=b;
				if(k>100) c=d;
				else{
				    	c=25;
					a=c;
				}
			}
			else{ 
				a = d;
				c=0;
			}

			System.out.println("i = " + i + " j = " + j + " k = " + k);
			System.out.println("a = " + a + " b = " + b + " c = "+ c + " d = " + d);
			
			//Многоступенчетые if-else
			System.out.println();
			i=0;
			for(i=0; i<6;i++){
				if(i==1)
					System.out.println("i=1");
				else if (i==2)
					System.out.println("i=2");
				else if (i==3)
					System.out.println("i=3");	
				else if (i==4)
					System.out.println("i=4");	
			//	else if (i==5)
			//		System.out.println("i=5");
				else
					//Оставшиеся варианты выведут нижнее i
					System.out.println("i не равно значениям от 1 до 4");
			}

	//Оператор switch
	System.out.println("\nДемнострация работы оператора switch()");
	for(i=0; i<10; i++)
		switch(i){
			case 0:
				System.out.println("i=0");
				break;
			case 1:
				System.out.println("i=1");
				break;
			case 2:
				System.out.println("i=2");
				break;
			case 3:
				System.out.println("i=3");
				break;
			case 4:
				System.out.println("i=4");
				break;
			default:
				System.out.println("i>=5");
				break;
		}
	//Вложенные операторы switch
	System.out.println();
	ch ='R';
	char ch1 ='A';
	switch(ch){
		case 'A': 
			System.out.println("Значение A внешнего оператора switch");
			switch(ch1){
				case 'A':
					System.out.println("Значение A внутреннего оператора switch");
					break;
			}
		case 'R':
			System.out.println("Значение R внешнего оператора switch");
			switch(ch1){
				case 'A':
					System.out.println("Значение А внутреннего оператора switch");
					break;
			}
			break;
		default:
				System.out.println("Значение по умолчанию для внешнего switch()");
			}
	}
}
