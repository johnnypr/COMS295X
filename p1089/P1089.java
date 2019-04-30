package unit1;

import java.util.*;
import java.io.*;


public class P1089 {
	
	public static void main(String[] args) throws IOException {
		P1089 myWork = new P1089();
		myWork.begin();
		
	}
	
    void begin() {
		
        Scanner stdIn = new Scanner(new BufferedInputStream(System.in));
        String line="";
     

        while (stdIn.hasNextLine()){
        	String input = stdIn.nextLine();
        	if (input.length() == 1) {
        		line += input+ " ";
        		break;
        	}
        	line += input+ " ";
            
        }
        stdIn.close();
        

        
        int i = 0;
        int step = 0;
        ArrayList<String> arrWords = new ArrayList<String>();
        ArrayList<Integer> nr = new ArrayList<Integer>();
        ArrayList<Integer> cut = new ArrayList<Integer>();

        
        for (String w : line.split("\\s", 0)) {
            try {
                nr.add(Integer.parseInt(w));
                cut.add(i-step);
                step +=1;
            } catch (Exception e) {
                arrWords.add(w);

            }
            i += 1;
         }
        	arrWords.add(".");

        morph(arrWords, nr, cut);

    }
        
        
    public static void morph(ArrayList<String> arrWords, ArrayList<Integer> nr, ArrayList<Integer> cut) {
    		
	        
    		int testcase = 0;
            int i = 0;

            String s ="";
            String t ="";

            while(testcase<=nr.size()-1) {
                s = arrWords.get(cut.get(testcase)-2);
                t = arrWords.get(cut.get(testcase)-1);
                i = 0;
                for(int j = 0 ; j <= (nr.get(testcase)*2); j+=2){
                    if (s.equals(arrWords.get(cut.get(testcase)+j))){
                        s = arrWords.get(cut.get(testcase)+(j+1));
                        i +=1;
                        if (s.equals(t)){
                            System.out.println("Case " + (testcase +1)+ ": " + (i));
                            break;
                        }
                    }

                }

                if(s.equals(t)){
                    testcase += 1;
                }else{
                    System.out.println("Case " + (testcase +1)+ ": No Solution");
                    testcase+=1;
                }
            }

        }

	}


