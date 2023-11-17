package p391dg;

import ai1.C40325g;
import bi1.C40388a;
import cg1.C40446a;
import de1.C40640a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41944z;
import p348ag.C9854a;
import p348ag.C9856c;
import p362bg.C10273c;
import p432gf.C15275c;
import p460if.C15618a;
import p652we.C18544f;
import p653wf.C18583l;
import p681yf.C18914a;
import zh1.C43511w;

/* renamed from: dg.l */
public final class C12122l {
    /* renamed from: a */
    public final C9856c mo32311a(C18544f fVar) {
        C41536l.m120489i(fVar, "scarlet");
        return (C9856c) fVar.mo46356d(C9856c.class);
    }

    /* renamed from: b */
    public final C41944z mo32312b(C18583l lVar) {
        C41944z.C41945a aVar = new C41944z.C41945a();
        aVar.mo97079O(60, TimeUnit.SECONDS);
        boolean z = false;
        if (lVar != null && lVar.mo46435b()) {
            z = true;
        }
        if (z) {
            aVar.mo97091a(new C40446a((C40446a.C40448b) null, 1, (DefaultConstructorMarker) null).mo94505e(C40446a.C40447a.BODY));
        }
        return aVar.mo97097d();
    }

    /* renamed from: c */
    public final C18544f mo32313c(C9854a aVar, C18583l lVar, C41944z zVar) {
        C41536l.m120489i(aVar, "chatLifecycle");
        C41536l.m120489i(zVar, "okHttpClient");
        C18544f.C18545a aVar2 = new C18544f.C18545a();
        C41536l.m120486f(lVar);
        return aVar2.mo46361j(C15618a.m56402a(zVar, lVar.mo46436c())).mo46357a(new C10273c.C10274a()).mo46358b(new C15275c()).mo46360i(aVar).mo46359c();
    }

    /* renamed from: d */
    public final C18914a mo32314d(C41944z zVar, C18583l lVar) {
        C41536l.m120489i(zVar, "okHttpClient");
        C43511w.C43513b bVar = new C43511w.C43513b();
        C41536l.m120486f(lVar);
        Object b = bVar.mo102232c(lVar.mo46434a()).mo102236g(zVar).mo102231b(C40388a.m116953f()).mo102230a(C40325g.m116761e(C40640a.m117458b())).mo102234e().mo102220b(C18914a.class);
        C41536l.m120488h(b, "restAdapter.create(ChatRestService::class.java)");
        return (C18914a) b;
    }
}
