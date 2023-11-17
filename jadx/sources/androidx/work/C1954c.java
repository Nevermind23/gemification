package androidx.work;

import android.net.Uri;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.work.c */
public final class C1954c {

    /* renamed from: i */
    public static final C1956b f5911i = new C1956b((DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final C1954c f5912j = new C1954c((C2075n) null, false, false, false, false, 0, 0, (Set) null, C11051p3.f31759c, (DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C2075n f5913a;

    /* renamed from: b */
    private final boolean f5914b;

    /* renamed from: c */
    private final boolean f5915c;

    /* renamed from: d */
    private final boolean f5916d;

    /* renamed from: e */
    private final boolean f5917e;

    /* renamed from: f */
    private final long f5918f;

    /* renamed from: g */
    private final long f5919g;

    /* renamed from: h */
    private final Set f5920h;

    /* renamed from: androidx.work.c$a */
    public static final class C1955a {

        /* renamed from: a */
        private boolean f5921a;

        /* renamed from: b */
        private boolean f5922b;

        /* renamed from: c */
        private C2075n f5923c = C2075n.NOT_REQUIRED;

        /* renamed from: d */
        private boolean f5924d;

        /* renamed from: e */
        private boolean f5925e;

        /* renamed from: f */
        private long f5926f = -1;

        /* renamed from: g */
        private long f5927g = -1;

        /* renamed from: h */
        private Set f5928h = new LinkedHashSet();

        /* renamed from: a */
        public final C1954c mo6720a() {
            Set set;
            long j;
            long j2;
            boolean z;
            if (Build.VERSION.SDK_INT >= 24) {
                set = C41358y.m119993D0(this.f5928h);
                j2 = this.f5926f;
                j = this.f5927g;
            } else {
                set = C41357x0.m119985e();
                j2 = -1;
                j = -1;
            }
            boolean z2 = this.f5921a;
            if (this.f5922b) {
                z = true;
            } else {
                z = false;
            }
            return new C1954c(this.f5923c, z2, z, this.f5924d, this.f5925e, j2, j, set);
        }

        /* renamed from: b */
        public final C1955a mo6721b(C2075n nVar) {
            C41536l.m120489i(nVar, "networkType");
            this.f5923c = nVar;
            return this;
        }
    }

    /* renamed from: androidx.work.c$b */
    public static final class C1956b {
        private C1956b() {
        }

        public /* synthetic */ C1956b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: androidx.work.c$c */
    public static final class C1957c {

        /* renamed from: a */
        private final Uri f5929a;

        /* renamed from: b */
        private final boolean f5930b;

        public C1957c(Uri uri, boolean z) {
            C41536l.m120489i(uri, "uri");
            this.f5929a = uri;
            this.f5930b = z;
        }

        /* renamed from: a */
        public final Uri mo6722a() {
            return this.f5929a;
        }

        /* renamed from: b */
        public final boolean mo6723b() {
            return this.f5930b;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<C1957c> cls2 = C1957c.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!C41536l.m120484d(cls2, cls)) {
                return false;
            }
            C41536l.m120487g(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            C1957c cVar = (C1957c) obj;
            if (C41536l.m120484d(this.f5929a, cVar.f5929a) && this.f5930b == cVar.f5930b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f5929a.hashCode() * 31) + C1958d.m7693a(this.f5930b);
        }
    }

    public C1954c(C2075n nVar, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        C41536l.m120489i(nVar, "requiredNetworkType");
        C41536l.m120489i(set, "contentUriTriggers");
        this.f5913a = nVar;
        this.f5914b = z;
        this.f5915c = z2;
        this.f5916d = z3;
        this.f5917e = z4;
        this.f5918f = j;
        this.f5919g = j2;
        this.f5920h = set;
    }

    /* renamed from: a */
    public final long mo6709a() {
        return this.f5919g;
    }

    /* renamed from: b */
    public final long mo6710b() {
        return this.f5918f;
    }

    /* renamed from: c */
    public final Set mo6711c() {
        return this.f5920h;
    }

    /* renamed from: d */
    public final C2075n mo6712d() {
        return this.f5913a;
    }

    /* renamed from: e */
    public final boolean mo6713e() {
        return !this.f5920h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C41536l.m120484d(C1954c.class, obj.getClass())) {
            return false;
        }
        C1954c cVar = (C1954c) obj;
        if (this.f5914b == cVar.f5914b && this.f5915c == cVar.f5915c && this.f5916d == cVar.f5916d && this.f5917e == cVar.f5917e && this.f5918f == cVar.f5918f && this.f5919g == cVar.f5919g && this.f5913a == cVar.f5913a) {
            return C41536l.m120484d(this.f5920h, cVar.f5920h);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo6715f() {
        return this.f5916d;
    }

    /* renamed from: g */
    public final boolean mo6716g() {
        return this.f5914b;
    }

    /* renamed from: h */
    public final boolean mo6717h() {
        return this.f5915c;
    }

    public int hashCode() {
        long j = this.f5918f;
        long j2 = this.f5919g;
        return (((((((((((((this.f5913a.hashCode() * 31) + (this.f5914b ? 1 : 0)) * 31) + (this.f5915c ? 1 : 0)) * 31) + (this.f5916d ? 1 : 0)) * 31) + (this.f5917e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f5920h.hashCode();
    }

    /* renamed from: i */
    public final boolean mo6719i() {
        return this.f5917e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1954c(androidx.work.C2075n r12, boolean r13, boolean r14, boolean r15, boolean r16, long r17, long r19, java.util.Set r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            androidx.work.n r1 = androidx.work.C2075n.NOT_REQUIRED
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r15
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r16
        L_0x0027:
            r6 = r0 & 32
            r7 = -1
            if (r6 == 0) goto L_0x002f
            r9 = r7
            goto L_0x0031
        L_0x002f:
            r9 = r17
        L_0x0031:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r19
        L_0x0038:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            java.util.Set r0 = ie1.C41357x0.m119985e()
            goto L_0x0043
        L_0x0041:
            r0 = r21
        L_0x0043:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r3
            r18 = r9
            r20 = r7
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1954c.<init>(androidx.work.n, boolean, boolean, boolean, boolean, long, long, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1954c(androidx.work.C1954c r13) {
        /*
            r12 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            boolean r3 = r13.f5914b
            boolean r4 = r13.f5915c
            androidx.work.n r2 = r13.f5913a
            boolean r5 = r13.f5916d
            boolean r6 = r13.f5917e
            java.util.Set r11 = r13.f5920h
            long r7 = r13.f5918f
            long r9 = r13.f5919g
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1954c.<init>(androidx.work.c):void");
    }
}
