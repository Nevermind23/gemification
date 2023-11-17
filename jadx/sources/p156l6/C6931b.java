package p156l6;

import com.google.android.gms.common.api.C3847a;
import p182n6.C7258g;

/* renamed from: l6.b */
public final class C6931b {

    /* renamed from: a */
    private final int f20803a;

    /* renamed from: b */
    private final C3847a f20804b;

    /* renamed from: c */
    private final C3847a.C3851d f20805c;

    /* renamed from: d */
    private final String f20806d;

    private C6931b(C3847a aVar, C3847a.C3851d dVar, String str) {
        this.f20804b = aVar;
        this.f20805c = dVar;
        this.f20806d = str;
        this.f20803a = C7258g.m27881b(aVar, dVar, str);
    }

    /* renamed from: a */
    public static C6931b m26928a(C3847a aVar, C3847a.C3851d dVar, String str) {
        return new C6931b(aVar, dVar, str);
    }

    /* renamed from: b */
    public final String mo21077b() {
        return this.f20804b.mo11916d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6931b)) {
            return false;
        }
        C6931b bVar = (C6931b) obj;
        if (!C7258g.m27880a(this.f20804b, bVar.f20804b) || !C7258g.m27880a(this.f20805c, bVar.f20805c) || !C7258g.m27880a(this.f20806d, bVar.f20806d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20803a;
    }
}
