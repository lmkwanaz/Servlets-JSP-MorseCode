package com.morsecode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCode {

	public static String[] lettersToMorseCode(String code){

        char[] morse_code =
                { 'a',
                'b', 'c',
                'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };

        String[] morse_code1 = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};
        String lower_str = code.toLowerCase();
        char[] changeit = lower_str.toCharArray();
        String newstr = "";
       
        String letSee = "";
	int count = 0;

        if(code.length() != 0){
            for(int i=0; i<changeit.length;i++){
                for(int k=0; k<39; k++){
                    if(changeit[i] == morse_code[k]){
                        newstr += morse_code1[k] + " ";
			count++;
                    }else if(Character.isWhitespace(changeit[i])){
			newstr += "/ ";
			count++; 
			break;
		    }
                }
            }

	     assert count == code.length() : "this is totaly wrong in lettersTomorseCode";
            //System.out.println(newstr);

            Pattern whitespace = Pattern.compile("\\s");
            Matcher white = whitespace.matcher(newstr);
            String[] separate = newstr.split(" ");
            Pattern whitespace_code = Pattern.compile("\\s");
            Matcher white_code = whitespace_code.matcher(code);
            String[] separate_code = newstr.split(" ");
            int count_space = 0;
            int count_space1 = 0;

            for(int i=0 ;i<separate.length; i++){
                if(white.find()){
                  count_space++;
                }
            }
            int count_minus = count_space - 1;

            for(int i=0 ;i<code.length(); i++){
                if(white_code.find()){
                    count_space1++;
                }
            }

            int count_add = count_space1 + 1;

            assert count_minus == 
            		count_add: letSee="the number of spaces of output are not equal";
            		letSee = "the number of spaces of the output are equal";

        }else{
            System.out.println("this field shouldn't be empty");
        }
        
        String[] arrayCode = {newstr, letSee};
        
        return arrayCode;
    }
	
	
	 public static String morseCodeToLetters(String code){

	        char[] morse_code =
	                { 'a', 'b', 'c',
	                        'd', 'e', 'f',
	                        'g', 'h', 'i',
	                        'j', 'k', 'l',
	                        'm', 'n', 'o',
	                        'p', 'q', 'r', 's',
	                        't', 'u', 'v',
	                        'w', 'x', 'y', 'z',
	                        '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
	                        ',', '.', '?' };

	        String[] morse_code1 = { ".-", "-...", "-.-.",
	                "-..", ".", "..-.",
	                "--.", "....", "..",
	                ".---", "-.-", ".-..",
	                "--", "-.", "---",
	                ".---.", "--.-", ".-.", "...",
	                "-", "..-", "...-",
	                ".--", "-..-", "-.--", "--..",
	                ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
	                "--..--", ".-.-.-", "..--.." };

	        String[] changeit = code.split(" ");

	        String  newstr = " ";
		int morse_code_count = 0;

	        if(code.length() != 0){
	            for(int i=0; i<changeit.length;i++){
	                for(int k=0; k<39 ;k++){
	                    if(changeit[i].equals(morse_code1[k])){
				morse_code_count++;
	                        newstr += morse_code[k];
	                    }else if(changeit[i].equals("/")){
				newstr += " ";
				morse_code_count++;
				break;
			    }
	                }
	            }
	            
	             assert morse_code_count == newstr.length() - 1 : "this is totaly wrong in morseToCode";
	            //System.out.println(newstr);

	        }else{
	            System.out.println("this field shouldn't  be empty");
	        }

	        return newstr;
	    }

}
