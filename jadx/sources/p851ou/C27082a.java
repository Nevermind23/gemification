package p851ou;

import ed1.C40734b;
import ef1.C40814h0;
import he1.C41228o;
import he1.C41238w;
import jf1.C41431e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;
import oe1.C41862l;
import p953yq.C30109c;
import ue1.C43079p;

/* renamed from: ou.a */
public final class C27082a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C30109c f68019a;

    /* renamed from: ou.a$a */
    static final class C27083a extends C41862l implements C43079p {

        /* renamed from: h */
        int f68020h;

        /* renamed from: i */
        final /* synthetic */ C27082a f68021i;

        /* renamed from: j */
        final /* synthetic */ boolean f68022j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27083a(C27082a aVar, boolean z, Continuation continuation) {
            super(2, continuation);
            this.f68021i = aVar;
            this.f68022j = z;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C27083a(this.f68021i, this.f68022j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f68020h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C30109c a = this.f68021i.f68019a;
                boolean z = this.f68022j;
                this.f68020h = 1;
                if (a.mo47932a(z, this) == c) {
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
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C27083a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public C27082a(C30109c cVar) {
        C41536l.m120489i(cVar, "initDictionary");
        this.f68019a = cVar;
    }

    /* renamed from: b */
    public final C40734b mo66334b(boolean z) {
        return C41431e.m120221c((C41752f) null, new C27083a(this, z, (Continuation) null), 1, (Object) null);
    }
}
