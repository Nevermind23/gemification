package p117i6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: i6.f */
public final /* synthetic */ class C6577f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C6572a f20080d;

    /* renamed from: e */
    public final /* synthetic */ Intent f20081e;

    /* renamed from: f */
    public final /* synthetic */ Context f20082f;

    /* renamed from: g */
    public final /* synthetic */ boolean f20083g;

    /* renamed from: h */
    public final /* synthetic */ BroadcastReceiver.PendingResult f20084h;

    public /* synthetic */ C6577f(C6572a aVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f20080d = aVar;
        this.f20081e = intent;
        this.f20082f = context;
        this.f20083g = z;
        this.f20084h = pendingResult;
    }

    public final void run() {
        this.f20080d.mo20566d(this.f20081e, this.f20082f, this.f20083g, this.f20084h);
    }
}
