package p183n7;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import p156l6.C6933c;
import p337z7.C9227g;

/* renamed from: n7.h0 */
final class C7311h0 implements C6933c {

    /* renamed from: a */
    private final C9227g f21513a;

    public C7311h0(C9227g gVar) {
        this.f21513a = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19853a(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.getStatus();
        if (status.mo11905q0()) {
            this.f21513a.mo24885c(new C7312i(locationSettingsResult));
        } else if (status.mo11901f0()) {
            this.f21513a.mo24884b(new ResolvableApiException(status));
        } else {
            this.f21513a.mo24884b(new ApiException(status));
        }
    }
}
