class oop {		
	public static void main(String [] args) { 		
		Animal[] animal = new Animal[2];
        animal[0] = new Cat(1, 2, 3);
		animal[1] = new Dog(0, 4, 6);
		for (int i=0; i<2; i++){
			int rL=animal[i].runLong;
			int sL=animal[i].swimLong;
			int jL=animal[i].jumpLong;
			System.out.println("animal["+i+"]-"+animal[i].run(rL));
			System.out.println("animal["+i+"]-"+animal[i].swim(sL));
			System.out.println("animal["+i+"]-"+animal[i].jump(jL));
		}
	}
}

abstract class Animal {
     int runLong;
     int swimLong;
     int jumpLong;

    Animal(int runLong, int swimLong, int jumpLong) {
        this.runLong =runLong ;
        this.swimLong = swimLong;
        this.jumpLong = jumpLong;     
    }
	
    abstract boolean run(int runLong);
	abstract boolean swim(int swimLong);
	abstract boolean jump(int jumpLong);
}


class Cat extends Animal {

    Cat(int runLong, int swimLong, int jumpLong) {
        super(runLong, swimLong, jumpLong);
	}
	@Override
	boolean run (int runLong) {
		if (runLong>=0 && runLong<=200) return true;
		else return false;
	}

	@Override
	boolean swim(int swimLong){
		if (swimLong==0) return true;
		else return false;
	}
	
	@Override
	boolean jump(int jumpLong){
		if (jumpLong>=0&&jumpLong<=2) return true;
		else return false;
    } 	
}

class Dog extends Animal {

    Dog(int runLong, int swimLong, int jumpLong) {
        super(runLong, swimLong, jumpLong);
	}
	@Override
	boolean run (int runLong) {
		if (runLong>=0&&runLong<=500) return true;
		else return false;
	}
	@Override
	boolean swim(int swimLong){
		if (swimLong>=0&&swimLong<=10) return true;
		else  return false;
	}
	@Override
	boolean jump(int jumpLong){
		if (jumpLong>=0&&jumpLong<=0.5) return true;
		else return false;
    }   
}