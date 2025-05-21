package com.itau.itau.controller;

import com.itau.itau.model.Transaction;
import com.itau.itau.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> getAll() {
        return transactionService.getTransactions();
    }

    @PostMapping
    public List<Transaction> create(@RequestBody @Valid Transaction transaction) {
        return transactionService.addTransaction(transaction);
    }

    @DeleteMapping
    public String deleteAll() {
        return transactionService.removeAllTransactions();
    }
}
