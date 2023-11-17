package p341ge.bog.mobilebank.openbanking.domain;

/* renamed from: ge.bog.mobilebank.openbanking.domain.AccountsLoadingInProgressException */
public final class AccountsLoadingInProgressException extends RuntimeException {
    public AccountsLoadingInProgressException() {
        super("Accounts will be added soon, refresh the page in a few seconds");
    }
}
