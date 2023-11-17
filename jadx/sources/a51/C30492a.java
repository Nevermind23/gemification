package a51;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41935w;
import of1.C41944z;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import z41.C40147a;
import zh1.C43511w;

/* renamed from: a51.a */
public abstract class C30492a {

    /* renamed from: a */
    public static final C30493a f76496a = new C30493a((DefaultConstructorMarker) null);

    /* renamed from: a51.a$a */
    public static final class C30493a {
        private C30493a() {
        }

        public /* synthetic */ C30493a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40147a mo70840a(C41935w wVar, C43511w.C43513b bVar, TargetEnvironment targetEnvironment) {
            C41536l.m120489i(bVar, "retrofitBuilder");
            C41536l.m120489i(targetEnvironment, "environment");
            C41944z.C41945a aVar = new C41944z.C41945a();
            if (wVar != null) {
                aVar.mo97091a(wVar);
            }
            C41944z d = aVar.mo97097d();
            String rbMiddleware = targetEnvironment.getRbMiddleware();
            Object b = bVar.mo102232c(rbMiddleware + C11110u2.f31950c).mo102236g(d).mo102234e().mo102220b(C40147a.class);
            C41536l.m120488h(b, "retrofit.create(ServerStatusService::class.java)");
            return (C40147a) b;
        }
    }
}
