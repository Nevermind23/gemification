package androidx.activity;

import android.window.OnBackInvokedCallback;

/* renamed from: androidx.activity.o */
public final /* synthetic */ class C0159o implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f1042a;

    public /* synthetic */ C0159o(Runnable runnable) {
        this.f1042a = runnable;
    }

    public final void onBackInvoked() {
        this.f1042a.run();
    }
}
