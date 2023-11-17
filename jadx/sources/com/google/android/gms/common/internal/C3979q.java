package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import p182n6.C7256f;

/* renamed from: com.google.android.gms.common.internal.q */
public final class C3979q implements ServiceConnection {

    /* renamed from: a */
    private final int f12698a;

    /* renamed from: b */
    final /* synthetic */ C3958b f12699b;

    public C3979q(C3958b bVar, int i) {
        this.f12699b = bVar;
        this.f12698a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C7256f fVar;
        C3958b bVar = this.f12699b;
        if (iBinder == null) {
            C3958b.m15018i0(bVar, 16);
            return;
        }
        synchronized (bVar.f12664n) {
            C3958b bVar2 = this.f12699b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C7256f)) {
                fVar = new C3974l(iBinder);
            } else {
                fVar = (C7256f) queryLocalInterface;
            }
            bVar2.f12665o = fVar;
        }
        this.f12699b.mo12245j0(0, (Bundle) null, this.f12698a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f12699b.f12664n) {
            this.f12699b.f12665o = null;
        }
        Handler handler = this.f12699b.f12662l;
        handler.sendMessage(handler.obtainMessage(6, this.f12698a, 1));
    }
}
