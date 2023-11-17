package p460if;

import af1.C40297d;
import dg1.C40681e;
import ed1.C40741h;
import he1.C41238w;
import jd1.C41399f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41534j;
import kotlin.jvm.internal.C41536l;
import of1.C41897h0;
import of1.C41901i0;
import p446hf.C15494b;
import p652we.C18539d;
import p652we.C18549h;
import p652we.C18558j;
import p652we.C18561l;
import ue1.C43075l;
import uh1.C43108c;

/* renamed from: if.c */
public final class C15620c implements C18561l {

    /* renamed from: a */
    private final C15627f f44425a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C15626e f44426b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C15621a f44427c;

    /* renamed from: if.c$a */
    public interface C15621a {
        /* renamed from: a */
        void mo42915a(C41901i0 i0Var);
    }

    /* renamed from: if.c$b */
    public static final class C15622b implements C18561l.C18568b {

        /* renamed from: a */
        private final C15621a f44428a;

        public C15622b(C15621a aVar) {
            C41536l.m120490j(aVar, "connectionEstablisher");
            this.f44428a = aVar;
        }

        public C18561l create() {
            return new C15620c(new C15627f(), new C15626e(), this.f44428a);
        }
    }

    /* renamed from: if.c$c */
    static final class C15623c implements C41399f {

        /* renamed from: d */
        final /* synthetic */ C15620c f44429d;

        C15623c(C15620c cVar) {
            this.f44429d = cVar;
        }

        /* renamed from: a */
        public final void accept(C43108c cVar) {
            this.f44429d.f44427c.mo42915a(this.f44429d.f44426b);
        }
    }

    /* renamed from: if.c$d */
    static final /* synthetic */ class C15624d extends C41534j implements C43075l {
        C15624d(C15620c cVar) {
            super(1, cVar);
        }

        /* renamed from: b */
        public final void mo42922b(C18561l.C18562a aVar) {
            C41536l.m120490j(aVar, "p1");
            ((C15620c) this.receiver).m56409h(aVar);
        }

        public final String getName() {
            return "handleWebSocketEvent";
        }

        public final C40297d getOwner() {
            return C41520a0.m120436b(C15620c.class);
        }

        public final String getSignature() {
            return "handleWebSocketEvent(Lcom/tinder/scarlet/WebSocket$Event;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42922b((C18561l.C18562a) obj);
            return C41238w.f97225a;
        }
    }

    public C15620c(C15627f fVar, C15626e eVar, C15621a aVar) {
        C41536l.m120490j(fVar, "okHttpWebSocketHolder");
        C41536l.m120490j(eVar, "okHttpWebSocketEventObserver");
        C41536l.m120490j(aVar, "connectionEstablisher");
        this.f44425a = fVar;
        this.f44426b = eVar;
        this.f44427c = aVar;
    }

    /* renamed from: g */
    private final synchronized void m56408g() {
        this.f44425a.mo42933c();
        this.f44426b.mo42930h();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m56409h(C18561l.C18562a aVar) {
        if (aVar instanceof C18561l.C18562a.C18566d) {
            C15627f fVar = this.f44425a;
            Object a = ((C18561l.C18562a.C18566d) aVar).mo46395a();
            if (a != null) {
                fVar.mo42931a((C41897h0) a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type okhttp3.WebSocket");
        } else if (aVar instanceof C18561l.C18562a.C18564b) {
            mo42918c(C18549h.f52056e);
        } else if ((aVar instanceof C18561l.C18562a.C18563a) || (aVar instanceof C18561l.C18562a.C18565c)) {
            m56408g();
        }
    }

    /* renamed from: a */
    public C18558j mo42916a() {
        C40741h m = this.f44426b.mo42929g().mo94933n(new C15623c(this)).mo94932m(new C15625d(new C15624d(this)));
        C41536l.m120485e(m, "okHttpWebSocketEventObse…is::handleWebSocketEvent)");
        return C15494b.m56048a(m);
    }

    /* renamed from: b */
    public synchronized boolean mo42917b(C18539d dVar) {
        boolean z;
        C41536l.m120490j(dVar, "message");
        if (dVar instanceof C18539d.C18541b) {
            z = this.f44425a.mo42932b(((C18539d.C18541b) dVar).mo46352a());
        } else if (dVar instanceof C18539d.C18540a) {
            byte[] a = ((C18539d.C18540a) dVar).mo46351a();
            C40681e t = C40681e.m117697t(a, 0, a.length);
            C15627f fVar = this.f44425a;
            C41536l.m120485e(t, "byteString");
            z = fVar.mo42936g(t);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return z;
    }

    /* renamed from: c */
    public synchronized boolean mo42918c(C18549h hVar) {
        C41536l.m120490j(hVar, "shutdownReason");
        return this.f44425a.mo42935f(hVar.mo46367a(), hVar.mo46368b());
    }

    public synchronized void cancel() {
        this.f44425a.cancel();
    }
}
