package p537nm;

import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p551om.C17267c;

/* renamed from: nm.s */
public final class C17102s {

    /* renamed from: a */
    private final boolean f47884a;

    /* renamed from: b */
    private final List f47885b;

    /* renamed from: c */
    private final double f47886c;

    /* renamed from: d */
    private final String f47887d;

    /* renamed from: e */
    private final boolean f47888e;

    /* renamed from: f */
    private final double f47889f;

    /* renamed from: g */
    private final String f47890g;

    /* renamed from: h */
    private C17267c f47891h;

    /* renamed from: i */
    private final Long f47892i;

    public C17102s(boolean z, List list, double d, String str, boolean z2, double d2, String str2, C17267c cVar, Long l) {
        C41536l.m120489i(list, "cards");
        C41536l.m120489i(str, "comCcy");
        C41536l.m120489i(str2, "packFeeCcy");
        this.f47884a = z;
        this.f47885b = list;
        this.f47886c = d;
        this.f47887d = str;
        this.f47888e = z2;
        this.f47889f = d2;
        this.f47890g = str2;
        this.f47891h = cVar;
        this.f47892i = l;
    }

    /* renamed from: a */
    public final double mo44479a() {
        return this.f47886c;
    }

    /* renamed from: b */
    public final String mo44480b() {
        return this.f47887d;
    }

    /* renamed from: c */
    public final double mo44481c() {
        return this.f47889f;
    }

    /* renamed from: d */
    public final String mo44482d() {
        return this.f47890g;
    }

    /* renamed from: e */
    public final boolean mo44483e() {
        return this.f47888e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17102s)) {
            return false;
        }
        C17102s sVar = (C17102s) obj;
        return this.f47884a == sVar.f47884a && C41536l.m120484d(this.f47885b, sVar.f47885b) && Double.compare(this.f47886c, sVar.f47886c) == 0 && C41536l.m120484d(this.f47887d, sVar.f47887d) && this.f47888e == sVar.f47888e && Double.compare(this.f47889f, sVar.f47889f) == 0 && C41536l.m120484d(this.f47890g, sVar.f47890g) && C41536l.m120484d(this.f47891h, sVar.f47891h) && C41536l.m120484d(this.f47892i, sVar.f47892i);
    }

    public int hashCode() {
        boolean z = this.f47884a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((((z ? 1 : 0) * true) + this.f47885b.hashCode()) * 31) + Double.doubleToLongBits(this.f47886c)) * 31) + this.f47887d.hashCode()) * 31;
        boolean z3 = this.f47888e;
        if (!z3) {
            z2 = z3;
        }
        int a = (((((hashCode + (z2 ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f47889f)) * 31) + this.f47890g.hashCode()) * 31;
        C17267c cVar = this.f47891h;
        int i = 0;
        int hashCode2 = (a + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Long l = this.f47892i;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        boolean z = this.f47884a;
        List list = this.f47885b;
        double d = this.f47886c;
        String str = this.f47887d;
        boolean z2 = this.f47888e;
        double d2 = this.f47889f;
        String str2 = this.f47890g;
        C17267c cVar = this.f47891h;
        Long l = this.f47892i;
        return "DebitCardFee(cardRecoveryFlag=" + z + ", cards=" + list + ", comAmount=" + d + ", comCcy=" + str + ", packageRegFlag=" + z2 + ", packFeeAmount=" + d2 + ", packFeeCcy=" + str2 + ", deliveryFee=" + cVar + ", orgId=" + l + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17102s(boolean z, List list, double d, String str, boolean z2, double d2, String str2, C17267c cVar, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, list, d, str, z2, d2, str2, cVar, (i & C11398b.f33139r) != 0 ? null : l);
    }
}
