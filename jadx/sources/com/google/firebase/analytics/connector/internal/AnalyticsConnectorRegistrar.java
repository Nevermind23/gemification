package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C5270e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p238ra.C8085h;
import p289v9.C8717d;
import p301w8.C8878a;
import p326y8.C9104c;
import p326y8.C9131r;

@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C9104c> getComponents() {
        return Arrays.asList(new C9104c[]{C9104c.m33561c(C8878a.class).mo24662b(C9131r.m33671j(C5270e.class)).mo24662b(C9131r.m33671j(Context.class)).mo24662b(C9131r.m33671j(C8717d.class)).mo24666f(C5236a.f16790a).mo24665e().mo24664d(), C8085h.m30616b("fire-analytics", "21.2.2")});
    }
}
