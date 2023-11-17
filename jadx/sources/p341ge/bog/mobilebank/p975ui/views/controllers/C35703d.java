package p341ge.bog.mobilebank.p975ui.views.controllers;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.views.controllers.d */
abstract class C35703d extends FrameLayout implements C18155c {
    private ViewComponentManager componentManager;
    private boolean injected;

    C35703d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inject();
    }

    /* access modifiers changed from: protected */
    public ViewComponentManager createComponentManager() {
        return new ViewComponentManager(this, false);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.injected) {
            this.injected = true;
            ((C35701b) generatedComponent()).mo32885a((C35700a) C18157e.m62250a(this));
        }
    }

    public final ViewComponentManager componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }
}
