import java.util.*; 

public class BallContainer {
	private int size = 10;
	private int cap = 0;
	ArrayList<Ball> balls= new ArrayList<Ball>(size);

	public void add(Ball b){
		if(!isFull()) {
			if(!balls.contains(b)){
				balls.add(b);
				cap=cap+1;
			} else {
				System.out.println("This ball is already in the box.");
			}
		} else {
			System.out.println("The box is full.");
		}

	}

	public void remove(Ball b){
		if(!balls.isEmpty()) {
			if(!balls.contains(b)) {
				System.out.println("This ball is not in the container");
			} else {
				balls.remove(b);
			}
		} else {
			System.out.println("The box is empty");
		}

	}

	public void print() {
		for(Ball b1:balls) {
			System.out.println(b1.getName());
		}
	}

	public void clear(){
		balls.clear();

	}

	public int getCapacity(){
		return cap; 
	}


	public int leftsize(){
		return size-cap;
	}

	public boolean contains(Ball b){
		if (balls.contains(b))
			return true;
		else return false;

	}

	public boolean isFull(){
		cap=balls.size();
		if 	(cap == size)
			return true;
		else return false;
	}


}
