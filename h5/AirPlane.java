/* #Училище: Технологично училище "Електронни системи" към Технически Университет - София
   #Клас: 11 Б
   #Номер: 12
   #Име: Даниела Яворова Алексова
   #Задача: Програма, която прави автоматична подредба на пътниците в самолет, който има 162 места, разделени на 6 колони и 27 реда.
*/
public class AirPlane {

private int [][] seats = new int[6][27];
private int sum = 0;
private boolean taken = false;

 public void printSeats() {
	for (int k=0; k<27; k++) {
		for(int l=0; l<6; l++) {
			if(l == 2){
				System.out.print(seats[l][k] + " ");
			} else {
				System.out.print(seats[l][k] );
			}
		}
		System.out.println();
	}
 }

 public void add(int rvalue) {
		taken = false;
		for(int i = 0; i<27; i++) {
			for(int k = 0; k<6; k++) {
				if(seats[k][i] == 0) {
					switch (rvalue) {
					case 1:
						seats[k][i] = 1;
						sum += rvalue;
						taken = true;
						break;
					case 2:
						if(k<=4) {
							if(seats[k+1][i] == 0 && k!=2 && k!=5) {
							seats[k][i] = 2;
							seats[k+1][i] = 2;
							sum += rvalue;
							taken = true;
							break;
							}
						}
						break;

					case 3:
						if(k<=3) {
							if(seats[k+1][i] == 0 && seats[k+2][i] == 0 && (k==0 || k==3)){
							seats[k][i] = 3;
							seats[k+1][i] = 3;
							seats[k+2][i] = 3;
							sum += rvalue;
							taken = true;
							break;
							}
						}
					break;
					default: break;
					}
				}else {
				continue;
				}
			}	
			if(taken == true) {
				break;
			}
		}
			if(taken == false){
			System.out.println("Please wait for another plane.We don't have free seats for you.");
			}
 }

 public int freeSeats() {
	int freeseats;
	if(sum < 162) {
		freeseats = 162 - sum;
		return freeseats;
	} else {
		System.out.println("There are no free seats left.");
		return 0;
	}
 }

 public static void main(String[] args) {
 int passangers;
	AirPlane plane = new AirPlane();
	while(plane.freeSeats() != 0) {
		passangers = (int)((Math.random() * 10)%3)+1;
		plane.add(passangers);
	}
	plane.printSeats();
	System.out.println("This plane is full and will take off now.");
	
 }

}
