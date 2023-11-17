package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.android.gms.cloudmessaging.i */
final class C3841i {

    /* renamed from: a */
    private final Messenger f12218a;

    /* renamed from: b */
    private final zzd f12219b;

    C3841i(IBinder iBinder) {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f12218a = new Messenger(iBinder);
            this.f12219b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f12219b = new zzd(iBinder);
            this.f12218a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11839a(Message message) {
        Messenger messenger = this.f12218a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzd = this.f12219b;
        if (zzd != null) {
            zzd.mo11848b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
