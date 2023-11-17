package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.engine.u */
class C2481u {

    /* renamed from: a */
    private boolean f7888a;

    /* renamed from: b */
    private final Handler f7889b = new Handler(Looper.getMainLooper(), new C2482a());

    /* renamed from: com.bumptech.glide.load.engine.u$a */
    private static final class C2482a implements Handler.Callback {
        C2482a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C7430c) message.obj).recycle();
            return true;
        }
    }

    C2481u() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo7958a(C7430c cVar, boolean z) {
        if (!this.f7888a) {
            if (!z) {
                this.f7888a = true;
                cVar.recycle();
                this.f7888a = false;
            }
        }
        this.f7889b.obtainMessage(1, cVar).sendToTarget();
    }
}
