package n70;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n70.b */
public enum C26375b {
    AMOUNT_FOUND("text.krn.acct.close.Amount.Found", "text.account.cancellation.error.dialog.transfer.offer"),
    COMMISSION("text.krn.acct.close.Active.Commission.Found", "text.account.cancellation.error.dialog.fee"),
    GEN_COMMISSION("text.krn.acct.close.Active.Gen.Commission.Found", "text.account.cancellation.error.dialog.gen.fee"),
    AGREEMENT_CLOSE("text.krn.acct.close.Active.Agreement.Close.Found", "text.account.cancellation.error.dialog.active.agreement"),
    AGREEMENT_ACTIVE("text.krn.acct.close.Active.Agreement.Found", "text.account.cancellation.error.dialog.overdraft.deposit"),
    BLOOMBERG("text.krn.acct.close.Active.Bloomberg.Found", "text.account.cancellation.error.dialog.bloomberg"),
    CARD("text.krn.acct.close.Active.Card.Found", "text.account.cancellation.error.dialog.linked.card"),
    COLLECTION("text.krn.acct.close.Active.Collection.Found", "text.account.cancellation.error.dialog.seizure"),
    EST("text.krn.acct.close.Active.Est.Found", "text.account.cancellation.error.dialog.statement.email"),
    FREEZING("text.krn.acct.close.Active.Freezing.Found", "text.account.cancellation.error.dialog.active.freezing"),
    GALTI("text.krn.acct.close.Active.Galti.Found", "text.account.cancellation.error.dialog.galt.and.taggart"),
    LFG("text.krn.acct.close.Active.Lfg.Found", "text.account.cancellation.error.dialog.warranty.service"),
    LOAN("text.krn.acct.close.Active.Loan.Found", "text.account.cancellation.error.dialog.active.loan"),
    PACKAGE("text.krn.acct.close.Active.Package.Found", "text.account.cancellation.error.dialog.account.package"),
    PLN("text.krn.acct.close.Active.Pln.Found", "text.account.cancellation.error.dialog.active.pawn.loan"),
    SAFEBOX("text.krn.acct.close.Active.Safebox.Found", "text.account.cancellation.error.dialog.safebox"),
    LAST_ACCT("text.krn.acct.close.Last.Acct.Gel", "text.account.cancellation.error.dialog.last.gel"),
    TRANSACTION_FOUND("text.krn.acct.close.Transaction.found", "text.account.cancellation.error.dialog.active.transaction"),
    CLOSE_FOUND("text.krn.acct.close.ActiveCard.Close.Found", "text.account.cancellation.error.dialog.linked.cancelled.card");
    

    /* renamed from: f */
    public static final C26376a f66809f = null;

    /* renamed from: d */
    private final String f66830d;

    /* renamed from: e */
    private final String f66831e;

    /* renamed from: n70.b$a */
    public static final class C26376a {
        private C26376a() {
        }

        public /* synthetic */ C26376a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26375b mo65585a(String str) {
            C41536l.m120489i(str, "warningCode");
            for (C26375b bVar : C26375b.values()) {
                if (C41536l.m120484d(bVar.mo65584c(), str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f66809f = new C26376a((DefaultConstructorMarker) null);
    }

    private C26375b(String str, String str2) {
        this.f66830d = str;
        this.f66831e = str2;
    }

    /* renamed from: b */
    public final String mo65583b() {
        return this.f66831e;
    }

    /* renamed from: c */
    public final String mo65584c() {
        return this.f66830d;
    }
}
