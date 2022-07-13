package AssignmentGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GameClass {

	public void movieInput() throws Exception {

		String[] movies = new String[25];

		int i = 0;

		File file = new File("C:\\Users\\venit\\OneDrive\\Desktop\\Class Works\\GameAssignment\\movies.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;

		while ((st = br.readLine()) != null) {

			movies[i] = st;

			i++;
		}

		Random movieNames = new Random();

		int indexNumber = movieNames.nextInt(movies.length);

		System.out.println(movies[indexNumber]);

		String guessMovie = movies[indexNumber]; // convert the movie name

		String underScoreName = guessMovie.replaceAll("[a-z ]", "_");

		System.out.println("You are guessing: " + underScoreName);

		char[] movie = guessMovie.toCharArray();

		char[] underscore = underScoreName.toCharArray();

		inputCheck(underscore, movie, guessMovie);

	}

	public void inputCheck(char underScore[], char movie[], String guessMovie) {

		Scanner sc = new Scanner(System.in);

		int m = 0;

		int k = 0;

		boolean isEqual = false;

		for (int j = 0; j < 100; j++) {

			System.out.println(underScore);
						
			if(underScore[j]!='_') {
				
				System.out.println("You Won");
				
				break;
			}
			else {

			System.out.println("You have guessed " + k + " wrong letters");

			System.out.println("Guess a letter: ");

			char guessedLetter = sc.next().charAt(0);

			for (int i = 0; i < movie.length; i++) {

				if (guessedLetter == movie[i]) {
					

					isEqual = true;

					char value = movie[i];

					underScore[i] = value;

				}

				if (!isEqual) {

					
					}

				}

			}

		}

	}
}
