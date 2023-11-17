package hi0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hi0.e */
public final class C25032e {

    /* renamed from: a */
    private final String f64376a;

    /* renamed from: b */
    private final String f64377b;

    /* renamed from: c */
    private final String f64378c;

    /* renamed from: d */
    private final String f64379d;

    public C25032e(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "number");
        C41536l.m120489i(str3, "photoUri");
        C41536l.m120489i(str4, "normalizedNumber");
        this.f64376a = str;
        this.f64377b = str2;
        this.f64378c = str3;
        this.f64379d = str4;
    }

    /* renamed from: a */
    public final String mo63456a() {
        return this.f64376a;
    }

    /* renamed from: b */
    public final String mo63457b() {
        return this.f64379d;
    }

    /* renamed from: c */
    public final String mo63458c() {
        return this.f64377b;
    }

    /* renamed from: d */
    public final String mo63459d() {
        return this.f64378c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25032e)) {
            return false;
        }
        C25032e eVar = (C25032e) obj;
        return C41536l.m120484d(this.f64376a, eVar.f64376a) && C41536l.m120484d(this.f64377b, eVar.f64377b) && C41536l.m120484d(this.f64378c, eVar.f64378c) && C41536l.m120484d(this.f64379d, eVar.f64379d);
    }

    public int hashCode() {
        return (((((this.f64376a.hashCode() * 31) + this.f64377b.hashCode()) * 31) + this.f64378c.hashCode()) * 31) + this.f64379d.hashCode();
    }

    public String toString() {
        String str = this.f64376a;
        String str2 = this.f64377b;
        String str3 = this.f64378c;
        String str4 = this.f64379d;
        return "PhoneContactUiModel(name=" + str + ", number=" + str2 + ", photoUri=" + str3 + ", normalizedNumber=" + str4 + ")";
    }
}
