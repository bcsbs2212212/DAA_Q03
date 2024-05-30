public class Main {
    public static void main(String[] args) {
        int amount = 1988;
        coinChange(amount);
    }

    public static void coinChange(int amount) {
        int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] result = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                result[i] = amount / denominations[i];
                amount %= denominations[i];
            }
        }

        System.out.println("Change for Rs. " + amount + ":");
        for (int i = 0; i < denominations.length; i++) {
            if (result[i] > 0) {
                System.out.println("Rs. " + denominations[i] + ": " + result[i]);
            }
        }
    }
}
