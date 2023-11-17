package cd0;

import bd0.C19370a;
import ef1.C40793d0;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import oe1.C41862l;
import p953yq.C30109c;
import ue1.C43075l;
import y21.C40016a;

/* renamed from: cd0.d */
public final class C19728d extends C40016a implements C30109c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C19370a f54076b;

    /* renamed from: c */
    private final C40793d0 f54077c;

    /* renamed from: cd0.d$a */
    static final class C19729a extends C41862l implements C43075l {

        /* renamed from: h */
        int f54078h;

        /* renamed from: i */
        final /* synthetic */ C19728d f54079i;

        /* renamed from: j */
        final /* synthetic */ boolean f54080j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19729a(C19728d dVar, boolean z, Continuation continuation) {
            super(1, continuation);
            this.f54079i = dVar;
            this.f54080j = z;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f54078h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C19370a c2 = this.f54079i.f54076b;
                boolean z = this.f54080j;
                this.f54078h = 1;
                if (C19370a.C19371a.m64842a(c2, z, (C40793d0) null, this, 2, (Object) null) == c) {
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
        public final Continuation mo47933n(Continuation continuation) {
            return new C19729a(this.f54079i, this.f54080j, continuation);
        }

        /* renamed from: o */
        public final Object invoke(Continuation continuation) {
            return ((C19729a) mo47933n(continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19728d(C19370a aVar, C40793d0 d0Var) {
        super(d0Var);
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(d0Var, "coroutineDispatcher");
        this.f54076b = aVar;
        this.f54077c = d0Var;
    }

    /* renamed from: a */
    public Object mo47932a(boolean z, Continuation continuation) {
        Object b = mo93837b(new C19729a(this, z, (Continuation) null), continuation);
        return b == C41793d.m121157c() ? b : C41238w.f97225a;
    }
}
