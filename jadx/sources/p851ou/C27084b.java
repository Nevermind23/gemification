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
import p953yq.C30110d;
import ue1.C43079p;

/* renamed from: ou.b */
public final class C27084b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C30110d f68023a;

    /* renamed from: ou.b$a */
    static final class C27085a extends C41862l implements C43079p {

        /* renamed from: h */
        int f68024h;

        /* renamed from: i */
        final /* synthetic */ C27084b f68025i;

        /* renamed from: j */
        final /* synthetic */ boolean f68026j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27085a(C27084b bVar, boolean z, Continuation continuation) {
            super(2, continuation);
            this.f68025i = bVar;
            this.f68026j = z;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C27085a(this.f68025i, this.f68026j, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f68024h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C30110d a = this.f68025i.f68023a;
                boolean z = this.f68026j;
                this.f68024h = 1;
                if (a.mo47935a(z, this) == c) {
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
            return ((C27085a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public C27084b(C30110d dVar) {
        C41536l.m120489i(dVar, "updateDictionary");
        this.f68023a = dVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C40734b m83955d(C27084b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return bVar.mo66337c(z);
    }

    /* renamed from: b */
    public final C40734b mo66336b() {
        return m83955d(this, false, 1, (Object) null);
    }

    /* renamed from: c */
    public final C40734b mo66337c(boolean z) {
        return C41431e.m120221c((C41752f) null, new C27085a(this, z, (Continuation) null), 1, (Object) null);
    }
}
