package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.p016os.C0916i;
import androidx.work.C2091u;

/* renamed from: androidx.work.impl.d */
public class C2004d implements C2091u {

    /* renamed from: a */
    private final Handler f6026a = C0916i.m3347a(Looper.getMainLooper());

    /* renamed from: a */
    public void mo6810a(Runnable runnable) {
        this.f6026a.removeCallbacks(runnable);
    }

    /* renamed from: b */
    public void mo6811b(long j, Runnable runnable) {
        this.f6026a.postDelayed(runnable, j);
    }
}
