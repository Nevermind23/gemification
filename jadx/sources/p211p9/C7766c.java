package p211p9;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.internal.C3964c;
import p182n6.C7249c;
import p211p9.C7772f;
import p211p9.C7774g;

/* renamed from: p9.c */
public class C7766c extends C3964c {
    public C7766c(Context context, Looper looper, C7249c cVar, C3860c.C3862b bVar, C3860c.C3863c cVar2) {
        super(context, looper, 131, cVar, bVar, cVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public String mo7049J() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public String mo7050K() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    /* renamed from: X */
    public boolean mo7051X() {
        return true;
    }

    /* renamed from: q */
    public int mo7053q() {
        return C3943d.f12557a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public C7774g mo7054x(IBinder iBinder) {
        return C7774g.C7775a.m29477k(iBinder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo22526s0(C7772f.C7773a aVar, String str) {
        try {
            ((C7774g) mo12223I()).mo22533j2(aVar, str);
        } catch (RemoteException unused) {
        }
    }
}
