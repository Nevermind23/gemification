package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.cloudmessaging.k */
abstract class C3843k {

    /* renamed from: a */
    final int f12220a;

    /* renamed from: b */
    final C9227g f12221b = new C9227g();

    /* renamed from: c */
    final int f12222c;

    /* renamed from: d */
    final Bundle f12223d;

    C3843k(int i, int i2, Bundle bundle) {
        this.f12220a = i;
        this.f12222c = i2;
        this.f12223d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo11840a(Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo11841b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11842c(zzq zzq) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzq);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f12221b.mo24884b(zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11843d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f12221b.mo24885c(obj);
    }

    public final String toString() {
        int i = this.f12222c;
        int i2 = this.f12220a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo11841b());
        sb.append("}");
        return sb.toString();
    }
}
