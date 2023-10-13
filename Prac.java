/*Write a Program to take a user-defined input in which 
1. All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters

Sample Input:
User gives input as "Hello"
Output should be: "Fbiil" */


class Prac
{
  public static void main(String args[])
   {
     String s = "Hello";
     String a= "";

     for(int i=0;i<s.length();i++)
      {
        if (Character.isUpperCase(s.charAt(i)))
              {                                                     //check if uppercase
                a += (char) (s.charAt(i) - 2);                      //character is decreased by 2 if its uppercase
             }
        else if (Character.isLowerCase(s.charAt(i)))
             {                                                    //check if lowercase
                a += (char) (s.charAt(i) - 3);                    //character is decreased by  3 if its lowercase
            }
        }

        System.out.println(a);                                  //prints modified result
    }
}