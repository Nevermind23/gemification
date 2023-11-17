package pf1;

import java.util.concurrent.ThreadFactory;

/* renamed from: pf1.b */
public final /* synthetic */ class C42195b implements ThreadFactory {

    /* renamed from: d */
    public final /* synthetic */ String f99261d;

    /* renamed from: e */
    public final /* synthetic */ boolean f99262e;

    public /* synthetic */ C42195b(String str, boolean z) {
        this.f99261d = str;
        this.f99262e = z;
    }

    public final Thread newThread(Runnable runnable) {
        return C42197d.m122520N(this.f99261d, this.f99262e, runnable);
    }
}
