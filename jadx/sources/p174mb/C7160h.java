package p174mb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: mb.h */
public final class C7160h {

    /* renamed from: a */
    private final Context f21195a;

    /* renamed from: b */
    private final BroadcastReceiver f21196b;

    /* renamed from: c */
    private boolean f21197c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f21198d;

    /* renamed from: e */
    private Runnable f21199e;

    /* renamed from: f */
    private boolean f21200f;

    /* renamed from: mb.h$b */
    private final class C7162b extends BroadcastReceiver {
        private C7162b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m27553b(boolean z) {
            C7160h.this.m27546f(z);
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C7160h.this.f21198d.post(new C7163i(this, z));
            }
        }
    }

    public C7160h(Context context, Runnable runnable) {
        this.f21195a = context;
        this.f21199e = runnable;
        this.f21196b = new C7162b();
        this.f21198d = new Handler();
    }

    /* renamed from: e */
    private void m27545e() {
        this.f21198d.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m27546f(boolean z) {
        this.f21200f = z;
        if (this.f21197c) {
            mo21423c();
        }
    }

    /* renamed from: g */
    private void m27547g() {
        if (!this.f21197c) {
            this.f21195a.registerReceiver(this.f21196b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f21197c = true;
        }
    }

    /* renamed from: i */
    private void m27548i() {
        if (this.f21197c) {
            this.f21195a.unregisterReceiver(this.f21196b);
            this.f21197c = false;
        }
    }

    /* renamed from: c */
    public void mo21423c() {
        m27545e();
        if (this.f21200f) {
            this.f21198d.postDelayed(this.f21199e, 300000);
        }
    }

    /* renamed from: d */
    public void mo21424d() {
        m27545e();
        m27548i();
    }

    /* renamed from: h */
    public void mo21425h() {
        m27547g();
        mo21423c();
    }
}
