package com.dream.backend.domain.transaction;

import com.dream.backend.domain.account.Account;
import com.dream.backend.domain.bank.Bank;
import com.dream.backend.domain.bank_client.BankClient;
import com.dream.backend.domain.inout_type.InoutType;
import com.dream.backend.domain.transaction_category.TransactionCategory;
import jdk.jfr.Category;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transaction_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="account_number")
    private Account account;

    //account 테이블의 fk를 조인하고 싶을 때!

    @Column(name="bank_code")
    private String bank;

    @Column(name = "client_key")
    private Long client;

    @Column(name = "tran_date")
    private LocalDateTime tranDate;

    @OneToOne
    @JoinColumn(name = "category_key")
    private TransactionCategory tranType;

    @OneToOne
    @JoinColumn(name = "inout_key")
    private InoutType inoutType;

    @Column(name = "tran_desc", length = 50)
    private String tranDesc;

    @Column(name = "tran_amt")
    private int tranAmt;

    @Column(name = "after_balanced_amt")
    private int balance;

    @Builder
    public Transaction(long id, Account account, LocalDateTime tranDate, TransactionCategory tranType, InoutType inoutType, String tranDesc, int tranAmt, int balance) {
        this.id = id;
        this.account = account;
        this.bank = account.getBank().getBankCode();
        this.client = account.getClient().getClientCode();
        this.tranDate = tranDate;
        this.tranType = tranType;
        this.inoutType = inoutType;
        this.tranDesc = tranDesc;
        this.tranAmt = tranAmt;
        this.balance = balance;
    }

    public LocalDateTime getTranDate() {
        return tranDate;
    }

    // ----- 비지니스 로직 ------ //
}