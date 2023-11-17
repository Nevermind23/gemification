package p217q2;

import androidx.work.C1958d;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q2.j */
public final class C7843j {

    /* renamed from: g */
    public static final C7845b f22759g = new C7845b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C7836g f22760a;

    /* renamed from: b */
    private final Object f22761b;

    /* renamed from: c */
    private final List f22762c;

    /* renamed from: d */
    private final Set f22763d;

    /* renamed from: e */
    private final boolean f22764e;

    /* renamed from: f */
    private final Map f22765f;

    /* renamed from: q2.j$a */
    public static final class C7844a {

        /* renamed from: a */
        private Object f22766a;

        /* renamed from: b */
        private List f22767b;

        /* renamed from: c */
        private Set f22768c;

        /* renamed from: d */
        private boolean f22769d;

        /* renamed from: e */
        private Map f22770e;

        /* renamed from: f */
        private final C7836g f22771f;

        public C7844a(C7836g gVar) {
            C41536l.m120490j(gVar, "operation");
            this.f22771f = gVar;
        }

        /* renamed from: a */
        public final C7843j mo22790a() {
            return new C7843j(this);
        }

        /* renamed from: b */
        public final C7844a mo22791b(Object obj) {
            this.f22766a = obj;
            return this;
        }

        /* renamed from: c */
        public final C7844a mo22792c(Set set) {
            this.f22768c = set;
            return this;
        }

        /* renamed from: d */
        public final C7844a mo22793d(List list) {
            this.f22767b = list;
            return this;
        }

        /* renamed from: e */
        public final C7844a mo22794e(Map map) {
            this.f22770e = map;
            return this;
        }

        /* renamed from: f */
        public final C7844a mo22795f(boolean z) {
            this.f22769d = z;
            return this;
        }

        /* renamed from: g */
        public final Object mo22796g() {
            return this.f22766a;
        }

        /* renamed from: h */
        public final Set mo22797h() {
            return this.f22768c;
        }

        /* renamed from: i */
        public final List mo22798i() {
            return this.f22767b;
        }

        /* renamed from: j */
        public final Map mo22799j() {
            return this.f22770e;
        }

        /* renamed from: k */
        public final boolean mo22800k() {
            return this.f22769d;
        }

        /* renamed from: l */
        public final C7836g mo22801l() {
            return this.f22771f;
        }
    }

    /* renamed from: q2.j$b */
    public static final class C7845b {
        private C7845b() {
        }

        public /* synthetic */ C7845b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7844a mo22802a(C7836g gVar) {
            C41536l.m120490j(gVar, "operation");
            return new C7844a(gVar);
        }
    }

    public C7843j(C7836g gVar, Object obj, List list, Set set, boolean z, Map map) {
        C41536l.m120490j(gVar, "operation");
        C41536l.m120490j(set, "dependentKeys");
        C41536l.m120490j(map, "extensions");
        this.f22760a = gVar;
        this.f22761b = obj;
        this.f22762c = list;
        this.f22763d = set;
        this.f22764e = z;
        this.f22765f = map;
    }

    /* renamed from: a */
    public static final C7844a m29754a(C7836g gVar) {
        return f22759g.mo22802a(gVar);
    }

    /* renamed from: b */
    public final Object mo22784b() {
        return this.f22761b;
    }

    /* renamed from: c */
    public final List mo22785c() {
        return this.f22762c;
    }

    /* renamed from: d */
    public final boolean mo22786d() {
        List list = this.f22762c;
        return !(list == null || list.isEmpty());
    }

    /* renamed from: e */
    public final C7844a mo22787e() {
        return new C7844a(this.f22760a).mo22791b(this.f22761b).mo22793d(this.f22762c).mo22792c(this.f22763d).mo22795f(this.f22764e).mo22794e(this.f22765f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7843j)) {
            return false;
        }
        C7843j jVar = (C7843j) obj;
        if (!(!C41536l.m120484d(this.f22760a, jVar.f22760a)) && !(!C41536l.m120484d(this.f22761b, jVar.f22761b)) && !(!C41536l.m120484d(this.f22762c, jVar.f22762c)) && !(!C41536l.m120484d(this.f22763d, jVar.f22763d)) && this.f22764e == jVar.f22764e && !(!C41536l.m120484d(this.f22765f, jVar.f22765f))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f22760a.hashCode() * 31;
        Object obj = this.f22761b;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        List list = this.f22762c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((((((i3 + i2) * 31) + this.f22763d.hashCode()) * 31) + C1958d.m7693a(this.f22764e)) * 31) + this.f22765f.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7843j(C7836g gVar, Object obj, List list, Set set, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, obj, (i & 4) != 0 ? null : list, (i & 8) != 0 ? C41357x0.m119985e() : set, (i & 16) != 0 ? false : z, (i & 32) != 0 ? C41344r0.m119928j() : map);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7843j(p217q2.C7843j.C7844a r9) {
        /*
            r8 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.C41536l.m120490j(r9, r0)
            q2.g r2 = r9.mo22801l()
            java.lang.Object r3 = r9.mo22796g()
            java.util.List r4 = r9.mo22798i()
            java.util.Set r0 = r9.mo22797h()
            if (r0 == 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            java.util.Set r0 = ie1.C41357x0.m119985e()
        L_0x001c:
            r5 = r0
            boolean r6 = r9.mo22800k()
            java.util.Map r9 = r9.mo22799j()
            if (r9 == 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            java.util.Map r9 = ie1.C41344r0.m119928j()
        L_0x002c:
            r7 = r9
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p217q2.C7843j.<init>(q2.j$a):void");
    }
}
