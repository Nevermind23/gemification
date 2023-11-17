package e11;

import android.content.Context;
import androidx.work.WorkerParameters;
import p341ge.bog.mobilebank.services.datagathering.LocationWifiDataReportWorker;

/* renamed from: e11.f */
public abstract class C31648f {
    /* renamed from: a */
    public static LocationWifiDataReportWorker m93777a(Context context, WorkerParameters workerParameters) {
        return new LocationWifiDataReportWorker(context, workerParameters);
    }
}
