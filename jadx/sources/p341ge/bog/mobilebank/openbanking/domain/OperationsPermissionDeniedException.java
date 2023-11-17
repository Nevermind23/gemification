package p341ge.bog.mobilebank.openbanking.domain;

/* renamed from: ge.bog.mobilebank.openbanking.domain.OperationsPermissionDeniedException */
public final class OperationsPermissionDeniedException extends RuntimeException {
    public OperationsPermissionDeniedException() {
        super("You don't have a permission to load operations");
    }
}
