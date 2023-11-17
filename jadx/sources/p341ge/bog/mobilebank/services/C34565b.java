package p341ge.bog.mobilebank.services;

import android.app.Service;
import d11.C31516c;
import dagger.hilt.android.internal.managers.C12068h;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.services.b */
abstract class C34565b extends Service implements C18155c {

    /* renamed from: d */
    private volatile C12068h f83525d;

    /* renamed from: e */
    private final Object f83526e = new Object();

    /* renamed from: f */
    private boolean f83527f = false;

    C34565b() {
    }

    /* renamed from: a */
    public final C12068h mo84076a() {
        if (this.f83525d == null) {
            synchronized (this.f83526e) {
                if (this.f83525d == null) {
                    this.f83525d = mo84077b();
                }
            }
        }
        return this.f83525d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12068h mo84077b() {
        return new C12068h(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo84078c() {
        if (!this.f83527f) {
            this.f83527f = true;
            ((C31516c) generatedComponent()).mo32849a((C34566c) C18157e.m62250a(this));
        }
    }

    public final Object generatedComponent() {
        return mo84076a().generatedComponent();
    }

    public void onCreate() {
        mo84078c();
        super.onCreate();
    }
}
