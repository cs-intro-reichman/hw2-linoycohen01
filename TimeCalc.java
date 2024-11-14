public class TimeCalc {
    public static void main(String[] args) {
     

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int MinutesToAdd = Integer.parseInt(args[1]);
        //System.out.println("hours: " + hours + " minutes: " + minutes + " Minutes To Add: " + MinutesToAdd);
        int TotalMinutes = ((hours * 60) + minutes + MinutesToAdd);
       // System.out.println(TotalMinutes);
        int TotalHours = ((TotalMinutes/60) % 24); 
        //System.out.println(TotalHours);
        int MinutesLeft = (TotalMinutes % 60);
        if (TotalHours < 10)
           { 
               System.out.println("0" + TotalHours + ":" + ((MinutesLeft < 10) ? "0" + MinutesLeft : MinutesLeft));
            }
        else {
           
                System.out.println(TotalHours + ":" + ((MinutesLeft < 10) ? "0" + MinutesLeft : MinutesLeft));
             
        }

    }
}
 