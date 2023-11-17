package lt0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel;

/* renamed from: lt0.b */
public final class C37153b {

    /* renamed from: a */
    private final BonusDepositAccountUiModel f89486a;

    /* renamed from: b */
    private final C37152a f89487b;

    /* renamed from: c */
    private final List f89488c;

    public C37153b(BonusDepositAccountUiModel bonusDepositAccountUiModel, C37152a aVar, List list) {
        C41536l.m120489i(list, "accounts");
        this.f89486a = bonusDepositAccountUiModel;
        this.f89487b = aVar;
        this.f89488c = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C37153b m109813b(C37153b bVar, BonusDepositAccountUiModel bonusDepositAccountUiModel, C37152a aVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bonusDepositAccountUiModel = bVar.f89486a;
        }
        if ((i & 2) != 0) {
            aVar = bVar.f89487b;
        }
        if ((i & 4) != 0) {
            list = bVar.f89488c;
        }
        return bVar.mo90134a(bonusDepositAccountUiModel, aVar, list);
    }

    /* renamed from: a */
    public final C37153b mo90134a(BonusDepositAccountUiModel bonusDepositAccountUiModel, C37152a aVar, List list) {
        C41536l.m120489i(list, "accounts");
        return new C37153b(bonusDepositAccountUiModel, aVar, list);
    }

    /* renamed from: c */
    public final List mo90135c() {
        return this.f89488c;
    }

    /* renamed from: d */
    public final C37152a mo90136d() {
        return this.f89487b;
    }

    /* renamed from: e */
    public final BonusDepositAccountUiModel mo90137e() {
        return this.f89486a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37153b)) {
            return false;
        }
        C37153b bVar = (C37153b) obj;
        return C41536l.m120484d(this.f89486a, bVar.f89486a) && C41536l.m120484d(this.f89487b, bVar.f89487b) && C41536l.m120484d(this.f89488c, bVar.f89488c);
    }

    /* renamed from: f */
    public final boolean mo90139f() {
        return (this.f89486a == null || this.f89487b == null || !(this.f89488c.isEmpty() ^ true)) ? false : true;
    }

    public int hashCode() {
        BonusDepositAccountUiModel bonusDepositAccountUiModel = this.f89486a;
        int i = 0;
        int hashCode = (bonusDepositAccountUiModel == null ? 0 : bonusDepositAccountUiModel.hashCode()) * 31;
        C37152a aVar = this.f89487b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((hashCode + i) * 31) + this.f89488c.hashCode();
    }

    public String toString() {
        BonusDepositAccountUiModel bonusDepositAccountUiModel = this.f89486a;
        C37152a aVar = this.f89487b;
        List list = this.f89488c;
        return "MoneyBoxInput(deposit=" + bonusDepositAccountUiModel + ", amount=" + aVar + ", accounts=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37153b(BonusDepositAccountUiModel bonusDepositAccountUiModel, C37152a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bonusDepositAccountUiModel, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? C41341q.m119907j() : list);
    }
}
