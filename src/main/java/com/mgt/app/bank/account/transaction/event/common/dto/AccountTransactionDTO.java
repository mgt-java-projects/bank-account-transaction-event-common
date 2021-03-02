package com.mgt.app.bank.account.transaction.event.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mgt.app.bank.account.transaction.event.common.enums.TransactionType;

import lombok.Data;

/**
 * Data Transfer Object for account transaction.
 * 
 * @author stami
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountTransactionDTO {

	/**
	 * Customer account number.
	 */
	private String accountNumber;

	/**
	 * Money transaction time stamp in ISO.
	 */
	private Date transactionTs;

	/**
	 * Transaction type 'DEPOSIT/WITHDRAW'.
	 */
	private TransactionType type;

	/**
	 * Amount involved on this particular transaction.
	 */
	private BigDecimal amount;

	/**
	 * No-arg constructor.
	 */
	public AccountTransactionDTO() {
	}

	/**
	 * Constructor with all params.
	 * 
	 * @param accountNumber
	 * @param transactionTs
	 * @param type
	 * @param amount
	 */
	public AccountTransactionDTO(String accountNumber, Date transactionTs, TransactionType type, BigDecimal amount) {
		this.accountNumber = accountNumber;
		this.transactionTs = transactionTs;
		this.type = type;
		this.amount = amount;
	}

}
