package androidx.core.p016os;

import androidx.core.util.C1002c;

/* renamed from: androidx.core.os.OperationCanceledException */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this((String) null);
    }

    public OperationCanceledException(String str) {
        super(C1002c.m3513e(str, "The operation has been canceled."));
    }
}
