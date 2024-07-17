package realworld;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionDataProcessor
{
   static class Transaction {
        String type;
        double amount;

       public String getType() {
           return type;
       }

       public void setType(String type) {
           this.type = type;
       }

       public double getAmount() {
           return amount;
       }

       public void setAmount(double amount) {
           this.amount = amount;
       }

       public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }
    }

   static List<Transaction> transactions = Arrays.asList(
            new Transaction("credit", 100.0),
            new Transaction("debit", 50.0),
            new Transaction("credit", 200.0),
            new Transaction("debit", 75.0)
    );

//    Given a list of transactions, group the transactions by type (e.g., "credit" and "debit")
//    and calculate the total amount for each type.
//    java

    public static void main(String[] args) {
        Map<String, Double> map = transactions.stream().collect(Collectors.groupingBy(Transaction::getType,Collectors.summingDouble(Transaction::getAmount)));
        for (String key : map.keySet()){
            System.out.println(key +"  "+ map.get(key));
        }
    }
}
