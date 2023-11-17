package he1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: he1.l */
public final class C41223l extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41223l(String str) {
        super(str);
        C41536l.m120489i(str, "message");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41223l(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
