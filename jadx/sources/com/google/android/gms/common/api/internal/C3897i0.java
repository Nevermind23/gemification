package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p066e7.C6047k;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
final class C3897i0 extends C6047k {

    /* renamed from: a */
    final /* synthetic */ C3900j0 f12439a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3897i0(C3900j0 j0Var, Looper looper) {
        super(looper);
        this.f12439a = j0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C3894h0) message.obj).mo12083b(this.f12439a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
