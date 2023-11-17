package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p238ra.C8085h;
import p288v8.C8713a;
import p301w8.C8878a;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9131r;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* access modifiers changed from: private */
    public static /* synthetic */ C5234a lambda$getComponents$0(C9110e eVar) {
        return new C5234a((Context) eVar.mo24668a(Context.class), eVar.mo24674g(C8878a.class));
    }

    public List<C9104c> getComponents() {
        return Arrays.asList(new C9104c[]{C9104c.m33561c(C5234a.class).mo24667h(LIBRARY_NAME).mo24662b(C9131r.m33671j(Context.class)).mo24662b(C9131r.m33670i(C8878a.class)).mo24666f(new C8713a()).mo24664d(), C8085h.m30616b(LIBRARY_NAME, "21.1.1")});
    }
}
