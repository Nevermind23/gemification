package p383cn;

import kotlin.jvm.internal.C41536l;

/* renamed from: cn.d */
public final class C10516d {

    /* renamed from: a */
    private final C10515c f29852a;

    /* renamed from: b */
    private final int f29853b;

    /* renamed from: c */
    private final float f29854c;

    public C10516d(C10515c cVar, int i, float f) {
        C41536l.m120489i(cVar, "step");
        this.f29852a = cVar;
        this.f29853b = i;
        this.f29854c = f;
    }

    /* renamed from: b */
    public static /* synthetic */ C10516d m38098b(C10516d dVar, C10515c cVar, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = dVar.f29852a;
        }
        if ((i2 & 2) != 0) {
            i = dVar.f29853b;
        }
        if ((i2 & 4) != 0) {
            f = dVar.f29854c;
        }
        return dVar.mo27238a(cVar, i, f);
    }

    /* renamed from: a */
    public final C10516d mo27238a(C10515c cVar, int i, float f) {
        C41536l.m120489i(cVar, "step");
        return new C10516d(cVar, i, f);
    }

    /* renamed from: c */
    public final C10515c mo27239c() {
        return this.f29852a;
    }

    /* renamed from: d */
    public final int mo27240d() {
        return this.f29853b;
    }

    /* renamed from: e */
    public final float mo27241e() {
        return this.f29854c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10516d)) {
            return false;
        }
        C10516d dVar = (C10516d) obj;
        return this.f29852a == dVar.f29852a && this.f29853b == dVar.f29853b && Float.compare(this.f29854c, dVar.f29854c) == 0;
    }

    public int hashCode() {
        return (((this.f29852a.hashCode() * 31) + this.f29853b) * 31) + Float.floatToIntBits(this.f29854c);
    }

    public String toString() {
        C10515c cVar = this.f29852a;
        int i = this.f29853b;
        float f = this.f29854c;
        return "OrderDebitCardStepData(step=" + cVar + ", stepIndex=" + i + ", stepProgress=" + f + ")";
    }
}
