package com.google.firebase.crashlytics;

import com.google.firebase.C5270e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p010a9.C0088f;
import p027b9.C2175a;
import p238ra.C8085h;
import p301w8.C8878a;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9131r;
import p339z9.C9270e;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public C5263a m20765b(C9110e eVar) {
        return C5263a.m20767b((C5270e) eVar.mo24668a(C5270e.class), (C9270e) eVar.mo24668a(C9270e.class), eVar.mo24676i(C2175a.class), eVar.mo24676i(C8878a.class));
    }

    public List getComponents() {
        return Arrays.asList(new C9104c[]{C9104c.m33561c(C5263a.class).mo24667h("fire-cls").mo24662b(C9131r.m33671j(C5270e.class)).mo24662b(C9131r.m33671j(C9270e.class)).mo24662b(C9131r.m33667a(C2175a.class)).mo24662b(C9131r.m33667a(C8878a.class)).mo24666f(new C0088f(this)).mo24665e().mo24664d(), C8085h.m30616b("fire-cls", "18.3.7")});
    }
}
