package i20;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: i20.a */
public final class C25101a {

    /* renamed from: a */
    private final String f64452a;

    /* renamed from: b */
    private final BigDecimal f64453b;

    /* renamed from: c */
    private final String f64454c;

    /* renamed from: d */
    private final boolean f64455d;

    /* renamed from: e */
    private final boolean f64456e;

    public C25101a(String str, BigDecimal bigDecimal, String str2, boolean z, boolean z2) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(bigDecimal, "amountBase");
        C41536l.m120489i(str2, "dictionaryKey");
        this.f64452a = str;
        this.f64453b = bigDecimal;
        this.f64454c = str2;
        this.f64455d = z;
        this.f64456e = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C25101a m80064b(C25101a aVar, String str, BigDecimal bigDecimal, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f64452a;
        }
        if ((i & 2) != 0) {
            bigDecimal = aVar.f64453b;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i & 4) != 0) {
            str2 = aVar.f64454c;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = aVar.f64455d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = aVar.f64456e;
        }
        return aVar.mo63536a(str, bigDecimal2, str3, z3, z2);
    }

    /* renamed from: a */
    public final C25101a mo63536a(String str, BigDecimal bigDecimal, String str2, boolean z, boolean z2) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(bigDecimal, "amountBase");
        C41536l.m120489i(str2, "dictionaryKey");
        return new C25101a(str, bigDecimal, str2, z, z2);
    }

    /* renamed from: c */
    public final BigDecimal mo63537c() {
        return this.f64453b;
    }

    /* renamed from: d */
    public final boolean mo63538d() {
        return this.f64456e;
    }

    /* renamed from: e */
    public final boolean mo63539e() {
        return this.f64455d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25101a)) {
            return false;
        }
        C25101a aVar = (C25101a) obj;
        return C41536l.m120484d(this.f64452a, aVar.f64452a) && C41536l.m120484d(this.f64453b, aVar.f64453b) && C41536l.m120484d(this.f64454c, aVar.f64454c) && this.f64455d == aVar.f64455d && this.f64456e == aVar.f64456e;
    }

    /* renamed from: f */
    public final String mo63541f() {
        return this.f64452a;
    }

    public int hashCode() {
        int hashCode = ((((this.f64452a.hashCode() * 31) + this.f64453b.hashCode()) * 31) + this.f64454c.hashCode()) * 31;
        boolean z = this.f64455d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f64456e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f64452a;
        BigDecimal bigDecimal = this.f64453b;
        String str2 = this.f64454c;
        boolean z = this.f64455d;
        boolean z2 = this.f64456e;
        return "AssetLiabilityDetailUIModel(productType=" + str + ", amountBase=" + bigDecimal + ", dictionaryKey=" + str2 + ", extraFlag=" + z + ", expiresSoon=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25101a(String str, BigDecimal bigDecimal, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bigDecimal, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }
}
