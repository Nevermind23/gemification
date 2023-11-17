package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11089s6;

/* renamed from: com.medallia.digital.mobilesdk.z7 */
class C11247z7 {

    /* renamed from: com.medallia.digital.mobilesdk.z7$a */
    static /* synthetic */ class C11248a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32614a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.medallia.digital.mobilesdk.z7$b[] r0 = com.medallia.digital.mobilesdk.C11247z7.C11249b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32614a = r0
                com.medallia.digital.mobilesdk.z7$b r1 = com.medallia.digital.mobilesdk.C11247z7.C11249b.CONFIGURATION_UUID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32614a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.z7$b r1 = com.medallia.digital.mobilesdk.C11247z7.C11249b.OCQ_UUID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32614a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.z7$b r1 = com.medallia.digital.mobilesdk.C11247z7.C11249b.C_UUID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11247z7.C11248a.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.z7$b */
    protected enum C11249b {
        CONFIGURATION_UUID,
        OCQ_UUID,
        C_UUID
    }

    C11247z7() {
    }

    /* renamed from: a */
    private static String m41220a(String str) {
        try {
            if (C11208y0.m41106c().mo29204a().getSdkConfiguration().getMedalliaDigitalClientConfig().getOcqCUuidUrlPrefix() != null) {
                return C11208y0.m41106c().mo29204a().getSdkConfiguration().getMedalliaDigitalClientConfig().getOcqCUuidUrlPrefix().concat(str);
            }
            return null;
        } catch (Exception unused) {
            C10735b4.m39111c("Cannot get ocqCuuidUrlPrefix from Configuration");
            return null;
        }
    }

    /* renamed from: b */
    protected static String m41223b(C11249b bVar) {
        C11089s6.C11090a d = m41227d(bVar);
        if (d != null) {
            return C11089s6.m40668b().mo28975a(d, (String) null);
        }
        return null;
    }

    /* renamed from: c */
    protected static String m41225c(C11249b bVar) {
        C11089s6.C11090a e = m41228e(bVar);
        if (e != null) {
            return C11089s6.m40668b().mo28975a(e, (String) null);
        }
        return null;
    }

    /* renamed from: d */
    private static C11089s6.C11090a m41227d(C11249b bVar) {
        int i = C11248a.f32614a[bVar.ordinal()];
        if (i == 1) {
            return C11089s6.C11090a.UUID;
        }
        if (i == 2) {
            return C11089s6.C11090a.OCQ_UUID;
        }
        if (i == 3) {
            return C11089s6.C11090a.C_UUID;
        }
        C10735b4.m39109b("couldn't find UUID Key for: " + bVar.toString());
        return null;
    }

    /* renamed from: e */
    private static C11089s6.C11090a m41228e(C11249b bVar) {
        if (bVar != null) {
            int i = C11248a.f32614a[bVar.ordinal()];
            if (i == 1 || i == 2) {
                return C11089s6.C11090a.UUID_URL;
            }
            if (i == 3) {
                return C11089s6.C11090a.OCQ_UUID_URL;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("couldn't find UUID Url Key for: ");
        sb.append(bVar != null ? bVar.toString() : "null");
        C10735b4.m39109b(sb.toString());
        return null;
    }

    /* renamed from: a */
    protected static void m41221a(C11249b bVar) {
        C11089s6.C11090a d = m41227d(bVar);
        C11089s6.C11090a e = m41228e(bVar);
        if (d != null) {
            C11089s6.m40668b().mo28984b(d, (String) null);
        }
        if (e != null) {
            C11089s6.m40668b().mo28984b(e, (String) null);
        }
    }

    /* renamed from: b */
    protected static void m41224b(C11249b bVar, String str) {
        C11089s6.C11090a d = m41227d(bVar);
        if (d != null) {
            C11089s6.m40668b().mo28984b(d, str);
        }
    }

    /* renamed from: c */
    protected static void m41226c(C11249b bVar, String str) {
        C11089s6.C11090a e = m41228e(bVar);
        if (e != null) {
            if (C11249b.C_UUID.equals(bVar)) {
                str = m41220a(str);
            }
            C11089s6.m40668b().mo28984b(e, str);
        }
    }

    /* renamed from: a */
    protected static boolean m41222a(C11249b bVar, String str) {
        StringBuilder sb;
        if (str == null) {
            return false;
        }
        String b = m41223b(bVar);
        if (b == null) {
            sb = new StringBuilder();
        } else if (b.equals(str)) {
            C10735b4.m39109b("Uuid is equal -> using local " + bVar.toString());
            return true;
        } else {
            sb = new StringBuilder();
        }
        sb.append("New UUID is not equal to previous using remote ");
        sb.append(bVar.toString());
        C10735b4.m39113e(sb.toString());
        return false;
    }
}
