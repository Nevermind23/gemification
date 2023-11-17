package w90;

import kotlin.jvm.internal.C41536l;
import of1.C41944z;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import t90.C28334c;
import zh1.C43511w;

/* renamed from: w90.a */
public final class C29245a {
    /* renamed from: a */
    public final C28334c mo69090a(C43511w.C43513b bVar, C41944z zVar, TargetEnvironment targetEnvironment) {
        C41536l.m120489i(bVar, "retrofitBuilder");
        C41536l.m120489i(zVar, "okHttpClient");
        C41536l.m120489i(targetEnvironment, "environment");
        String ddEndPoint = targetEnvironment.getDdEndPoint();
        Object b = bVar.mo102232c(ddEndPoint + C11110u2.f31950c).mo102236g(zVar).mo102234e().mo102220b(C28334c.class);
        C41536l.m120488h(b, "retrofit.create(DDServiceApi::class.java)");
        return (C28334c) b;
    }
}
