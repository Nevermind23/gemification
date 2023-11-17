package tc0;

import bi1.C40388a;
import d51.C31540c;
import kotlin.jvm.internal.C41536l;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41935w;
import of1.C41944z;
import p341ge.bog.mobilebank.rest.model.BogUrlHelper;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import q41.C38129b;
import sc0.C28188a;
import zh1.C43511w;

/* renamed from: tc0.a */
public final class C28354a {

    /* renamed from: a */
    public static final C28354a f71867a = new C28354a();

    /* renamed from: tc0.a$a */
    public static final class C28355a implements C41935w {

        /* renamed from: a */
        final /* synthetic */ C31540c f71868a;

        public C28355a(C31540c cVar) {
            this.f71868a = cVar;
        }

        /* renamed from: a */
        public final C41880d0 mo21294a(C41935w.C41936a aVar) {
            String str;
            C41536l.m120489i(aVar, "chain");
            C41869b0.C41870a h = aVar.mo97011w().mo96679h();
            if (this.f71868a.invoke()) {
                str = "MOBILE";
            } else {
                str = BogUrlHelper.CHANNEL_MOBILE_EXT;
            }
            h.mo96691i("channel", str);
            return aVar.mo97008a(h.mo96684b());
        }
    }

    private C28354a() {
    }

    /* renamed from: a */
    public final C28188a mo67989a(C41935w wVar, TargetEnvironment targetEnvironment, C31540c cVar) {
        C41536l.m120489i(targetEnvironment, "environment");
        C41536l.m120489i(cVar, "isLoggedIn");
        C43511w.C43513b b = new C43511w.C43513b().mo102236g(C38129b.m112246d(new C41944z.C41945a().mo97091a(new C28355a(cVar)), wVar).mo97097d()).mo102231b(C40388a.m116953f());
        String dictionary = targetEnvironment.getDictionary();
        Object b2 = b.mo102232c(dictionary + C11110u2.f31950c).mo102234e().mo102220b(C28188a.class);
        C41536l.m120488h(b2, "Builder()\n            .c…ictionaryApi::class.java)");
        return (C28188a) b2;
    }
}
