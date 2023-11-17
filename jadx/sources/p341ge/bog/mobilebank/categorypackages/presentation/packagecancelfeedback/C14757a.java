package p341ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p540np.C17140e;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.a */
public abstract class C14757a extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f42789d;

    /* renamed from: e */
    private boolean f42790e;

    /* renamed from: f */
    private boolean f42791f = false;

    C14757a() {
    }

    private void initializeComponentContext() {
        if (this.f42789d == null) {
            this.f42789d = C12066g.m44266b(super.getContext(), this);
            this.f42790e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f42790e) {
            return null;
        }
        initializeComponentContext();
        return this.f42789d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f42791f) {
            this.f42791f = true;
            ((C17140e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32665Y((PackageCancelFeedbackFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f42789d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
