package lec14;

import java.util.*;

public class book_allocation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] pages = new int[n];
            int maxPage = 0;
            long totalSum = 0;

            for (int i = 0; i < n; i++) {
                pages[i] = scanner.nextInt();
                maxPage = Math.max(maxPage, pages[i]);
                totalSum += pages[i];
            }

            long left = maxPage;
            long right = totalSum;
            long result = 0;

            while (left <= right) {
                long mid = (left + right) / 2;
                if (isFeasible(pages, n, m, mid)) {
                    result = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(result);
        }
    }

    private static boolean isFeasible(int[] pages, int n, int m, long maxPages) {
        int students = 1;
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            if (currentSum + pages[i] > maxPages) {
                students++;
                currentSum = pages[i];
                if (students > m) {
                    return false;
                }
            } else {
                currentSum += pages[i];
            }
        }

        return true;
    }
}
