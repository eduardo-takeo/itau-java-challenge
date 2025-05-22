package com.itau.itau.service;

import com.itau.itau.model.Statistic;
import com.itau.itau.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
public class StatisticService {
    private final TransactionService transactionService;

    public StatisticService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public Statistic getStatistics() {
        return calculateStatistics(transactionService.getTransactions());
    }


    private Statistic calculateStatistics(List<Transaction> transactions) {
        DoubleSummaryStatistics stats = transactions.stream()
                .mapToDouble(t -> t.getValue() != null ? t.getValue() : 0.0f)
                .summaryStatistics();

        double min = stats.getCount() == 0 ? 0.0 : stats.getMin();
        double max = stats.getCount() == 0 ? 0.0 : stats.getMax();

        return new Statistic(
                stats.getCount(),
                stats.getSum(),
                stats.getAverage(),
                min,
                max
        );
    }
}
