package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.salesforce.marketingcloud.C11398b;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;

/* renamed from: com.google.android.gms.measurement.internal.m3 */
final class C4713m3 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ int f14605d;

    /* renamed from: e */
    final /* synthetic */ String f14606e;

    /* renamed from: f */
    final /* synthetic */ Object f14607f;

    /* renamed from: g */
    final /* synthetic */ Object f14608g;

    /* renamed from: h */
    final /* synthetic */ Object f14609h;

    /* renamed from: i */
    final /* synthetic */ C4746p3 f14610i;

    C4713m3(C4746p3 p3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f14610i = p3Var;
        this.f14605d = i;
        this.f14606e = str;
        this.f14607f = obj;
        this.f14608g = obj2;
        this.f14609h = obj3;
    }

    public final void run() {
        C4614d4 F = this.f14610i.f14613a.mo14849F();
        if (F.mo14643n()) {
            C4746p3 p3Var = this.f14610i;
            if (p3Var.f14713c == 0) {
                if (p3Var.f14613a.mo14876z().mo14404H()) {
                    C4746p3 p3Var2 = this.f14610i;
                    p3Var2.f14613a.mo14549b();
                    p3Var2.f14713c = 'C';
                } else {
                    C4746p3 p3Var3 = this.f14610i;
                    p3Var3.f14613a.mo14549b();
                    p3Var3.f14713c = 'c';
                }
            }
            C4746p3 p3Var4 = this.f14610i;
            if (p3Var4.f14714d < 0) {
                p3Var4.f14613a.mo14876z().mo14411q();
                p3Var4.f14714d = 77000;
            }
            char charAt = "01VDIWEA?".charAt(this.f14605d);
            C4746p3 p3Var5 = this.f14610i;
            String str = AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID + charAt + p3Var5.f14713c + p3Var5.f14714d + ":" + C4746p3.m18087A(true, this.f14606e, this.f14607f, this.f14608g, this.f14609h);
            if (str.length() > 1024) {
                str = this.f14606e.substring(0, C11398b.f33141t);
            }
            C4590b4 b4Var = F.f14260d;
            if (b4Var != null) {
                b4Var.mo14308b(str, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f14610i.mo14672D(), "Persisted config not initialized. Not logging error/warn");
    }
}
