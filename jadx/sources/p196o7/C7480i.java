package p196o7;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p209p7.C7737e;

/* renamed from: o7.i */
public final class C7480i {

    /* renamed from: a */
    private final C7737e f21789a;

    C7480i(C7737e eVar) {
        this.f21789a = eVar;
    }

    /* renamed from: a */
    public void mo21897a(boolean z) {
        try {
            this.f21789a.mo22511B0(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public void mo21898b(boolean z) {
        try {
            this.f21789a.mo22512I(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public void mo21899c(boolean z) {
        try {
            this.f21789a.mo22513S1(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
