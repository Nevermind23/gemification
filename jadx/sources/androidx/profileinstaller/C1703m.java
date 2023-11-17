package androidx.profileinstaller;

import android.view.Choreographer;

/* renamed from: androidx.profileinstaller.m */
public final /* synthetic */ class C1703m implements Choreographer.FrameCallback {

    /* renamed from: d */
    public final /* synthetic */ Runnable f4954d;

    public /* synthetic */ C1703m(Runnable runnable) {
        this.f4954d = runnable;
    }

    public final void doFrame(long j) {
        this.f4954d.run();
    }
}
