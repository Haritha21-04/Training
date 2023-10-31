package Spring.Assign;

import java.util.Scanner;

@SpringBootApplication
public class BankingApplication {
    private static final String SpringApplication = null;
	@Autowired
    private AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(BankingApplication.class, args);
    }

    @PostConstruct
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Banking Application Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    depositFunds(scanner);
                    break;
                case 3:
                    withdrawFunds(scanner);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void createAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account owner: ");
        String owner = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Account account = new Account();
        account.setAccountNumber(accountNumber);
        account.setOwner(owner);
        account.setBalance(balance);

        accountRepository.save(account);
        System.out.println("Account created successfully.");
    }

    private void depositFunds(Scanner scanner) {
        System.out.print("Enter account ID: ");
        Long accountId = scanner.nextLong();

        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();

        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new EntityNotFoundException("Account not found"));

        account.setBalance(account.getBalance() + amount);
        accountRepository.save(account);
        System.out.println("Funds deposited successfully.");
    }

    private void withdrawFunds(Scanner scanner) {
        System.out.print("Enter account ID: ");
        Long accountId = scanner.nextLong();

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new EntityNotFoundException("Account not found"));

        if (account.getBalance() < amount) {
            System.out.println("Insufficient funds.");
        } else {
            account.setBalance(account.getBalance() - amount);
            accountRepository.save(account);
            System.out.println("Funds withdrawn successfully.");
        }
    }
}
