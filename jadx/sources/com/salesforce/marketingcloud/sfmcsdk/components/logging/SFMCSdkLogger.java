package com.salesforce.marketingcloud.sfmcsdk.components.logging;

import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

public final class SFMCSdkLogger extends Logger {
    public static final SFMCSdkLogger INSTANCE = new SFMCSdkLogger();

    private SFMCSdkLogger() {
    }

    /* renamed from: d */
    public void mo31452d(String str, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        mo31451d(str, (Throwable) null, aVar);
    }

    /* renamed from: e */
    public void mo31454e(String str, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        mo31453e(str, (Throwable) null, aVar);
    }

    /* renamed from: w */
    public void mo31463w(String str, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        mo31462w(str, (Throwable) null, aVar);
    }

    /* renamed from: d */
    public void mo31451d(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        log$sfmcsdk_release(LogLevel.DEBUG, str, th, aVar);
    }

    /* renamed from: e */
    public void mo31453e(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        log$sfmcsdk_release(LogLevel.ERROR, str, th, aVar);
    }

    /* renamed from: w */
    public void mo31462w(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        log$sfmcsdk_release(LogLevel.WARN, str, th, aVar);
    }
}
