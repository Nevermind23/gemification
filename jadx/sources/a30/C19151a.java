package a30;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: a30.a */
public final class C19151a {

    /* renamed from: a */
    private final long f53334a;

    /* renamed from: b */
    private final boolean f53335b;

    /* renamed from: c */
    private final String f53336c;

    /* renamed from: d */
    private final double f53337d;

    /* renamed from: e */
    private final String f53338e;

    /* renamed from: f */
    private final boolean f53339f;

    public C19151a(long j, boolean z, String str, double d, String str2, boolean z2) {
        this.f53334a = j;
        this.f53335b = z;
        this.f53336c = str;
        this.f53337d = d;
        this.f53338e = str2;
        this.f53339f = z2;
    }

    /* renamed from: a */
    public final double mo47355a() {
        return this.f53337d;
    }

    /* renamed from: b */
    public final boolean mo47356b() {
        return this.f53339f;
    }

    /* renamed from: c */
    public final String mo47357c() {
        return this.f53336c;
    }

    /* renamed from: d */
    public final String mo47358d() {
        return this.f53338e;
    }

    /* renamed from: e */
    public final long mo47359e() {
        return this.f53334a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19151a)) {
            return false;
        }
        C19151a aVar = (C19151a) obj;
        return this.f53334a == aVar.f53334a && this.f53335b == aVar.f53335b && C41536l.m120484d(this.f53336c, aVar.f53336c) && Double.compare(this.f53337d, aVar.f53337d) == 0 && C41536l.m120484d(this.f53338e, aVar.f53338e) && this.f53339f == aVar.f53339f;
    }

    /* renamed from: f */
    public final boolean mo47361f() {
        return this.f53335b;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f53334a) * 31;
        boolean z = this.f53335b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.f53336c;
        int i2 = 0;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.f53337d)) * 31;
        String str2 = this.f53338e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z3 = this.f53339f;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        long j = this.f53334a;
        boolean z = this.f53335b;
        String str = this.f53336c;
        double d = this.f53337d;
        String str2 = this.f53338e;
        boolean z2 = this.f53339f;
        return "BillSplitOperationItem(operationId=" + j + ", isCashOperation=" + z + ", operationDescription=" + str + ", amount=" + d + ", operationIconUrl=" + str2 + ", applyTintToOperationIcon=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19151a(long j, boolean z, String str, double d, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, str, d, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z2);
    }
}
