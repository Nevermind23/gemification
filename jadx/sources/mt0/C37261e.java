package mt0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel;

/* renamed from: mt0.e */
public final class C37261e {

    /* renamed from: a */
    private final PiggyBankResourcesUiModel f89703a;

    /* renamed from: b */
    private final List f89704b;

    /* renamed from: c */
    private final List f89705c;

    public C37261e(PiggyBankResourcesUiModel piggyBankResourcesUiModel, List list, List list2) {
        C41536l.m120489i(piggyBankResourcesUiModel, "piggyBankResources");
        C41536l.m120489i(list, "pausePeriods");
        C41536l.m120489i(list2, "casServices");
        this.f89703a = piggyBankResourcesUiModel;
        this.f89704b = list;
        this.f89705c = list2;
    }

    /* renamed from: a */
    public final List mo90360a() {
        return this.f89705c;
    }

    /* renamed from: b */
    public final List mo90361b() {
        return this.f89704b;
    }

    /* renamed from: c */
    public final PiggyBankResourcesUiModel mo90362c() {
        return this.f89703a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37261e)) {
            return false;
        }
        C37261e eVar = (C37261e) obj;
        return C41536l.m120484d(this.f89703a, eVar.f89703a) && C41536l.m120484d(this.f89704b, eVar.f89704b) && C41536l.m120484d(this.f89705c, eVar.f89705c);
    }

    public int hashCode() {
        return (((this.f89703a.hashCode() * 31) + this.f89704b.hashCode()) * 31) + this.f89705c.hashCode();
    }

    public String toString() {
        PiggyBankResourcesUiModel piggyBankResourcesUiModel = this.f89703a;
        List list = this.f89704b;
        List list2 = this.f89705c;
        return "PiggyBankDetailsResourcesUiModel(piggyBankResources=" + piggyBankResourcesUiModel + ", pausePeriods=" + list + ", casServices=" + list2 + ")";
    }
}
