package r30;

import cf1.C40419j;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p812kv.C25781d;
import r30.C27906g;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: r30.f */
public final class C27899f implements C27906g {

    /* renamed from: p */
    public static final C27900a f71061p = new C27900a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final long f71062a;

    /* renamed from: b */
    private final boolean f71063b;

    /* renamed from: c */
    private final String f71064c;

    /* renamed from: d */
    private final boolean f71065d;

    /* renamed from: e */
    private final double f71066e;

    /* renamed from: f */
    private final double f71067f;

    /* renamed from: g */
    private final C25781d f71068g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final List f71069h;

    /* renamed from: i */
    private final float f71070i;

    /* renamed from: j */
    private final boolean f71071j;

    /* renamed from: k */
    private final C41217g f71072k;

    /* renamed from: l */
    private final C41217g f71073l;

    /* renamed from: m */
    private final String f71074m;

    /* renamed from: n */
    private final String f71075n;

    /* renamed from: o */
    private final C27906g.C27907a f71076o;

    /* renamed from: r30.f$a */
    public static final class C27900a {
        private C27900a() {
        }

        public /* synthetic */ C27900a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r30.f$b */
    public static final class C27901b {

        /* renamed from: a */
        private final String f71077a;

        /* renamed from: b */
        private final int f71078b;

        /* renamed from: c */
        private final String f71079c;

        /* renamed from: d */
        private final double f71080d;

        public C27901b(String str, int i, String str2, double d) {
            C41536l.m120489i(str2, "fullName");
            this.f71077a = str;
            this.f71078b = i;
            this.f71079c = str2;
            this.f71080d = d;
        }

        /* renamed from: a */
        public final double mo67473a() {
            return this.f71080d;
        }

        /* renamed from: b */
        public final String mo67474b() {
            return this.f71079c;
        }

        /* renamed from: c */
        public final int mo67475c() {
            return this.f71078b;
        }

        /* renamed from: d */
        public final String mo67476d() {
            return this.f71077a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27901b)) {
                return false;
            }
            C27901b bVar = (C27901b) obj;
            return C41536l.m120484d(this.f71077a, bVar.f71077a) && this.f71078b == bVar.f71078b && C41536l.m120484d(this.f71079c, bVar.f71079c) && Double.compare(this.f71080d, bVar.f71080d) == 0;
        }

