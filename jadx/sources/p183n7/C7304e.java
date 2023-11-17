package p183n7;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3857b;
import com.google.android.gms.common.api.internal.C3892h;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;
import p337z7.Task;

/* renamed from: n7.e */
public class C7304e extends C3857b {
    public C7304e(Context context) {
        super(context, C7310h.f21507a, (C3847a.C3851d) C3847a.C3851d.f12268T2, C3857b.C3858a.f12279c);
    }

    /* renamed from: A */
    public Task mo21681A(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return mo11941q(C3892h.m14753a().mo12078b(new C7328q(geofencingRequest.mo13917w(mo11944t()), pendingIntent)).mo12081e(2424).mo12077a());
    }

    /* renamed from: B */
    public Task mo21682B(PendingIntent pendingIntent) {
        return mo11941q(C3892h.m14753a().mo12078b(new C7326p(pendingIntent)).mo12081e(2425).mo12077a());
    }

    /* renamed from: C */
    public Task mo21683C(List list) {
        return mo11941q(C3892h.m14753a().mo12078b(new C7330r(list)).mo12081e(2425).mo12077a());
    }
}
