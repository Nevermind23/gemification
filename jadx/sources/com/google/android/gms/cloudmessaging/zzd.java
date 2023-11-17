package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C3833a();

    /* renamed from: d */
    Messenger f12229d;

    public zzd(IBinder iBinder) {
        this.f12229d = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo11847a() {
        Messenger messenger = this.f12229d;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* renamed from: b */
    public final void mo11848b(Message message) {
        Messenger messenger = this.f12229d;
        messenger.getClass();
        messenger.send(message);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo11847a().equals(((zzd) obj).mo11847a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return mo11847a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f12229d;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
