package p157l7;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import p156l6.C6956n;
import p337z7.C9227g;

/* renamed from: l7.d */
final class C6981d extends C6985f {

    /* renamed from: b */
    final /* synthetic */ C9227g f20854b;

    C6981d(C6983e eVar, C9227g gVar) {
        this.f20854b = gVar;
    }

    /* renamed from: k1 */
    public final void mo21122k1(Status status, Bundle bundle) {
        Status status2;
        if (status.mo11901f0()) {
            status2 = Status.f12252j;
        } else {
            status2 = status;
        }
        C6956n.m26963c(status2, status.mo11909w(), this.f20854b);
    }
}
