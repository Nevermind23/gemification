package e11;

import android.content.Context;
import androidx.work.WorkerParameters;
import p341ge.bog.mobilebank.services.datagathering.InstalledAppsDataReportWorker;

/* renamed from: e11.b */
public abstract class C31644b {
    /* renamed from: a */
    public static InstalledAppsDataReportWorker m93774a(Context context, WorkerParameters workerParameters) {
        return new InstalledAppsDataReportWorker(context, workerParameters);
    }
}
