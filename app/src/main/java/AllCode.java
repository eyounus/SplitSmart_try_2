/*import java.util.*;

class User {
    private final boolean allowEmailNotifications;
    private int userId;
    private String username;
    private String email;
    private String password;

    public User(int userId, String username, String email, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.allowEmailNotifications = true;
    }
    public boolean isAllowEmailNotifications() {
        return allowEmailNotifications;
    }

    public void setAllowEmailNotifications(boolean allowEmailNotifications) {
        this.allowEmailNotifications = allowEmailNotifications;
    }
}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}


class Group {
    private int groupId;
    private String groupName;
    private List<User> members;

    public Group(int groupId, String groupName, List<User> members) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.members = members;
    }
}

class Expense {
    private int expenseId;
    private String description;
    private double amount;
    private Date date;
    private String sharedManner;
    private List<User> involvedUsers;
    private String receiptImage;

    public Expense(int expenseId, String description, double amount, Date date, String sharedManner, List<User> involvedUsers, String receiptImage) {
        this.expenseId = expenseId;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.sharedManner = sharedManner;
        this.involvedUsers = involvedUsers;
        this.receiptImage = receiptImage;
    }
}

interface ExpenseApproval {
    void approveExpense(Expense expense);
    void rejectExpense(Expense expense);
}

class NotificationService {
    public void sendNotification(User user, String message) {
        if (user.isAllowEmailNotifications()) {
            System.out.println("Sending email notification to user: " + user.getUsername() + ", Message: " + message);
        } else {
            System.out.println("Sending notification to user: " + user.getUsername() + ", Message: " + message);
        }
    }
}

class BalanceTracker {
    private Map<User, Map<User, Double>> balances;
    private NotificationService notificationService;

    public BalanceTracker() {
        balances = new HashMap<>();
        notificationService = new NotificationService();
    }
    private void notifyBalanceUpdate(User payer, User payee, double amount) {
        String message = "Payment recorded: " + payer.getUsername() + " paid " + amount + " to " + payee.getUsername();
        notificationService.sendNotification(payer, message);
        notificationService.sendNotification(payee, message);
    }

    public void updateBalance(Expense expense) {
    }

    public double getBalance(User user1, User user2) {
        // Implementation to get the balance owed by user1 to user2
        return balances.getOrDefault(user1, new HashMap<>()).getOrDefault(user2, 0.0);
    }
}

class PaymentTracker {
    public void recordPayment(User payer, User payee, double amount) {
        // Implementation to record the payment and update the balances
        balanceTracker = new BalanceTracker;


    }
}

class ExpenseReport {
    public void generateExpenseReport(User user, Date startDate, Date endDate) {
        // Implementation to generate the expense report for the specified user and date range

    }
}

class SplitSmartApp implements ExpenseApproval {
    private List<User> users;
    private List<Group> groups;
    private List<Expense> expenses;
    private NotificationService notificationService;
    private BalanceTracker balanceTracker;
    private PaymentTracker paymentTracker;
    private ExpenseReport expenseReport;
    private User loggedInUser;

    public SplitSmartApp() {
        users = new ArrayList<>();
        groups = new ArrayList<>();
        expenses = new ArrayList<>();
        notificationService = new NotificationService();
        balanceTracker = new BalanceTracker();
        paymentTracker = new PaymentTracker();
        expenseReport = new ExpenseReport();
        nextUserId = 1;
    }
    public void signUp(String username, String email, String password) {
        // Perform validation and create a new user object
        User newUser = new User(nextUserId++, username, email, password);
        users.add(newUser);
        System.out.println("Sign-up successful for user: " + newUser.getUsername());
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedInUser = user;
                return true;
            }
        }
        return false;
    }

    // Method to handle group creation
    public void createGroup(String groupName, List<User> members) {
        Group newGroup = new Group(groupName, members);
        groups.add(newGroup);
    }

    // Method to handle expense creation
    public void createExpense(String description, double amount, Date date, String sharedManner, List<User> involvedUsers, String receiptImage)
    {
        Expense newExpense = new Expense(description, amount, date, sharedManner, involvedUsers, receiptImage);
        expenses.add(newExpense);
        balanceTracker.updateBalance(newExpense);
    }

    @Override
    public void approveExpense(Expense expense) {
        // Implementation to approve the expense
        System.out.print("Expense Approved!");
    }

    @Override
    public void rejectExpense(Expense expense) {
        // Implementation to reject the expense
        System.out.print("Expense rejected!");
    }
}
    private boolean isValidUsernameAndPassword(String username, String password) {
        return true;
    }
    private boolean isValidGroup(String groupName, List<User> members) {
        return true;
    }
    private boolean isValidExpense(String description, double amount, Date date, String sharedManner, List<User> involvedUsers, String receiptImage)
    {
        return true;
    }

    public static void main(String[] args) {
        SplitSmartApp splitSmartApp = new SplitSmartApp();
        Scanner scanner = new Scanner(System.in);

        // User sign-up
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        splitSmartApp.signUp(username, email, password);

        // User login
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        if (splitSmartApp.login(username, password)) {
            System.out.println("Login successful!");
            // Now the loggedInUser field will be set to the logged-in user.
            // You can perform other operations like group creation, expense creation, etc.
            System.out.print("Group name: ");
            String groupName = scanner.nextLine();
            System.out.print("Group members: ");
            // how will the user select group members to be added?

            Group newGroup = new Group();

            // End: New Group

            // New Expense

            System.out.print("Expense description: ");
            String expenseDesc = scanner.nextLine();

            System.out.print("Expense amount: ")
            double expenseAmount = scanner.nextLine();

            Date expenseDate = new Date();

            // only shared manner implemented is equal
            String expenseSharedManner = "equal";

            int numUsers = 0;
            System.out.print("Number of users: ");
            numUsers = Integer.parseInt(scanner.nextLine());
            // Figure out how to add the users to the list
            List<User> involvedUsers = new List<User>;
            for (int i = 0; i < numUsers; i++)
            {
                involvedUsers.add();
                System.out.print("Name of user " (i + 1));
                involvedUsers[i].username = scanner.nextLine();
            }

            String expenseReceiptImage = "";
            splitSmartApp.createExpense(expenseDesc, expenseAmount, expenseDate, expenseSharedManner, involvedUsers, expenseReceiptImage);

            // End: New Expense

        } else {
            System.out.println("Invalid username or password. Login failed.");
        }
    }
}

 */