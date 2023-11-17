package p917uy;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: uy.b */
public final class C28952b {

    /* renamed from: a */
    private final Long f73895a;

    /* renamed from: b */
    private final Long f73896b;

    /* renamed from: c */
    private final String f73897c;

    /* renamed from: d */
    private final String f73898d;

    /* renamed from: e */
    private final long f73899e;

    public C28952b(Long l, Long l2, String str, String str2, long j) {
        this.f73895a = l;
        this.f73896b = l2;
        this.f73897c = str;
        this.f73898d = str2;
        this.f73899e = j;
    }

    /* renamed from: a */
    public final Long mo68809a() {
        return this.f73896b;
    }

    /* renamed from: b */
    public final Long mo68810b() {
        return this.f73895a;
    }

    /* renamed from: c */
    public final long mo68811c() {
        return this.f73899e;
    }

    /* renamed from: d */
    public final String mo68812d() {
        return this.f73898d;
    }

    /* renamed from: e */
    public final String mo68813e() {
        return this.f73897c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28952b)) {
            return false;
        }
        C28952b bVar = (C28952b) obj;
        return C41536l.m120484d(this.f73895a, bVar.f73895a) && C41536l.m120484d(this.f73896b, bVar.f73896b) && C41536l.m120484d(this.f73897c, bVar.f73897c) && C41536l.m120484d(this.f73898d, bVar.f73898d) && this.f73899e == bVar.f73899e;
    }

    public int hashCode() {
        Long l = this.f73895a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f73896b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f73897c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73898d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode3 + i) * 31) + C7397t.m28148a(this.f73899e);
    }

    public String toString() {
        Long l = this.f73895a;
        Long l2 = this.f73896b;
        String str = this.f73897c;
        String str2 = this.f73898d;
        long j = this.f73899e;
        return "PrloTicket(id=" + l + ", clientKey=" + l2 + ", ticketNo=" + str + ", status=" + str2 + ", runDate=" + j + ")";
    }
}
