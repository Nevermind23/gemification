package he1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ze1.C43420e;

/* renamed from: he1.e */
public final class C41214e implements Comparable {

    /* renamed from: h */
    public static final C41215a f97196h = new C41215a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final C41214e f97197i = C41216f.m119465a();

    /* renamed from: d */
    private final int f97198d;

    /* renamed from: e */
    private final int f97199e;

    /* renamed from: f */
    private final int f97200f;

    /* renamed from: g */
    private final int f97201g;

    /* renamed from: he1.e$a */
    public static final class C41215a {
        private C41215a() {
        }

        public /* synthetic */ C41215a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C41214e(int i, int i2, int i3) {
        this.f97198d = i;
        this.f97199e = i2;
        this.f97200f = i3;
        this.f97201g = m119463b(i, i2, i3);
    }

    /* renamed from: b */
    private final int m119463b(int i, int i2, int i3) {
        boolean z = false;
        if (new C43420e(0, C11051p3.f31759c).mo102116v(i) && new C43420e(0, C11051p3.f31759c).mo102116v(i2) && new C43420e(0, C11051p3.f31759c).mo102116v(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* renamed from: a */
    public int compareTo(C41214e eVar) {
        C41536l.m120489i(eVar, "other");
        return this.f97201g - eVar.f97201g;
    }

    public boolean equals(Object obj) {
        C41214e eVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41214e) {
            eVar = (C41214e) obj;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return false;
        }
        if (this.f97201g == eVar.f97201g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f97201g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f97198d);
        sb.append('.');
        sb.append(this.f97199e);
        sb.append('.');
        sb.append(this.f97200f);
        return sb.toString();
    }
}
