package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;
import p516mf.C16681a;
import p586rf.C17608d;
import p627uf.C18154b;
import p627uf.C18156d;

/* renamed from: dagger.hilt.android.internal.managers.h */
public final class C12068h implements C18154b {

    /* renamed from: d */
    private final Service f35470d;

    /* renamed from: e */
    private Object f35471e;

    /* renamed from: dagger.hilt.android.internal.managers.h$a */
    public interface C12069a {
        /* renamed from: d */
        C17608d mo32193d();
    }

    public C12068h(Service service) {
        this.f35470d = service;
    }

    /* renamed from: a */
    private Object m44271a() {
        Application application = this.f35470d.getApplication();
        C18156d.m62249d(application instanceof C18154b, "Hilt service must be attached to an @AndroidEntryPoint Application. Found: %s", application.getClass());
        return ((C12069a) C16681a.m59022a(application, C12069a.class)).mo32193d().mo32846b(this.f35470d).mo32845a();
    }

    public Object generatedComponent() {
        if (this.f35471e == null) {
            this.f35471e = m44271a();
        }
        return this.f35471e;
    }
}
