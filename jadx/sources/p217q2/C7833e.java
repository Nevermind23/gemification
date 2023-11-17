package p217q2;

import androidx.work.C1958d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q2.e */
public final class C7833e {

    /* renamed from: c */
    public static final C7834a f22754c = new C7834a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final Object f22755a;

    /* renamed from: b */
    public final boolean f22756b;

    /* renamed from: q2.e$a */
    public static final class C7834a {
        private C7834a() {
        }

        public /* synthetic */ C7834a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7833e mo22767a() {
            return new C7833e((Object) null, false);
        }

        /* renamed from: b */
        public final C7833e mo22768b(Object obj) {
            return new C7833e(obj, true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = p217q2.C7833e.f22754c.mo22768b(r2);
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p217q2.C7833e mo22769c(java.lang.Object r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x000b
                q2.e$a r0 = p217q2.C7833e.f22754c
                q2.e r2 = r0.mo22768b(r2)
                if (r2 == 0) goto L_0x000b
                goto L_0x000f
            L_0x000b:
                q2.e r2 = r1.mo22767a()
            L_0x000f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p217q2.C7833e.C7834a.mo22769c(java.lang.Object):q2.e");
        }
    }

    public C7833e(Object obj, boolean z) {
        this.f22755a = obj;
        this.f22756b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7833e)) {
            return false;
        }
        C7833e eVar = (C7833e) obj;
        if (!(!C41536l.m120484d(this.f22755a, eVar.f22755a)) && this.f22756b == eVar.f22756b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        Object obj = this.f22755a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + C1958d.m7693a(this.f22756b);
    }
}
