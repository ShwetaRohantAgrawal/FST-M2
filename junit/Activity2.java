package activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {
    @Test
    public void notEnoughFunds(){
        System.out.println("case1:");
        BankAccount acc = new BankAccount(9);

        assertThrows(NotEnoughFundsException.class, ()-> acc.withdraw(10),"balance low");
    }

    @Test
    public void enoughFunds(){
        System.out.println("case2:");
        BankAccount acc = new BankAccount(100);

        assertDoesNotThrow(  ()-> acc.withdraw(100));

    }
}
