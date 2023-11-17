package p068e9;

import android.os.Process;

/* renamed from: e9.c */
public abstract class C6053c implements Runnable {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19544a();

    public final void run() {
        Process.setThreadPriority(10);
        mo19544a();
    }
}
