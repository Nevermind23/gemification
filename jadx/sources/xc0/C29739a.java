package xc0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xc0.a */
public final class C29739a implements C29740b {

    /* renamed from: a */
    private final String f75168a;

    /* renamed from: b */
    private final String f75169b;

    /* renamed from: c */
    private String f75170c;

    /* renamed from: d */
    private String f75171d;

    public C29739a(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, "segment");
        this.f75168a = str;
        this.f75169b = str2;
        this.f75170c = str3;
        this.f75171d = str4;
    }

    /* renamed from: a */
    public String mo69742a() {
        return this.f75169b;
    }

    /* renamed from: b */
    public String mo69743b() {
        return this.f75170c;
    }

    /* renamed from: c */
    public String mo69744c() {
        return this.f75171d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29739a)) {
            return false;
        }
        C29739a aVar = (C29739a) obj;
        return C41536l.m120484d(this.f75168a, aVar.f75168a) && C41536l.m120484d(this.f75169b, aVar.f75169b) && C41536l.m120484d(this.f75170c, aVar.f75170c) && C41536l.m120484d(this.f75171d, aVar.f75171d);
    }

    public String getKey() {
        return this.f75168a;
    }

    public int hashCode() {
        int hashCode = ((this.f75168a.hashCode() * 31) + this.f75169b.hashCode()) * 31;
        String str = this.f75170c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75171d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f75168a;
        String str2 = this.f75169b;
        String str3 = this.f75170c;
        String str4 = this.f75171d;
        return "CommonDictionaryEntity(key=" + str + ", segment=" + str2 + ", valueEn=" + str3 + ", valueGe=" + str4 + ")";
    }
}
