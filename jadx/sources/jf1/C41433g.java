package jf1;

import ed1.C40749p;
import ed1.C40751q;
import ef1.C40813h;
import ef1.C40814h0;
import ef1.C40815h1;
import ef1.C40822j0;
import ef1.C40867u0;
import he1.C41228o;
import he1.C41238w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C41556a;
import kotlinx.coroutines.flow.C41557b;
import me1.C41752f;
import me1.C41758g;
import oe1.C41862l;
import ue1.C43079p;

/* renamed from: jf1.g */
public abstract class C41433g {

    /* renamed from: jf1.g$a */
    static final class C41434a extends C41862l implements C43079p {

        /* renamed from: h */
        int f97501h;

        /* renamed from: i */
        private /* synthetic */ Object f97502i;

        /* renamed from: j */
        final /* synthetic */ C41556a f97503j;

        /* renamed from: k */
        final /* synthetic */ C40751q f97504k;

        /* renamed from: jf1.g$a$a */
        static final class C41435a implements C41557b {

            /* renamed from: a */
            final /* synthetic */ C40751q f97505a;

            C41435a(C40751q qVar) {
                this.f97505a = qVar;
            }

            /* renamed from: b */
            public final Object mo95721b(Object obj, Continuation continuation) {
                this.f97505a.onNext(obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41434a(C41556a aVar, C40751q qVar, Continuation continuation) {
            super(2, continuation);
            this.f97503j = aVar;
            this.f97504k = qVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C41434a aVar = new C41434a(this.f97503j, this.f97504k, continuation);
            aVar.f97502i = obj;
            return aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Throwable th;
            C40814h0 h0Var;
            Object c = C41793d.m121157c();
            int i = this.f97501h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C40814h0 h0Var2 = (C40814h0) this.f97502i;
                try {
                    C41556a aVar = this.f97503j;
                    C41435a aVar2 = new C41435a(this.f97504k);
                    this.f97502i = h0Var2;
                    this.f97501h = 1;
                    if (aVar.mo95707a(aVar2, this) == c) {
                        return c;
                    }
                    h0Var = h0Var2;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    h0Var = h0Var2;
                    th = th3;
                    if (th instanceof CancellationException) {
                        this.f97504k.onComplete();
                    } else if (!this.f97504k.mo95048b(th)) {
                        C41428b.m120214a(th, h0Var.mo4808Q());
                    }
                    return C41238w.f97225a;
                }
            } else if (i == 1) {
                h0Var = (C40814h0) this.f97502i;
                try {
                    C41228o.m119483b(obj);
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f97504k.onComplete();
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C41434a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: b */
    public static final C40749p m120226b(C41556a aVar, C41752f fVar) {
        return C40749p.m118054r(new C41432f(fVar, aVar));
    }

    /* renamed from: c */
    public static /* synthetic */ C40749p m120227c(C41556a aVar, C41752f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C41758g.f98029d;
        }
        return m120226b(aVar, fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m120228d(C41752f fVar, C41556a aVar, C40751q qVar) {
        qVar.mo95049c(new C41427a(C40813h.m118299a(C40815h1.f96534d, C40867u0.m118470d().mo23741u(fVar), C40822j0.ATOMIC, new C41434a(aVar, qVar, (Continuation) null))));
    }
}
