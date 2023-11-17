package y21;

import b41.C31128a;
import ef1.C40793d0;
import ef1.C40814h0;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe1.C41853d;
import oe1.C41862l;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: y21.a */
public abstract class C40016a {

    /* renamed from: a */
    private final C40793d0 f95009a;

    /* renamed from: y21.a$a */
    static final class C40017a extends C41853d {

        /* renamed from: g */
        /* synthetic */ Object f95010g;

        /* renamed from: h */
        final /* synthetic */ C40016a f95011h;

        /* renamed from: i */
        int f95012i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40017a(C40016a aVar, Continuation continuation) {
            super(continuation);
            this.f95011h = aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f95010g = obj;
            this.f95012i |= Integer.MIN_VALUE;
            return this.f95011h.mo93837b((C43075l) null, this);
        }
    }

    /* renamed from: y21.a$b */
    static final class C40018b extends C41862l implements C43079p {

        /* renamed from: h */
        int f95013h;

        /* renamed from: i */
        final /* synthetic */ C43075l f95014i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40018b(C43075l lVar, Continuation continuation) {
            super(2, continuation);
            this.f95014i = lVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C40018b(this.f95014i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f95013h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C43075l lVar = this.f95014i;
                this.f95013h = 1;
                obj = lVar.invoke(this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return new C31128a.C31131c(obj, 0, 2, (DefaultConstructorMarker) null);
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C40018b) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public C40016a(C40793d0 d0Var) {
        C41536l.m120489i(d0Var, "coroutineDispatcher");
        this.f95009a = d0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo93837b(ue1.C43075l r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof y21.C40016a.C40017a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            y21.a$a r0 = (y21.C40016a.C40017a) r0
            int r1 = r0.f95012i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f95012i = r1
            goto L_0x0018
        L_0x0013:
            y21.a$a r0 = new y21.a$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f95010g
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f95012i
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            he1.C41228o.m119483b(r8)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0048
        L_0x0029:
            r7 = move-exception
            r1 = r7
            goto L_0x004b
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            he1.C41228o.m119483b(r8)
            ef1.d0 r8 = r6.f95009a     // Catch:{ Exception -> 0x0029 }
            y21.a$b r2 = new y21.a$b     // Catch:{ Exception -> 0x0029 }
            r4 = 0
            r2.<init>(r7, r4)     // Catch:{ Exception -> 0x0029 }
            r0.f95012i = r3     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r8 = ef1.C40813h.m118303e(r8, r2, r0)     // Catch:{ Exception -> 0x0029 }
            if (r8 != r1) goto L_0x0048
            return r1
        L_0x0048:
            b41.a r8 = (b41.C31128a) r8     // Catch:{ Exception -> 0x0029 }
            goto L_0x0059
        L_0x004b:
            boolean r7 = r1 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L_0x005a
            b41.a$a r8 = new b41.a$a
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0059:
            return r8
        L_0x005a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y21.C40016a.mo93837b(ue1.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
