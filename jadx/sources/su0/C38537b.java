package su0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: su0.b */
public abstract class C38537b {

    /* renamed from: b */
    public static final C38543f f92384b = new C38543f((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f92385a;

    /* renamed from: su0.b$a */
    public static final class C38538a extends C38537b {

        /* renamed from: c */
        public static final C38538a f92386c = new C38538a();

        private C38538a() {
            super("AC", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$b */
    public static final class C38539b extends C38537b {

        /* renamed from: c */
        public static final C38539b f92387c = new C38539b();

        private C38539b() {
            super("BA", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$c */
    public static final class C38540c extends C38537b {

        /* renamed from: c */
        public static final C38540c f92388c = new C38540c();

        private C38540c() {
            super("BE", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$d */
    public static final class C38541d extends C38537b {

        /* renamed from: c */
        public static final C38541d f92389c = new C38541d();

        private C38541d() {
            super("BL", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$e */
    public static final class C38542e extends C38537b {

        /* renamed from: c */
        public static final C38542e f92390c = new C38542e();

        private C38542e() {
            super("CL", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$f */
    public static final class C38543f {
        private C38543f() {
        }

        public /* synthetic */ C38543f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final C38537b[] m113136b() {
            return new C38537b[]{C38556s.f92403c, C38549l.f92396c, C38544g.f92391c, C38553p.f92400c, C38551n.f92398c, C38555r.f92402c, C38538a.f92386c, C38542e.f92390c, C38541d.f92389c, C38546i.f92393c, C38548k.f92395c, C38545h.f92392c, C38540c.f92388c, C38539b.f92387c, C38554q.f92401c, C38550m.f92397c, C38547j.f92394c};
        }

        /* renamed from: a */
        public final C38537b mo92153a(String str) {
            C38537b bVar;
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            C38537b[] b = m113136b();
            int length = b.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = b[i];
                if (C41536l.m120484d(bVar.mo92152a(), str)) {
                    break;
                }
                i++;
            }
            if (bVar == null) {
                return new C38552o(str);
            }
            return bVar;
        }
    }

    /* renamed from: su0.b$g */
    public static final class C38544g extends C38537b {

        /* renamed from: c */
        public static final C38544g f92391c = new C38544g();

        private C38544g() {
            super("DEP_BUNDLE", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$h */
    public static final class C38545h extends C38537b {

        /* renamed from: c */
        public static final C38545h f92392c = new C38545h();

        private C38545h() {
            super("EC", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$i */
    public static final class C38546i extends C38537b {

        /* renamed from: c */
        public static final C38546i f92393c = new C38546i();

        private C38546i() {
            super("EL", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$j */
    public static final class C38547j extends C38537b {

        /* renamed from: c */
        public static final C38547j f92394c = new C38547j();

        private C38547j() {
            super("ENLARG_DEPOSIT", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$k */
    public static final class C38548k extends C38537b {

        /* renamed from: c */
        public static final C38548k f92395c = new C38548k();

        private C38548k() {
            super("EX", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$l */
    public static final class C38549l extends C38537b {

        /* renamed from: c */
        public static final C38549l f92396c = new C38549l();

        private C38549l() {
            super("EXP_LOAN", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$m */
    public static final class C38550m extends C38537b {

        /* renamed from: c */
        public static final C38550m f92397c = new C38550m();

        private C38550m() {
            super("LC", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$n */
    public static final class C38551n extends C38537b {

        /* renamed from: c */
        public static final C38551n f92398c = new C38551n();

        private C38551n() {
            super("ML", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$o */
    public static final class C38552o extends C38537b {

        /* renamed from: c */
        private final String f92399c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38552o(String str) {
            super(str, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            this.f92399c = str;
        }

        /* renamed from: a */
        public String mo92152a() {
            return this.f92399c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38552o) && C41536l.m120484d(this.f92399c, ((C38552o) obj).f92399c);
        }

        public int hashCode() {
            return this.f92399c.hashCode();
        }

        public String toString() {
            String str = this.f92399c;
            return "Other(value=" + str + ")";
        }
    }

    /* renamed from: su0.b$p */
    public static final class C38553p extends C38537b {

        /* renamed from: c */
        public static final C38553p f92400c = new C38553p();

        private C38553p() {
            super("PL", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$q */
    public static final class C38554q extends C38537b {

        /* renamed from: c */
        public static final C38554q f92401c = new C38554q();

        private C38554q() {
            super("RL", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$r */
    public static final class C38555r extends C38537b {

        /* renamed from: c */
        public static final C38555r f92402c = new C38555r();

        private C38555r() {
            super("SL", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.b$s */
    public static final class C38556s extends C38537b {

        /* renamed from: c */
        public static final C38556s f92403c = new C38556s();

        private C38556s() {
            super("SMS_LOAN", (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C38537b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public String mo92152a() {
        return this.f92385a;
    }

    private C38537b(String str) {
        this.f92385a = str;
    }
}
