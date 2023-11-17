package com.salesforce.marketingcloud.sfmcsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cf1.C40419j;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorType;
import kotlin.jvm.internal.C41536l;

public final class SFMCSdkReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        BehaviorType fromString;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        String str = action;
        if (!C40439w.m117118v(str)) {
            String D = C40439w.m117105D(str, C41536l.m120497q(context.getApplicationContext().getPackageName(), new C40419j(".")), "", false, 4, (Object) null);
            if (C41536l.m120484d(D, "android.intent.action.MY_PACKAGE_REPLACED") && (fromString = BehaviorType.Companion.fromString(D)) != null) {
                SFMCSdkJobIntentService.Companion.enqueueSystemBehavior(context, fromString, intent.getExtras());
            }
        }
    }
}
