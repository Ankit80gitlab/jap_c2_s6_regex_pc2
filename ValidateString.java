package com.jap.validatestring;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateString {
    public static void main(String[] args) {
        String str = "Julia_21";

        ValidateString validateString = new ValidateString();
        // Call method to check if input string is valid or not
		validateString.validatePassword(str);

        if (!validateString.validatePassword(str)) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Valid Password!");
        }
    }

    // Function to validate username based on the specified rules
    public boolean validatePassword(String str) 
	{
        boolean result=false;

		if (str==null)
		{
            result=false;

		}

		else
		{
        int n=str.length();
         	
		Pattern pObject =Pattern.compile("[a-z A-Z]{1,}[_]{0,}[0-9]{0,}");
        Matcher mObject= pObject.matcher(str);

        

        if (n<7)
        {
            result=false;
        } 

		else if (n>19)
        {
            result=false;
        }

        else if(mObject.matches())
        {
            result=true;
        }
		}

		return result;
	}
}
