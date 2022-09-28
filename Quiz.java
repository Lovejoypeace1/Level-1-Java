package com.learn;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int correct = 0;
		int incorrect = 0;
		int questions = 4;
		System.out.print("\n");

		System.out.println("Multiple Choice Quiz");
		System.out.println("\n");
		String[][] Ques_Ans = {
				{ "What is the capital of Nepal?", "\n A. Kathmandu \n B. Dhaka \n C. Istanbul \n D. Framkfurt \n",
						"A" },
				{ "Who is the founder of Mircrosoft?",
						"\n A. Thomas Edison \n B. Steve Jobs \n C. Bill Gates \n D. Florence Nightinagale \n", "C" },
				{ "Where is Nepal located?", "\n A. South Asia \n B. East Asia \n C. North Asia \n D. West Asia \n",
						"A" },
				{ "What is the capital of U.S.A?", "\n A. Moscow \n B. Brussels \n C. Paris  \n D. Washington D.C",
						"D" } };

		String[] user_ans = new String[(int) questions];
		int i = 0;

		do {
			System.out.print(" " + (i + 1) + "." + Ques_Ans[i][0] + " " + Ques_Ans[i][1]);
			user_ans[i] = String.valueOf(input.next().charAt(0));

			if (Ques_Ans[i][2].equals(user_ans[i].toUpperCase())) {
				System.out.println("\n Correct Answer !");
				correct++;
			}
			else
			{
				System.out.println("\n Incorrect. The Correct Answer is" + Ques_Ans[i][2]);
				incorrect++;
			}
			System.out.print("\n");
			i++;
		} while (i < questions);
		System.out.print("\n");
		System.out.print("\t ----DISPLAY RESULT----");
		System.out.print("\n");
		System.out.println("\n Number of Correct Answers : " + correct);
		System.out.println("\n Number of Incorrect Answers :" + incorrect);
		System.out.print("\n");
		System.out.print("\t End of Program");
		System.out.print("\n");
		System.exit(0);

	}

}
