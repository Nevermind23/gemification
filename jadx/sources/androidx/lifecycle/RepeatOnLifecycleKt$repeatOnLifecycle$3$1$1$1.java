package androidx.lifecycle;

import android.support.p013v4.media.session.C0125b;
import androidx.lifecycle.C1593j;
import ef1.C40814h0;
import ef1.C40818i0;
import ef1.C40822j0;
import ef1.C40839n;
import ef1.C40845o1;
import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import java.util.concurrent.CancellationException;
import kf1.C41511a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41550z;
import me1.C41752f;
import oe1.C41862l;
import ue1.C43079p;

final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements C1606m {

    /* renamed from: d */
    final /* synthetic */ C1593j.C1594a f4533d;

    /* renamed from: e */
    final /* synthetic */ C41550z f4534e;

    /* renamed from: f */
    final /* synthetic */ C40814h0 f4535f;

    /* renamed from: g */
    final /* synthetic */ C1593j.C1594a f4536g;

    /* renamed from: h */
    final /* synthetic */ C40839n f4537h;

    /* renamed from: i */
    final /* synthetic */ C43079p f4538i;

    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a */
    static final class C1554a extends C41862l implements C43079p {

        /* renamed from: h */
        Object f4539h;

        /* renamed from: i */
        Object f4540i;

        /* renamed from: j */
        int f4541j;

        /* renamed from: k */
        final /* synthetic */ C43079p f4542k;

        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a */
        static final class C1555a extends C41862l implements C43079p {

            /* renamed from: h */
            int f4543h;

            /* renamed from: i */
            private /* synthetic */ Object f4544i;

            /* renamed from: j */
            final /* synthetic */ C43079p f4545j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1555a(C43079p pVar, Continuation continuation) {
                super(2, continuation);
                this.f4545j = pVar;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                C1555a aVar = new C1555a(this.f4545j, continuation);
                aVar.f4544i = obj;
                return aVar;
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object c = C41793d.m121157c();
                int i = this.f4543h;
                if (i == 0) {
                    C41228o.m119483b(obj);
                    C43079p pVar = this.f4545j;
                    this.f4543h = 1;
                    if (pVar.invoke((C40814h0) this.f4544i, this) == c) {
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
                return ((C1555a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1554a(C41511a aVar, C43079p pVar, Continuation continuation) {
            super(2, continuation);
            this.f4542k = pVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C1554a((C41511a) null, this.f4542k, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f4541j;
            if (i != 0) {
                if (i == 1) {
                    C43079p pVar = (C43079p) this.f4540i;
                    C0125b.m366a(this.f4539h);
                    C41228o.m119483b(obj);
                    C1555a aVar = new C1555a(pVar, (Continuation) null);
                    this.f4539h = null;
                    this.f4540i = null;
                    this.f4541j = 2;
                    if (C40818i0.m118310b(aVar, this) == c) {
                        return c;
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C0125b.m366a(this.f4539h);
                    C41228o.m119483b(obj);
                }
                C41238w wVar = C41238w.f97225a;
                throw null;
            }
            C41228o.m119483b(obj);
            C43079p pVar2 = this.f4542k;
            this.f4539h = null;
            this.f4540i = pVar2;
            this.f4541j = 1;
            throw null;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C1554a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: b */
    public final void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        C41536l.m120489i(qVar, "<anonymous parameter 0>");
        C41536l.m120489i(aVar, "event");
        if (aVar == this.f4533d) {
            this.f4534e.f97717d = C40821j.m118316b(this.f4535f, (C41752f) null, (C40822j0) null, new C1554a((C41511a) null, this.f4538i, (Continuation) null), 3, (Object) null);
            return;
        }
        if (aVar == this.f4536g) {
            C40845o1 o1Var = (C40845o1) this.f4534e.f97717d;
            if (o1Var != null) {
                C40845o1.C40846a.m118414a(o1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f4534e.f97717d = null;
        }
        if (aVar == C1593j.C1594a.ON_DESTROY) {
            C40839n nVar = this.f4537h;
            C41225n.C41226a aVar2 = C41225n.f97210d;
            nVar.mo94382h(C41225n.m119478a(C41238w.f97225a));
        }
    }
}
