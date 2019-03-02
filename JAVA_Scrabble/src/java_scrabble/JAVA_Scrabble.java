/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_scrabble;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Al2a
 */
public class JAVA_Scrabble {
    String input;
    
    public JAVA_Scrabble(){
    Scanner txt = new Scanner(System.in);
    System.out.println("Please enter the text");
    String input = txt.nextLine();
    String[] w = input.split(" ");
    int nbr_w=w.length;
    //System.out.println(nbr_w);
    int[] score = new int[nbr_w]; 
    
    System.out.println("\n");
    
    for (int i = 0; i < nbr_w; i = i + 1) {
        int len = w[i].length();
        //score = new int[nbr_w]; 
        score[i]=0;
        //System.out.println(score[i]);
        for (int j = 0; j < len; j = j + 1) {
            char var = w[i].charAt(j);
            String v=String.valueOf(var);  
            //System.out.println(var+" ");
             switch (v){
		case "e":case "a":case "i":case "o":case "n":case "r":case "t":case "l":case "s":case "u":case "E":case "A":case "I":case "O":case "N":case "R":case "T":case "L":case "S":case "U":
		score[i]=score[i]+1;
		break;
		case "d":case "g":case "D":case "G":
		score[i]=score[i]+2;
		break;
		case "b":case "c":case "m":case "p":case "B":case "C":case "M":case "P":
		score[i]=score[i]+3;
		break;
		case "f":case "h":case "v":case "w":case "y":case "F":case "H":case "V":case "W":case "Y":
		score[i]=score[i]+4;
		break;
		case "k":case "K":
		score[i]=score[i]+5;
		break;
		case "j":case "x":case "J":case "X":
		score[i]=score[i]+8;
		break;
		case "q":case "z":case "Q":case "Z":
		score[i]=score[i]+10;
		break;
		}                   
        }
    }
    
    for (int i = 0; i < nbr_w; i = i + 1) {
        int len = w[i].length();
        int max = Arrays.stream(score).max().getAsInt();
        if(score[i]==max && len<=10){
            System.out.println("Word : "+w[i]+" && Highest point : "+score[i]+" points");
        }
        if (len>10) {
            System.out.println("Word : "+w[i]+" The max length of a word is 10 letters.");
        }
        
    }
    
    System.out.println("\n");
    
    for (int i = 0; i < nbr_w; i = i + 1) {
        System.out.println("Word : "+w[i]+" Score : "+score[i]);
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JAVA_Scrabble myObj = new JAVA_Scrabble();
    }
    
}
