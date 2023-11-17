package p858pr;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p349ah.C9860d;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: pr.a */
public abstract class C27605a extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f70537B;

    /* renamed from: C */
    private boolean f70538C;

    /* renamed from: D */
    private volatile C12066g f70539D;

    /* renamed from: E */
    private final Object f70540E = new Object();

    /* renamed from: F */
    private boolean f70541F = false;

    private void initializeComponentContext() {
        if (this.f70537B == null) {
            this.f70537B = C12066g.m44266b(super.getContext(), this);
            this.f70538C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f70539D == null) {
            synchronized (this.f70540E) {
                if (this.f70539D == null) {
                    this.f70539D = createComponentManager();
                }
            }
        }
        return this.f70539D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f70538C) {
            return null;
        }
        initializeComponentContext();
        return this.f70537B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f70541F) {
            this.f70541F = true;
            ((C27617g) generatedComponent()).mo32672a0((C27612f) C18157e.m62250a(this));
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C12066g.m44267c(onGetLayoutInflater, this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f70537B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
