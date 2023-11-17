package p341ge.bog.mobilebank.sync;

import android.app.Service;
import dagger.hilt.android.internal.managers.C12068h;
import p627uf.C18155c;
import p627uf.C18157e;
import q61.C38133a;

/* renamed from: ge.bog.mobilebank.sync.e */
abstract class C34844e extends Service implements C18155c {

    /* renamed from: d */
    private volatile C12068h f84117d;

    /* renamed from: e */
    private final Object f84118e = new Object();

    /* renamed from: f */
    private boolean f84119f = false;

    C34844e() {
    }

    /* renamed from: a */
    public final C12068h mo85112a() {
        if (this.f84117d == null) {
            synchronized (this.f84118e) {
                if (this.f84117d == null) {
                    this.f84117d = mo85113b();
                }
            }
        }
        return this.f84117d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12068h mo85113b() {
        return new C12068h(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo85114c() {
        if (!this.f84119f) {
            this.f84119f = true;
            ((C38133a) generatedComponent()).mo32850b((CommonDataSyncService) C18157e.m62250a(this));
        }
    }

    public final Object generatedComponent() {
        return mo85112a().generatedComponent();
    }

    public void onCreate() {
        mo85114c();
        super.onCreate();
    }
}
