package ef0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ef0.g */
public final class C20232g {

    /* renamed from: a */
    private final C20226a f55122a;

    /* renamed from: b */
    private final C20227b f55123b;

    /* renamed from: c */
    private final C20229d f55124c;

    public C20232g(C20226a aVar, C20227b bVar, C20229d dVar) {
        C41536l.m120489i(aVar, "employmentInfo");
        C41536l.m120489i(bVar, "fundingSources");
        C41536l.m120489i(dVar, "investorInfo");
        this.f55122a = aVar;
        this.f55123b = bVar;
        this.f55124c = dVar;
    }

    /* renamed from: a */
    public final C20226a mo48702a() {
        return this.f55122a;
    }

    /* renamed from: b */
    public final C20227b mo48703b() {
        return this.f55123b;
    }

    /* renamed from: c */
    public final C20229d mo48704c() {
        return this.f55124c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20232g)) {
            return false;
        }
        C20232g gVar = (C20232g) obj;
        return C41536l.m120484d(this.f55122a, gVar.f55122a) && C41536l.m120484d(this.f55123b, gVar.f55123b) && C41536l.m120484d(this.f55124c, gVar.f55124c);
    }

    public int hashCode() {
        return (((this.f55122a.hashCode() * 31) + this.f55123b.hashCode()) * 31) + this.f55124c.hashCode();
    }

    public String toString() {
        C20226a aVar = this.f55122a;
        C20227b bVar = this.f55123b;
        C20229d dVar = this.f55124c;
        return "UserInfoModel(employmentInfo=" + aVar + ", fundingSources=" + bVar + ", investorInfo=" + dVar + ")";
    }
}
