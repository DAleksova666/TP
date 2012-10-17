//#Училище: Технологично училище "Електронни системи" към Технически Университет - София
//#Клас: 11 Б
//#Номер: 12
//#Име: Даниела Яворова Алексова
//#Задача: Програма, която извежда системните свойства по зададени от командния ред имена на свойствата.

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;




public class SistemProperties{

 public static void main(String[] args){
  


  List<String> output = new ArrayList<String>();
  

  for(String str:args){
     
	if(System.getProperty(str)!=null){
   
	output.add(System.getProperty(str));
	}   
  }
  
  String[] result = new String[output.size()];
  output.toArray(result);

   

   int final = args.length-1;
  
   if(args[final].equals("up")){
   Arrays.sort(result);
   System.out.println(); 
	for(String str:result){
	System.out.println(str); 
        }
   }
  
    if(args[final].equals("down")){
     Arrays.sort(result,Collections.reverseOrder());
     System.out.println(); 
		for(String str:result){
		System.out.println(str); 
       		}
    }

  
  
 }
}