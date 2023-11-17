package p341ge.bog.mobilebank.services.datagathering;

import android.content.Context;
import androidx.concurrent.futures.C0612c;
import androidx.work.C2068l;
import androidx.work.WorkerParameters;
import e11.C31643a;
import g91.C32330r0;
import p262t8.C8421a;
import p341ge.bog.mobilebank.model.datareport.DeviceDataReport;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ge.bog.mobilebank.services.datagathering.BaseDataReportWorker */
public abstract class BaseDataReportWorker extends C2068l {

    /* renamed from: f */
    BankApi f83530f;

    /* renamed from: g */
    PreferencesApiManager f83531g;

    /* renamed from: ge.bog.mobilebank.services.datagathering.BaseDataReportWorker$a */
    class C34568a extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ DeviceDataReport f83532a;

        /* renamed from: b */
        final /* synthetic */ String f83533b;

        /* renamed from: c */
        final /* synthetic */ C0612c.C0613a f83534c;

        C34568a(DeviceDataReport deviceDataReport, String str, C0612c.C0613a aVar) {
            this.f83532a = deviceDataReport;
            this.f83533b = str;
            this.f83534c = aVar;
        }

        public void onFailure(Throwable th) {
            this.f83534c.mo2832d(th);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (bankApiResponse.isSuccess()) {
                BaseDataReportWorker.this.f83531g.setDataReportTime(this.f83533b, this.f83532a.getCalculationEndDate() != -1 ? this.f83532a.getCalculationEndDate() : System.currentTimeMillis());
            }
            this.f83534c.mo2831b(C2068l.C2069a.m8067c());
        }
    }

    public BaseDataReportWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m101390d(DeviceDataReport deviceDataReport, String str, C0612c.C0613a aVar) {
        mo84080e(deviceDataReport, str, aVar);
        return deviceDataReport;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo84079c(String str) {
        return C32330r0.m95338m(getApplicationContext(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo84080e(DeviceDataReport deviceDataReport, String str, C0612c.C0613a aVar) {
        this.f83530f.loadMobileData(deviceDataReport, new C34568a(deviceDataReport, str, aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C8421a mo84081g(DeviceDataReport deviceDataReport, String str) {
        return C0612c.m2367a(new C31643a(this, deviceDataReport, str));
    }
}
