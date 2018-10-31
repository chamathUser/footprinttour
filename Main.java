package handPrint;
import static java.lang.Math.*;
//import java.util.ArrayList.toArray(T[]);
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;

public class Main {
	static float[] test;
	ArrayList<ArrayList<Float>> allVal = new ArrayList<ArrayList<Float>>();
	
	String NAME ;
	public void Test(String name){
		if(NAME.equals(name)){
			System.out.println("authentication successfull as "+ name);
			
		}else{
			System.out.println("login faild");
		}
		
	}

	
	public void getInput (ArrayList<ArrayList<Float>> lst){
	}
	public void print(int val){
		File file = new File("file.txt");
		try {

			Scanner sc = new Scanner(file);
			ArrayList<String> lines = new ArrayList<String>();
			//
			while (sc.hasNextLine()) {		
			  lines.add(sc.nextLine());
			}
			
			
			String arrTwo = lines.get(val+1);
			//System.out.println(arrTwo);
			String[] name = arrTwo.split(" ");

			//Main Y = new Main();
			Test(name[0]);
			
			
			
		}
		
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		float[] test = {7.6f,8.5f,9.5f,8.5f,6.6f,2,2,2,2,2,3,3,3,3,3};
		Main m = new Main();
		m.authenticate(test, "Chamath");



		
		

	}
	
	public void map(int[] list){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (Integer nextInt : list) {
            Integer count = map.get(nextInt);
            if (count == null) {
                count = 1;
            } else {
                count = count + 1;
            }
            map.put(nextInt, count);
        }

        Integer mostRepeatedNumber = null;
        Integer mostRepeatedCount = null;
        Set<Integer>keys = map.keySet();
        for (Integer key : keys) {
            Integer count = map.get(key);
            if (mostRepeatedNumber == null) {
                mostRepeatedNumber = key;
                mostRepeatedCount = count;
            } else if (count > mostRepeatedCount) {
                mostRepeatedNumber = key;
                mostRepeatedCount = count;
            } else if (count == mostRepeatedCount && key < mostRepeatedNumber) {
                mostRepeatedNumber = key;
                mostRepeatedCount = count;
            }
        }

        //System.out.println("Most repeated value is: " + mostRepeatedNumber); 
		//Main E = new Main();
		print(mostRepeatedNumber);
        
        
		
	}
	
	
	public void authenticate(float[] test, String s1){
		//System.out.println(NAME);
		NAME = s1;
		
		//ArrayList<String> names = new ArrayList<String>();
			File file = new File("file.txt");
			try {
	
				Scanner sc = new Scanner(file);
				ArrayList<String> lines = new ArrayList<String>();
				//
				while (sc.hasNextLine()) {		
				  lines.add(sc.nextLine());
				}
				
				
				String[] arr = lines.toArray(new String[0]);
			
			for(int z=0;z<arr.length;z++){
				ArrayList<Float> val = new ArrayList<Float>();
				String[] s = arr[z].split(" ");
				for(int y=1;y<s.length;y++){
					float value = Float.parseFloat(s[y]);
					val.add(value);
				}
				allVal.add(val);
			}
			allVal.remove(0);
			int a = 0;
			float valueNew = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			int u = 0;
			for(int x=0;x<15;x++){
				
				valueNew = test[x];
				
				int indx = 0;
					
				//if(x < 15){		
					float distance = valueNew - (allVal.get(0)).get(x);
						//System.out.println(distance);
						//u=0;
						for(int y=1;y<(allVal.size()-1);y++){
							if(distance < 0.0f){float distanceVal1 = distance + 0.0f;distance = 0.0f - distanceVal1;}
							
							float cdistance = (valueNew - (allVal.get(y)).get(x));
							
							if(cdistance < 0.0f){float distanceVal2 = cdistance + 0.0f;cdistance = 0.0f - distanceVal2;}

							if(cdistance<distance){indx = y;distance = cdistance;}
							
						}
						list.add(indx);
						float theNumber = (allVal.get(indx)).get(x);
						//System.out.println("this is the number "+Float.toString(theNumber));
						//System.out.println("this is value new "+Float.toString(valueNew));
						float difference = theNumber-valueNew;
						if(difference < 0){float tr = 0.0f+(difference);difference = 0.0f-tr;}
						if(difference <= 0.3f){
							//System.out.println(Float.toString(difference));
							u++;
						}
						//System.out.println(theNumber);
					
					}
				
				
			//}
			 int[] newList = new int[list.size()];
			 for(int x = 0;x<list.size();x++){
				  newList[x]=list.get(x);
				   
			   }
			   //newList = list.toArray(newList);
			   //TestApp m = new TestApp();
			 //System.out.println(Integer.toString(u));
			 if(u>=5){
				 
				 map(newList); 
			 }
			 else{
				 System.out.println("wrong user");
			 }
			   
				//m.getList(newList);
			
		}
			
			
			//int[] list = {1, 2, 3, 1, 0, 0, 1, 5, 6, 1569, 1, 2, 3, 2, 1569, 3};
  
			
			
			
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
		
		
		

		
	}
}
