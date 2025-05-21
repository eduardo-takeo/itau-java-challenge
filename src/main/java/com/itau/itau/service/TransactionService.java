package com.itau.itau.service;

import com.itau.itau.exception.BusinessException;
import com.itau.itau.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    private final List<Transaction> transactions = new ArrayList<>();

    private void validateRequestBody(Transaction transaction) {
        if (transaction.getDatetime().isAfter(OffsetDateTime.now())) {
            throw new BusinessException("Transaction date must be valid");
        }

        if (transaction.getValue() <= 0) {
            throw new BusinessException("Value must be valid");
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Transaction> addTransaction(Transaction transaction) {
        validateRequestBody(transaction);
        transactions.add(transaction);
        return transactions;
    }

    public String removeAllTransactions() {
       transactions.clear();
       return "All transactions removed successfully";
    }
}
