package n80;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: n80.a */
public final class C26377a {

    /* renamed from: a */
    private final long f66832a;

    /* renamed from: b */
    private final long f66833b;

    /* renamed from: c */
    private final String f66834c;

    public C26377a(long j, long j2, String str) {
        this.f66832a = j;
        this.f66833b = j2;
        this.f66834c = str;
    }

    /* renamed from: a */
    public final String mo65586a() {
        return this.f66834c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26377a)) {
            return false;
        }
        C26377a aVar = (C26377a) obj;
        return this.f66832a == aVar.f66832a && this.f66833b == aVar.f66833b && C41536l.m120484d(this.f66834c, aVar.f66834c);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f66832a) * 31) + C7397t.m28148a(this.f66833b)) * 31;
        String str = this.f66834c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f66832a;
        long j2 = this.f66833b;
        String str = this.f66834c;
        return "AttachmentExtension(id=" + j + ", fileAttachmentTypeId=" + j2 + ", fileExtension=" + str + ")";
    }
}
