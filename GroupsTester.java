import java.util.ArrayList;
public class GroupsTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
		Student a = new Student("One","One","1234", 3.1);
		Student b = new Student("Two","Two","1234", 3.2);
		Student c = new Student("Three","Three","1234", 2.1);
		Student d = new Student("Four","Four","1234", 1.3);
		Student e = new Student("Five","Five","1234", 3.7);
		Student f = new Student("Six","Six","1234", 3.43);
		Student g = new Student("Seven","Seven","1234", 1.1);
		Student h = new Student("Eight","Eight","1234", 2.7);
		Student i = new Student("Nine","Nine","1234", 2.3);
		Student j = new Student("Ten","Ten","1234", 3.8);
		Student k = new Student("Eleven","Eleven","1234", 3.5);
		Student l = new Student("Twelve","Twelve","1234", 1.9);
		Student m = new Student("Lucky","Lucky","1234", 2.9);
		Student n = new Student("Fourteen","Fourteen","1234", 3.75);
		Student o = new Student("Fifteen","Fifteen","1234", 2.65);
		Student p = new Student("Sixteen","Sixteen","1234", 2.99);
		Student q = new Student("Seventeen","Seventeen","1234", 3.02);
		Student r = new Student("Eightteen","Eightteen","1234", 3.47);
		Student s = new Student("Nineteen","Nineteen","1234", 3.23);
		Student t = new Student("Twenty","Twenty","1234", 2.57);
		Student u = new Student("TwentyOne","TwentyOne","1234", 1.22);
		Student v = new Student("TwentyTwo","TwentyTwo","1234", 2.22);
		students.add(a);
		students.add(b);
		students.add(c);
		students.add(d);
		students.add(e);
		students.add(f);
		students.add(g);
		students.add(h);
		students.add(i);
		students.add(j);
		students.add(k);
		students.add(l);
		students.add(m);
		students.add(n);
		students.add(o);
		students.add(p);
		students.add(q);
		students.add(r);
		students.add(s);
		//students.add(t);
		//students.add(u);
		//students.add(v);
		GroupsGenerator generator = new GroupsGenerator(4, students);
		System.out.println(students.size());
		ArrayList<Group> groupsProduced = generator.makeGroups();
		for (Group gr : groupsProduced){
			System.out.println(gr);
			
		}
	}

}
