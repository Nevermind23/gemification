package p267u0;

import android.os.CancellationSignal;
import ef1.C40793d0;
import ef1.C40813h;
import ef1.C40814h0;
import ef1.C40815h1;
import ef1.C40822j0;
import ef1.C40839n;
import ef1.C40843o;
import ef1.C40845o1;
import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me1.C41748d;
import oe1.C41857h;
import oe1.C41862l;
import p318y0.C8991b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: u0.f */
public abstract class C8465f {

    /* renamed from: a */
    public static final C8466a f24060a = new C8466a((DefaultConstructorMarker) null);

    /* renamed from: u0.f$a */
    public static final class C8466a {

        /* renamed from: u0.f$a$a */
        static final class C8467a extends C41862l implements C43079p {

            /* renamed from: h */
            int f24061h;

            /* renamed from: i */
            final /* synthetic */ Callable f24062i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8467a(Callable callable, Continuation continuation) {
                super(2, continuation);
                this.f24062i = callable;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C8467a(this.f24062i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object unused = C41793d.m121157c();
                if (this.f24061h == 0) {
                    C41228o.m119483b(obj);
                    return this.f24062i.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C8467a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* renamed from: u0.f$a$b */
        static final class C8468b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CancellationSignal f24063d;

            /* renamed from: e */
            final /* synthetic */ C40845o1 f24064e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8468b(CancellationSignal cancellationSignal, C40845o1 o1Var) {
                super(1);
                this.f24063d = cancellationSignal;
                this.f24064e = o1Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C8991b.m33278a(this.f24063d);
                C40845o1.C40846a.m118414a(this.f24064e, (CancellationException) null, 1, (Object) null);
            }
        }

        /* renamed from: u0.f$a$c */
        static final class C8469c extends C41862l implements C43079p {

            /* renamed from: h */
            int f24065h;

            /* renamed from: i */
            final /* synthetic */ Callable f24066i;

            /* renamed from: j */
            final /* synthetic */ C40839n f24067j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8469c(Callable callable, C40839n nVar, Continuation continuation) {
                super(2, continuation);
                this.f24066i = callable;
                this.f24067j = nVar;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C8469c(this.f24066i, this.f24067j, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object unused = C41793d.m121157c();
                if (this.f24065h == 0) {
                    C41228o.m119483b(obj);
                    try {
                        this.f24067j.mo94382h(C41225n.m119478a(this.f24066i.call()));
                    } catch (Throwable th) {
                        C40839n nVar = this.f24067j;
                        C41225n.C41226a aVar = C41225n.f97210d;
                        nVar.mo94382h(C41225n.m119478a(C41228o.m119482a(th)));
                    }
                    return C41238w.f97225a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C8469c) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        private C8466a() {
        }

        public /* synthetic */ C8466a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Object mo23729a(C8503w wVar, boolean z, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
            C40793d0 d0Var;
            C41748d dVar;
            if (wVar.mo23821z() && wVar.mo23817t()) {
                return callable.call();
            }
            C8470f0 f0Var = (C8470f0) continuation.mo94380b().mo23736c(C8470f0.f24068g);
            if (f0Var == null || (dVar = f0Var.mo23737e()) == null) {
                if (z) {
                    d0Var = C8472g.m31757b(wVar);
                } else {
                    d0Var = C8472g.m31756a(wVar);
                }
                dVar = d0Var;
            }
            C41748d dVar2 = dVar;
            C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
            oVar.mo95193C();
            oVar.mo95186i(new C8468b(cancellationSignal, C40821j.m118316b(C40815h1.f96534d, dVar2, (C40822j0) null, new C8469c(callable, oVar, (Continuation) null), 2, (Object) null)));
            Object x = oVar.mo95209x();
            if (x == C41793d.m121157c()) {
                C41857h.m121275c(continuation);
            }
            return x;
        }

        /* renamed from: b */
        public final Object mo23730b(C8503w wVar, boolean z, Callable callable, Continuation continuation) {
            C41748d dVar;
            C40793d0 d0Var;
            if (wVar.mo23821z() && wVar.mo23817t()) {
                return callable.call();
            }
            C8470f0 f0Var = (C8470f0) continuation.mo94380b().mo23736c(C8470f0.f24068g);
            if (f0Var == null || (dVar = f0Var.mo23737e()) == null) {
                if (z) {
                    d0Var = C8472g.m31757b(wVar);
                } else {
                    d0Var = C8472g.m31756a(wVar);
                }
                dVar = d0Var;
            }
            return C40813h.m118303e(dVar, new C8467a(callable, (Continuation) null), continuation);
        }
    }

    /* renamed from: a */
    public static final Object m31739a(C8503w wVar, boolean z, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
        return f24060a.mo23729a(wVar, z, cancellationSignal, callable, continuation);
    }

    /* renamed from: b */
    public static final Object m31740b(C8503w wVar, boolean z, Callable callable, Continuation continuation) {
        return f24060a.mo23730b(wVar, z, callable, continuation);
    }
}
