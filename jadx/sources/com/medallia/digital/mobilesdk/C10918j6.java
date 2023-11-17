package com.medallia.digital.mobilesdk;

import android.os.Build;
import com.medallia.digital.mobilesdk.C11089s6;

/* renamed from: com.medallia.digital.mobilesdk.j6 */
final class C10918j6 {
    C10918j6() {
    }

    /* renamed from: a */
    protected static boolean m39860a() {
        return !C11089s6.m40668b().mo28975a(C11089s6.C11090a.LAST_OS_VERSION, "").equals(Build.VERSION.RELEASE);
    }

    /* renamed from: b */
    protected static boolean m39861b() {
        return !C11089s6.m40668b().mo28975a(C11089s6.C11090a.LAST_SDK_VERSION, "").equals("4.1.5");
    }

    /* renamed from: c */
    protected static void m39862c() {
        C11089s6.m40668b().mo28984b(C11089s6.C11090a.LAST_SDK_VERSION, "4.1.5");
        C11089s6.m40668b().mo28984b(C11089s6.C11090a.LAST_OS_VERSION, Build.VERSION.RELEASE);
    }
}
