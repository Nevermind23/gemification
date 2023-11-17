package e11;

import android.location.Location;
import androidx.concurrent.futures.C0612c;
import p337z7.C9223e;
import p341ge.bog.mobilebank.services.datagathering.LocationWifiDataReportWorker;

/* renamed from: e11.d */
public final /* synthetic */ class C31646d implements C9223e {

    /* renamed from: a */
    public final /* synthetic */ LocationWifiDataReportWorker f78234a;

    /* renamed from: b */
    public final /* synthetic */ C0612c.C0613a f78235b;

    public /* synthetic */ C31646d(LocationWifiDataReportWorker locationWifiDataReportWorker, C0612c.C0613a aVar) {
        this.f78234a = locationWifiDataReportWorker;
        this.f78235b = aVar;
    }

    /* renamed from: a */
    public final void mo17635a(Object obj) {
        this.f78234a.m101400m(this.f78235b, (Location) obj);
    }
}
