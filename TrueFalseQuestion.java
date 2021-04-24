package cs1102f;
import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	TrueFalseQuestion(String question, String correctAnswer) {
		super(question);
		JPanel buttons = new JPanel();
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		if (correctAnswer.equals("F")||correctAnswer.equals("f")||correctAnswer.equals("false")||correctAnswer.equals("False")
				||correctAnswer.equals("FALSE")||correctAnswer.equals("n")||correctAnswer.equals("no")||correctAnswer.equals("No")
				||correctAnswer.equals("NO")||correctAnswer.equals("N")||correctAnswer.equals("t")||correctAnswer.equals("true")
				||correctAnswer.equals("T")||correctAnswer.equals("True")||correctAnswer.equals("TRUE")||correctAnswer.equals("y")
				||correctAnswer.equals("yes")||correctAnswer.equals("Y")||correctAnswer.equals("Yes")||correctAnswer.equals("YES")) {
			correctAnswer = correctAnswer.toUpperCase();
			if (correctAnswer.equals("F")||correctAnswer.equals("N")||correctAnswer.equals("FALSE")||correctAnswer.equals("NO")) {
				this.correctAnswer = "FALSE";
			}
			else {
				this.correctAnswer = "TRUE";
			}
			

		}	
	}
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
		
	}
}


