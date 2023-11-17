package p165m2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p152l2.C6873f;
import p178n2.C7218c;

/* renamed from: m2.h */
public class C7078h extends Handler {

    /* renamed from: a */
    private final C6873f f21027a;

    public C7078h(C6873f fVar) {
        super(Looper.getMainLooper());
        this.f21027a = fVar;
    }

    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        C6873f fVar = this.f21027a;
        if (fVar != null) {
            C7218c cVar = (C7218c) message.obj;
            fVar.mo20480a(cVar.f21388d, cVar.f21389e);
        }
    }
}
