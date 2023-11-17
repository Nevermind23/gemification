package ef1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41550z;
import me1.C41748d;
import me1.C41752f;
import me1.C41758g;
import oe1.C41854e;
import ue1.C43079p;

/* renamed from: ef1.c0 */
public abstract class C40786c0 {

    /* renamed from: ef1.c0$a */
    static final class C40787a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C40787a f96512d = new C40787a();

        C40787a() {
            super(2);
        }

        /* renamed from: a */
        public final C41752f invoke(C41752f fVar, C41752f.C41755b bVar) {
            return fVar.mo23741u(bVar);
        }
    }

    /* renamed from: ef1.c0$b */
    static final class C40788b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C41550z f96513d;

        /* renamed from: e */
        final /* synthetic */ boolean f96514e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40788b(C41550z zVar, boolean z) {
            super(2);
            this.f96513d = zVar;
            this.f96514e = z;
        }

        /* renamed from: a */
        public final C41752f invoke(C41752f fVar, C41752f.C41755b bVar) {
            return fVar.mo23741u(bVar);
        }
    }

    /* renamed from: ef1.c0$c */
    static final class C40789c extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C40789c f96515d = new C40789c();

        C40789c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo95143a(boolean z, C41752f.C41755b bVar) {
            return Boolean.valueOf(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo95143a(((Boolean) obj).booleanValue(), (C41752f.C41755b) obj2);
        }
    }

    /* renamed from: a */
    private static final C41752f m118258a(C41752f fVar, C41752f fVar2, boolean z) {
        boolean c = m118260c(fVar);
        boolean c2 = m118260c(fVar2);
        if (!c && !c2) {
            return fVar.mo23741u(fVar2);
        }
        C41550z zVar = new C41550z();
        zVar.f97717d = fVar2;
        C41758g gVar = C41758g.f98029d;
        C41752f fVar3 = (C41752f) fVar.mo23734U(gVar, new C40788b(zVar, z));
        if (c2) {
            zVar.f97717d = ((C41752f) zVar.f97717d).mo23734U(gVar, C40787a.f96512d);
        }
        return fVar3.mo23741u((C41752f) zVar.f97717d);
    }

    /* renamed from: b */
    public static final String m118259b(C41752f fVar) {
        return null;
    }

    /* renamed from: c */
    private static final boolean m118260c(C41752f fVar) {
        return ((Boolean) fVar.mo23734U(Boolean.FALSE, C40789c.f96515d)).booleanValue();
    }

    /* renamed from: d */
    public static final C41752f m118261d(C40814h0 h0Var, C41752f fVar) {
        C41752f a = m118258a(h0Var.mo4808Q(), fVar, true);
        if (a == C40867u0.m118467a() || a.mo23736c(C41748d.f98026f3) != null) {
            return a;
        }
        return a.mo23741u(C40867u0.m118467a());
    }

    /* renamed from: e */
    public static final C41752f m118262e(C41752f fVar, C41752f fVar2) {
        if (!m118260c(fVar2)) {
            return fVar.mo23741u(fVar2);
        }
        return m118258a(fVar, fVar2, false);
    }

    /* renamed from: f */
    public static final C40842n2 m118263f(C41854e eVar) {
        while (!(eVar instanceof C40858r0) && (eVar = eVar.mo95202g()) != null) {
            if (eVar instanceof C40842n2) {
                return (C40842n2) eVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C40842n2 m118264g(Continuation continuation, C41752f fVar, Object obj) {
        boolean z;
        if (!(continuation instanceof C41854e)) {
            return null;
        }
        if (fVar.mo23736c(C40848o2.f96563d) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C40842n2 f = m118263f((C41854e) continuation);
        if (f != null) {
            f.mo95192P0(fVar, obj);
        }
        return f;
    }
}
