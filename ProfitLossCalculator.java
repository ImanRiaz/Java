import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        double[] costPrice = new double[4];
        double[] sellingPrice = new double[4];
        double[] profitLoss = new double[4];

        double totalProfit = 0, totalLoss = 0;

        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Cost Price of item " + (i + 1) + ": ");
            costPrice[i] = scanner.nextDouble();
            System.out.print("Enter Selling Price of item " + (i + 1) + ": ");
            sellingPrice[i] = scanner.nextDouble();

            
            profitLoss[i] = sellingPrice[i] - costPrice[i];

            if (profitLoss[i] > 0) {
                System.out.println("Item " + (i + 1) + ": Profit of " + profitLoss[i]);
                totalProfit += profitLoss[i];  
            } else if (profitLoss[i] < 0) {
                System.out.println("Item " + (i + 1) + ": Loss of " + Math.abs(profitLoss[i]));
                totalLoss += Math.abs(profitLoss[i]);  
            } else {
                System.out.println("Item " + (i + 1) + ": No Profit, No Loss.");
            }
            System.out.println();
        }

        
        if (totalProfit > totalLoss) {
            System.out.println("Overall Profit: " + (totalProfit - totalLoss));
        } else if (totalLoss > totalProfit) {
            System.out.println("Overall Loss: " + (totalLoss - totalProfit));
        } else {
            System.out.println("Overall: No Profit, No Loss.");
        }

        
    }
}
