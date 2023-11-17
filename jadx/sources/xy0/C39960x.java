package xy0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.x */
public final class C39960x {

    /* renamed from: a */
    private final BigDecimal f94931a;

    /* renamed from: b */
    private final BigDecimal f94932b;

    /* renamed from: c */
    private final boolean f94933c;

    /* renamed from: d */
    private final String f94934d;

    /* renamed from: e */
    private final boolean f94935e;

    /* renamed from: f */
    private final BigDecimal f94936f;

    public C39960x(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str, boolean z2, BigDecimal bigDecimal3) {
        this.f94931a = bigDecimal;
        this.f94932b = bigDecimal2;
        this.f94933c = z;
        this.f94934d = str;
        this.f94935e = z2;
        this.f94936f = bigDecimal3;
    }

    /* renamed from: a */
    public final BigDecimal mo93788a() {
        return this.f94931a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39960x)) {
            return false;
        }
        C39960x xVar = (C39960x) obj;
        return C41536l.m120484d(this.f94931a, xVar.f94931a) && C41536l.m120484d(this.f94932b, xVar.f94932b) && this.f94933c == xVar.f94933c && C41536l.m120484d(this.f94934d, xVar.f94934d) && this.f94935e == xVar.f94935e && C41536l.m120484d(this.f94936f, xVar.f94936f);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f94931a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f94932b;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        boolean z = this.f94933c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str = this.f94934d;
        int hashCode3 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.f94935e;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode3 + (z2 ? 1 : 0)) * 31;
        BigDecimal bigDecimal3 = this.f94936f;
        if (bigDecimal3 != null) {
            i = bigDecimal3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f94931a;
        BigDecimal bigDecimal2 = this.f94932b;
        boolean z = this.f94933c;
        String str = this.f94934d;
        boolean z2 = this.f94935e;
        BigDecimal bigDecimal3 = this.f94936f;
        return "PensionAmount(totalSaving=" + bigDecimal + ", contribution=" + bigDecimal2 + ", isMember=" + z + ", customerId=" + str + ", validationStatus=" + z2 + ", profit=" + bigDecimal3 + ")";
    }
}
