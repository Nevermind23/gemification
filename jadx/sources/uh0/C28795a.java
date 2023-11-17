package uh0;

import kotlin.jvm.internal.C41536l;
import of1.C41944z;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import ph0.C27532a;
import ph0.C27533b;
import zh1.C43511w;

/* renamed from: uh0.a */
public final class C28795a {
    /* renamed from: a */
    public final C27532a mo68518a(C43511w.C43513b bVar, C41944z zVar, TargetEnvironment targetEnvironment) {
        C41536l.m120489i(bVar, "retrofitBuilder");
        C41536l.m120489i(zVar, "okHttpClient");
        C41536l.m120489i(targetEnvironment, "environment");
        String giftCardsEndpoint = targetEnvironment.getGiftCardsEndpoint();
        Object b = bVar.mo102232c(giftCardsEndpoint + C11110u2.f31950c).mo102236g(zVar).mo102234e().mo102220b(C27532a.class);
        C41536l.m120488h(b, "retrofit.create(GiftCardsApi::class.java)");
        return (C27532a) b;
    }

    /* renamed from: b */
    public final C27533b mo68519b(C43511w wVar) {
        C41536l.m120489i(wVar, "retrofit");
        Object b = wVar.mo102220b(C27533b.class);
        C41536l.m120488h(b, "retrofit.create(TransferAccountsApi::class.java)");
        return (C27533b) b;
    }
}
