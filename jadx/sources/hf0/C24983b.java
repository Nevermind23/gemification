package hf0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction;

/* renamed from: hf0.b */
public abstract class C24983b {

    /* renamed from: a */
    private final GTTransaction f64308a;

    /* renamed from: hf0.b$a */
    public static final class C24984a extends C24983b {

        /* renamed from: b */
        private final GTTransaction f64309b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24984a(GTTransaction gTTransaction) {
            super(gTTransaction, (DefaultConstructorMarker) null);
            C41536l.m120489i(gTTransaction, "transaction");
            this.f64309b = gTTransaction;
        }

        /* renamed from: a */
        public GTTransaction mo63392a() {
            return this.f64309b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24984a) && C41536l.m120484d(this.f64309b, ((C24984a) obj).f64309b);
        }

        public int hashCode() {
            return this.f64309b.hashCode();
        }

        public String toString() {
            GTTransaction gTTransaction = this.f64309b;
            return "TransactionCancelled(transaction=" + gTTransaction + ")";
        }
    }

    public /* synthetic */ C24983b(GTTransaction gTTransaction, DefaultConstructorMarker defaultConstructorMarker) {
        this(gTTransaction);
    }

    private C24983b(GTTransaction gTTransaction) {
        this.f64308a = gTTransaction;
    }
}
