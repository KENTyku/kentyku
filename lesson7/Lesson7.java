/*	Java Lesson 7
*	avtor: Tveritin Yuri
*	version: 29.05.2017
*/
import java.util.Scanner;
class Lesson7 {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cat[] cat = new Cat[3];		
        cat[0] = new Cat("Barsik", 15, false);
		cat[1] = new Cat("Kuzma", 10, false);
		cat[2] = new Cat("Vaska", 5, false);
        Plate plate = new Plate(24);		
		int i=0;
		int add=1;
		while (add!=0){
			System.out.println(plate); 
			while (plate.food-cat[i].appetite>=0) {//проверка опустошения тарелки	котами по очереди		
				if (cat[i].full==false) {
					cat[i].eat(plate);
					cat[i].full=true;
				}				
				i=i++;			
			}
			for (int j=0; j<3; j++){
				if (plate.food>cat[j].appetite&&cat[j].full==false) {// проверка достаточности остатка еды для какого-либо кота 
					cat[j].eat(plate); 
					cat[j].full=true;
				}
			}
			for (int j=0; j<3; j++){
				System.out.println(cat[j]);
			}		
			System.out.println(plate);
			System.out.println ("How much food to add to the plate?(0-do not feed)");
			add=sc.nextInt();
			plate.addFood(add);
		}
		System.out.println("End");
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
        return name+": " + full;
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
	void addFood(int add) {//метод увеличения еды в тарелке
        this.food += add;
	}
    @Override
    public String toString() {//переопределение метода для вывода в консоль объекта plate
        return "food is: " + food;
    }
}