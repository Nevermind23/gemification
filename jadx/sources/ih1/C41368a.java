package ih1;

import af1.C40296c;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import sh1.C42576a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ih1.a */
public final class C41368a {

    /* renamed from: a */
    private C41371c f97405a;

    /* renamed from: b */
    private final C41806a f97406b;

    /* renamed from: c */
    private final C40296c f97407c;

    /* renamed from: d */
    private final C41806a f97408d;

    /* renamed from: e */
    private final C43079p f97409e;

    /* renamed from: f */
    private final C41373e f97410f;

    /* renamed from: g */
    private List f97411g;

    /* renamed from: h */
    private final C41374f f97412h;

    /* renamed from: i */
    private final C41375g f97413i;

    /* renamed from: ih1.a$a */
    static final class C41369a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C41369a f97414d = new C41369a();

        C41369a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C40296c cVar) {
            C41536l.m120489i(cVar, "it");
            return C42576a.m123264a(cVar);
        }
    }

    public C41368a(C41806a aVar, C40296c cVar, C41806a aVar2, C43079p pVar, C41373e eVar, List list, C41374f fVar, C41375g gVar) {
        C41536l.m120489i(aVar, "scopeQualifier");
        C41536l.m120489i(cVar, "primaryType");
        C41536l.m120489i(pVar, "definition");
        C41536l.m120489i(eVar, "kind");
        C41536l.m120489i(list, "secondaryTypes");
        C41536l.m120489i(fVar, "options");
        C41536l.m120489i(gVar, "properties");
        this.f97406b = aVar;
        this.f97407c = cVar;
        this.f97408d = aVar2;
        this.f97409e = pVar;
        this.f97410f = eVar;
        this.f97411g = list;
        this.f97412h = fVar;
        this.f97413i = gVar;
        this.f97405a = new C41371c((C43075l) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final C43079p mo95997a() {
        return this.f97409e;
    }

    /* renamed from: b */
    public final C41373e mo95998b() {
        return this.f97410f;
    }

    /* renamed from: c */
    public final C41374f mo95999c() {
        return this.f97412h;
    }

    /* renamed from: d */
    public final C40296c mo96000d() {
        return this.f97407c;
    }

    /* renamed from: e */
    public final C41375g mo96001e() {
        return this.f97413i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            C41368a aVar = (C41368a) obj;
            if (!(!C41536l.m120484d(this.f97407c, aVar.f97407c)) && !(!C41536l.m120484d(this.f97408d, aVar.f97408d)) && !(!C41536l.m120484d(this.f97406b, aVar.f97406b))) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }

    /* renamed from: f */
    public final C41806a mo96003f() {
        return this.f97408d;
    }

    /* renamed from: g */
    public final C41806a mo96004g() {
        return this.f97406b;
    }

    /* renamed from: h */
    public final List mo96005h() {
        return this.f97411g;
    }

    public int hashCode() {
        int i;
        C41806a aVar = this.f97408d;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + this.f97407c.hashCode()) * 31) + this.f97406b.hashCode();
    }

    /* renamed from: i */
    public final void mo96007i(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f97411g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r15 = this;
            ih1.e r0 = r15.f97410f
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 39
            r1.append(r2)
            af1.c r3 = r15.f97407c
            java.lang.String r3 = sh1.C42576a.m123264a(r3)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            nh1.a r2 = r15.f97408d
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x003c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = ",qualifier:"
            r2.append(r4)
            nh1.a r4 = r15.f97408d
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            nh1.a r4 = r15.f97406b
            ph1.b$a r5 = ph1.C42205b.f99310e
            nh1.c r5 = r5.mo97689a()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x004d
            r4 = r3
            goto L_0x0060
        L_0x004d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ",scope:"
            r4.append(r5)
            nh1.a r5 = r15.f97406b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x0060:
            java.util.List r5 = r15.f97411g
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x008c
            java.util.List r6 = r15.f97411g
            java.lang.String r7 = ","
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            ih1.a$a r12 = ih1.C41368a.C41369a.f97414d
            r13 = 30
            r14 = 0
            java.lang.String r3 = ie1.C41358y.m120017g0(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ",binds:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x008c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 91
            r5.append(r6)
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ih1.C41368a.toString():java.lang.String");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C41368a(nh1.C41806a r17, af1.C40296c r18, nh1.C41806a r19, ue1.C43079p r20, ih1.C41373e r21, java.util.List r22, ih1.C41374f r23, ih1.C41375g r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r16 = this;
            r0 = r25
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r19
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0015
            java.util.List r1 = ie1.C41341q.m119907j()
            r9 = r1
            goto L_0x0017
        L_0x0015:
            r9 = r22
        L_0x0017:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0027
            ih1.f r1 = new ih1.f
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 7
            r15 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0029
        L_0x0027:
            r10 = r23
        L_0x0029:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0035
            ih1.g r0 = new ih1.g
            r1 = 1
            r0.<init>(r2, r1, r2)
            r11 = r0
            goto L_0x0037
        L_0x0035:
            r11 = r24
        L_0x0037:
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r8 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ih1.C41368a.<init>(nh1.a, af1.c, nh1.a, ue1.p, ih1.e, java.util.List, ih1.f, ih1.g, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
