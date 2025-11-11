//Применение различного доступа к переменным внутри класса
class MyClass {
	private int a; //закрытый доступ, значение переменной меняется только внутри класса
	public int b; //открытый досуп, значение меняется из любого класса
	int c; //доступ по умолчанию (в данном случае - аналог открытого доступа)
	//Методы доступа к закрытой переменной a
	void setA(int A) {
		if(A < 10)
			a = A;
		else {
			System.out.println("Значение параметра должно быть менее 10");
			a = 0;
		}

	}
	int getA(){
		return a;
	}
}
//Возврат объекта из метода

class ErrorMsg{
	String msgs[] = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Отсутствует место на диске",
		"Вывод индекса за границы диапазона"
	};

	String getErrorMsg(int i) {
		if(i >=0 & i < msgs.length)
			return msgs[i];
		else 
			return "Неверное значение ошибки";
	}
}	
//Класс, где реализуется отказоустойчивый массив
//Объявление закрытой ссылки на массив и закрытого значения ошибки доступа
class FailSoftArray {
	private int a[];
	private int errVal;
	//Открытая переменная с длиной массива	
	public int length;
	//Конструктор массива, 1 параметр - размер, 2 - значение при ошибке доступа
	public FailSoftArray(int size, int errV){
		a = new int[size];
		errVal = errV;
		length = size;
	}
	//Метод досупа к элементам массива при чтении значения элемента по индексу
	public int get(int index){
		if (indexOK(index))
			return a[index];
		return
			errVal;
	}
	// Метод изменения значения элемента по индексу, 2 параметр - новое значение
	public boolean put(int index, int val){
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
	//Метод проверки корректности индекса
	private boolean indexOK(int index){
		if(index >=0 & index < length)
			return true;
		return false;
	}
}
//Демонстрация передачи объектов методам
class Block {
	int a,b,c;
	int V;

	Block(int i, int j, int k){
		a = i;
		b = j;
		c = k;
		V = a*b*c;
	}

	boolean sameBlock(Block ob){
		if((ob.a == a) & (ob.b == b) & (ob.c == c))
			return true;
		else 
			return false;
	}

	boolean sameV (Block ob){
		if(ob.V == V)
			return true;
		else 
			return false;
	}
}
class Err {
	String msg;
	int severity;

	Err(String m, int s){
		msg = m;
		severity = s;
	}
}
class ErrorInfo{
	String msgs[] = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Отсутствует место на диске",
		"Вывод индекса за границы диапазона"
	};
	int howbad[] = {3, 3, 2, 4};

	Err getErrorInfo(int i) {	
		if(i >=0 & i < msgs.length)
			return new Err(msgs[i], howbad[i]);
		else 
			return new Err("Неверное значение ошибки", 0);
	}
}
class Overload {
	void ovlDemo(){
		System.out.println("Метод запущен без параметра");
	}
	void ovlDemo(int a) {
		System.out.println("Один параметр: " + a);
	}

	int ovlDemo(int a, int b){
		System.out.println("Два целых параметра: " + a + " " + b);
		return a+b;
	}

	double ovlDemo(double a, double b) {
		System.out.println("Два double параметра: " + a + " " + b);
		return a+b;
	}
	//Метод для демонстрации перегрузки методов при автоматическом переобразовании типов
	void ovlDemo2(int x) {
		System.out.println("Выван метод ovlDemo2(int): " + x);
	}
	void ovlDemo2(double x) {
		System.out.println("Выван метод ovlDemo2(double): " + x);
	}
	void ovlDemo2(byte x) {
		System.out.println("Выван метод ovlDemo2(byte): " + x);
	}
}
//Круг, квадрат, прямоугольник
class Square {
	int w, h;
	double R;
	String type;

	Square() {
		w = h = 0;
		R = 0.0;
		type = "Неопределенная фигура";
	}
	Square(int a) {
		w = a;
		h = a;
		w = h = a;
		type = "Квадрат";
	}
	Square(int a, int b){
		w = a;
		h = b;
		type = "Прямоугольник";
	}
	Square(double r){
		w = h;
		R = r;
		type = "Круг";
	}
	void sqrSlv() {
		System.out.println("Нет параметров");
	}
	int srqSlv(int a){
		System.out.println("Принят 1 int параметр" + a + " -> квадрат. Ответ: " + a*a);
		return a*a;
	}
	double sqrSlv(double r){
		System.out.println("Принят 1 double параметр: " + r + " -> круг. Ответ : " + 3.14*r*r);
		return 3.14*r*r;
	}
	int sqrSlv(int a, int b){
		System.out.println("Принято 2 int параметра: " + a + ", " + b + " -> прямоугольник. Ответ: " + a*b);
		return a*b;
	}
}
class Overload2 {
	int x;
	Overload2() {
		System.out.println("Выполняется Overload2");
		x = 0;
	}
	Overload2(int i) {
		System.out.println("Выполняется Overload2(int)");
		x = i;
	}
	Overload2(double i) {
		System.out.println("Выполняется Overload2(double)");
		x = (int) i;
	}
	Overload2(int i, int j) {
		System.out.println("Выполняется Overload2(double)");
		x = i + j;
	}
}
class Summation{
	//Созадние одного объекта при помощи передачи конструктору уже существуюущего
	int sum;

