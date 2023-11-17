package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C5270e;
import com.google.firebase.abt.component.C5234a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p238ra.C8085h;
import p251sa.C8290m;
import p301w8.C8878a;
import p314x8.C8977b;
import p326y8.C9102b0;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9131r;
import p339z9.C9270e;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* access modifiers changed from: private */
    public static /* synthetic */ C5436c lambda$getComponents$0(C9102b0 b0Var, C9110e eVar) {
        return new C5436c((Context) eVar.mo24668a(Context.class), (ScheduledExecutorService) eVar.mo24670c(b0Var), (C5270e) eVar.mo24668a(C5270e.class), (C9270e) eVar.mo24668a(C9270e.class), ((C5234a) eVar.mo24668a(C5234a.class)).mo17402b("frc"), eVar.mo24674g(C8878a.class));
    }

    public List<C9104c> getComponents() {
        C9102b0 a = C9102b0.m33557a(C8977b.class, ScheduledExecutorService.class);
        return Arrays.asList(new C9104c[]{C9104c.m33561c(C5436c.class).mo24667h(LIBRARY_NAME).mo24662b(C9131r.m33671j(Context.class)).mo24662b(C9131r.m33672k(a)).mo24662b(C9131r.m33671j(C5270e.class)).mo24662b(C9131r.m33671j(C9270e.class)).mo24662b(C9131r.m33671j(C5234a.class)).mo24662b(C9131r.m33670i(C8878a.class)).mo24666f(new C8290m(a)).mo24665e().mo24664d(), C8085h.m30616b(LIBRARY_NAME, "21.4.0")});
    }
}
