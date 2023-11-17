package p183n7;

import android.app.PendingIntent;
import com.google.android.gms.internal.location.C4081i;
import com.google.android.gms.location.GeofencingRequest;
import p156l6.C6948j;
import p337z7.C9227g;

/* renamed from: n7.q */
public final /* synthetic */ class C7328q implements C6948j {

    /* renamed from: a */
    public final /* synthetic */ GeofencingRequest f21519a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f21520b;

    public /* synthetic */ C7328q(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.f21519a = geofencingRequest;
        this.f21520b = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ((C4081i) obj).mo12805v0(this.f21519a, this.f21520b, new C7332s((C9227g) obj2));
    }
}
