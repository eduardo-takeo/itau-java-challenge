package com.itau.itau.service;

import com.itau.itau.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    private final List<Transaction> transactions = new ArrayList<>();

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Transaction> addTransaction(Transaction transaction) {
        try {
            transactions.add(transaction);
            return transactions;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Transaction> removeTransaction(Transaction transaction) {
        try {
            transactions.remove(transaction);
            return transactions;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String removeAllTransactions() {
        try {
            transactions.clear();
            return "All transactions removed successfully";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
