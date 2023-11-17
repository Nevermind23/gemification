package lt0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;

/* renamed from: lt0.a */
public final class C37152a {

    /* renamed from: a */
    private final MoneyBoxTariffUiModel f89484a;

    /* renamed from: b */
    private final int f89485b;

    public C37152a(MoneyBoxTariffUiModel moneyBoxTariffUiModel, int i) {
        C41536l.m120489i(moneyBoxTariffUiModel, "amount");
        this.f89484a = moneyBoxTariffUiModel;
        this.f89485b = i;
    }

    /* renamed from: a */
    public final MoneyBoxTariffUiModel mo90129a() {
        return this.f89484a;
    }

    /* renamed from: b */
    public final int mo90130b() {
        return this.f89485b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37152a)) {
            return false;
        }
        C37152a aVar = (C37152a) obj;
        return C41536l.m120484d(this.f89484a, aVar.f89484a) && this.f89485b == aVar.f89485b;
    }

    public int hashCode() {
        return (this.f89484a.hashCode() * 31) + this.f89485b;
    }

    public String toString() {
        MoneyBoxTariffUiModel moneyBoxTariffUiModel = this.f89484a;
        int i = this.f89485b;
        return "MoneyBoxAmountItem(amount=" + moneyBoxTariffUiModel + ", index=" + i + ")";
    }
}
