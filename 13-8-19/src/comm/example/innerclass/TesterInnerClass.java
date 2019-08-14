package comm.example.innerclass;

public class TesterInnerClass {
	
	public static void main(String args[]) {
		InnerClass oc = new InnerClass();
		oc.display();
		InnerClass.OuterClass ic = oc.new OuterClass();
		ic.display1();
	}
}
