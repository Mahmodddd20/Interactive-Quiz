package cs1102f;

public class Quiz {
	public static void main(String[] args) {
		
		Question question1 = new MultipleChoiceQuestion("How many blue stripes are there on the U.S. flag?",
				"6", "7", "13", "0", "5", "d");
		Question question2 = new MultipleChoiceQuestion("Which one of these characters is not friends with Harry Potter?",
				"Ron Weasley", "Neville Longbottom", "Draco Malfoy", "Hermione Granger", "Me", "c");
		Question question3 = new MultipleChoiceQuestion("Which country held the 2016 Summer Olympics?",
				"China", "Ireland", "Brazil", "Italy", "Greece", "c");
		Question question4 = new MultipleChoiceQuestion("Which planet is the hottest?",
				"Venus", "Saturn", "Mercury", "Mars", "Earth in summer", "a");
		Question question5 = new MultipleChoiceQuestion("What is the rarest blood type?",
				"O", "A", "B", "AB-Negative", "O-Negative", "d");
		Question question6 = new TrueFalseQuestion("Damascus is the capital of Syria","TRUE");
		Question question7 = new TrueFalseQuestion("The Great Wall of China is longer than the distance between London and Beijing","TRUE");
		Question question8 = new TrueFalseQuestion("'A' is the most common letter used in the English language","FALSE");
		Question question9 = new TrueFalseQuestion("Monaco is the smallest country in the world","FALSE");
		Question question10 = new TrueFalseQuestion("There are five different blood groups","FALSE");




		question1.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		question6.check();
		question7.check();
		question8.check();
		question9.check();
		question10.check();




		MultipleChoiceQuestion.showResults();
		
		
	}

		
	}

