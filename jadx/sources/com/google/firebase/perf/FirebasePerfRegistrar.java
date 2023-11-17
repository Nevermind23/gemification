package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.C5270e;
import com.google.firebase.C5298l;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.C5436c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p095ga.C6398b;
import p095ga.C6399c;
import p095ga.C6400d;
import p095ga.C6401e;
import p108ha.C6487a;
import p121ia.C6620a;
import p142k5.C6816g;
import p238ra.C8085h;
import p314x8.C8979d;
import p326y8.C9102b0;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9131r;
import p339z9.C9270e;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* access modifiers changed from: private */
    public static /* synthetic */ C6398b lambda$getComponents$0(C9102b0 b0Var, C9110e eVar) {
        return new C6398b((C5270e) eVar.mo24668a(C5270e.class), (C5298l) eVar.mo24674g(C5298l.class).get(), (Executor) eVar.mo24670c(b0Var));
    }

    /* access modifiers changed from: private */
    public static C6401e providesFirebasePerformance(C9110e eVar) {
        eVar.mo24668a(C6398b.class);
        return C6487a.m25645b().mo20394b(new C6620a((C5270e) eVar.mo24668a(C5270e.class), (C9270e) eVar.mo24668a(C9270e.class), eVar.mo24674g(C5436c.class), eVar.mo24674g(C6816g.class))).mo20393a().mo20392a();
    }

    @Keep
    public List<C9104c> getComponents() {
        C9102b0 a = C9102b0.m33557a(C8979d.class, Executor.class);
        Class<C5270e> cls = C5270e.class;
        Class<C6398b> cls2 = C6398b.class;
        return Arrays.asList(new C9104c[]{C9104c.m33561c(C6401e.class).mo24667h(LIBRARY_NAME).mo24662b(C9131r.m33671j(cls)).mo24662b(C9131r.m33673l(C5436c.class)).mo24662b(C9131r.m33671j(C9270e.class)).mo24662b(C9131r.m33673l(C6816g.class)).mo24662b(C9131r.m33671j(cls2)).mo24666f(new C6399c()).mo24664d(), C9104c.m33561c(cls2).mo24667h(EARLY_LIBRARY_NAME).mo24662b(C9131r.m33671j(cls)).mo24662b(C9131r.m33670i(C5298l.class)).mo24662b(C9131r.m33672k(a)).mo24665e().mo24666f(new C6400d(a)).mo24664d(), C8085h.m30616b(LIBRARY_NAME, "20.3.2")});
    }
}
