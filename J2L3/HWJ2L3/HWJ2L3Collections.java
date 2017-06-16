/*	HW Java2 Lesson 3
*	avtor: Tveritin Yuri
*	version: 15.06.2017
*	Collection Framework
*/
import java.util.*;

public class HWJ2L3Collections{
	
	public static void main(String[] args){
		String[] arraywords={"Cat","Dog","Ball","Monkey","Wolf","Dog","Ball",
		"Monkey","Wolf","Dog","Ball","Monkey","Wolf","Dog","Ball","Monkey",
		"Wolf","Dog","Dog","Dog","Wolf","Dog","Ball"};
		int size=arraywords.length;
		ArrayList<String> words=new ArrayList<String>();//for equally words
		TreeSet<String> noew = new TreeSet<String>();//no equally words
		for (int i=0;i<size;i++){
			System.out.print(arraywords[i]+" ");//выводим исходный массив слов
			words.add(arraywords[i]);//помещаем слова в ArrayList чтобы найти одинаковые элементы
			noew.add(arraywords[i]);//помещаем слова в TreeSet для уникальности и сортировки
		}
		System.out.println();
					
		for (int i=0;i<size;i++)System.out.println(words.get(i)+"-"+Collections.frequency(words, words.get(i)));//подсчет слов
		
		System.out.println(noew); //список слов 
		//add()
	}
}

/*public class Phonebook{
	
	Map<String, String> pb = new TreeMap<>();
        pb.put(Contact1.name,Contact1 info);
        pb.put(Contact1.name,Contact1 info);
        pb.put(Contact1.name,Contact1 info);
        pb.put(Contact1.name,Contact1 info);
	void write(){
		pb.put(Contact1.name,Contact info)
	}
}

public class Contacts{
	public Contacts (String name, String info)
		this name=name;
		this.info=info;
		
	
	
	
}*/