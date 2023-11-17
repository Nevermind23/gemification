package ag1;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf1.C43286k;

/* renamed from: ag1.c */
public abstract class C40309c {

    /* renamed from: a */
    public static final C40310a f95766a = new C40310a((DefaultConstructorMarker) null);

    /* renamed from: ag1.c$a */
    public static final class C40310a {
        private C40310a() {
        }

        public /* synthetic */ C40310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40309c mo94340a(X509TrustManager x509TrustManager) {
            C41536l.m120489i(x509TrustManager, "trustManager");
            return C43286k.f101052a.mo101988g().mo101952c(x509TrustManager);
        }
    }

    /* renamed from: a */
    public abstract List mo94334a(List list, String str);
}
