package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import p182n6.C7264i;
import p182n6.C7278o0;
import p182n6.C7282q0;

/* renamed from: com.google.android.gms.common.internal.x */
final class C3986x implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C3987y f12710a;

    /* synthetic */ C3986x(C3987y yVar, C7282q0 q0Var) {
        this.f12710a = yVar;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f12710a.f12711f) {
                C7278o0 o0Var = (C7278o0) message.obj;
                C3985w wVar = (C3985w) this.f12710a.f12711f.get(o0Var);
                if (wVar != null && wVar.mo12302i()) {
                    if (wVar.mo12303j()) {
                        wVar.mo12300g("GmsClientSupervisor");
                    }
                    this.f12710a.f12711f.remove(o0Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f12710a.f12711f) {
                C7278o0 o0Var2 = (C7278o0) message.obj;
                C3985w wVar2 = (C3985w) this.f12710a.f12711f.get(o0Var2);
                if (wVar2 != null && wVar2.mo12294a() == 3) {
                    String valueOf = String.valueOf(o0Var2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName b = wVar2.mo12295b();
                    if (b == null) {
                        b = o0Var2.mo21652a();
                    }
                    if (b == null) {
                        String c = o0Var2.mo21654c();
                        C7264i.m27902k(c);
                        b = new ComponentName(c, C11651j.f33767h);
                    }
                    wVar2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
