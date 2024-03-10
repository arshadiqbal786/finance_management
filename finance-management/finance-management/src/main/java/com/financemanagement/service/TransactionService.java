package com.financemanagement.service;

import com.financemanagement.entity.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction addTransaction(Transaction transaction);
    List<Transaction> getAllTransactions();
    Transaction getTransactionById(Long id);
    Transaction updateTransaction(Long id, Transaction transactionDetails);
    void deleteTransaction(Long id);
}

