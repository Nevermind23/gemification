package p117i6;

import android.util.Log;
import java.io.IOException;
import p337z7.C9227g;

/* renamed from: i6.m */
public final /* synthetic */ class C6584m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9227g f20095d;

    public /* synthetic */ C6584m(C9227g gVar) {
        this.f20095d = gVar;
    }

    public final void run() {
        if (this.f20095d.mo24886d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
