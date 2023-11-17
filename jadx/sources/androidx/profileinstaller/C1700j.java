package androidx.profileinstaller;

import android.content.Context;

/* renamed from: androidx.profileinstaller.j */
public final /* synthetic */ class C1700j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProfileInstallerInitializer f4950d;

    /* renamed from: e */
    public final /* synthetic */ Context f4951e;

    public /* synthetic */ C1700j(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f4950d = profileInstallerInitializer;
        this.f4951e = context;
    }

    public final void run() {
        this.f4950d.m5889i(this.f4951e);
    }
}
