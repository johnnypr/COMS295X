import java.util.*;
import java.io.*;


public class waldorf {


    //-----------------------------Assume positions-------------------------------------//
    public static int checkFHorizontal(char[][] grid,String word,int x, int y,int rows, int columns){
        int end = 0;

        if (y<=word.length()){
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
        
       
        if(y >=columns - word.length()){
    
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
       

        if (x<=word.length()){
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
        
        
            if (yword.length()&& x<=row-word.length()){
        
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


    //new methods for edge cases
    public static int checkFIncline(char[][] grid,String word,int x, int y,int row, int column){
        int top = 0;

        

        if (y>=column-word.length() && x>=row-word.length()){
            for(int i = 1; i<word.length();i++){
                if (grid[x+i][y+i] != word.charAt(i)){
                    return top;
                }   
                top = y+i;
            }
        }
        return top;
    }

    public static int checkFDecline(char[][] grid,String word,int x, int y,int row, int column){
        int top = 0;

        if (y>=column-word.length() && x>=row-word.length()){
            for(int i = 1; i<word.length();i++){
                if (grid[x-i][y+i] != word.charAt(i)){
                    return top;
                }   
                top = y+i;
            }
        }
        return top;

    }


    public static int checkFVertical(char[][] grid,String word,int x, int y,int row, int column){
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

    //------------------------------find words----------------------------------------//

    public static void findWords(char[][] grid,String[] words, int row , int column){
        

        search: 
            for (int index = 0; index < words.length; index++){
                int wordIndex = index;
                
            
                for(int r = 0; r<row;r++){
                    for(int c= 0; c<column;c++){


                        if (grid[r][c] == words[wordIndex].charAt(0)){
                            System.out.println(words[wordIndex]);
                            
                            if(words[wordIndex].length() <= 1){
                                System.out.println((r+1) + " " + (c+1));
                                continue search;
                            }


                            if (checkFHorizontal(grid, words[wordIndex], r, c,row,column) != 0){
                                System.out.println(((r+1) + " " + (c+1)));
                                continue search;
                            
                            }
                        
                            if (checkRHorizontal(grid, words[wordIndex], r, c,row,column) != 0){
                                System.out.println(((r+1) + " " + (c+1)));
                                continue search;
                                
                            }
                        
                            if (checkVertical(grid, words[wordIndex], r, c,row,column) != 0){
                                System.out.println(((r+1) + " " + (c+1)));
                                continue search;
                                
                            }
                        
                            if (checkDecline(grid, words[wordIndex], r, c,row,column) != 0){
                                System.out.println(((r+1) + " " + (c+1)));
                                continue search;
                                
                            }
                        
                            if (checkIncline(grid, words[wordIndex], r, c,row,column) != 0){
                                System.out.println(((r+1) + " " + (c+1)));
                                continue search;
                                
                            }

                        }
                    }
            
                }
                
            }
            return;
        }



public static void main(String[] args) throws FileNotFoundException { 
        File file = new File("input.txt");
        ArrayList<String> data = new ArrayList<String>();
        String line;
        int testcases, x, y;
        testcases =x =y = 0;

        Scanner scn = new Scanner(file);
        testcases = scn.nextInt();
        
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

            
            findWords(grid, words, x, y);
            System.out.println("\n");
                        
            testcases -=1;
        
        }
        scn.close();

    }
    
}