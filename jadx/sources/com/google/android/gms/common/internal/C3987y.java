package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p092g7.C6254e;
import p182n6.C7264i;
import p182n6.C7278o0;
import p182n6.C7282q0;
import p247s6.C8242b;

/* renamed from: com.google.android.gms.common.internal.y */
final class C3987y extends C3965d {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashMap f12711f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f12712g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile Handler f12713h;

    /* renamed from: i */
    private final C3986x f12714i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C8242b f12715j;

    /* renamed from: k */
    private final long f12716k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f12717l;

    /* renamed from: m */
    private volatile Executor f12718m;

    C3987y(Context context, Looper looper, Executor executor) {
        C3986x xVar = new C3986x(this, (C7282q0) null);
        this.f12714i = xVar;
        this.f12712g = context.getApplicationContext();
        this.f12713h = new C6254e(looper, xVar);
        this.f12715j = C8242b.m31044b();
        this.f12716k = 5000;
        this.f12717l = 300000;
        this.f12718m = executor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo12261c(C7278o0 o0Var, ServiceConnection serviceConnection, String str) {
        C7264i.m27903l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f12711f) {
            C3985w wVar = (C3985w) this.f12711f.get(o0Var);
            if (wVar == null) {
                String obj = o0Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (wVar.mo12301h(serviceConnection)) {
                wVar.mo12299f(serviceConnection, str);
                if (wVar.mo12302i()) {
                    this.f12713h.sendMessageDelayed(this.f12713h.obtainMessage(0, o0Var), this.f12716k);
                }
            } else {
                String obj2 = o0Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo12263e(C7278o0 o0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        C7264i.m27903l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f12711f) {
            C3985w wVar = (C3985w) this.f12711f.get(o0Var);
            if (executor == null) {
                executor = this.f12718m;
            }
            if (wVar == null) {
                wVar = new C3985w(this, o0Var);
                wVar.mo12297d(serviceConnection, serviceConnection, str);
                wVar.mo12298e(str, executor);
                this.f12711f.put(o0Var, wVar);
            } else {
                this.f12713h.removeMessages(0, o0Var);
                if (!wVar.mo12301h(serviceConnection)) {
                    wVar.mo12297d(serviceConnection, serviceConnection, str);
                    int a = wVar.mo12294a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(wVar.mo12295b(), wVar.mo12296c());
                    } else if (a == 2) {
                        wVar.mo12298e(str, executor);
                    }
                } else {
                    String obj = o0Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j = wVar.mo12303j();
        }
        return j;
    }
}
