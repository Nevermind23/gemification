package i90;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: i90.a */
public final class C25135a {

    /* renamed from: a */
    private final C25136b f64583a;

    /* renamed from: b */
    private final String f64584b;

    /* renamed from: c */
    private final String f64585c;

    /* renamed from: d */
    private final String f64586d;

    /* renamed from: e */
    private boolean f64587e;

    public C25135a(C25136b bVar, String str, String str2, String str3, boolean z) {
        C41536l.m120489i(bVar, "type");
        C41536l.m120489i(str, "contractText");
        C41536l.m120489i(str3, "headerText");
        this.f64583a = bVar;
        this.f64584b = str;
        this.f64585c = str2;
        this.f64586d = str3;
        this.f64587e = z;
    }

    /* renamed from: a */
    public final boolean mo63680a() {
        return this.f64587e;
    }

    /* renamed from: b */
    public final String mo63681b() {
        return this.f64584b;
    }

    /* renamed from: c */
    public final String mo63682c() {
        return this.f64585c;
    }

    /* renamed from: d */
    public final String mo63683d() {
        return this.f64586d;
    }

    /* renamed from: e */
    public final C25136b mo63684e() {
        return this.f64583a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25135a)) {
            return false;
        }
        C25135a aVar = (C25135a) obj;
        return this.f64583a == aVar.f64583a && C41536l.m120484d(this.f64584b, aVar.f64584b) && C41536l.m120484d(this.f64585c, aVar.f64585c) && C41536l.m120484d(this.f64586d, aVar.f64586d) && this.f64587e == aVar.f64587e;
    }

    /* renamed from: f */
    public final void mo63686f(boolean z) {
        this.f64587e = z;
    }

    public int hashCode() {
        int hashCode = ((this.f64583a.hashCode() * 31) + this.f64584b.hashCode()) * 31;
        String str = this.f64585c;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f64586d.hashCode()) * 31;
        boolean z = this.f64587e;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        C25136b bVar = this.f64583a;
        String str = this.f64584b;
        String str2 = this.f64585c;
        String str3 = this.f64586d;
        boolean z = this.f64587e;
        return "ClaContract(type=" + bVar + ", contractText=" + str + ", contractVersionId=" + str2 + ", headerText=" + str3 + ", accepted=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25135a(C25136b bVar, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, str2, str3, (i & 16) != 0 ? false : z);
    }
}
