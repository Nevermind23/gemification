package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.a */
public abstract class C41519a implements C41533i, Serializable {
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public final Object f97690d;

    /* renamed from: e */
    private final Class f97691e;

    /* renamed from: f */
    private final String f97692f;

    /* renamed from: g */
    private final String f97693g;

    /* renamed from: h */
    private final boolean f97694h;

    /* renamed from: i */
    private final int f97695i;

    /* renamed from: j */
    private final int f97696j;

    public C41519a(int i, Object obj, Class cls, String str, String str2, int i2) {
        boolean z;
        this.f97690d = obj;
        this.f97691e = cls;
        this.f97692f = str;
        this.f97693g = str2;
        if ((i2 & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f97694h = z;
        this.f97695i = i;
        this.f97696j = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41519a)) {
            return false;
        }
        C41519a aVar = (C41519a) obj;
        if (this.f97694h != aVar.f97694h || this.f97695i != aVar.f97695i || this.f97696j != aVar.f97696j || !C41536l.m120484d(this.f97690d, aVar.f97690d) || !C41536l.m120484d(this.f97691e, aVar.f97691e) || !this.f97692f.equals(aVar.f97692f) || !this.f97693g.equals(aVar.f97693g)) {
            return false;
        }
        return true;
    }

    public int getArity() {
        return this.f97695i;
    }

    public int hashCode() {
        int i;
        int i2;
        Object obj = this.f97690d;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Class cls = this.f97691e;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int hashCode = (((((i4 + i3) * 31) + this.f97692f.hashCode()) * 31) + this.f97693g.hashCode()) * 31;
        if (this.f97694h) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((hashCode + i2) * 31) + this.f97695i) * 31) + this.f97696j;
    }

    public String toString() {
        return C41520a0.m120442h(this);
    }
}
