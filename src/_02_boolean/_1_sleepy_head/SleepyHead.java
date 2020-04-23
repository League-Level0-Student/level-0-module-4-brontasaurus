package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         */
        int i=JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if (i==1) {isWeekday=false;
        }
        else {isWeekday=true;
        }
        int e=JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if (e==1) {isVacation=false;
        }
        else {isVacation=true;
        }
        
        if (isWeekday&&!isVacation) {
        
        	JOptionPane.showMessageDialog(null, " “get up lazybones!");
        }
        else if (isVacation) {
        	JOptionPane.showMessageDialog(null, " “sleep in?");
        }
        


        /*
         * Print “sleep in"? if it is a vacation or a weekend. 
         * If it’s a weekday, print “get up lazybones!"? 
         * If it is a weekday, but we are on vacation,  print “sleep in"?.
         */
    }
}
