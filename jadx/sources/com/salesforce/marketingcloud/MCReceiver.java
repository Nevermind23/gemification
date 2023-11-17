package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

@SuppressLint({"UnknownNullness"})
public class MCReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f32836a = "com.salesforce.marketingcloud.WAKE_FOR_ALARM";

    /* renamed from: b */
    private static final String f32837b = "alarmName";

    /* renamed from: c */
    private static final String f32838c = C11461g.m41875a("MCReceiver");

    /* renamed from: a */
    public static Intent m41379a(Context context, String str) {
        Intent intent = new Intent(context, MCReceiver.class);
        return intent.setAction(context.getApplicationContext().getPackageName() + "." + "com.salesforce.marketingcloud.WAKE_FOR_ALARM").putExtra(f32837b, str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        if (r0.equals("android.intent.action.AIRPLANE_MODE") == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            java.lang.String r0 = r8.getAction()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            java.lang.String r7 = f32838c
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r8 = r8.toString()
            r0[r2] = r8
            java.lang.String r8 = "Action was empty %s"
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r7, (java.lang.String) r8, (java.lang.Object[]) r0)
            return
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r4 = r7.getApplicationContext()
            java.lang.String r4 = r4.getPackageName()
            r1.append(r4)
            java.lang.String r4 = "."
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replaceFirst(r1, r4)
            java.lang.String r1 = f32838c
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r0
            java.lang.String r5 = "onReceive with action: %s"
            com.salesforce.marketingcloud.C11461g.m41891d((java.lang.String) r1, (java.lang.String) r5, (java.lang.Object[]) r4)
            r0.hashCode()
            int r1 = r0.hashCode()
            r4 = -1
            switch(r1) {
                case -1076576821: goto L_0x008a;
                case 487459773: goto L_0x007f;
                case 502473491: goto L_0x0074;
                case 798292259: goto L_0x0069;
                case 1737074039: goto L_0x005e;
                case 1947666138: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            r2 = r4
            goto L_0x0093
        L_0x0053:
            java.lang.String r1 = "android.intent.action.ACTION_SHUTDOWN"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x005c
            goto L_0x0051
        L_0x005c:
            r2 = 5
            goto L_0x0093
        L_0x005e:
            java.lang.String r1 = "android.intent.action.MY_PACKAGE_REPLACED"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0067
            goto L_0x0051
        L_0x0067:
            r2 = 4
            goto L_0x0093
        L_0x0069:
            java.lang.String r1 = "android.intent.action.BOOT_COMPLETED"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x0051
        L_0x0072:
            r2 = 3
            goto L_0x0093
        L_0x0074:
            java.lang.String r1 = "android.intent.action.TIMEZONE_CHANGED"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x007d
            goto L_0x0051
        L_0x007d:
            r2 = 2
            goto L_0x0093
        L_0x007f:
            java.lang.String r1 = "com.salesforce.marketingcloud.WAKE_FOR_ALARM"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0088
            goto L_0x0051
        L_0x0088:
            r2 = r3
            goto L_0x0093
        L_0x008a:
            java.lang.String r1 = "android.intent.action.AIRPLANE_MODE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0093
            goto L_0x0051
        L_0x0093:
            switch(r2) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0097;
                case 2: goto L_0x00a1;
                case 3: goto L_0x00a1;
                case 4: goto L_0x00a1;
                case 5: goto L_0x00a1;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x00ae
        L_0x0097:
            java.lang.String r0 = "alarmName"
            java.lang.String r8 = r8.getStringExtra(r0)
            com.salesforce.marketingcloud.MCService.m41382a((android.content.Context) r7, (java.lang.String) r8)
            goto L_0x00ae
        L_0x00a1:
            com.salesforce.marketingcloud.behaviors.a r0 = com.salesforce.marketingcloud.behaviors.C11402a.m41718a(r0)
            if (r0 == 0) goto L_0x00ae
            android.os.Bundle r8 = r8.getExtras()
            com.salesforce.marketingcloud.MCService.m41380a((android.content.Context) r7, (com.salesforce.marketingcloud.behaviors.C11402a) r0, (android.os.Bundle) r8)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MCReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
