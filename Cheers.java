//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String name = args[0].toUpperCase();
        int count = Integer.parseInt(args[1]);
        String anLtters = ("AEFHILMNORSX");
       int i = 0;

        while (i < name.length()){
                if(anLtters.indexOf(name.charAt(i)) != -1){
                          System.out.println("Give me an " + name.charAt(i) + ": " + name.charAt(i) + "!");
                } else
                        System.out.println("Give me a  " + name.charAt(i) + ": " + name.charAt(i) + "!");
          i += 1;
        }

        System.out.println("What does that spell?");
        while (count > 0 ){
                System.out.println(name + "!!!");

                count--;
        }

        
       }
 }
