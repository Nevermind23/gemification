package he1;

import java.io.Serializable;
import kotlin.jvm.internal.C41536l;

/* renamed from: he1.m */
public final class C41224m implements Serializable {

    /* renamed from: d */
    private final Object f97208d;

    /* renamed from: e */
    private final Object f97209e;

    public C41224m(Object obj, Object obj2) {
        this.f97208d = obj;
        this.f97209e = obj2;
    }

    /* renamed from: d */
    public static /* synthetic */ C41224m m119472d(C41224m mVar, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = mVar.f97208d;
        }
        if ((i & 2) != 0) {
            obj2 = mVar.f97209e;
        }
        return mVar.mo95677c(obj, obj2);
    }

    /* renamed from: a */
    public final Object mo95675a() {
        return this.f97208d;
    }

    /* renamed from: b */
    public final Object mo95676b() {
        return this.f97209e;
    }

    /* renamed from: c */
    public final C41224m mo95677c(Object obj, Object obj2) {
        return new C41224m(obj, obj2);
    }

    /* renamed from: e */
    public final Object mo95678e() {
        return this.f97208d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41224m)) {
            return false;
        }
        C41224m mVar = (C41224m) obj;
        return C41536l.m120484d(this.f97208d, mVar.f97208d) && C41536l.m120484d(this.f97209e, mVar.f97209e);
    }

    /* renamed from: f */
    public final Object mo95680f() {
        return this.f97209e;
    }

    public int hashCode() {
        Object obj = this.f97208d;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f97209e;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f97208d + ", " + this.f97209e + ')';
    }
}
