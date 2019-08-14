package comm.example.abstrct1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Line(10,40);
		Model model2 = new Line(10,40);
		System.out.println("Object1 greater than Object2: "+model.isGreater(model2));
		System.out.println("Object1 lesser than Object2: "+model.isLesser(model2));
		System.out.println("Object1 equal to Object2: "+model.isEqual(model2));
	}

}
