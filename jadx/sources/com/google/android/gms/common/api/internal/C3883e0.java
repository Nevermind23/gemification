package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p066e7.C6047k;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
final class C3883e0 extends C6047k {

    /* renamed from: a */
    final /* synthetic */ C3890g0 f12381a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3883e0(C3890g0 g0Var, Looper looper) {
        super(looper);
        this.f12381a = g0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C3890g0.m14730t(this.f12381a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            C3890g0.m14729s(this.f12381a);
        }
    }
}
