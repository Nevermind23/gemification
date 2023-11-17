package xf1;

import ag1.C40309c;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf1.C43376c;
import yf1.C43378d;
import yf1.C43383h;
import yf1.C43386i;
import yf1.C43391k;
import yf1.C43394l;
import yf1.C43396m;

/* renamed from: xf1.b */
public final class C43267b extends C43286k {

    /* renamed from: e */
    public static final C43268a f101022e = new C43268a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f101023f;

    /* renamed from: d */
    private final List f101024d;

    /* renamed from: xf1.b$a */
    public static final class C43268a {
        private C43268a() {
        }

        public /* synthetic */ C43268a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43286k mo101956a() {
            if (mo101957b()) {
                return new C43267b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo101957b() {
            return C43267b.f101023f;
        }
    }

    static {
        boolean z;
        if (!C43286k.f101052a.mo101989h() || Build.VERSION.SDK_INT < 29) {
            z = false;
        } else {
            z = true;
        }
        f101023f = z;
    }

    public C43267b() {
        List o = C41341q.m119912o(C43376c.f101217a.mo102054a(), new C43394l(C43383h.f101225f.mo102065d()), new C43394l(C43391k.f101239a.mo102072a()), new C43394l(C43386i.f101233a.mo102068a()));
        ArrayList arrayList = new ArrayList();
        for (Object next : o) {
            if (((C43396m) next).mo102050a()) {
                arrayList.add(next);
            }
        }
        this.f101024d = arrayList;
    }

    /* renamed from: c */
    public C40309c mo101952c(X509TrustManager x509TrustManager) {
        C41536l.m120489i(x509TrustManager, "trustManager");
        C43378d a = C43378d.f101218d.mo102058a(x509TrustManager);
        if (a == null) {
            return super.mo101952c(x509TrustManager);
        }
        return a;
    }

    /* renamed from: e */
    public void mo101953e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41536l.m120489i(list, "protocols");
        Iterator it = this.f101024d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C43396m) obj).mo102051b(sSLSocket)) {
                break;
            }
        }
        C43396m mVar = (C43396m) obj;
        if (mVar != null) {
            mVar.mo102053d(sSLSocket, str, list);
        }
    }

    /* renamed from: g */
    public String mo101954g(SSLSocket sSLSocket) {
        Object obj;
        C41536l.m120489i(sSLSocket, "sslSocket");
        Iterator it = this.f101024d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C43396m) obj).mo102051b(sSLSocket)) {
                break;
            }
        }
        C43396m mVar = (C43396m) obj;
        if (mVar == null) {
            return null;
        }
        return mVar.mo102052c(sSLSocket);
    }

    /* renamed from: i */
    public boolean mo101955i(String str) {
        C41536l.m120489i(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
