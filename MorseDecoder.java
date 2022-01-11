import java.util.*;

public class MorseDecoder {
    public static void main(String[] args) {
        
        Scanner take = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = take.nextLine(); //Get the name from user
        char holder;
        
        for(int i=0; i<name.length(); i++){

            holder = name.charAt(i); //assign to holder ith character of name

            if(holder == 'A' || holder == 'a'){
                System.out.print(".- ");
            }
            else if(holder == 'B' || holder == 'b'){
                System.out.print("-... ");
            }
            else if(holder == 'C' || holder == 'c'){
                System.out.print("-.-. ");
            }
            else if(holder == 'D' || holder == 'd'){
                System.out.print("-.. ");
            }
            else if(holder == 'E' || holder == 'e'){
                System.out.print(". ");
            }
            else if(holder == 'F' || holder == 'f'){
                System.out.print("..-. ");
            }
            else if(holder == 'G' || holder == 'g'){
                System.out.print("--. ");
            }
            else if(holder == 'H' || holder == 'h'){
                System.out.print(".... ");
            }
            else if(holder == 'I' || holder == 'i'){
                System.out.print(".. ");
            }
            else if(holder == 'J' || holder == 'j'){
                System.out.print(".--- ");
            }
            else if(holder == 'K' || holder == 'k'){
                System.out.print("-.- ");
            }
            else if(holder == 'L' || holder == 'l'){
                System.out.print(".-.. ");
            }
            else if(holder == 'M' || holder == 'm'){
                System.out.print("-- ");
            }
            else if(holder == 'N' || holder == 'n'){
                System.out.print("-. ");
            }
            else if(holder == 'O' || holder == 'o'){
                System.out.print("--- ");
            }
            else if(holder == 'P' || holder == 'p'){
                System.out.print(".--. ");
            }
            else if(holder == 'Q' || holder == 'q'){
                System.out.print("--.- ");
            }
            else if(holder == 'R' || holder == 'r'){
                System.out.print(".-. ");
            }
            else if(holder == 'S' || holder == 's'){
                System.out.print("... ");
            }
            else if(holder == 'T' || holder == 't'){
                System.out.print("- ");
            }
            else if(holder == 'U' || holder == 'u'){
                System.out.print("..- ");
            }
            else if(holder == 'V' || holder == 'v'){
                System.out.print("...- ");
            }
            else if(holder == 'W' || holder == 'w'){
                System.out.print(".-- ");
            }
            else if(holder == 'X' || holder == 'x'){
                System.out.print("-..- ");
            }
            else if(holder == 'Y' || holder == 'y'){
                System.out.print("-.-- ");
            }
            else if(holder == 'Z' || holder == 'z'){
                System.out.print("--.. ");
            }
            else if(holder == ' '){
                System.out.print("/ ");
            }
            else{
                System.out.print("Please do not use Turkish character.");
                break;
            }
        }
    }
}

