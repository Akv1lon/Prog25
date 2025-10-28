class Pr010{
	public static void main(String args[]){
		//Массивы строк
		String strs[] = {"Первая часть", "Вторая часть", "Третья часть", "Четвертая часть", "массива строк"};
		System.out.println("Исходный массив: ");
		for(String s : strs)
			System.out.println(s + "");
		System.out.println("\n");
		//Изменение элементов массива
		strs[2] = "Третья измененная часть";
		strs[3] = "и четвертую часть изменили у";
		
		System.out.println("Измененный массив: ");
		for(String s : strs)
			System.out.println(s + "");
		System.out.println("\n");
		
		//Работа с подстрокой
		String orgstr = "Оригинальна ястрока для операций с подстрокой";

		String substr = orgstr.substring(13, 19);
		System.out.println("Оригинальное значение в orgstr: " + orgstr);
		System.out.println("Значение, сохраненное в substr: " + substr);

		//Строки при управлении в операторе switch
		String command = "asdf";
		
		switch(command){
			case "connect":
			      System.out.println("Подключение");
			      break;
			case "cancel":
			      System.out.println("Отмена");
			      break;
			case "disconnect":
			      System.out.println("Отключение");
			      break;
			default:
			      System.out.println("Неподдерживаемая команда");
		} 	

		//Работа с командной строкой
		System.out.println();
		System.out.println("Программе передано " + args.length + " аргументов в командной строке");
		System.out.println("Список аргументов");
		int i = 0;
		for(String s : args){
			i++;
			System.out.println("Аргумент " + i + ": " + s);

		}
		String numbers[][] = {
			{"кто-тович", "+8 800 555 35 35"},
			{"анонимнов", "+7 777 777 77 77"},
			{"неизвстновой", "+7 699 699 69 69"},
			{"авыктов", "-3 333 222 11 11"}
		};
		if(args.length != 1)
			System.out.println("Укажите 1 аргумент");
		else{
			for(i=0; i<numbers.length; i++){
				if(numbers[i][0].equals(args[0])){
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					break;
				};
				
			}
			if( i == numbers.length)
				System.out.println("Данные не найдены");

		}
	}
}
