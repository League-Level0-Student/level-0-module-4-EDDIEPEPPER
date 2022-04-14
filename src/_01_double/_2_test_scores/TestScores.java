package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String answer = JOptionPane.showInputDialog("what is your most recent test score?");
double answerdouble = Double.parseDouble(answer);
if(answerdouble == 100) {

JOptionPane.showMessageDialog(null, "wow. very school.");

}
else if(answerdouble > 90) {

JOptionPane.showMessageDialog(null,"noice.");

}
else if(answerdouble > 60) {

JOptionPane.showMessageDialog(null,"pretty good.");

}
else if(answerdouble > 50) {

JOptionPane.showMessageDialog(null,"ok.");

}
else if(answerdouble > ) {

JOptionPane.showMessageDialog(null,"noice.");

}
else {
syso("You got 10 or less");
}

	}


}
