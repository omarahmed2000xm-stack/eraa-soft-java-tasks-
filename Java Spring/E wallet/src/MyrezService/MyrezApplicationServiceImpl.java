package MyrezService;

import MyrezEWalletSystem.Validation.*;
import MyrezEWalletSystem.exception.*;
import MyrezEWalletSystem.model.Account;
import MyrezEWalletSystem.model.EWallet;

import javax.naming.Name;
import java.util.Scanner;
import java.util.concurrent.Executors;

public class MyrezApplicationServiceImpl implements MyrezApplicationService {
    private EWallet eWallet = new EWallet();
    private ServiceAccount accountService = new ServiceAccountImpl();

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO MYREZ FOR F & B SOLUTIONS  E WALLET");
        boolean exit = false;
        int counter = 0;

        while (true) {
            System.out.println("1-LOGIN   2-SIGN UP    3- EXIT");

            System.out.println(" pls enter your choice : ? ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" 1- WELCOME TO LOG IN ");
                    try {
                        logIn();
                    } catch (InvalidEmailException e) {
                        System.out.println(e.getMessage());
                    } catch (InvalidPasswordException e) {
                        System.out.println(e.getMessage());
                    }


                    break;

                case 2:
                    System.out.println("2- WELCOME TO SIGN UP ");
                    try {
                        signUp();
                    } catch (InvalidPhoneNumberException e) {
                        System.out.println(e.getMessage());
                    } catch (InvalidPasswordException e) {
                        System.out.println(e.getMessage());
                    } catch (InvalidEmailException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println("3- Bye  ");
                    exit = true;

                    break;
                default:
                    System.out.println("you have entered invalid choice pls Try again : ) ");
                    counter++;


            }
            if (exit == true) {
                System.out.println(" you have exit successfuly : ) ");
                break;
            }
            if (counter == 4) {
                System.out.println(" You have reached the maximum number of attempts.");
                break;
            }
        }


    }

    private void signUp() throws InvalidEmailException, InvalidPasswordException, InvalidPhoneNumberException {
        Scanner scanner = new Scanner(System.in);

        // ============ Step 1: Name ============
        String email;
        EmailValidation emailValidation= new EmailValidation();
        while (true) {
            System.out.println("PLS ENTER YOUR Email : ");
             email = scanner.next();
            try {
                emailValidation.checkEmail(email);
                break;
            } catch (InvalidEmailException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }

        // ============ Step 2: Password ============
        String password;
        PasswordValidation passwordValidation = new PasswordValidation();
        while (true) {
            System.out.println("PLS ENTER YOUR PASSWORD : ");
            password = scanner.next();
            try {
                passwordValidation.checkPassword(password);
                break;
            } catch (InvalidPasswordException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }

        // ============ Step 3: Phone Number ============
        String phonenumber;
        PhoneNumberValidation phoneNumberValidation = new PhoneNumberValidation();
        while (true) {
            System.out.println("PLS ENTER YOUR PHONE NUMBER : ");
            phonenumber = scanner.next();
            try {
                phoneNumberValidation.checkPhoneNumber(phonenumber);
                break;
            } catch (InvalidPhoneNumberException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }

        // ============ Step 4: Create Account ============
        Account account = new Account(email, password, phonenumber);
        boolean accountCreated = accountService.createAccount(account);
        if (accountCreated) {
            System.out.println("the account is created successfully ))");
        } else {
            System.out.println("❌ Username already exists, please choose another");
        }
    }

    private void logIn() throws InvalidEmailException, InvalidPasswordException {
        int attempts = 0;

        while (attempts < 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" pls enter your Email : ");
            String email = scanner.next();
EmailValidation emailValidation=new EmailValidation();
emailValidation.checkEmail(email);
            System.out.println(" pls enter your password : ");

            String password = scanner.next();
            PasswordValidation passwordValidation = new PasswordValidation();
            passwordValidation.checkPassword(password);

            Account loggedInUser = accountService.signIn(email, password);

            if (loggedInUser != null) {
                System.out.println("Welcome " + loggedInUser.getEmail() + " 🎉");
                mainProfile(loggedInUser);
                return;   // اخرج من logIn بعد ما المستخدم يخلص
            } else {
                attempts++;
                System.out.println("Wrong username or password (" + attempts + "/4)");
            }
        }

        System.out.println("Too many attempts, try later 🚫");
    }

    private void mainProfile(Account currentUser) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- PROFILE MENU ---");
            System.out.println("1- Show Profile");
            System.out.println("2- Deposit");
            System.out.println("3- Withdraw");
            System.out.println("4- Logout");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(accountService.showProfile(currentUser.getEmail()));
                    break;
                case 2:
                    System.out.println("Deposit");
                    try {
                        deposit(currentUser);
                    } catch (InvalidDepositException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println("Withdraw ");
                    try {
                        withdraw(currentUser);
                    }
                    catch (InvalidWithdrawException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println("Transfer money : ");
                    try {
                        transfer(currentUser);
                    }
                    catch (InvalidEmailException e){
                        System.out.println(e.getMessage());
                    }
                    catch (InvalidWithdrawException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                case 5:
                    System.out.println("Logged out 👋");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }

    private void deposit(Account currentUser) throws InvalidDepositException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the amount that you wanna to deposit it : ");
        double amount = scanner.nextDouble();
        DepositValidation depositValidation = new DepositValidation();
        depositValidation.checkDeposit(amount);

        boolean result = accountService.deposit(currentUser, amount);

        if (result) {
            System.out.println("the deposit done successfully : ");
            System.out.println(" the new balance : " + currentUser.getBalance());
        } else {
            System.out.println("the deposit failed !!!");
        }


    }
    private void withdraw(Account currentUser) throws  InvalidWithdrawException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your amount that you wanna to withdraw it : ");
        double amount = scanner.nextDouble();
        WithDrawValidation withDrawValidation = new WithDrawValidation();
        withDrawValidation.checkWithDraw(amount, currentUser);
        boolean result = accountService.withDraw(currentUser, amount);

        if (result) {
            System.out.println("the withdraw done successfully : ");
            System.out.println(" the new balance : " + currentUser.getBalance());
        } else {
            System.out.println("the withdraw  failed !!!");
        }
    }
        private void transfer(Account currentUser)throws InvalidEmailException,InvalidWithdrawException {

            while (true) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("enter reciever email : ");
                String email = scanner.nextLine();
                Account receiver = eWallet.getAccounts().stream().filter(acc -> acc.getEmail().equals(email)).findFirst().orElse(null);
                new EmailValidation().checkEmail(email);
                if(receiver == null){
                    System.out.println("❌ Account not found!");
                    continue;}

                    System.out.println("pls enter the amount you wanna to recieve it  : ");
                    double amount = scanner.nextDouble();
                    new WithDrawValidation().checkWithDraw(amount, currentUser);

                    boolean result = accountService.transfer(currentUser, receiver, amount);
                    if (result) {
                        System.out.println("the transfer is done ))");
                        System.out.println("your balance is : " + currentUser.getBalance());
                        break;
                    } else {
                        System.out.println("the transfer is failed ");

                    }

                }


            }
        }








