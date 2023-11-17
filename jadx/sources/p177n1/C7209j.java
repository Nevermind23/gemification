package p177n1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.C2073m;
import kotlin.jvm.internal.C41536l;
import p151l1.C6862b;
import p203p1.C7650n;
import p203p1.C7653q;
import p216q1.C7819c;

/* renamed from: n1.j */
public final class C7209j extends C7207h {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ConnectivityManager f21374f;

    /* renamed from: g */
    private final C7210a f21375g = new C7210a(this);

    /* renamed from: n1.j$a */
    public static final class C7210a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final /* synthetic */ C7209j f21376a;

        C7210a(C7209j jVar) {
            this.f21376a = jVar;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C41536l.m120489i(network, "network");
            C41536l.m120489i(networkCapabilities, "capabilities");
            C2073m e = C2073m.m8071e();
            String b = C7211k.f21377a;
            e.mo6959a(b, "Network capabilities changed: " + networkCapabilities);
            C7209j jVar = this.f21376a;
            jVar.mo21574g(C7211k.m27766c(jVar.f21374f));
        }

        public void onLost(Network network) {
            C41536l.m120489i(network, "network");
            C2073m.m8071e().mo6959a(C7211k.f21377a, "Network connection lost");
            C7209j jVar = this.f21376a;
            jVar.mo21574g(C7211k.m27766c(jVar.f21374f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7209j(Context context, C7819c cVar) {
        super(context, cVar);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "taskExecutor");
        Object systemService = mo21572d().getSystemService("connectivity");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f21374f = (ConnectivityManager) systemService;
    }

    /* renamed from: h */
    public void mo21567h() {
        try {
            C2073m.m8071e().mo6959a(C7211k.f21377a, "Registering network callback");
            C7653q.m29094a(this.f21374f, this.f21375g);
        } catch (IllegalArgumentException e) {
            C2073m.m8071e().mo6962d(C7211k.f21377a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            C2073m.m8071e().mo6962d(C7211k.f21377a, "Received exception while registering network callback", e2);
        }
    }

    /* renamed from: i */
    public void mo21568i() {
        try {
            C2073m.m8071e().mo6959a(C7211k.f21377a, "Unregistering network callback");
            C7650n.m29091c(this.f21374f, this.f21375g);
        } catch (IllegalArgumentException e) {
            C2073m.m8071e().mo6962d(C7211k.f21377a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            C2073m.m8071e().mo6962d(C7211k.f21377a, "Received exception while unregistering network callback", e2);
        }
    }

    /* renamed from: k */
    public C6862b mo21562e() {
        return C7211k.m27766c(this.f21374f);
    }
}
