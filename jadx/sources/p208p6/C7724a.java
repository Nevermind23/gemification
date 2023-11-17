package p208p6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;
import p066e7.C6037a;
import p066e7.C6039c;

/* renamed from: p6.a */
public final class C7724a extends C6037a {
    C7724a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: T1 */
    public final void mo22475T1(TelemetryData telemetryData) {
        Parcel k = mo19527k();
        C6039c.m24167c(k, telemetryData);
        mo19529y(1, k);
    }
}
