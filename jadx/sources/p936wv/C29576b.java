package p936wv;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetUpdateEntity;

/* renamed from: wv.b */
public final class C29576b {

    /* renamed from: a */
    private final Long f74709a;

    /* renamed from: b */
    private final long f74710b;

    /* renamed from: c */
    private final float f74711c;

    /* renamed from: d */
    private final String f74712d;

    public C29576b(Long l, long j, float f, String str) {
        this.f74709a = l;
        this.f74710b = j;
        this.f74711c = f;
        this.f74712d = str;
    }

    /* renamed from: a */
    public final long mo69433a() {
        return this.f74710b;
    }

    /* renamed from: b */
    public final String mo69434b() {
        return this.f74712d;
    }

    /* renamed from: c */
    public final Long mo69435c() {
        return this.f74709a;
    }

    /* renamed from: d */
    public final float mo69436d() {
        return this.f74711c;
    }

    /* renamed from: e */
    public final BudgetUpdateEntity mo69437e() {
        return new BudgetUpdateEntity(this.f74709a, this.f74710b, this.f74711c, (String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29576b)) {
            return false;
        }
        C29576b bVar = (C29576b) obj;
        return C41536l.m120484d(this.f74709a, bVar.f74709a) && this.f74710b == bVar.f74710b && Float.compare(this.f74711c, bVar.f74711c) == 0 && C41536l.m120484d(this.f74712d, bVar.f74712d);
    }

    public int hashCode() {
        Long l = this.f74709a;
        int i = 0;
        int hashCode = (((((l == null ? 0 : l.hashCode()) * 31) + C7397t.m28148a(this.f74710b)) * 31) + Float.floatToIntBits(this.f74711c)) * 31;
        String str = this.f74712d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Long l = this.f74709a;
        long j = this.f74710b;
        float f = this.f74711c;
        String str = this.f74712d;
        return "BudgetUpdate(id=" + l + ", catId=" + j + ", value=" + f + ", errorDictionaryKey=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29576b(Long l, long j, float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, j, f, (i & 8) != 0 ? null : str);
    }
}
