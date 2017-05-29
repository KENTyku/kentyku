/*	Java Lesson 7
*	avtor: Tveritin Yuri
*	version: 29.05.2017
*/
class Lesson7 {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 15, false);
        Plate plate = new Plate(20);
		while (plate.food-cat.appetite>=0) {//проверка опустошения тарелки			
			cat.full=true;
			cat.eat(plate);
			System.out.println(plate);
		}
		System.out.println(cat);
		System.out.println("need more food!");
        /*
        
        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);*/
    }
}

class Cat {
    String name;
    int appetite;
	boolean full;
    Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
		this.full=full;
    }
    void eat(Plate plate) {//метод кота,потребляющего еду из конкретной тарелки 
        plate.decreaseFood(appetite);
    }
	@Override
    public String toString() {//переопределение метода для вывода в консоль объекта cat
        return "cat full: " + full;
    }
}

class Plate {
    int food;
    Plate(int food) {
        this.food = food;
    }
    void decreaseFood(int ap) {//метод уменьшения еды в тарелке
        this.food -= ap;
    }
    @Override
    public String toString() {//переопределение метода для вывода в консоль объекта plate
        return "plate: " + food;
    }
}