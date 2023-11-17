package xf0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xf0.e */
public final class C29766e {

    /* renamed from: a */
    private C29761a f75297a;

    /* renamed from: b */
    private C29763b f75298b;

    /* renamed from: c */
    private C29764c f75299c;

    public C29766e(C29761a aVar, C29763b bVar, C29764c cVar) {
        C41536l.m120489i(aVar, "employmentInfo");
        C41536l.m120489i(bVar, "fundingSources");
        C41536l.m120489i(cVar, "investorInfo");
        this.f75297a = aVar;
        this.f75298b = bVar;
        this.f75299c = cVar;
    }

    /* renamed from: a */
    public final C29761a mo69929a() {
        return this.f75297a;
    }

    /* renamed from: b */
    public final C29763b mo69930b() {
        return this.f75298b;
    }

    /* renamed from: c */
    public final C29764c mo69931c() {
        return this.f75299c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29766e)) {
            return false;
        }
        C29766e eVar = (C29766e) obj;
        return C41536l.m120484d(this.f75297a, eVar.f75297a) && C41536l.m120484d(this.f75298b, eVar.f75298b) && C41536l.m120484d(this.f75299c, eVar.f75299c);
    }

    public int hashCode() {
        return (((this.f75297a.hashCode() * 31) + this.f75298b.hashCode()) * 31) + this.f75299c.hashCode();
    }

    public String toString() {
        C29761a aVar = this.f75297a;
        C29763b bVar = this.f75298b;
        C29764c cVar = this.f75299c;
        return "UserInfoUIModel(employmentInfo=" + aVar + ", fundingSources=" + bVar + ", investorInfo=" + cVar + ")";
    }
}
