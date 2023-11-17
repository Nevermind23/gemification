package p832mv;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p891su.C28261a;

/* renamed from: mv.b */
public abstract class C26305b {

    /* renamed from: mv.b$c */
    public enum C26308c {
        ACTIVE,
        COMPLETED,
        f66669f
    }

    private C26305b() {
    }

    public /* synthetic */ C26305b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo65470a();

    /* renamed from: b */
    public final double mo65471b() {
        BigDecimal subtract = new BigDecimal(String.valueOf(mo65472c())).subtract(new BigDecimal(String.valueOf(mo65474e())));
        C41536l.m120488h(subtract, "this.subtract(other)");
        return subtract.doubleValue();
    }

    /* renamed from: c */
    public abstract double mo65472c();

    /* renamed from: d */
    public abstract C26308c mo65473d();

    /* renamed from: e */
    public abstract double mo65474e();

    /* renamed from: mv.b$b */
    public static final class C26307b extends C26305b {

        /* renamed from: a */
        private final String f66661a;

        /* renamed from: b */
        private final String f66662b;

        /* renamed from: c */
        private final double f66663c;

        /* renamed from: d */
        private final double f66664d;

        /* renamed from: e */
        private final String f66665e;

        /* renamed from: f */
        private final C26308c f66666f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26307b(String str, String str2, double d, double d2, String str3, C26308c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? str : str3, (i & 32) != 0 ? C26308c.ACTIVE : cVar);
        }

        /* renamed from: g */
        public static /* synthetic */ C26307b m82277g(C26307b bVar, String str, String str2, double d, double d2, String str3, C26308c cVar, int i, Object obj) {
            C26307b bVar2 = bVar;
            return bVar.mo65481f((i & 1) != 0 ? bVar2.f66661a : str, (i & 2) != 0 ? bVar2.f66662b : str2, (i & 4) != 0 ? bVar2.f66663c : d, (i & 8) != 0 ? bVar2.f66664d : d2, (i & 16) != 0 ? bVar2.f66665e : str3, (i & 32) != 0 ? bVar2.f66666f : cVar);
        }

        /* renamed from: a */
        public String mo65470a() {
            return this.f66665e;
        }

        /* renamed from: c */
        public double mo65472c() {
            return this.f66663c;
        }

        /* renamed from: d */
        public C26308c mo65473d() {
            return this.f66666f;
        }

