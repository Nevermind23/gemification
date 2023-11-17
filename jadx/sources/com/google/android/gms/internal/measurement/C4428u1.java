package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p182n6.C7264i;
import p248s7.C8259m;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.internal.measurement.u1 */
final class C4428u1 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ String f13712h;

    /* renamed from: i */
    final /* synthetic */ String f13713i;

    /* renamed from: j */
    final /* synthetic */ Context f13714j;

    /* renamed from: k */
    final /* synthetic */ Bundle f13715k;

    /* renamed from: l */
    final /* synthetic */ C4429u2 f13716l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4428u1(C4429u2 u2Var, String str, String str2, Context context, Bundle bundle) {
        super(u2Var, true);
        this.f13716l = u2Var;
        this.f13712h = str;
        this.f13713i = str2;
        this.f13714j = context;
        this.f13715k = bundle;
    }

    /* renamed from: a */
    public final void mo12836a() {
        String str;
        String str2;
        String str3;
        boolean z;
        try {
            if (this.f13716l.m16795m(this.f13712h, this.f13713i)) {
                str = this.f13713i;
                str2 = this.f13712h;
                str3 = this.f13716l.f13718a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C7264i.m27902k(this.f13714j);
            C4429u2 u2Var = this.f13716l;
            u2Var.f13726i = u2Var.mo13672r(this.f13714j, true);
            if (this.f13716l.f13726i == null) {
                Log.w(this.f13716l.f13718a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m15256a(this.f13714j, ModuleDescriptor.MODULE_ID);
            int c = DynamiteModule.m15257c(this.f13714j, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a, c);
            if (c < a) {
                z = true;
            } else {
                z = false;
            }
            ((C4173f1) C7264i.m27902k(this.f13716l.f13726i)).initialize(C8862d.m32984T1(this.f13714j), new zzcl(77000, (long) max, z, str3, str2, str, this.f13715k, C8259m.m31089a(this.f13714j)), this.f13361d);
        } catch (Exception e) {
            this.f13716l.m16792j(e, true, false);
        }
    }
}
