package he1;

import java.io.Serializable;
import kotlin.jvm.internal.C41536l;

/* renamed from: he1.r */
public final class C41232r implements Serializable {

    /* renamed from: d */
    private final Object f97220d;

    /* renamed from: e */
    private final Object f97221e;

    /* renamed from: f */
    private final Object f97222f;

    public C41232r(Object obj, Object obj2, Object obj3) {
        this.f97220d = obj;
        this.f97221e = obj2;
        this.f97222f = obj3;
    }

    /* renamed from: a */
    public final Object mo95688a() {
        return this.f97220d;
    }

    /* renamed from: b */
    public final Object mo95689b() {
        return this.f97221e;
    }

    /* renamed from: c */
    public final Object mo95690c() {
        return this.f97222f;
    }

    /* renamed from: d */
    public final Object mo95691d() {
        return this.f97220d;
    }

    /* renamed from: e */
    public final Object mo95692e() {
        return this.f97221e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41232r)) {
            return false;
        }
        C41232r rVar = (C41232r) obj;
        return C41536l.m120484d(this.f97220d, rVar.f97220d) && C41536l.m120484d(this.f97221e, rVar.f97221e) && C41536l.m120484d(this.f97222f, rVar.f97222f);
    }

    /* renamed from: f */
    public final Object mo95694f() {
        return this.f97222f;
    }

    public int hashCode() {
        Object obj = this.f97220d;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f97221e;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f97222f;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return '(' + this.f97220d + ", " + this.f97221e + ", " + this.f97222f + ')';
    }
}