        /* renamed from: e */
        public double mo65474e() {
            return this.f66664d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26307b)) {
                return false;
            }
            C26307b bVar = (C26307b) obj;
            return C41536l.m120484d(this.f66661a, bVar.f66661a) && C41536l.m120484d(this.f66662b, bVar.f66662b) && Double.compare(this.f66663c, bVar.f66663c) == 0 && Double.compare(this.f66664d, bVar.f66664d) == 0 && C41536l.m120484d(this.f66665e, bVar.f66665e) && this.f66666f == bVar.f66666f;
        }

        /* renamed from: f */
        public final C26307b mo65481f(String str, String str2, double d, double d2, String str3, C26308c cVar) {
            C41536l.m120489i(str, "phone");
            C41536l.m120489i(str2, "name");
            String str4 = str3;
            C41536l.m120489i(str4, "receiverId");
            C26308c cVar2 = cVar;
            C41536l.m120489i(cVar2, "status");
            return new C26307b(str, str2, d, d2, str4, cVar2);
        }

        /* renamed from: h */
        public final String mo65482h() {
            return this.f66662b;
        }

        public int hashCode() {
            return (((((((((this.f66661a.hashCode() * 31) + this.f66662b.hashCode()) * 31) + Double.doubleToLongBits(this.f66663c)) * 31) + Double.doubleToLongBits(this.f66664d)) * 31) + this.f66665e.hashCode()) * 31) + this.f66666f.hashCode();
        }

        /* renamed from: i */
        public final String mo65484i() {
            return this.f66661a;
        }

        public String toString() {
            String str = this.f66661a;
            String str2 = this.f66662b;
            double d = this.f66663c;
            double d2 = this.f66664d;
            String str3 = this.f66665e;
            C26308c cVar = this.f66666f;
            return "PhoneNumber(phone=" + str + ", name=" + str2 + ", requestedAmount=" + d + ", transferredAmount=" + d2 + ", receiverId=" + str3 + ", status=" + cVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26307b(String str, String str2, double d, double d2, String str3, C26308c cVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "phone");
            C41536l.m120489i(str2, "name");
            C41536l.m120489i(str3, "receiverId");
            C41536l.m120489i(cVar, "status");
            this.f66661a = str;
            this.f66662b = str2;
            this.f66663c = d;
            this.f66664d = d2;
            this.f66665e = str3;
            this.f66666f = cVar;
        }
    }

    /* renamed from: mv.b$a */
    public static final class C26306a extends C26305b {

        /* renamed from: a */
        private final C28261a f66656a;

        /* renamed from: b */
        private final double f66657b;

        /* renamed from: c */
        private final double f66658c;

        /* renamed from: d */
        private final String f66659d;

        /* renamed from: e */
        private final C26308c f66660e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C26306a(p891su.C28261a r8, double r9, double r11, java.lang.String r13, p832mv.C26305b.C26308c r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
            /*
                r7 = this;
                r0 = r15 & 2
                r1 = 0
                if (r0 == 0) goto L_0x0008
                r3 = r1
                goto L_0x0009
            L_0x0008:
                r3 = r9
            L_0x0009:
                r0 = r15 & 4
                if (r0 == 0) goto L_0x000e
                goto L_0x000f
            L_0x000e:
                r1 = r11
            L_0x000f:
                r0 = r15 & 8
                if (r0 == 0) goto L_0x001c
                long r5 = r8.mo67857m()
                java.lang.String r0 = java.lang.String.valueOf(r5)
                goto L_0x001d
            L_0x001c:
                r0 = r13
            L_0x001d:
                r5 = r15 & 16
                if (r5 == 0) goto L_0x0024
                mv.b$c r5 = p832mv.C26305b.C26308c.ACTIVE
                goto L_0x0025
            L_0x0024:
                r5 = r14
            L_0x0025:
                r9 = r7
                r10 = r8
                r11 = r3
                r13 = r1
                r15 = r0
                r16 = r5
                r9.<init>(r10, r11, r13, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p832mv.C26305b.C26306a.<init>(su.a, double, double, java.lang.String, mv.b$c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: g */
        public static /* synthetic */ C26306a m82270g(C26306a aVar, C28261a aVar2, double d, double d2, String str, C26308c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.f66656a;
            }
            if ((i & 2) != 0) {
                d = aVar.f66657b;
            }
            double d3 = d;
            if ((i & 4) != 0) {
                d2 = aVar.f66658c;
            }
            double d4 = d2;
            if ((i & 8) != 0) {
                str = aVar.f66659d;
            }
            String str2 = str;
            if ((i & 16) != 0) {
                cVar = aVar.f66660e;
            }
            return aVar.mo65476f(aVar2, d3, d4, str2, cVar);
        }

        /* renamed from: a */
        public String mo65470a() {
            return this.f66659d;
        }

        /* renamed from: c */
        public double mo65472c() {
            return this.f66657b;
        }

        /* renamed from: d */
        public C26308c mo65473d() {
            return this.f66660e;
        }

        /* renamed from: e */
        public double mo65474e() {
            return this.f66658c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26306a)) {
                return false;
            }
            C26306a aVar = (C26306a) obj;
            return C41536l.m120484d(this.f66656a, aVar.f66656a) && Double.compare(this.f66657b, aVar.f66657b) == 0 && Double.compare(this.f66658c, aVar.f66658c) == 0 && C41536l.m120484d(this.f66659d, aVar.f66659d) && this.f66660e == aVar.f66660e;
        }

        /* renamed from: f */
        public final C26306a mo65476f(C28261a aVar, double d, double d2, String str, C26308c cVar) {
            C41536l.m120489i(aVar, "contact");
            C41536l.m120489i(str, "receiverId");
            C26308c cVar2 = cVar;
            C41536l.m120489i(cVar2, "status");
            return new C26306a(aVar, d, d2, str, cVar2);
        }

        /* renamed from: h */
        public final C28261a mo65477h() {
            return this.f66656a;
        }

        public int hashCode() {
            return (((((((this.f66656a.hashCode() * 31) + Double.doubleToLongBits(this.f66657b)) * 31) + Double.doubleToLongBits(this.f66658c)) * 31) + this.f66659d.hashCode()) * 31) + this.f66660e.hashCode();
        }

        public String toString() {
            C28261a aVar = this.f66656a;
            double d = this.f66657b;
            double d2 = this.f66658c;
            String str = this.f66659d;
            C26308c cVar = this.f66660e;
            return "ExistingContact(contact=" + aVar + ", requestedAmount=" + d + ", transferredAmount=" + d2 + ", receiverId=" + str + ", status=" + cVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26306a(C28261a aVar, double d, double d2, String str, C26308c cVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "contact");
            C41536l.m120489i(str, "receiverId");
            C41536l.m120489i(cVar, "status");
            this.f66656a = aVar;
            this.f66657b = d;
            this.f66658c = d2;
            this.f66659d = str;
            this.f66660e = cVar;
        }
    }
}
