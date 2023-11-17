package com.google.android.gms.measurement.internal;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
public final /* synthetic */ class C4659h4 implements Callable {

    /* renamed from: d */
    public final /* synthetic */ C4725n4 f14484d;

    /* renamed from: e */
    public final /* synthetic */ String f14485e;

    public /* synthetic */ C4659h4(C4725n4 n4Var, String str) {
        this.f14484d = n4Var;
        this.f14485e = str;
    }

    public final Object call() {
        C4725n4 n4Var = this.f14484d;
        String str = this.f14485e;
        C4748p5 R = n4Var.f15082b.mo14577W().mo14497R(str);
        HashMap hashMap = new HashMap();
        hashMap.put(C11772k.C11773a.f34170b, "android");
        hashMap.put("package_name", str);
        n4Var.f14613a.mo14876z().mo14411q();
        hashMap.put("gmp_version", 77000L);
        if (R != null) {
            String l0 = R.mo14734l0();
            if (l0 != null) {
                hashMap.put(C11772k.C11773a.f34185q, l0);
            }
            hashMap.put("app_version_int", Long.valueOf(R.mo14700P()));
            hashMap.put("dynamite_version", Long.valueOf(R.mo14709Y()));
        }
        return hashMap;
    }
}
