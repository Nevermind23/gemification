package androidx.lifecycle;

import androidx.lifecycle.C1593j;
import ef1.C40814h0;
import ef1.C40822j0;
import ef1.C40845o1;
import ef1.C40867u0;
import he1.C41228o;
import he1.C41238w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;
import oe1.C41862l;
import ue1.C43079p;

public final class LifecycleCoroutineScopeImpl extends C1600k implements C1606m {

    /* renamed from: d */
    private final C1593j f4507d;

    /* renamed from: e */
    private final C41752f f4508e;

    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    static final class C1550a extends C41862l implements C43079p {

        /* renamed from: h */
        int f4509h;

        /* renamed from: i */
        private /* synthetic */ Object f4510i;

        /* renamed from: j */
        final /* synthetic */ LifecycleCoroutineScopeImpl f4511j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1550a(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Continuation continuation) {
            super(2, continuation);
            this.f4511j = lifecycleCoroutineScopeImpl;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C1550a aVar = new C1550a(this.f4511j, continuation);
            aVar.f4510i = obj;
            return aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object unused = C41793d.m121157c();
            if (this.f4509h == 0) {
                C41228o.m119483b(obj);
                C40814h0 h0Var = (C40814h0) this.f4510i;
                if (this.f4511j.mo4809c().mo4907b().compareTo(C1593j.C1598b.INITIALIZED) >= 0) {
                    this.f4511j.mo4809c().mo4906a(this.f4511j);
                } else {
                    C40865t1.m118462d(h0Var.mo4808Q(), (CancellationException) null, 1, (Object) null);
                }
                return C41238w.f97225a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C1550a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public LifecycleCoroutineScopeImpl(C1593j jVar, C41752f fVar) {
        C41536l.m120489i(jVar, "lifecycle");
        C41536l.m120489i(fVar, "coroutineContext");
        this.f4507d = jVar;
        this.f4508e = fVar;
        if (mo4809c().mo4907b() == C1593j.C1598b.DESTROYED) {
            C40865t1.m118462d(mo4808Q(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: Q */
    public C41752f mo4808Q() {
        return this.f4508e;
    }

    /* renamed from: b */
    public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        C41536l.m120489i(qVar, "source");
        C41536l.m120489i(aVar, "event");
        if (mo4809c().mo4907b().compareTo(C1593j.C1598b.DESTROYED) <= 0) {
            mo4809c().mo4909d(this);
            C40865t1.m118462d(mo4808Q(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: c */
    public C1593j mo4809c() {
        return this.f4507d;
    }

    /* renamed from: f */
    public final void mo4810f() {
        C40845o1 unused = C40821j.m118316b(this, C40867u0.m118469c().mo95277Q(), (C40822j0) null, new C1550a(this, (Continuation) null), 2, (Object) null);
    }
}
