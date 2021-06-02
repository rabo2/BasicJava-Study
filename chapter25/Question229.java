package chapter25;

import java.util.Random;
import java.util.jar.Attributes.Name;

public class Question229 {
	public static void main(String[] args) {
		String[] names = { "김xx", "이xx", "박xx", "손xx", "최xx", "홍xx" };
		String[] subject = { "국어", "영어", "수학", "사회", "과학", "Java", "Oracle" };
		int[][] score = new int[names.length][subject.length];

		Random random = new Random();
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = random.nextInt(101);
			}
		}

		int[] nameSum = new int[names.length];
		for (int i = 0; i < nameSum.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];
			}
		}

		float[] nameAvg = new float[names.length];
		for (int i = 0; i < nameAvg.length; i++) {
			nameAvg[i] = (int) (nameSum[i] / (float) subject.length * 100 + 0.5f) / 100f;
		}

		int[] subSum = new int[subject.length];
		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < names.length; j++) {
				subSum[i] = score[j][i];
			}
		}

		float[] subAvg = new float[subject.length];
		for (int i = 0; i < subAvg.length; i++) {
			subAvg[i] = (int) (subSum[i] / (float) names.length * 100 + 0.5f) / 100f;
		}

		int[] rank = new int[names.length];
		rank[0] = 1;
		for (int i = 0; i < names.length; i++) {
			for (int j = i; j < names.length; j++) {
				if (subSum[i] < subSum[j]) {
					rank[i]++;
				}
			}
		}

		
		
		System.out.println("\t국어\t영어\t수학\t사회\t과학\tJava\tOracle\t합계\t평균\t석차");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");

			for (int j = 0; j < subject.length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}

	}
}
