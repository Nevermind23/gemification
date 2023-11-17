package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p142k5.C6816g;
import p185n9.C7352a;
import p238ra.C8085h;
import p326y8.C9104c;
import p326y8.C9131r;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<C9104c> getComponents() {
        return Arrays.asList(new C9104c[]{C9104c.m33561c(C6816g.class).mo24667h(LIBRARY_NAME).mo24662b(C9131r.m33671j(Context.class)).mo24666f(new C7352a()).mo24664d(), C8085h.m30616b(LIBRARY_NAME, "18.1.8")});
    }
}
