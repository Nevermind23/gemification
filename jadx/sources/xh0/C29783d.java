package xh0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xh0.d */
public abstract class C29783d {

    /* renamed from: b */
    public static final C29785b f75335b = new C29785b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f75336a;

    /* renamed from: xh0.d$a */
    public static final class C29784a extends C29783d {

        /* renamed from: c */
        public static final C29784a f75337c = new C29784a();

        private C29784a() {
            super("ANIMATION", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: xh0.d$b */
    public static final class C29785b {
        private C29785b() {
        }

        public /* synthetic */ C29785b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29783d mo69962a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            C29786c cVar = C29786c.f75338c;
            if (C41536l.m120484d(str, cVar.mo69961a())) {
                return cVar;
            }
            C29784a aVar = C29784a.f75337c;
            if (C41536l.m120484d(str, aVar.mo69961a())) {
                return aVar;
            }
            return new C29787d(str);
        }
    }

    /* renamed from: xh0.d$c */
    public static final class C29786c extends C29783d {

        /* renamed from: c */
        public static final C29786c f75338c = new C29786c();

        private C29786c() {
            super("GYROSCOPE", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: xh0.d$d */
    public static final class C29787d extends C29783d {

        /* renamed from: c */
        private final String f75339c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29787d(String str) {
            super(str, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            this.f75339c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29787d) && C41536l.m120484d(this.f75339c, ((C29787d) obj).f75339c);
        }

        public int hashCode() {
            return this.f75339c.hashCode();
        }

        public String toString() {
            String str = this.f75339c;
            return "Unknown(value=" + str + ")";
        }
    }

    public /* synthetic */ C29783d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public String mo69961a() {
        return this.f75336a;
    }

    private C29783d(String str) {
        this.f75336a = str;
    }
}
