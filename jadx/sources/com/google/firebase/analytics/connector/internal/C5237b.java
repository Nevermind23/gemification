package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4349p7;
import com.google.android.gms.internal.measurement.C4417t7;
import com.google.android.gms.internal.measurement.C4434u7;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import p248s7.C8265s;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
public abstract class C5237b {

    /* renamed from: a */
    private static final C4434u7 f16791a = C4434u7.m16959o("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b */
    private static final C4417t7 f16792b = C4417t7.m16745r("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    private static final C4417t7 f16793c = C4417t7.m16744o("auto", "app", "am");

    /* renamed from: d */
    private static final C4417t7 f16794d = C4417t7.m16743n(NotificationMessage.NOTIF_KEY_REQUEST_ID, "_dbg");

    /* renamed from: e */
    private static final C4417t7 f16795e;

    /* renamed from: f */
    private static final C4417t7 f16796f = C4417t7.m16743n("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: g */
    public static final /* synthetic */ int f16797g = 0;

    static {
        C4349p7 p7Var = new C4349p7();
        p7Var.mo13457a(C8265s.f23469a);
        p7Var.mo13457a(C8265s.f23470b);
        f16795e = p7Var.mo13458b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20697a(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r6 = m20700d(r5)
            r1 = 0
            if (r6 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r7 != 0) goto L_0x0015
            return r1
        L_0x0015:
            com.google.android.gms.internal.measurement.t7 r6 = f16794d
            int r2 = r6.size()
            r3 = r1
        L_0x001c:
            if (r3 >= r2) goto L_0x002d
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L_0x001c
            return r1
        L_0x002d:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L_0x0056
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L_0x004c
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L_0x0042
            goto L_0x0060
        L_0x0042:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            r5 = r3
            goto L_0x0061
        L_0x004c:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            r5 = r0
            goto L_0x0061
        L_0x0056:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            r5 = r1
            goto L_0x0061
        L_0x0060:
            r5 = -1
        L_0x0061:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L_0x0076
            if (r5 == r0) goto L_0x0070
            if (r5 == r3) goto L_0x006a
            return r1
        L_0x006a:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L_0x0070:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L_0x0076:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.C5237b.m20697a(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    /* renamed from: b */
    public static boolean m20698b(String str, Bundle bundle) {
        if (f16792b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        C4417t7 t7Var = f16794d;
        int size = t7Var.size();
        int i = 0;
        while (i < size) {
            boolean containsKey = bundle.containsKey((String) t7Var.get(i));
            i++;
            if (containsKey) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m20699c(String str) {
        return !f16791a.contains(str);
    }

    /* renamed from: d */
    public static boolean m20700d(String str) {
        return !f16793c.contains(str);
    }

    /* renamed from: e */
    public static boolean m20701e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
            return false;
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
            return false;
        } else if (f16795e.contains(str2)) {
            return false;
        } else {
            C4417t7 t7Var = f16796f;
            int size = t7Var.size();
            int i = 0;
            while (i < size) {
                boolean matches = str2.matches((String) t7Var.get(i));
                i++;
                if (matches) {
                    return false;
                }
            }
            return true;
        }
    }
}
