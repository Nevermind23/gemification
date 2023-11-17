package com.google.firebase.dynamiclinks.internal;

import androidx.annotation.Keep;
import com.google.firebase.C5270e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p198o9.C7493a;
import p211p9.C7767d;
import p211p9.C7768e;
import p238ra.C8085h;
import p301w8.C8878a;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9131r;

@Keep
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* access modifiers changed from: private */
    public static /* synthetic */ C7493a lambda$getComponents$0(C9110e eVar) {
        return new C7768e((C5270e) eVar.mo24668a(C5270e.class), eVar.mo24674g(C8878a.class));
    }

    @Keep
    public List<C9104c> getComponents() {
        return Arrays.asList(new C9104c[]{C9104c.m33561c(C7493a.class).mo24667h(LIBRARY_NAME).mo24662b(C9131r.m33671j(C5270e.class)).mo24662b(C9131r.m33670i(C8878a.class)).mo24666f(new C7767d()).mo24664d(), C8085h.m30616b(LIBRARY_NAME, "21.1.0")});
    }
}
