package f61;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f61.f */
public abstract class C31934f {

    /* renamed from: b */
    public static final C31935a f78716b = new C31935a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f78717a;

    /* renamed from: f61.f$a */
    public static final class C31935a {
        private C31935a() {
        }

        public /* synthetic */ C31935a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31934f mo72420a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            C31938d dVar = C31938d.f78720c;
            if (C41536l.m120484d(str, dVar.mo72419a())) {
                return dVar;
            }
            C31937c cVar = C31937c.f78719c;
            if (C41536l.m120484d(str, cVar.mo72419a())) {
                return cVar;
            }
            C31936b bVar = C31936b.f78718c;
            if (C41536l.m120484d(str, bVar.mo72419a())) {
                return bVar;
            }
            return new C31939e(str);
        }
    }

    /* renamed from: f61.f$b */
    public static final class C31936b extends C31934f {

        /* renamed from: c */
        public static final C31936b f78718c = new C31936b();

        private C31936b() {
            super("LIFESTYLE", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: f61.f$c */
    public static final class C31937c extends C31934f {

        /* renamed from: c */
        public static final C31937c f78719c = new C31937c();

        private C31937c() {
            super("MARKETING", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: f61.f$d */
    public static final class C31938d extends C31934f {

        /* renamed from: c */
        public static final C31938d f78720c = new C31938d();

        private C31938d() {
            super("NBO", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: f61.f$e */
    public static final class C31939e extends C31934f {

        /* renamed from: c */
        private final String f78721c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31939e(String str) {
            super(str, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            this.f78721c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31939e) && C41536l.m120484d(this.f78721c, ((C31939e) obj).f78721c);
        }

        public int hashCode() {
            return this.f78721c.hashCode();
        }

        public String toString() {
            String str = this.f78721c;
            return "Unknown(value=" + str + ")";
        }
    }

    public /* synthetic */ C31934f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public String mo72419a() {
        return this.f78717a;
    }

    private C31934f(String str) {
        this.f78717a = str;
    }
}