	Summation(int num){
		sum = 0;
		for(int i=1; i<=num; i++)
			sum +=i;
	}

	Summation(Summation ob){
		sum = ob.sum;
	}
}
class Pr012{
	public static void main(String args[]){
		MyClass ob = new MyClass();
		ob.setA(5);
		System.out.println("Значение переменной а в объекте ob: " + ob.getA());
		ob.setA(10);
		System.out.println("Значение переменной а в объекте ob: " + ob.getA());
		//ob.a = 10; Попытка доступа к закрытой переменной
		//System.out.println("Значение переменной а в объекте ob: " + ob.a);
		ob.b = 10;
		System.out.println("Значение переменной b в объекте ob: " + ob.b);
		ob.c = 10;
		System.out.println("Значение переменной c в объекте ob: " + ob.c);

		//Пример работы с отказоустойчивым массивом 
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;

		System.out.println("\nОбработка ошибок без вывода отчета");
		for(int i=0; i < (fs.length * 2); i++)
			fs.put(i, i*10);

		for(int i=0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -1)
				System.out.println(x + " ");
		}
		System.out.println();

		System.out.println("\nОбработка ошибок с выводом отчета");

		for(int i=0; i < (fs.length * 2); i++)
			if(!fs.put(i, i*10))
				System.out.println("Значение индекса " + i + " находится за пределами границ массива");

		for(int i=0; i < (fs.length * 2); i++){
			x = fs.get(i);
			if(x != -1)
				System.out.print(x + " ");
			else
				System.out.println("Значение индекса " + i + " находится за пределами границ массива");
		}
		
		//Проверка работы методов, принимающих объект Block в качестве параметра
		Block ob1 = new Block(10,2,5);
		Block ob2 = new Block(10,2,5);
		Block ob3 = new Block(4,5,5);

		System.out.println("\nob1 совпадает по размерам с ob2: " + ob1.sameBlock(ob2));

		System.out.println("\nob2 совпадает по размерам с ob3: " + ob2.sameBlock(ob3));
		
		System.out.println("\nob2 совпадает по объему с ob3: " + ob2.sameV(ob3));

		ErrorMsg err = new ErrorMsg();
		
		//Применение метода, возвращающего строку
		System.out.println("\n" + err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(7));
		
		//Применение метода, возвращающего объект с информацией об ошибке
		ErrorInfo err1 = new ErrorInfo();
		Err e;

		e = err1.getErrorInfo(2);
		System.out.println("\n" + e.msg + " уровень: " + e.severity);
		
		e = err1.getErrorInfo(7);
		System.out.println(e.msg + " уровень: " + e.severity);
		
		//Перегрузка методов ovlDemo()
		Overload ob4 = new Overload();
		int resI;
		double resD;

		ob4.ovlDemo();
		System.out.println();
		
		ob4.ovlDemo(3);
		System.out.println();
		
		ob4.ovlDemo(7,8);
		System.out.println("Возвращаемое значение: " + ob4.ovlDemo(7,8));
	
		ob4.ovlDemo(2.7,3.4);
		System.out.println("Возвращаемое значение: " + ob4.ovlDemo(2.7,3.4));
		
		System.out.println();
		Square ob5 = new Square();

		ob5.sqrSlv();
		//Круг
		double rndA = ob5.sqrSlv(5.5);
		//Прямоугольник
		int recA = ob5.sqrSlv(3, 6);
		//Квадрат
		//int sqrA = ob5.sqrSlv(4);
		
		//Демонстрация автоматичесого преобразования типов при перегрузке метода ovlDemo2()
		int i1 = 5;
		double d1 = 10.1;
		byte b1 = 7;
		short s1 = 9;
		float f1 = 12.1F;

		ob4.ovlDemo2(i1);
		ob4.ovlDemo2(d1);
		ob4.ovlDemo2(b1);
		ob4.ovlDemo2(s1);
		ob4.ovlDemo2(f1);

		//Перегрузка кострукторов
		System.out.println();
		Overload2 ob9 = new Overload2();
		Overload2 ob6 = new Overload2(100);
		Overload2 ob7 = new Overload2(22.3);
		Overload2 ob8 = new Overload2(2,8);
		
		System.out.println("ob9 = " + ob9.x);
		System.out.println("ob6 = " + ob6.x);
		System.out.println("ob7 = " + ob7.x);
		System.out.println("ob8 = " + ob8.x);
		
		//Демонстрация создания объекта на базе существующего объекта
		System.out.println();
		Summation s3 = new Summation(10);
		Summation s2 = new Summation(s3);
	
		System.out.println("s3 = " + s3.sum);
		System.out.println("s2 = " + s2.sum);
		
		Square figure1 = new Square();
		Square figure2 = new Square(2, 2);
		Square figure3 = new Square(3, 2);
		Square figure4 = new Square(4.2);
		System.out.println("\nТип фигуры " + figure1.type);
		System.out.println("\nТип фигуры " + figure2.type);
		System.out.println("\nТип фигуры " + figure3.type);
		System.out.println("\nТип фигуры " + figure4.type);
	}
}
