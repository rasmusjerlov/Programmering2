package lambda.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();



//		OPGAVE A
		System.out.println(findFirst(persons, p -> p.getAge() == 44));
//		OPGAVE B
		System.out.println(findFirst(persons, p -> p.getName().startsWith("S")));
//		OPGAVE C
//		System.out.println(findFirst(persons, p -> ) { };

//		Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1
//		OPGAVE D
		System.out.println(findFirst(persons, p -> p.getName().length() == p.getAge()));
	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {

		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}
}
