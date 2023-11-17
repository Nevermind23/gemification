package p341ge.bog.mobilebank.services.datagathering;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import androidx.work.WorkerParameters;
import j91.C36773a;
import java.util.ArrayList;
import java.util.List;
import p262t8.C8421a;
import p341ge.bog.mobilebank.model.datareport.AppsDataReport;
import p341ge.bog.mobilebank.model.datareport.DeviceDataReport;

/* renamed from: ge.bog.mobilebank.services.datagathering.InstalledAppsDataReportWorker */
public class InstalledAppsDataReportWorker extends BaseDataReportWorker {
    public InstalledAppsDataReportWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: h */
    private List m101394h() {
        PackageManager packageManager = getApplicationContext().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo loadLabel : queryIntentActivities) {
            arrayList.add((String) loadLabel.loadLabel(packageManager));
        }
        return arrayList;
    }

    public C8421a startWork() {
        AppsDataReport appsDataReport = new AppsDataReport();
        appsDataReport.setInstalledAppList(m101394h());
        DeviceDataReport b = new C36773a(getApplicationContext()).mo89650a(appsDataReport).mo89651b();
        Log.d("InstalledAppsInfoReport", ">> DataReport: " + b);
        return mo84081g(b, "INSTALLED_APPS_INFO_REPORT_JOB");
    }
}
