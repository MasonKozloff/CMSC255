/*
 * ArtAnalysis.java
 *
 * Programming Project 6 – Apartment Buildings
 *Mason Kozloff
 *5/5/21
 * 255 CMSC
 */

package Project7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class ArtAnalysis {

    /**
     *
     * @param inputFile
     * @return lines (ArrayList<String>)
     * @throws FileNotFoundException
     */
    public static ArrayList<String> readFile(File inputFile) throws FileNotFoundException{
        // open file
        BufferedReader buffReader = new BufferedReader( new FileReader(inputFile));
        ArrayList<String> lines=new ArrayList<String>();
        String line="";
        try {
            // read line by line as string
            while((line=buffReader.readLine())!=null){
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error : "+e.getMessage());
        }
        try {
            buffReader.close();
        } catch (IOException e) {
            System.out.println("Error : "+e.getMessage());
        }
        return lines;
    }

    /**
     *
     * @param lines
     * @return arts (ArrayList<Art>)
     */
    public static ArrayList<Art> parseData(ArrayList<String> lines){
        ArrayList<Art> arts=new ArrayList<Art>();
        for(int i=0;i<lines.size();i++){
            // split lines
            String [] splts=lines.get(i).split(" ");
            String word="";

            // to store all arts values
            String nm="",creator="",location="";
            double val=0;


            int lvl=0;
            for(int j=0;j<splts.length;j++){
                // each string is empty , then store in arts values
                if(splts[j].equals("")){
                    // value
                    if(lvl==2){
                        val=Double.parseDouble(word);
                        if(val<0){
                            val=0;
                        }
                    }

                    // creator
                    if(lvl==1){
                        creator=word;
                    }
                    // name
                    if(lvl==0){
                        nm=word;
                    }
                    if(j<splts.length-1 && splts[j+1].equals("")==false){
                        lvl++;
                    }
                    word="";
                }
                else{
                    word+=splts[j];
                    // add space in word
                    if(j<splts.length-1 && splts[j+1].equals("")==false){
                        word+=" ";
                    }
                }
            }
            // location
            location=word;
            Art art=new Art(nm,creator,val,location);

            arts.add(art);
        }
        return arts;
    }
    /**
     *
     * @param artworks
     * @return
     */
    public static double calcValueAvg(ArrayList<Art> artworks){
        double total=0;
        for(int i=0;i<artworks.size();i++){
            total+=artworks.get(i).getValue();
        }
        return (total/(double)artworks.size());
    }
    /**
     *
     * @param artworks
     * @return
     */
    public static double findHighValue(ArrayList<Art> artworks){
        double max=-1;
        for(int i=0;i<artworks.size();i++){
            if(max<artworks.get(i).getValue()){
                max=artworks.get(i).getValue();
            }
        }
        return (max);
    }
    /**
     *
     * @param artworks
     * @param avg
     * @return
     */
    public static ArrayList<Art> findHighestArtByValue(ArrayList<Art> artworks,double avg){
        ArrayList<Art> arts=new ArrayList<Art>();
        for(int i=0;i<artworks.size();i++){
            if(avg<artworks.get(i).getValue()){
                arts.add(artworks.get(i));
            }
        }
        return arts;
    }
    /**
     *
     * @param artworks
     * @param art
     * @return
     */
    public static boolean findArt(ArrayList<Art> artworks,Art art){
        for(int i=0;i<artworks.size();i++){
            if(artworks.get(i).equals(art)){
                return true;
            }
        }
        return false;
    }

    public static void writeOutData(String outputMessage,ArrayList<Art> artworks,PrintWriter out){
        out.println(outputMessage);
        for(int i=0;i<artworks.size();i++){
            out.print("\t");
            out.println(artworks.get(i));
        }
    }
    public static void writeOutData(String outputMessage,double value,PrintWriter out){
        out.print(outputMessage);
        out.printf(": %.2f",value);
        out.println("\n");
        out.println("\n");
    }
    public static void writeOutData(String outputMessage,boolean value,PrintWriter out){
        out.println("\n");
        out.print(outputMessage);
        out.print(": ");
        out.println(value);

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String inputFileName="";
        String outputFileName="";
        // if no files name in command line
        if(args.length==0){
            System.out.print("Enter the input file name : ");
            inputFileName=sc.next();
            System.out.print("Enter the output file name : ");
            outputFileName=sc.next();
        }
        // if one file name in command line
        if(args.length==1){
            System.out.print("Enter the output file name : ");
            outputFileName=sc.next();
        }
        // if two files name in command line
        if(args.length==2){
            inputFileName=args[0];
            outputFileName=args[1];
        }
        sc.close();
        ArrayList<Art> arts=null;
        try {
            // read file and store in arraylist
            arts= parseData(readFile(new File(inputFileName)));
        } catch (FileNotFoundException e) {
            System.out.println("Error : "+e.getMessage());
        }
        // get average from all arts
        double avg=calcValueAvg(arts);
        ArrayList<Art> artsavg= findHighestArtByValue(arts,avg);
                /*
System.out.printf("The average value is: %.2f\n",avg);

System.out.printf("\nThe highest value is: %.2f\n",findHighValue(arts));
// get all arts more than average
// display arts more than average
System.out.println("\nThe arts above the average value are:");
for(int i=0;i<artsavg.size();i++){
System.out.println("\t"+artsavg.get(i));
}
                 */
        System.out.println("Incorrect input filename or Input file correct.");
        System.out.println("Incorrect output filename or Output file correct.");

        // write in file
        PrintWriter out =null;
        try {
            out = new PrintWriter(new File(outputFileName));
            writeOutData("The average value is",avg,out);
            writeOutData("\nThe highest value is",findHighValue(arts),out);
            writeOutData("\nThe arts above the average value are",artsavg,out);
            Art art=new Art("David","Donatello",41642723.44,"823 Harlow St");
            writeOutData("\nIs David by Donatello in the data? ",findArt(arts,art),out);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error : "+e.getMessage());
        } }

}