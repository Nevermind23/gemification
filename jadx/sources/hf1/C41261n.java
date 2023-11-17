package hf1;

import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C41557b;
import kotlinx.coroutines.internal.C41592e0;
import me1.C41752f;
import oe1.C41862l;
import ue1.C43079p;

/* renamed from: hf1.n */
final class C41261n implements C41557b {

    /* renamed from: a */
    private final C41752f f97272a;

    /* renamed from: b */
    private final Object f97273b;

    /* renamed from: c */
    private final C43079p f97274c;

    /* renamed from: hf1.n$a */
    static final class C41262a extends C41862l implements C43079p {

        /* renamed from: h */
        int f97275h;

        /* renamed from: i */
        /* synthetic */ Object f97276i;

        /* renamed from: j */
        final /* synthetic */ C41557b f97277j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41262a(C41557b bVar, Continuation continuation) {
            super(2, continuation);
            this.f97277j = bVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C41262a aVar = new C41262a(this.f97277j, continuation);
            aVar.f97276i = obj;
            return aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f97275h;
            if (i == 0) {
                C41228o.m119483b(obj);
                Object obj2 = this.f97276i;
                C41557b bVar = this.f97277j;
                this.f97275h = 1;
                if (bVar.mo95721b(obj2, this) == c) {
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
        public final Object invoke(Object obj, Continuation continuation) {
            return ((C41262a) mo3708a(obj, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public C41261n(C41557b bVar, C41752f fVar) {
        this.f97272a = fVar;
        this.f97273b = C41592e0.m120648b(fVar);
        this.f97274c = new C41262a(bVar, (Continuation) null);
    }

    /* renamed from: b */
    public Object mo95721b(Object obj, Continuation continuation) {
        Object b = C41246e.m119526b(this.f97272a, obj, this.f97273b, this.f97274c, continuation);
        return b == C41793d.m121157c() ? b : C41238w.f97225a;
    }
}
