package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C1583g0;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1599j0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1631s;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.savedstate.C1846a;
import p163m0.C7047a;
import p163m0.C7052d;
import p306x0.C8931c;
import p306x0.C8933d;

/* renamed from: androidx.fragment.app.i0 */
class C1512i0 implements C1591i, C8933d, C1638u0 {

    /* renamed from: d */
    private final Fragment f4422d;

    /* renamed from: e */
    private final C1636t0 f4423e;

    /* renamed from: f */
    private C1620q0.C1624b f4424f;

    /* renamed from: g */
    private C1631s f4425g = null;

    /* renamed from: h */
    private C8931c f4426h = null;

    C1512i0(Fragment fragment, C1636t0 t0Var) {
        this.f4422d = fragment;
        this.f4423e = t0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4710a(C1593j.C1594a aVar) {
        this.f4425g.mo4941i(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4711b() {
        if (this.f4425g == null) {
            this.f4425g = new C1631s(this);
            C8931c a = C8931c.m33145a(this);
            this.f4426h = a;
            a.mo24349c();
            C1583g0.m5614c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4712c() {
        return this.f4425g != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4713d(Bundle bundle) {
        this.f4426h.mo24350d(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4714e(Bundle bundle) {
        this.f4426h.mo24351e(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4715f(C1593j.C1598b bVar) {
        this.f4425g.mo4943o(bVar);
    }

    public C7047a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f4422d.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        C7052d dVar = new C7052d();
        if (application != null) {
            dVar.mo21274c(C1620q0.C1621a.f4641g, application);
        }
        dVar.mo21274c(C1583g0.f4589a, this);
        dVar.mo21274c(C1583g0.f4590b, this);
        if (this.f4422d.getArguments() != null) {
            dVar.mo21274c(C1583g0.f4591c, this.f4422d.getArguments());
        }
        return dVar;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        Application application;
        C1620q0.C1624b defaultViewModelProviderFactory = this.f4422d.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f4422d.mDefaultFactory)) {
            this.f4424f = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f4424f == null) {
            Context applicationContext = this.f4422d.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f4424f = new C1599j0(application, this, this.f4422d.getArguments());
        }
        return this.f4424f;
    }

    public C1593j getLifecycle() {
        mo4711b();
        return this.f4425g;
    }

    public C1846a getSavedStateRegistry() {
        mo4711b();
        return this.f4426h.mo24348b();
    }

    public C1636t0 getViewModelStore() {
        mo4711b();
        return this.f4423e;
    }
}
