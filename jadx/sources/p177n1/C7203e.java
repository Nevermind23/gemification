package p177n1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C2073m;
import kotlin.jvm.internal.C41536l;
import p216q1.C7819c;

/* renamed from: n1.e */
public abstract class C7203e extends C7207h {

    /* renamed from: f */
    private final BroadcastReceiver f21363f = new C7204a(this);

    /* renamed from: n1.e$a */
    public static final class C7204a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C7203e f21364a;

        C7204a(C7203e eVar) {
            this.f21364a = eVar;
        }

        public void onReceive(Context context, Intent intent) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(intent, "intent");
            this.f21364a.mo21564k(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7203e(Context context, C7819c cVar) {
        super(context, cVar);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "taskExecutor");
    }

    /* renamed from: h */
    public void mo21567h() {
        C2073m e = C2073m.m8071e();
        String a = C7205f.f21365a;
        e.mo6959a(a, getClass().getSimpleName() + ": registering receiver");
        mo21572d().registerReceiver(this.f21363f, mo21563j());
    }

    /* renamed from: i */
    public void mo21568i() {
        C2073m e = C2073m.m8071e();
        String a = C7205f.f21365a;
        e.mo6959a(a, getClass().getSimpleName() + ": unregistering receiver");
        mo21572d().unregisterReceiver(this.f21363f);
    }

    /* renamed from: j */
    public abstract IntentFilter mo21563j();

    /* renamed from: k */
    public abstract void mo21564k(Intent intent);
}
