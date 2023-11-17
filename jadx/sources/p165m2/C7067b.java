package p165m2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p152l2.C6868b;
import p178n2.C7218c;

/* renamed from: m2.b */
public class C7067b extends Handler {

    /* renamed from: a */
    private final C6868b f21005a;

    public C7067b(C6868b bVar) {
        super(Looper.getMainLooper());
        this.f21005a = bVar;
    }

    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        C6868b bVar = this.f21005a;
        if (bVar != null) {
            C7218c cVar = (C7218c) message.obj;
            bVar.mo20479a(cVar.f21388d, cVar.f21389e);
        }
    }
}
