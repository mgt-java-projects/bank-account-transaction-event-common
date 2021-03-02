package com.mgt.app.bank.account.transaction.event.common.exception;

/**
 * Exception thrown by account transaction client module when processing client request
 * 
 * @author stami
 *
 */
public class AccountTransactionDataAccessException extends RuntimeException {

	/**
	 * serialVersionUID as recommended.
	 */
	private static final long serialVersionUID = -8552861422905621801L;

	/**
	 * Constructor.
	 * 
	 * @param message
	 * @param exception
	 */
	public AccountTransactionDataAccessException(final String message, final Throwable exception) {
		super(message, exception);

	}
}
