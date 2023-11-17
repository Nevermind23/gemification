package ne1;

import he1.C41228o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;
import me1.C41758g;
import oe1.C41850a;
import oe1.C41853d;
import oe1.C41857h;
import oe1.C41860j;
import ue1.C43079p;

/* renamed from: ne1.c */
abstract class C41790c {

    /* renamed from: ne1.c$a */
    public static final class C41791a extends C41860j {

        /* renamed from: e */
        private int f98113e;

        /* renamed from: f */
        final /* synthetic */ C43079p f98114f;

        /* renamed from: g */
        final /* synthetic */ Object f98115g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41791a(Continuation continuation, C43079p pVar, Object obj) {
            super(continuation);
            this.f98114f = pVar;
            this.f98115g = obj;
            C41536l.m120487g(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public Object mo3709f(Object obj) {
            int i = this.f98113e;
            if (i == 0) {
                this.f98113e = 1;
                C41228o.m119483b(obj);
                C41536l.m120487g(this.f98114f, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((C43079p) C41527d0.m120459f(this.f98114f, 2)).invoke(this.f98115g, this);
            } else if (i == 1) {
                this.f98113e = 2;
                C41228o.m119483b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: ne1.c$b */
    public static final class C41792b extends C41853d {

        /* renamed from: g */
        private int f98116g;

        /* renamed from: h */
        final /* synthetic */ C43079p f98117h;

        /* renamed from: i */
        final /* synthetic */ Object f98118i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41792b(Continuation continuation, C41752f fVar, C43079p pVar, Object obj) {
            super(continuation, fVar);
            this.f98117h = pVar;
            this.f98118i = obj;
            C41536l.m120487g(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public Object mo3709f(Object obj) {
            int i = this.f98116g;
            if (i == 0) {
                this.f98116g = 1;
                C41228o.m119483b(obj);
                C41536l.m120487g(this.f98117h, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((C43079p) C41527d0.m120459f(this.f98117h, 2)).invoke(this.f98118i, this);
            } else if (i == 1) {
                this.f98116g = 2;
                C41228o.m119483b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static Continuation m121153a(C43079p pVar, Object obj, Continuation continuation) {
        C41536l.m120489i(pVar, "<this>");
        C41536l.m120489i(continuation, "completion");
        Continuation a = C41857h.m121273a(continuation);
        if (pVar instanceof C41850a) {
            return ((C41850a) pVar).mo3708a(obj, a);
        }
        C41752f b = a.mo94380b();
        if (b == C41758g.f98029d) {
            return new C41791a(a, pVar, obj);
        }
        return new C41792b(a, b, pVar, obj);
    }

    /* renamed from: b */
    public static Continuation m121154b(Continuation continuation) {
        C41853d dVar;
        Continuation m;
        C41536l.m120489i(continuation, "<this>");
        if (continuation instanceof C41853d) {
            dVar = (C41853d) continuation;
        } else {
            dVar = null;
        }
        if (dVar == null || (m = dVar.mo96648m()) == null) {
            return continuation;
        }
        return m;
    }
}
