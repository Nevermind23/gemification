package p177n1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.C2073m;
import kotlin.jvm.internal.C41536l;
import p151l1.C6862b;
import p216q1.C7819c;

/* renamed from: n1.l */
public final class C7212l extends C7203e {

    /* renamed from: g */
    private final ConnectivityManager f21378g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7212l(Context context, C7819c cVar) {
        super(context, cVar);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "taskExecutor");
        Object systemService = mo21572d().getSystemService("connectivity");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f21378g = (ConnectivityManager) systemService;
    }

    /* renamed from: j */
    public IntentFilter mo21563j() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    /* renamed from: k */
    public void mo21564k(Intent intent) {
        C41536l.m120489i(intent, "intent");
        if (C41536l.m120484d(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            C2073m.m8071e().mo6959a(C7211k.f21377a, "Network broadcast received");
            mo21574g(C7211k.m27766c(this.f21378g));
        }
    }

    /* renamed from: l */
    public C6862b mo21562e() {
        return C7211k.m27766c(this.f21378g);
    }
}
