package n80;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: n80.c */
public final class C26379c {

    /* renamed from: a */
    private final long f66837a;

    /* renamed from: b */
    private final long f66838b;

    /* renamed from: c */
    private final String f66839c;

    /* renamed from: d */
    private final long f66840d;

    /* renamed from: e */
    private final long f66841e;

    /* renamed from: f */
    private final String f66842f;

    public C26379c(long j, long j2, String str, long j3, long j4, String str2) {
        C41536l.m120489i(str, "status");
        C41536l.m120489i(str2, "attachmentType");
        this.f66837a = j;
        this.f66838b = j2;
        this.f66839c = str;
        this.f66840d = j3;
        this.f66841e = j4;
        this.f66842f = str2;
    }

    /* renamed from: a */
    public final long mo65595a() {
        return this.f66841e;
    }

    /* renamed from: b */
    public final long mo65596b() {
        return this.f66840d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26379c)) {
            return false;
        }
        C26379c cVar = (C26379c) obj;
        return this.f66837a == cVar.f66837a && this.f66838b == cVar.f66838b && C41536l.m120484d(this.f66839c, cVar.f66839c) && this.f66840d == cVar.f66840d && this.f66841e == cVar.f66841e && C41536l.m120484d(this.f66842f, cVar.f66842f);
    }

    public int hashCode() {
        return (((((((((C7397t.m28148a(this.f66837a) * 31) + C7397t.m28148a(this.f66838b)) * 31) + this.f66839c.hashCode()) * 31) + C7397t.m28148a(this.f66840d)) * 31) + C7397t.m28148a(this.f66841e)) * 31) + this.f66842f.hashCode();
    }

    public String toString() {
        long j = this.f66837a;
        long j2 = this.f66838b;
        String str = this.f66839c;
        long j3 = this.f66840d;
        long j4 = this.f66841e;
        String str2 = this.f66842f;
        return "AttachmentType(id=" + j + ", dictionaryKeyId=" + j2 + ", status=" + str + ", minSize=" + j3 + ", maxSize=" + j4 + ", attachmentType=" + str2 + ")";
    }
}
