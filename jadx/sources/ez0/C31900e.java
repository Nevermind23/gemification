package ez0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ez0.e */
public final class C31900e {

    /* renamed from: a */
    private final String f78633a;

    /* renamed from: b */
    private final String f78634b;

    /* renamed from: c */
    private final String f78635c;

    /* renamed from: d */
    private final String f78636d;

    public C31900e(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "text");
        C41536l.m120489i(str3, "secondaryButtonText");
        C41536l.m120489i(str4, "primaryButtonText");
        this.f78633a = str;
        this.f78634b = str2;
        this.f78635c = str3;
        this.f78636d = str4;
    }

    /* renamed from: a */
    public final String mo72332a() {
        return this.f78636d;
    }

    /* renamed from: b */
    public final String mo72333b() {
        return this.f78635c;
    }

    /* renamed from: c */
    public final String mo72334c() {
        return this.f78634b;
    }

    /* renamed from: d */
    public final String mo72335d() {
        return this.f78633a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31900e)) {
            return false;
        }
        C31900e eVar = (C31900e) obj;
        return C41536l.m120484d(this.f78633a, eVar.f78633a) && C41536l.m120484d(this.f78634b, eVar.f78634b) && C41536l.m120484d(this.f78635c, eVar.f78635c) && C41536l.m120484d(this.f78636d, eVar.f78636d);
    }

    public int hashCode() {
        return (((((this.f78633a.hashCode() * 31) + this.f78634b.hashCode()) * 31) + this.f78635c.hashCode()) * 31) + this.f78636d.hashCode();
    }

    public String toString() {
        String str = this.f78633a;
        String str2 = this.f78634b;
        String str3 = this.f78635c;
        String str4 = this.f78636d;
        return "InsurancePopupData(title=" + str + ", text=" + str2 + ", secondaryButtonText=" + str3 + ", primaryButtonText=" + str4 + ")";
    }
}
