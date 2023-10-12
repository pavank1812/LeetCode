class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        k--;
        for (int i = n - 1; i >= 0; i--) {
            int index = k / factorial[i];
            sb.append(numbers.get(index));
            numbers.remove(index);
            k %= factorial[i];
        }

        return sb.toString();
    }
}
