package p392dh;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dh.a */
public final class C12128a {

    /* renamed from: a */
    private final Object f35631a;

    /* renamed from: b */
    private boolean f35632b;

    /* renamed from: c */
    private final int f35633c;

    public C12128a(Object obj, boolean z, int i) {
        this.f35631a = obj;
        this.f35632b = z;
        this.f35633c = i;
    }

    /* renamed from: b */
    public static /* synthetic */ C12128a m44483b(C12128a aVar, Object obj, boolean z, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = aVar.f35631a;
        }
        if ((i2 & 2) != 0) {
            z = aVar.f35632b;
        }
        if ((i2 & 4) != 0) {
            i = aVar.f35633c;
        }
        return aVar.mo32319a(obj, z, i);
    }

    /* renamed from: a */
    public final C12128a mo32319a(Object obj, boolean z, int i) {
        return new C12128a(obj, z, i);
    }

    /* renamed from: c */
    public final int mo32320c() {
        return this.f35633c;
    }

    /* renamed from: d */
    public final Object mo32321d() {
        return this.f35631a;
    }

    /* renamed from: e */
    public final boolean mo32322e() {
        return this.f35632b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12128a)) {
            return false;
        }
        C12128a aVar = (C12128a) obj;
        return C41536l.m120484d(this.f35631a, aVar.f35631a) && this.f35632b == aVar.f35632b && this.f35633c == aVar.f35633c;
    }

    /* renamed from: f */
    public final void mo32324f(boolean z) {
        this.f35632b = z;
    }

    public int hashCode() {
        Object obj = this.f35631a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        boolean z = this.f35632b;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f35633c;
    }

    public String toString() {
        Object obj = this.f35631a;
        boolean z = this.f35632b;
        int i = this.f35633c;
        return "SelectorItem(value=" + obj + ", isChecked=" + z + ", index=" + i + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12128a(Object obj, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? -1 : i);
    }
}
