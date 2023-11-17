package p926vw;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: vw.a */
public final class C29181a {

    /* renamed from: a */
    private final Long f74200a;

    /* renamed from: b */
    private final long f74201b;

    /* renamed from: c */
    private final int f74202c;

    /* renamed from: d */
    private final String f74203d;

    /* renamed from: e */
    private final String f74204e;

    public C29181a(Long l, long j, int i, String str, String str2) {
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(str2, "lookUpValue");
        this.f74200a = l;
        this.f74201b = j;
        this.f74202c = i;
        this.f74203d = str;
        this.f74204e = str2;
    }

    /* renamed from: a */
    public final String mo69019a() {
        return this.f74203d;
    }

    /* renamed from: b */
    public final String mo69020b() {
        return this.f74204e;
    }

    /* renamed from: c */
    public final long mo69021c() {
        return this.f74201b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29181a)) {
            return false;
        }
        C29181a aVar = (C29181a) obj;
        return C41536l.m120484d(this.f74200a, aVar.f74200a) && this.f74201b == aVar.f74201b && this.f74202c == aVar.f74202c && C41536l.m120484d(this.f74203d, aVar.f74203d) && C41536l.m120484d(this.f74204e, aVar.f74204e);
    }

    public int hashCode() {
        Long l = this.f74200a;
        return ((((((((l == null ? 0 : l.hashCode()) * 31) + C7397t.m28148a(this.f74201b)) * 31) + this.f74202c) * 31) + this.f74203d.hashCode()) * 31) + this.f74204e.hashCode();
    }

    public String toString() {
        Long l = this.f74200a;
        long j = this.f74201b;
        int i = this.f74202c;
        String str = this.f74203d;
        String str2 = this.f74204e;
        return "DepositPurpose(id=" + l + ", savingGoalId=" + j + ", orderNumber=" + i + ", dictionaryKey=" + str + ", lookUpValue=" + str2 + ")";
    }
}
