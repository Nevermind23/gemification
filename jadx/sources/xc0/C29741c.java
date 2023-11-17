package xc0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xc0.c */
public final class C29741c implements C29740b {

    /* renamed from: a */
    private final String f75172a;

    /* renamed from: b */
    private final String f75173b;

    /* renamed from: c */
    private String f75174c;

    /* renamed from: d */
    private String f75175d;

    public C29741c(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, "segment");
        this.f75172a = str;
        this.f75173b = str2;
        this.f75174c = str3;
        this.f75175d = str4;
    }

    /* renamed from: a */
    public String mo69742a() {
        return this.f75173b;
    }

    /* renamed from: b */
    public String mo69743b() {
        return this.f75174c;
    }

    /* renamed from: c */
    public String mo69744c() {
        return this.f75175d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29741c)) {
            return false;
        }
        C29741c cVar = (C29741c) obj;
        return C41536l.m120484d(this.f75172a, cVar.f75172a) && C41536l.m120484d(this.f75173b, cVar.f75173b) && C41536l.m120484d(this.f75174c, cVar.f75174c) && C41536l.m120484d(this.f75175d, cVar.f75175d);
    }

    public String getKey() {
        return this.f75172a;
    }

    public int hashCode() {
        int hashCode = ((this.f75172a.hashCode() * 31) + this.f75173b.hashCode()) * 31;
        String str = this.f75174c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75175d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f75172a;
        String str2 = this.f75173b;
        String str3 = this.f75174c;
        String str4 = this.f75175d;
        return "PaymentsDictionaryEntity(key=" + str + ", segment=" + str2 + ", valueEn=" + str3 + ", valueGe=" + str4 + ")";
    }
}
