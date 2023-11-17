package com.salesforce.marketingcloud.messages.push;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.firebase.C5270e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.messages.push.b */
final class C11691b {

    /* renamed from: a */
    private static final String f33899a = "com.google.android.c2dm.intent.RECEIVE";

    /* renamed from: b */
    private static final String f33900b = "com.google.firebase.INSTANCE_ID_EVENT";

    /* renamed from: c */
    private static final String f33901c = "com.google.firebase.MESSAGING_EVENT";

    private C11691b() {
    }

    /* renamed from: a */
    private static ComponentInfo m42645a(ResolveInfo resolveInfo) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo != null) {
            return activityInfo;
        }
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            return serviceInfo;
        }
        return null;
    }

    /* renamed from: a */
    private static JSONArray m42646a(Context context) {
        JSONArray jSONArray = new JSONArray();
        try {
            List<C5270e> k = C5270e.m20804k(context);
            if (!k.isEmpty()) {
                for (C5270e eVar : k) {
                    jSONArray.put(eVar.toString());
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static JSONArray m42647a(String str, List<ResolveInfo> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            for (ResolveInfo next : list) {
                ComponentInfo a = m42645a(next);
                if (a != null && str.equals(a.processName)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", a.name);
                    jSONObject.put("priority", next.priority);
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    /* renamed from: a */
    static JSONObject m42648a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        JSONObject jSONObject = new JSONObject();
        Object obj = str;
        if (str == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("senderId", obj);
        Object obj2 = str2;
        if (str2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("deviceToken", obj2);
        jSONObject.put("firebaseApps", m42646a(context));
        jSONObject.put("c2dmReceiver", m42647a(packageName, packageManager.queryBroadcastReceivers(new Intent(f33899a), 0)));
        jSONObject.put("instanceIdService", m42647a(packageName, packageManager.queryIntentServices(new Intent(f33900b), 0)));
        jSONObject.put("messagingService", m42647a(packageName, packageManager.queryIntentServices(new Intent(f33901c), 0)));
        return jSONObject;
    }
}
