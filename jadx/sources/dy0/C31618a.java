package dy0;

import kotlin.jvm.internal.C41536l;

/* renamed from: dy0.a */
public final class C31618a {

    /* renamed from: a */
    private final int f78181a;

    /* renamed from: b */
    private final Object f78182b;

    /* renamed from: c */
    private final boolean f78183c;

    public C31618a(int i, Object obj, boolean z) {
        this.f78181a = i;
        this.f78182b = obj;
        this.f78183c = z;
    }

    /* renamed from: a */
    public final int mo72032a() {
        return this.f78181a;
    }

    /* renamed from: b */
    public final Object mo72033b() {
        return this.f78182b;
    }

    /* renamed from: c */
    public final boolean mo72034c() {
        return this.f78183c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31618a)) {
            return false;
        }
        C31618a aVar = (C31618a) obj;
        return this.f78181a == aVar.f78181a && C41536l.m120484d(this.f78182b, aVar.f78182b) && this.f78183c == aVar.f78183c;
    }

    public int hashCode() {
        int i = this.f78181a * 31;
        Object obj = this.f78182b;
        int hashCode = (i + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z = this.f78183c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        int i = this.f78181a;
        Object obj = this.f78182b;
        boolean z = this.f78183c;
        return "ElementRestoreValueUiModel(index=" + i + ", value=" + obj + ", visibleInForm=" + z + ")";
    }
}
