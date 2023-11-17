package e11;

import androidx.concurrent.futures.C0612c;
import p337z7.C9221d;
import p341ge.bog.mobilebank.services.datagathering.LocationWifiDataReportWorker;

/* renamed from: e11.e */
public final /* synthetic */ class C31647e implements C9221d {

    /* renamed from: a */
    public final /* synthetic */ LocationWifiDataReportWorker f78236a;

    /* renamed from: b */
    public final /* synthetic */ C0612c.C0613a f78237b;

    public /* synthetic */ C31647e(LocationWifiDataReportWorker locationWifiDataReportWorker, C0612c.C0613a aVar) {
        this.f78236a = locationWifiDataReportWorker;
        this.f78237b = aVar;
    }

    public final void onFailure(Exception exc) {
        this.f78236a.m101401n(this.f78237b, exc);
    }
}
