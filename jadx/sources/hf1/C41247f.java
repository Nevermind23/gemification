package hf1;

import gf1.C41097e;
import gf1.C41113q;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlinx.coroutines.flow.C41556a;
import kotlinx.coroutines.flow.C41557b;
import me1.C41748d;
import me1.C41752f;
import oe1.C41862l;
import ue1.C43079p;

/* renamed from: hf1.f */
public abstract class C41247f extends C41243d {

    /* renamed from: d */
    protected final C41556a f97242d;

    /* renamed from: hf1.f$a */
    static final class C41248a extends C41862l implements C43079p {

        /* renamed from: h */
        int f97243h;

        /* renamed from: i */
        /* synthetic */ Object f97244i;

        /* renamed from: j */
        final /* synthetic */ C41247f f97245j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41248a(C41247f fVar, Continuation continuation) {
            super(2, continuation);
            this.f97245j = fVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C41248a aVar = new C41248a(this.f97245j, continuation);
            aVar.f97244i = obj;
            return aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f97243h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C41247f fVar = this.f97245j;
                this.f97243h = 1;
                if (fVar.mo95718o((C41557b) this.f97244i, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C41557b bVar, Continuation continuation) {
            return ((C41248a) mo3708a(bVar, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public C41247f(C41556a aVar, C41752f fVar, int i, C41097e eVar) {
        super(fVar, i, eVar);
        this.f97242d = aVar;
    }

    /* renamed from: l */
    static /* synthetic */ Object m119529l(C41247f fVar, C41557b bVar, Continuation continuation) {
        if (fVar.f97233b == -3) {
            C41752f b = continuation.mo94380b();
            C41752f u = b.mo23741u(fVar.f97232a);
            if (C41536l.m120484d(u, b)) {
                Object o = fVar.mo95718o(bVar, continuation);
                if (o == C41793d.m121157c()) {
                    return o;
                }
                return C41238w.f97225a;
            }
            C41748d.C41750b bVar2 = C41748d.f98026f3;
            if (C41536l.m120484d(u.mo23736c(bVar2), b.mo23736c(bVar2))) {
                Object n = fVar.m119531n(bVar, u, continuation);
                if (n == C41793d.m121157c()) {
                    return n;
                }
                return C41238w.f97225a;
            }
        }
        Object a = super.mo95707a(bVar, continuation);
        if (a == C41793d.m121157c()) {
            return a;
        }
        return C41238w.f97225a;
    }

    /* renamed from: m */
    static /* synthetic */ Object m119530m(C41247f fVar, C41113q qVar, Continuation continuation) {
        Object o = fVar.mo95718o(new C41259l(qVar), continuation);
        return o == C41793d.m121157c() ? o : C41238w.f97225a;
    }

    /* renamed from: n */
    private final Object m119531n(C41557b bVar, C41752f fVar, Continuation continuation) {
        Object c = C41246e.m119527c(fVar, C41246e.m119528d(bVar, continuation.mo94380b()), (Object) null, new C41248a(this, (Continuation) null), continuation, 4, (Object) null);
        if (c == C41793d.m121157c()) {
            return c;
        }
        return C41238w.f97225a;
    }

    /* renamed from: a */
    public Object mo95707a(C41557b bVar, Continuation continuation) {
        return m119529l(this, bVar, continuation);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo95710g(C41113q qVar, Continuation continuation) {
        return m119530m(this, qVar, continuation);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract Object mo95718o(C41557b bVar, Continuation continuation);

    public String toString() {
        return this.f97242d + " -> " + super.toString();
    }
}
