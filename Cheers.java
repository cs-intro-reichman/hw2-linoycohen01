// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String Cheer = args[0];
            String CapsLetter = Cheer.toUpperCase();
            int times = Integer.parseInt(args[1]);
            String letters = "AEFHILMNORSX";
            for (int i = 0; i < CapsLetter.length() && (times != 0); i++)
            {
                char current = CapsLetter.charAt(i);
                System.out.println("Give me " + ((letters.indexOf(CapsLetter.charAt(i)) == -1) ? "a  " : "an ")
                                         + current + ": " + current + "!");
            }
           if (times != 0){
            System.out.println("What does that spell?");
           for (int i = 0; i < times; i++){
                System.out.println(CapsLetter + "!!!");
            }}
        }
}
