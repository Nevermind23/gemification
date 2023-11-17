package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p168m5.C7129p;
import p168m5.C7135u;
import p259t5.C8369a;
import p311x5.C8965a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m13982b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C7135u.m27505f(context);
        C7129p.C7130a d = C7129p.m27484a().mo21361b(queryParameter).mo21363d(C8965a.m33238b(intValue));
        if (queryParameter2 != null) {
            d.mo21362c(Base64.decode(queryParameter2, 0));
        }
        C7135u.m27503c().mo21391e().mo23589v(d.mo21360a(), i, new C8369a());
    }
}
