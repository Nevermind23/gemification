package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.C5270e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p142k5.C6816g;
import p238ra.C8085h;
import p238ra.C8087i;
import p289v9.C8717d;
import p302w9.C8896j;
import p315x9.C8980a;
import p326y8.C9104c;
import p326y8.C9131r;
import p339z9.C9270e;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    @Keep
    public List<C9104c> getComponents() {
        return Arrays.asList(new C9104c[]{C9104c.m33561c(FirebaseMessaging.class).mo24667h(LIBRARY_NAME).mo24662b(C9131r.m33671j(C5270e.class)).mo24662b(C9131r.m33669h(C8980a.class)).mo24662b(C9131r.m33670i(C8087i.class)).mo24662b(C9131r.m33670i(C8896j.class)).mo24662b(C9131r.m33669h(C6816g.class)).mo24662b(C9131r.m33671j(C9270e.class)).mo24662b(C9131r.m33671j(C8717d.class)).mo24666f(new C5369y()).mo24663c().mo24664d(), C8085h.m30616b(LIBRARY_NAME, "23.1.2")});
    }
}
