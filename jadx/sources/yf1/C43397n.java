package yf1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf1.C43286k;

/* renamed from: yf1.n */
public final class C43397n extends C43383h {

    /* renamed from: j */
    public static final C43398a f101243j = new C43398a((DefaultConstructorMarker) null);

    /* renamed from: h */
    private final Class f101244h;

    /* renamed from: i */
    private final Class f101245i;

    /* renamed from: yf1.n$a */
    public static final class C43398a {
        private C43398a() {
        }

        public /* synthetic */ C43398a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C43396m m124496b(C43398a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.mo102073a(str);
        }

        /* renamed from: a */
        public final C43396m mo102073a(String str) {
            C41536l.m120489i(str, "packageName");
            try {
                Class<?> cls = Class.forName(C41536l.m120497q(str, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(C41536l.m120497q(str, ".OpenSSLSocketFactoryImpl"));
                Class<?> cls3 = Class.forName(C41536l.m120497q(str, ".SSLParametersImpl"));
                C41536l.m120488h(cls3, "paramsClass");
                return new C43397n(cls, cls2, cls3);
            } catch (Exception e) {
                C43286k.f101052a.mo101988g().mo101984j("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43397n(Class cls, Class cls2, Class cls3) {
        super(cls);
        C41536l.m120489i(cls, "sslSocketClass");
        C41536l.m120489i(cls2, "sslSocketFactoryClass");
        C41536l.m120489i(cls3, "paramClass");
        this.f101244h = cls2;
        this.f101245i = cls3;
    }
}
