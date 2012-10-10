// Училище: Технологично училище "Електронни системи" към Технически Университет - София
// Клас: 11 Б
// Номер: 12
// Име: Даниела Яворова Алексова
// Задача: Събират се числата от колона на CSV документ и сумата им се извежда на екрана.
import java.io.BufferedReader;
import java.io.FileReader;


public class ParseCSVFile {
 
        public static void main(String[] args) throws Exception{
               
                                                           
                        String strFile = "test.csv";
                       
                        BufferedReader br = new BufferedReader( new FileReader("test.csv"));
                        String []line=new String[10];
                        String []arr=new String[10];
                        int Sum = 0,p;
			
                
                for(p=0;p<5;p++){
                        line[p]=br.readLine();
                        arr=line[p].split(",");

			if(p!=0){
                                Sum = Sum + Integer.parseInt(arr[1]);
                        }
                                           
                }
                        System.out.println(Sum);
                                      
                
        }
} 
