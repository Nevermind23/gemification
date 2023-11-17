package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.C5270e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p238ra.C8085h;
import p302w9.C8893h;
import p302w9.C8895i;
import p314x8.C8976a;
import p314x8.C8977b;
import p326y8.C9102b0;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9131r;
import p338z8.C9259j;
import p339z9.C9270e;
import p339z9.C9271f;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ C9270e lambda$getComponents$0(C9110e eVar) {
        return new C5283c((C5270e) eVar.mo24668a(C5270e.class), eVar.mo24674g(C8895i.class), (ExecutorService) eVar.mo24670c(C9102b0.m33557a(C8976a.class, ExecutorService.class)), C9259j.m34160b((Executor) eVar.mo24670c(C9102b0.m33557a(C8977b.class, Executor.class))));
    }

    public List<C9104c> getComponents() {
        return Arrays.asList(new C9104c[]{C9104c.m33561c(C9270e.class).mo24667h(LIBRARY_NAME).mo24662b(C9131r.m33671j(C5270e.class)).mo24662b(C9131r.m33670i(C8895i.class)).mo24662b(C9131r.m33672k(C9102b0.m33557a(C8976a.class, ExecutorService.class))).mo24662b(C9131r.m33672k(C9102b0.m33557a(C8977b.class, Executor.class))).mo24666f(new C9271f()).mo24664d(), C8893h.m33043a(), C8085h.m30616b(LIBRARY_NAME, "17.1.3")});
    }
}
