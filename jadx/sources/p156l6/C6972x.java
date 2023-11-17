package p156l6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: l6.x */
public final class C6972x extends BroadcastReceiver {

    /* renamed from: a */
    Context f20847a;

    /* renamed from: b */
    private final C6971w f20848b;

    public C6972x(C6971w wVar) {
        this.f20848b = wVar;
    }

    /* renamed from: a */
    public final void mo21105a(Context context) {
        this.f20847a = context;
    }

    /* renamed from: b */
    public final synchronized void mo21106b() {
        Context context = this.f20847a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f20847a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f20848b.mo12062a();
            mo21106b();
        }
    }
}
