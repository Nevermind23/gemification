package p202p0;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;

/* renamed from: p0.i */
public final class C7546i {

    /* renamed from: a */
    private final C7606z f22009a;

    /* renamed from: b */
    private final boolean f22010b;

    /* renamed from: c */
    private final boolean f22011c;

    /* renamed from: d */
    private final Object f22012d;

    /* renamed from: p0.i$a */
    public static final class C7547a {

        /* renamed from: a */
        private C7606z f22013a;

        /* renamed from: b */
        private boolean f22014b;

        /* renamed from: c */
        private Object f22015c;

        /* renamed from: d */
        private boolean f22016d;

        /* renamed from: a */
        public final C7546i mo22091a() {
            C7606z zVar = this.f22013a;
            if (zVar == null) {
                zVar = C7606z.f22195c.mo22312c(this.f22015c);
            }
            return new C7546i(zVar, this.f22014b, this.f22015c, this.f22016d);
        }

        /* renamed from: b */
        public final C7547a mo22092b(Object obj) {
            this.f22015c = obj;
            this.f22016d = true;
            return this;
        }

        /* renamed from: c */
        public final C7547a mo22093c(boolean z) {
            this.f22014b = z;
            return this;
        }

        /* renamed from: d */
        public final C7547a mo22094d(C7606z zVar) {
            C41536l.m120489i(zVar, "type");
            this.f22013a = zVar;
            return this;
        }
    }

    public C7546i(C7606z zVar, boolean z, Object obj, boolean z2) {
        boolean z3;
        C41536l.m120489i(zVar, "type");
        boolean z4 = false;
        if (zVar.mo22272c() || !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if ((z || !z2 || obj != null) ? true : z4) {
                this.f22009a = zVar;
                this.f22010b = z;
                this.f22012d = obj;
                this.f22011c = z2;
                return;
            }
            throw new IllegalArgumentException(("Argument with type " + zVar.mo22271b() + " has null value but is not nullable.").toString());
        }
        throw new IllegalArgumentException((zVar.mo22271b() + " does not allow nullable values").toString());
    }

    /* renamed from: a */
    public final C7606z mo22083a() {
        return this.f22009a;
    }

    /* renamed from: b */
    public final boolean mo22084b() {
        return this.f22011c;
    }

    /* renamed from: c */
    public final boolean mo22085c() {
        return this.f22010b;
    }

    /* renamed from: d */
    public final void mo22086d(String str, Bundle bundle) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(bundle, "bundle");
        if (this.f22011c) {
            this.f22009a.mo22275f(bundle, str, this.f22012d);
        }
    }

    /* renamed from: e */
    public final boolean mo22087e(String str, Bundle bundle) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(bundle, "bundle");
        if (!this.f22010b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f22009a.mo22270a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C41536l.m120484d(C7546i.class, obj.getClass())) {
            return false;
        }
        C7546i iVar = (C7546i) obj;
        if (this.f22010b != iVar.f22010b || this.f22011c != iVar.f22011c || !C41536l.m120484d(this.f22009a, iVar.f22009a)) {
            return false;
        }
        Object obj2 = this.f22012d;
        if (obj2 != null) {
            return C41536l.m120484d(obj2, iVar.f22012d);
        }
        if (iVar.f22012d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f22009a.hashCode() * 31) + (this.f22010b ? 1 : 0)) * 31) + (this.f22011c ? 1 : 0)) * 31;
        Object obj = this.f22012d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7546i.class.getSimpleName());
        sb.append(" Type: " + this.f22009a);
        sb.append(" Nullable: " + this.f22010b);
        if (this.f22011c) {
            sb.append(" DefaultValue: " + this.f22012d);
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "sb.toString()");
        return sb2;
    }
}
