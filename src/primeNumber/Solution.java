package primeNumber;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		long sum = getSumOfPrimeBelow(Integer.parseInt(args[0]));
		System.out.println(sum);
	}

	public static long getSumOfPrimeBelow(int n) {
		List<Long> result = new ArrayList<>();
		for(int i = 2 ;i <= n; i++) {
			if(isPrimeNumber(i)){
				result.add(Long.valueOf(i));
			}
		}
		long sum = 0;
		if(result.size() != 0) {
			for(long r : result) {
				sum += r;
			}
		}
		return sum;
	}

	public static boolean isPrimeNumber(int n) {
		if(n == 2) {
			return true;
		}
		if (n == 1 || n % 2 == 0) {
			return false;
		}
		long tmp = (long) Math.sqrt(n);
		if (tmp * tmp == n) {
			return false;
		}
		int i = 3;
		while (i <= tmp) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}

		return true;
	}

}
