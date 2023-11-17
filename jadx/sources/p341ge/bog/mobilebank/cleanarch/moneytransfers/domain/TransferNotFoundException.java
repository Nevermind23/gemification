package p341ge.bog.mobilebank.cleanarch.moneytransfers.domain;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.domain.TransferNotFoundException */
public final class TransferNotFoundException extends RuntimeException {
    public TransferNotFoundException() {
        super("Transfer wasn't found");
    }
}
