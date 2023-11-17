package mt0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;

/* renamed from: mt0.f */
public final class C37262f {

    /* renamed from: a */
    private final MoneyBoxTariffUiModel f89706a;

    /* renamed from: b */
    private final int f89707b;

    /* renamed from: c */
    private final List f89708c;

    public C37262f(MoneyBoxTariffUiModel moneyBoxTariffUiModel, int i, List list) {
        C41536l.m120489i(list, "accounts");
        this.f89706a = moneyBoxTariffUiModel;
        this.f89707b = i;
        this.f89708c = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C37262f m110020b(C37262f fVar, MoneyBoxTariffUiModel moneyBoxTariffUiModel, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            moneyBoxTariffUiModel = fVar.f89706a;
        }
        if ((i2 & 2) != 0) {
            i = fVar.f89707b;
        }
        if ((i2 & 4) != 0) {
            list = fVar.f89708c;
        }
        return fVar.mo90366a(moneyBoxTariffUiModel, i, list);
    }

    /* renamed from: a */
    public final C37262f mo90366a(MoneyBoxTariffUiModel moneyBoxTariffUiModel, int i, List list) {
        C41536l.m120489i(list, "accounts");
        return new C37262f(moneyBoxTariffUiModel, i, list);
    }

    /* renamed from: c */
    public final List mo90367c() {
        return this.f89708c;
    }

    /* renamed from: d */
    public final MoneyBoxTariffUiModel mo90368d() {
        return this.f89706a;
    }

    /* renamed from: e */
    public final int mo90369e() {
        return this.f89707b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37262f)) {
            return false;
        }
        C37262f fVar = (C37262f) obj;
        return C41536l.m120484d(this.f89706a, fVar.f89706a) && this.f89707b == fVar.f89707b && C41536l.m120484d(this.f89708c, fVar.f89708c);
    }

    /* renamed from: f */
    public final boolean mo90371f() {
        return this.f89706a != null && (this.f89708c.isEmpty() ^ true);
    }

    public int hashCode() {
        MoneyBoxTariffUiModel moneyBoxTariffUiModel = this.f89706a;
        return ((((moneyBoxTariffUiModel == null ? 0 : moneyBoxTariffUiModel.hashCode()) * 31) + this.f89707b) * 31) + this.f89708c.hashCode();
    }

    public String toString() {
        MoneyBoxTariffUiModel moneyBoxTariffUiModel = this.f89706a;
        int i = this.f89707b;
        List list = this.f89708c;
        return "PiggyBankInput(amount=" + moneyBoxTariffUiModel + ", amountIndex=" + i + ", accounts=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37262f(MoneyBoxTariffUiModel moneyBoxTariffUiModel, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : moneyBoxTariffUiModel, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? C41341q.m119907j() : list);
    }
}
