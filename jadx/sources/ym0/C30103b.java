package ym0;

import kotlin.jvm.internal.C41536l;
import ym0.C30096a;

/* renamed from: ym0.b */
public final class C30103b {

    /* renamed from: a */
    private final C30096a.C30102f f75947a;

    /* renamed from: b */
    private final C30096a.C30102f f75948b;

    /* renamed from: c */
    private final C30096a.C30100d f75949c;

    /* renamed from: d */
    private final C30096a.C30102f f75950d;

    /* renamed from: e */
    private final C30096a.C30098b f75951e;

    /* renamed from: f */
    private final C30096a.C30097a f75952f;

    public C30103b(C30096a.C30102f fVar, C30096a.C30102f fVar2, C30096a.C30100d dVar, C30096a.C30102f fVar3, C30096a.C30098b bVar, C30096a.C30097a aVar) {
        C41536l.m120489i(fVar, "firstName");
        C41536l.m120489i(fVar2, "lastName");
        C41536l.m120489i(dVar, "birthDate");
        C41536l.m120489i(fVar3, "pin");
        C41536l.m120489i(bVar, "phoneNumber");
        C41536l.m120489i(aVar, "termsIsChecked");
        this.f75947a = fVar;
        this.f75948b = fVar2;
        this.f75949c = dVar;
        this.f75950d = fVar3;
        this.f75951e = bVar;
        this.f75952f = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C30103b m91076b(C30103b bVar, C30096a.C30102f fVar, C30096a.C30102f fVar2, C30096a.C30100d dVar, C30096a.C30102f fVar3, C30096a.C30098b bVar2, C30096a.C30097a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = bVar.f75947a;
        }
        if ((i & 2) != 0) {
            fVar2 = bVar.f75948b;
        }
        C30096a.C30102f fVar4 = fVar2;
        if ((i & 4) != 0) {
            dVar = bVar.f75949c;
        }
        C30096a.C30100d dVar2 = dVar;
        if ((i & 8) != 0) {
            fVar3 = bVar.f75950d;
        }
        C30096a.C30102f fVar5 = fVar3;
        if ((i & 16) != 0) {
            bVar2 = bVar.f75951e;
        }
        C30096a.C30098b bVar3 = bVar2;
        if ((i & 32) != 0) {
            aVar = bVar.f75952f;
        }
        return bVar.mo70379a(fVar, fVar4, dVar2, fVar5, bVar3, aVar);
    }

    /* renamed from: a */
    public final C30103b mo70379a(C30096a.C30102f fVar, C30096a.C30102f fVar2, C30096a.C30100d dVar, C30096a.C30102f fVar3, C30096a.C30098b bVar, C30096a.C30097a aVar) {
        C41536l.m120489i(fVar, "firstName");
        C41536l.m120489i(fVar2, "lastName");
        C41536l.m120489i(dVar, "birthDate");
        C41536l.m120489i(fVar3, "pin");
        C41536l.m120489i(bVar, "phoneNumber");
        C41536l.m120489i(aVar, "termsIsChecked");
        return new C30103b(fVar, fVar2, dVar, fVar3, bVar, aVar);
    }

    /* renamed from: c */
    public final C30096a.C30100d mo70380c() {
        return this.f75949c;
    }

    /* renamed from: d */
    public final C30096a.C30102f mo70381d() {
        return this.f75947a;
    }

    /* renamed from: e */
    public final C30096a.C30102f mo70382e() {
        return this.f75948b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30103b)) {
            return false;
        }
        C30103b bVar = (C30103b) obj;
        return C41536l.m120484d(this.f75947a, bVar.f75947a) && C41536l.m120484d(this.f75948b, bVar.f75948b) && C41536l.m120484d(this.f75949c, bVar.f75949c) && C41536l.m120484d(this.f75950d, bVar.f75950d) && C41536l.m120484d(this.f75951e, bVar.f75951e) && C41536l.m120484d(this.f75952f, bVar.f75952f);
    }

    /* renamed from: f */
    public final C30096a.C30098b mo70384f() {
        return this.f75951e;
    }

    /* renamed from: g */
    public final C30096a.C30102f mo70385g() {
        return this.f75950d;
    }

    /* renamed from: h */
    public final boolean mo70386h() {
        if (!this.f75947a.mo70375c() || !this.f75948b.mo70375c() || this.f75949c.mo70369a() == null || !this.f75950d.mo70375c() || !this.f75951e.mo70364d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((this.f75947a.hashCode() * 31) + this.f75948b.hashCode()) * 31) + this.f75949c.hashCode()) * 31) + this.f75950d.hashCode()) * 31) + this.f75951e.hashCode()) * 31) + this.f75952f.hashCode();
    }

    public String toString() {
        C30096a.C30102f fVar = this.f75947a;
        C30096a.C30102f fVar2 = this.f75948b;
        C30096a.C30100d dVar = this.f75949c;
        C30096a.C30102f fVar3 = this.f75950d;
        C30096a.C30098b bVar = this.f75951e;
        C30096a.C30097a aVar = this.f75952f;
        return "ActivateJuniorInput(firstName=" + fVar + ", lastName=" + fVar2 + ", birthDate=" + dVar + ", pin=" + fVar3 + ", phoneNumber=" + bVar + ", termsIsChecked=" + aVar + ")";
    }
}
