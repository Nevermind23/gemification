package e11;

import androidx.concurrent.futures.C0612c;
import p341ge.bog.mobilebank.model.datareport.DeviceDataReport;
import p341ge.bog.mobilebank.services.datagathering.BaseDataReportWorker;

/* renamed from: e11.a */
public final /* synthetic */ class C31643a implements C0612c.C0615c {

    /* renamed from: a */
    public final /* synthetic */ BaseDataReportWorker f78230a;

    /* renamed from: b */
    public final /* synthetic */ DeviceDataReport f78231b;

    /* renamed from: c */
    public final /* synthetic */ String f78232c;

    public /* synthetic */ C31643a(BaseDataReportWorker baseDataReportWorker, DeviceDataReport deviceDataReport, String str) {
        this.f78230a = baseDataReportWorker;
        this.f78231b = deviceDataReport;
        this.f78232c = str;
    }

    /* renamed from: a */
    public final Object mo2835a(C0612c.C0613a aVar) {
        return this.f78230a.m101390d(this.f78231b, this.f78232c, aVar);
    }
}
