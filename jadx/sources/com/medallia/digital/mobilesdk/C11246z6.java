package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11209y1;
import java.util.ArrayList;

/* renamed from: com.medallia.digital.mobilesdk.z6 */
final class C11246z6 {

    /* renamed from: d */
    private static C11246z6 f32610d;

    /* renamed from: a */
    private C11229y6 f32611a;

    /* renamed from: b */
    private boolean f32612b = true;

    /* renamed from: c */
    private boolean f32613c;

    private C11246z6() {
    }

    /* renamed from: b */
    protected static C11246z6 m41212b() {
        if (f32610d == null) {
            f32610d = new C11246z6();
        }
        return f32610d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<C11199x1> mo29260a() {
        C11229y6 y6Var = this.f32611a;
        if (y6Var != null) {
            return y6Var.mo28136b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo29266c() {
        C11229y6 y6Var = this.f32611a;
        if (y6Var != null) {
            return y6Var.mo28140c();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29261a(ConfigurationContract configurationContract) {
        MedalliaDigitalBrainConfigurationContract medalliaDigitalBrain;
        if (configurationContract != null && configurationContract.getSdkConfiguration() != null && (medalliaDigitalBrain = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain()) != null) {
            boolean isTREV2Enabled = medalliaDigitalBrain.isTREV2Enabled();
            this.f32611a = isTREV2Enabled ? new C10766c7() : new C10740b7();
            this.f32611a.mo28134a(this.f32612b, this.f32613c);
            StringBuilder sb = new StringBuilder();
            sb.append("TargetEvaluator ");
            sb.append(isTREV2Enabled ? "V2" : "V1");
            sb.append(" is running");
            C10735b4.m39113e(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29265b(ConfigurationContract configurationContract) {
        C11229y6 y6Var = this.f32611a;
        if (y6Var != null) {
            y6Var.mo28128a(configurationContract);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29262a(C11209y1.C11211b bVar) {
        C11229y6 y6Var = this.f32611a;
        if (y6Var != null) {
            y6Var.mo28130a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29263a(boolean z) {
        C11229y6 y6Var = this.f32611a;
        if (y6Var != null) {
            y6Var.mo28133a(z);
        } else {
            this.f32613c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29264a(boolean z, boolean z2) {
        C11229y6 y6Var = this.f32611a;
        if (y6Var == null || !z2) {
            this.f32612b = z;
        } else {
            y6Var.mo28138b(z);
        }
    }
}
