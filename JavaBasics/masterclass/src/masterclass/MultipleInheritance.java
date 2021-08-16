package masterclass;

import java.util.Arrays;
import java.util.Scanner;

interface HockeyTeam {
	public int calculateHockeyScore();

	public int findHighestGoalByIndividualInHockey();
}

interface FootballTeam {
	public int calculateFootballScore();

	public int findHighestGoalByIndividualInFootball();
}

class Sport implements HockeyTeam, FootballTeam {
	int[] hockeyPlayers;
	int[] footballPlayers;

	Sport(int[] paramHockeyPlayers, int[] paramFootballPlayers) {
		hockeyPlayers = paramHockeyPlayers;
		footballPlayers = paramFootballPlayers;
	}

	public int calculateHockeyScore() {
		int score = 0;
		for (int i = 0; i < 11; i++) {
			score += hockeyPlayers[i];
		}
		return score;
	}

	public int calculateFootballScore() {
		int score = 0;
		for (int i = 0; i < 11; i++) {
			score += footballPlayers[i];
		}
		return score;
	}

	public int findHighestGoalByIndividualInHockey() {
		int max = 0;
		for (int i = 0; i < 11; i++)
			if (hockeyPlayers[i] > max)
				max = hockeyPlayers[i];
		return max;
	}

	public int findHighestGoalByIndividualInFootball() {
		int max = 0;
		for (int i = 0; i < 11; i++)
			if (footballPlayers[i] > max)
				max = footballPlayers[i];
		return max;
	}
}

public class MultipleInheritance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] hockeyPlayers = new int[11];
		int[] footballPlayers = new int[11];

		for (int i = 0; i < 11; i++) {
			hockeyPlayers[i] = sc.nextInt();
		}

		for (int i = 0; i < 11; i++) {
			footballPlayers[i] = sc.nextInt();
		}

		Sport s = new Sport(hockeyPlayers, footballPlayers);
		try {
			HockeyTeam.class.getMethod("calculateHockeyScore");
			HockeyTeam.class.getMethod("findHighestGoalByIndividualInHockey");
			FootballTeam.class.getMethod("calculateFootballScore");
			FootballTeam.class.getMethod("findHighestGoalByIndividualInFootball");

			if (s instanceof HockeyTeam && s instanceof FootballTeam) {
				System.out.println(s.calculateHockeyScore());
				System.out.println(s.calculateFootballScore());
				System.out.println(s.findHighestGoalByIndividualInHockey());
				System.out.println(s.findHighestGoalByIndividualInFootball());
			}
		} catch (NoSuchMethodException ex) {
			System.out.println("No such function is exits");
		}
	}
}
