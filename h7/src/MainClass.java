
public class MainClass {
	public static void main(String[] args) {
		BallContainer box = new BallContainer();
		Ball b1 = new Ball();
		b1.setName("b1");
		box.add(b1);
		box.print();

		System.out.println(box.contains(b1));
		System.out.println(box.getCapacity());
		System.out.println(box.leftsize());


		Ball b2 = new Ball();
		b2.setName("b2");
		box.add(b2);
		Ball b3 = new Ball();
		b3.setName("b3");
		box.add(b3);
		System.out.println("    ");
		box.print();
		System.out.println(box.getCapacity());
		System.out.println(box.leftsize());
		System.out.println("    ");
		box.remove(b3);
		box.print();
		System.out.println("    ");
		box.clear();
		box.print();


	}
}
