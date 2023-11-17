package o41;

import ai1.C40325g;
import bi1.C40388a;
import com.google.gson.Gson;
import de1.C40640a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import of1.C41944z;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import u41.C39015e;
import u41.C39026k;
import zh1.C43511w;

/* renamed from: o41.i */
public final class C37639i {

    /* renamed from: a */
    public static final C37639i f90403a = new C37639i();

    private C37639i() {
    }

    /* renamed from: a */
    public final C43511w.C43513b mo90816a(Gson gson) {
        C41536l.m120489i(gson, "gson");
        C40325g e = C40325g.m116761e(C40640a.m117458b());
        C43511w.C43513b b = new C43511w.C43513b().mo102231b(C40388a.m116954g(gson));
        C41536l.m120488h(e, "rxCallAdapterFactory");
        C43511w.C43513b a = b.mo102230a(new C39015e(e)).mo102230a(e);
        C41536l.m120488h(a, "Builder()\n            .a…ory(rxCallAdapterFactory)");
        return a;
    }

    /* renamed from: b */
    public final C43511w mo90817b(C41944z zVar, C43511w wVar) {
        C41536l.m120489i(zVar, "okHttpClient");
        C41536l.m120489i(wVar, "retrofit");
        C43511w e = wVar.mo102222d().mo102236g(zVar.mo97033B().mo97080P(false).mo97079O(95, TimeUnit.SECONDS).mo97097d()).mo102234e();
        C41536l.m120488h(e, "retrofit.newBuilder().cl…pClient\n        ).build()");
        return e;
    }

    /* renamed from: c */
    public final C43511w mo90818c(TargetEnvironment targetEnvironment, C41944z zVar, C43511w.C43513b bVar) {
        C41536l.m120489i(targetEnvironment, "environment");
        C41536l.m120489i(zVar, "okHttpClient");
        C41536l.m120489i(bVar, "retrofitBuilder");
        String rbMiddleware = targetEnvironment.getRbMiddleware();
        C43511w e = bVar.mo102232c(rbMiddleware + C11110u2.f31950c).mo102236g(zVar).mo102234e();
        C41536l.m120488h(e, "retrofitBuilder\n        …ent)\n            .build()");
        return e;
    }

    /* renamed from: d */
    public final C43511w.C43513b mo90819d(Gson gson) {
        C41536l.m120489i(gson, "gson");
        C40325g e = C40325g.m116761e(C40640a.m117458b());
        C43511w.C43513b b = new C43511w.C43513b().mo102231b(C40388a.m116954g(gson));
        C41536l.m120488h(e, "rxCallAdapterFactory");
        C43511w.C43513b a = b.mo102230a(new C39026k(e)).mo102230a(e);
        C41536l.m120488h(a, "Builder()\n            .a…ory(rxCallAdapterFactory)");
        return a;
    }
}
