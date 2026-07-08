// Last updated: 08/07/2026, 15:36:53
import java.util.*;

class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int ans = Integer.MIN_VALUE;

        // The only possible endpoints are [n - k, n)
        for (int end = n - k; end < n; end++) {
            int sum = 0;
            int j = end;

            // Move backwards in steps of k
            while (j >= 0) {
                sum += energy[j];
                ans = Math.max(ans, sum);
                j -= k;
            }
        }

        return ans;
    }

    // ✅ Optional: for runtime input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] energy = new int[n];

        System.out.println("Enter the energy values:");
        for (int i = 0; i < n; i++) {
            energy[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.maximumEnergy(energy, k);
        System.out.println("Maximum Energy: " + result);

        sc.close();
    }
}
