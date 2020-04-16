package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testing {
public static void main(String[] args) {
	

String tea=	JOptionPane.showInputDialog("What did yOoOOoU get on the test??? ( ͡° ͜ʖ ͡°)");
double erz = Double.parseDouble(tea);
if (erz>= 95) {
	JOptionPane.showMessageDialog(null, "Oh well, you'll be fine. It's not like you fAilEd or anything.");
}
else if (erz>=80) {
	JOptionPane.showMessageDialog(null, "It's not bad, but it's not great either... you'll be fiiiiiiine");
}
else if (erz>=76) {
	JOptionPane.showMessageDialog(null, "too bad. i wanted you to fail");
}
else if (erz>=60) {
	JOptionPane.showMessageDialog(null, "Wow you did soooooooooooooooooooooooooooooooooo well");
}
else if (erz>=40) {
	JOptionPane.showMessageDialog(null, "Haha look at this loser, up studying instead of partying");
}
else if (erz>=0) {
	JOptionPane.showMessageDialog(null, "Well compared to you i ACED it");
}
}
}
