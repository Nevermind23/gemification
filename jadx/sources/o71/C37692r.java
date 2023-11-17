package o71;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;

/* renamed from: o71.r */
public final class C37692r {

    /* renamed from: a */
    private final CreditCardView.C13270b f90552a;

    /* renamed from: b */
    private final List f90553b;

    public C37692r(CreditCardView.C13270b bVar, List list) {
        C41536l.m120489i(bVar, "selectedCard");
        C41536l.m120489i(list, "passDevices");
        this.f90552a = bVar;
        this.f90553b = list;
    }

    /* renamed from: a */
    public final List mo90865a() {
        return this.f90553b;
    }

    /* renamed from: b */
    public final CreditCardView.C13270b mo90866b() {
        return this.f90552a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37692r)) {
            return false;
        }
        C37692r rVar = (C37692r) obj;
        return C41536l.m120484d(this.f90552a, rVar.f90552a) && C41536l.m120484d(this.f90553b, rVar.f90553b);
    }

    public int hashCode() {
        return (this.f90552a.hashCode() * 31) + this.f90553b.hashCode();
    }

    public String toString() {
        CreditCardView.C13270b bVar = this.f90552a;
        List list = this.f90553b;
        return "SubstitutePassesUiState(selectedCard=" + bVar + ", passDevices=" + list + ")";
    }
}
