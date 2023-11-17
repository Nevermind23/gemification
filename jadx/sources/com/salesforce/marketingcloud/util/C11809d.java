package com.salesforce.marketingcloud.util;

import com.google.android.gms.common.api.C3847a;
import p183n7.C7310h;

/* renamed from: com.salesforce.marketingcloud.util.d */
public class C11809d {

    /* renamed from: a */
    private static Boolean f34269a;

    /* renamed from: b */
    private static Boolean f34270b;

    private C11809d() {
    }

    /* renamed from: a */
    public static boolean m43208a() {
        if (f34270b == null) {
            try {
                Class.forName("org.altbeacon.beacon.BeaconManager");
                f34270b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f34270b = Boolean.FALSE;
            }
        }
        return f34270b.booleanValue();
    }

    /* renamed from: b */
    public static boolean m43209b() {
        if (f34269a == null) {
            try {
                C3847a aVar = C7310h.f21507a;
                f34269a = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f34269a = Boolean.FALSE;
            }
        }
        return f34269a.booleanValue();
    }
}
