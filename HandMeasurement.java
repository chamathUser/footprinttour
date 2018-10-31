package handPrint;

import java.io.*;

public class HandMeasurement {
	float[] testCase = {1.22f,3.48f,4,5,6.799f};

   public static void main (String[] args) {
	   float[] testCase = {1.22f,3.48f,4,5,6.799f};
	   String s = "chamath";

	   HandMeasurement a = new HandMeasurement();
      a.appendToCheckbook(testCase, s);

   } // end main
   public String getUserName(String s){
	   return s;
   }

   public void appendToCheckbook (float[] array, String name) {

      BufferedWriter bw = null;

      try {
         // APPEND MODE SET HERE
         bw = new BufferedWriter(new FileWriter("file.txt", true));
         bw.write(name+" ");
         for(float x: array){
        	 bw.write(String.valueOf(x));
        	 bw.write(" ");
         }
         
         bw.newLine();
         bw.flush();
      } catch (IOException ioe) {
    	  ioe.printStackTrace();
      } finally {                       // always close the file
    	  if (bw != null) try {
	    bw.close();
	 } catch (IOException ioe2) {
	    // just ignore it
	 }
     } // end try/catch/finally

   } // end test()

} // end class

