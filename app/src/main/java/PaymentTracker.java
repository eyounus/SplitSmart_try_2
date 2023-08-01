public class PaymentTracker {

        private double amount;
        private double balance;

        public PaymentTracker(double amount, double balance) {
            this.amount = amount;
            this.balance = balance;
        }
        public double getAmount() {
            return amount;
        }
        public double getBalance() {
            return balance;
        }
        public void recordPayment() {
            balance -= amount;
        }
        // Implementation to record the payment and update the balances



    }

