package unit3;
import java.util.*;
import java.io.*;


public class waldorf {
    public static int checkFHorizontal(char[][] grid,String word,int x, int y,int rows, int columns){
        int end = 0;

        if (y<columns-word.length()){
            for(int i = 1; i<word.length();i++){
                if (grid[x][y+i] != word.charAt(i)){ 
                    end = 0;
                    return end;
                }
                end = y+i;
            } 
        }
        return end;
    }

    public static int checkRHorizontal(char[][] grid,String word,int x, int y,int rows, int columns){
        int end = 0;
        
       
        if(y>= columns - word.length()){
    
            for(int i = 1; i<word.length();i++){
                if (grid[x][y-i] != word.charAt(i)){ 
                    end =0;
                    return end;
                }
                end = y+i;
                
            }

        }
        return end;
    }
    public static int checkVertical(char[][] grid,String word,int x, int y,int rows, int columns){
        int end = 0;
       

        if (x<=rows-word.length()){
            for(int i = 1; i<word.length();i++){
                if (grid[x+i][y] != word.charAt(i)){
                    end =0;
                    return end;
                }
                end = y+i;
            }
        }
        return end;
    }
    public static int checkIncline(char[][] grid,String word,int x, int y,int row, int column){
        int end = 0;
        
        
            if (y>word.length()&& x<=row-word.length()){
        
                for(int i = 1; i<word.length();i++){
                    if (grid[x+i][y-i] != word.charAt(i)){
                        end =0;
                        return end;
                    }
                    end = y+i;
                }
            }
            return end;
        
    }
        
    
    public static int checkDecline(char[][] grid,String word,int x, int y, int row, int column){
        int end = 0;

        


        if (y<=column-word.length() && x<=row-word.length()){
            for(int i = 1; i<word.length();i++){
                if (grid[x+i][y+i] != word.charAt(i)){
                    end =0;
                    return end;
                }   
                end = y+i;
            }
        }
        return end;
    }


    public static String findWords(char[][] grid,String[] words, int row , int column){
        
        for (int index = 0; index < words.length; index++){
            int wordIndex = index;
        
            for(int r = 0; r<row;r++){
                for(int c= 0; c<column;c++){
                    if (grid[r][c] == words[wordIndex].charAt(0)){
                        if(w)
                         if (checkFHorizontal(grid, words[wordIndex], r, c,row,column) != 0){
                        System.out.println(((r+1) + " " + (c+1)));
                        }
                    
                        if (checkRHorizontal(grid, words[wordIndex], r, c,row,column) != 0){
                            System.out.println(((r+1) + " " + (c+1)));
                        }
                    
                        if (checkVertical(grid, words[wordIndex], r, c,row,column) != 0){
                            System.out.println(((r+1) + " " + (c+1)));
                        }
                    
                        if (checkDecline(grid, words[wordIndex], r, c,row,column) != 0){
                            System.out.println(((r+1) + " " + (c+1)));
                        }
                    
                        if (checkIncline(grid, words[wordIndex], r, c,row,column) != 0){
                            System.out.println(((r+1) + " " + (c+1)));
                        } 

                    }
                }
           
            }
        
            
        }
        return "";
    }



    public static void main(String[] args) throws FileNotFoundException { 
        File file = new File("input.txt");
        ArrayList<String> data = new ArrayList<String>();
        String line;
        int testcases, x, y;
        testcases =x =y = 0;

        Scanner scn = new Scanner(file);
        testcases = scn.nextInt();
        System.out.println(testcases);

        while(testcases > 0){
            x = scn.nextInt();
            y = scn.nextInt();


            
            for(int i = 0; i<x;i++){
                line = scn.next(); 
                data.add(line.toLowerCase());
                
            }


            char[][] grid = new char[x][y];

            for(int i = 0; i<x;i++){
                for(int j = 0; j<y;j++){
                    grid[i][j]=((data.get(0)).charAt(j));
                }
                data.remove(0);
            }

            



            int numWords = scn.nextInt();
            String[] words = new String[numWords];

            for(int z = 0; z< numWords; z++){
                String word = scn.next();
                words[z] = word.toLowerCase();
            }

            System.out.println(x + " and " + y);
            for(int a = 0; a < x; a++){
                System.out.println(Arrays.toString(grid[a]));
            }
            System.out.println(Arrays.deepToString(words));

            System.out.println(findWords(grid, words, x, y));
            testcases -=1;
        
        }
        scn.close();

        

    }
    
}