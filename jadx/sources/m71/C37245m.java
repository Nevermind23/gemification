package m71;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment;
import p349ah.C9860d;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: m71.m */
public abstract class C37245m extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f89659B;

    /* renamed from: C */
    private boolean f89660C;

    /* renamed from: D */
    private volatile C12066g f89661D;

    /* renamed from: E */
    private final Object f89662E = new Object();

    /* renamed from: F */
    private boolean f89663F = false;

    private void initializeComponentContext() {
        if (this.f89659B == null) {
            this.f89659B = C12066g.m44266b(super.getContext(), this);
            this.f89660C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f89661D == null) {
            synchronized (this.f89662E) {
                if (this.f89661D == null) {
                    this.f89661D = createComponentManager();
                }
            }
        }
        return this.f89661D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f89660C) {
            return null;
        }
        initializeComponentContext();
        return this.f89659B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f89663F) {
            this.f89663F = true;
            ((C37234b) generatedComponent()).mo32654U((ChooseCardDialogFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f89659B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
