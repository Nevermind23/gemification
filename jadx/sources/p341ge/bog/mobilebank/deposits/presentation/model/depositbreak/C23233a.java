package p341ge.bog.mobilebank.deposits.presentation.model.depositbreak;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem;

/* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.a */
public final class C23233a {

    /* renamed from: a */
    private final List f60820a;

    /* renamed from: b */
    private final List f60821b;

    /* renamed from: c */
    private final Amount f60822c;

    /* renamed from: d */
    private final DepositBreakDetailItem.DepositAmountItem f60823d;

    public C23233a(List list, List list2, Amount amount, DepositBreakDetailItem.DepositAmountItem depositAmountItem) {
        C41536l.m120489i(list, "breakDetailsLossDetails");
        C41536l.m120489i(list2, "depositBreakDetails");
        C41536l.m120489i(amount, "breakAmount");
        C41536l.m120489i(depositAmountItem, "amount");
        this.f60820a = list;
        this.f60821b = list2;
        this.f60822c = amount;
        this.f60823d = depositAmountItem;
    }

    /* renamed from: a */
    public final DepositBreakDetailItem.DepositAmountItem mo58109a() {
        return this.f60823d;
    }

    /* renamed from: b */
    public final Amount mo58110b() {
        return this.f60822c;
    }

    /* renamed from: c */
    public final List mo58111c() {
        return this.f60820a;
    }

    /* renamed from: d */
    public final List mo58112d() {
        return this.f60821b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23233a)) {
            return false;
        }
        C23233a aVar = (C23233a) obj;
        return C41536l.m120484d(this.f60820a, aVar.f60820a) && C41536l.m120484d(this.f60821b, aVar.f60821b) && C41536l.m120484d(this.f60822c, aVar.f60822c) && C41536l.m120484d(this.f60823d, aVar.f60823d);
    }

    public int hashCode() {
        return (((((this.f60820a.hashCode() * 31) + this.f60821b.hashCode()) * 31) + this.f60822c.hashCode()) * 31) + this.f60823d.hashCode();
    }

    public String toString() {
        List list = this.f60820a;
        List list2 = this.f60821b;
        Amount amount = this.f60822c;
        DepositBreakDetailItem.DepositAmountItem depositAmountItem = this.f60823d;
        return "DepositBreakDetailsUiModel(breakDetailsLossDetails=" + list + ", depositBreakDetails=" + list2 + ", breakAmount=" + amount + ", amount=" + depositAmountItem + ")";
    }
}
