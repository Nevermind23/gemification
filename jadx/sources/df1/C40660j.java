package df1;

import df1.C40649a;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: df1.j */
public interface C40660j {

    /* renamed from: df1.j$a */
    public static final class C40661a implements C40660j {

        /* renamed from: a */
        public static final C40661a f96294a = new C40661a();

        /* renamed from: df1.j$a$a */
        public static final class C40662a implements C40649a {

            /* renamed from: d */
            private final long f96295d;

            private /* synthetic */ C40662a(long j) {
                this.f96295d = j;
            }

            /* renamed from: a */
            public static final /* synthetic */ C40662a m117525a(long j) {
                return new C40662a(j);
            }

            /* renamed from: c */
            public static long m117526c(long j) {
                return j;
            }

            /* renamed from: e */
            public static boolean m117527e(long j, Object obj) {
                return (obj instanceof C40662a) && j == ((C40662a) obj).mo94658l();
            }

            /* renamed from: f */
            public static int m117528f(long j) {
                return C7397t.m28148a(j);
            }

            /* renamed from: g */
            public static final long m117529g(long j, long j2) {
                return C40658h.f96292a.mo94649b(j, j2);
            }

            /* renamed from: h */
            public static long m117530h(long j, C40649a aVar) {
                C41536l.m120489i(aVar, "other");
                if (aVar instanceof C40662a) {
                    return m117529g(j, ((C40662a) aVar).mo94658l());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + m117531j(j) + " and " + aVar);
            }

            /* renamed from: j */
            public static String m117531j(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            /* renamed from: b */
            public int compareTo(C40649a aVar) {
                return C40649a.C40650a.m117465a(this, aVar);
            }

            /* renamed from: d */
            public long mo94645d(C40649a aVar) {
                C41536l.m120489i(aVar, "other");
                return m117530h(this.f96295d, aVar);
            }

            public boolean equals(Object obj) {
                return m117527e(this.f96295d, obj);
            }

            public int hashCode() {
                return m117528f(this.f96295d);
            }

            /* renamed from: l */
            public final /* synthetic */ long mo94658l() {
                return this.f96295d;
            }

            public String toString() {
                return m117531j(this.f96295d);
            }
        }

        private C40661a() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C40659i mo94648a() {
            return C40662a.m117525a(mo94652b());
        }

        /* renamed from: b */
        public long mo94652b() {
            return C40658h.f96292a.mo94650c();
        }

        public String toString() {
            return C40658h.f96292a.toString();
        }
    }

    /* renamed from: a */
    C40659i mo94648a();
}