        public int hashCode() {
            String str = this.f71077a;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f71078b) * 31) + this.f71079c.hashCode()) * 31) + Double.doubleToLongBits(this.f71080d);
        }

        public String toString() {
            String str = this.f71077a;
            int i = this.f71078b;
            String str2 = this.f71079c;
            double d = this.f71080d;
            return "Receiver(profilePictureUrl=" + str + ", icon=" + i + ", fullName=" + str2 + ", amountToTransfer=" + d + ")";
        }
    }

    /* renamed from: r30.f$c */
    static final class C27902c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27899f f71081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27902c(C27899f fVar) {
            super(0);
            this.f71081d = fVar;
        }

        /* renamed from: b */
        public final List invoke() {
            List e;
            if (this.f71081d.mo67472p()) {
                List<C27901b> v0 = C41358y.m120032v0(this.f71081d.f71069h, 3);
                ArrayList arrayList = new ArrayList(C41343r.m119925u(v0, 10));
                for (C27901b bVar : v0) {
                    arrayList.add(C41233s.m119492a(bVar.mo67476d(), Integer.valueOf(bVar.mo67475c())));
                }
                return arrayList;
            }
            C27901b bVar2 = (C27901b) C41358y.m120009Y(this.f71081d.f71069h);
            if (bVar2 == null || (e = C41339p.m119900e(C41233s.m119492a(bVar2.mo67476d(), Integer.valueOf(bVar2.mo67475c())))) == null) {
                return C41341q.m119907j();
            }
            return e;
        }
    }

    /* renamed from: r30.f$d */
    static final class C27903d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27899f f71082d;

        /* renamed from: r30.f$d$a */
        static final class C27904a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C27899f f71083d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C27904a(C27899f fVar) {
                super(1);
                this.f71083d = fVar;
            }

            /* renamed from: a */
            public final CharSequence invoke(C27901b bVar) {
                C41536l.m120489i(bVar, "it");
                if (this.f71083d.mo67464h()) {
                    return bVar.mo67474b();
                }
                return (CharSequence) C41358y.m120007W(new C40419j("\\s").mo94492i(bVar.mo67474b(), 0));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27903d(C27899f fVar) {
            super(0);
            this.f71082d = fVar;
        }

        public final String invoke() {
            return this.f71082d.mo67472p() ? C41358y.m120017g0(this.f71082d.f71069h, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C27904a(this.f71082d), 31, (Object) null) : "";
        }
    }

    /* renamed from: r30.f$e */
    public static final class C27905e implements Comparator {

        /* renamed from: d */
        final /* synthetic */ Comparator f71084d;

        public C27905e(Comparator comparator) {
            this.f71084d = comparator;
        }

        public final int compare(Object obj, Object obj2) {
            return this.f71084d.compare(((C27901b) obj).mo67476d(), ((C27901b) obj2).mo67476d());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27899f(long r2, boolean r4, java.lang.String r5, boolean r6, double r7, double r9, java.util.List r11, p812kv.C25781d r12) {
        /*
            r1 = this;
            java.lang.String r0 = "requestReceivers"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            java.lang.String r0 = "requestType"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            r1.<init>()
            r1.f71062a = r2
            r1.f71063b = r4
            r1.f71064c = r5
            r1.f71065d = r6
            r1.f71066e = r7
            r1.f71067f = r9
            r1.f71068g = r12
            r30.e r2 = new r30.e
            r2.<init>()
            java.util.Comparator r2 = ke1.C41506d.m120409h(r2)
            r30.f$e r3 = new r30.f$e
            r3.<init>(r2)
            java.util.List r2 = ie1.C41358y.m120030t0(r11, r3)
            r1.f71069h = r2
            r3 = 0
            r5 = 1
            if (r4 == 0) goto L_0x0045
            r11 = 0
            int r6 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x003b
            r6 = r5
            goto L_0x003c
        L_0x003b:
            r6 = r3
        L_0x003c:
            if (r6 != 0) goto L_0x0045
            double r9 = r9 / r7
            float r6 = (float) r9
            r9 = 100
            float r9 = (float) r9
            float r6 = r6 * r9
            goto L_0x0047
        L_0x0045:
            r6 = 2143289344(0x7fc00000, float:NaN)
        L_0x0047:
            r1.f71070i = r6
            int r6 = r2.size()
            if (r6 != r5) goto L_0x0050
            r3 = r5
        L_0x0050:
            r1.f71071j = r3
            r30.f$d r3 = new r30.f$d
            r3.<init>(r1)
            he1.g r3 = he1.C41219i.m119470b(r3)
            r1.f71072k = r3
            r30.f$c r3 = new r30.f$c
            r3.<init>(r1)
            he1.g r3 = he1.C41219i.m119470b(r3)
            r1.f71073l = r3
            r3 = 0
            if (r4 != 0) goto L_0x0077
            java.lang.Object r5 = ie1.C41358y.m120009Y(r2)
            r30.f$b r5 = (r30.C27899f.C27901b) r5
            if (r5 == 0) goto L_0x0077
            java.lang.String r3 = r5.mo67474b()
        L_0x0077:
            r1.f71074m = r3
            java.lang.String r3 = ""
            if (r4 == 0) goto L_0x00a2
            java.lang.String r6 = "₾"
            r2 = 0
            r9 = 2
            r10 = 0
            r4 = r7
            r7 = r2
            r8 = r9
            r9 = r10
            java.lang.String r2 = g91.C32343x.m95410Q(r4, r6, r7, r8, r9)
            boolean r4 = r1.m86176f()
            if (r4 == 0) goto L_0x0092
            java.lang.String r3 = "+"
        L_0x0092:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x00bb
        L_0x00a2:
            java.lang.Object r2 = ie1.C41358y.m120009Y(r2)
            r30.f$b r2 = (r30.C27899f.C27901b) r2
            if (r2 == 0) goto L_0x00bb
            double r4 = r2.mo67473a()
            java.lang.String r6 = "GEL"
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r2 = g91.C32343x.m95410Q(r4, r6, r7, r8, r9)
            if (r2 != 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r3 = r2
        L_0x00bb:
            r1.f71075n = r3
            r30.g$a r2 = r30.C27906g.C27907a.MONEY_REQUEST_VERTICAL
            r1.f71076o = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r30.C27899f.<init>(long, boolean, java.lang.String, boolean, double, double, java.util.List, kv.d):void");
    }

    /* renamed from: f */
    private final boolean m86176f() {
        return this.f71063b && this.f71067f > this.f71066e;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final int m86177q(Object obj, Object obj2) {
        return 0;
    }

    /* renamed from: a */
    public C27906g.C27907a mo67429a() {
        return this.f71076o;
    }

    /* renamed from: d */
    public final boolean mo67461d() {
        return this.f71063b && this.f71067f >= this.f71066e;
    }

    /* renamed from: e */
    public final String mo67462e() {
        return this.f71064c;
    }

    /* renamed from: g */
    public final String mo67463g() {
        return this.f71075n;
    }

    /* renamed from: h */
    public final boolean mo67464h() {
        return this.f71071j;
    }

    /* renamed from: i */
    public final boolean mo67465i() {
        return this.f71065d;
    }

    /* renamed from: j */
    public final List mo67466j() {
        return (List) this.f71073l.getValue();
    }

    /* renamed from: k */
    public final long mo67467k() {
        return this.f71062a;
    }

    /* renamed from: l */
    public final float mo67468l() {
        return this.f71070i;
    }

    /* renamed from: m */
    public final String mo67469m() {
        return (String) this.f71072k.getValue();
    }

    /* renamed from: n */
    public final String mo67470n() {
        return this.f71074m;
    }

    /* renamed from: o */
    public final C25781d mo67471o() {
        return this.f71068g;
    }

    /* renamed from: p */
    public final boolean mo67472p() {
        return this.f71063b;
    }
}
