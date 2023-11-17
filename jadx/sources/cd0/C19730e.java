package cd0;

import bd0.C19370a;
import ef1.C40793d0;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import oe1.C41853d;
import oe1.C41862l;
import p953yq.C30110d;
import ue1.C43075l;
import y21.C40016a;

/* renamed from: cd0.e */
public final class C19730e extends C40016a implements C30110d {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C19370a f54081b;

    /* renamed from: c */
    private final C40793d0 f54082c;

    /* renamed from: cd0.e$a */
    static final class C19731a extends C41853d {

        /* renamed from: g */
        /* synthetic */ Object f54083g;

        /* renamed from: h */
        final /* synthetic */ C19730e f54084h;

        /* renamed from: i */
        int f54085i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19731a(C19730e eVar, Continuation continuation) {
            super(continuation);
            this.f54084h = eVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f54083g = obj;
            this.f54085i |= Integer.MIN_VALUE;
            return this.f54084h.mo47935a(false, this);
        }
    }

    /* renamed from: cd0.e$b */
    static final class C19732b extends C41862l implements C43075l {

        /* renamed from: h */
        int f54086h;

        /* renamed from: i */
        final /* synthetic */ C19730e f54087i;

        /* renamed from: j */
        final /* synthetic */ boolean f54088j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19732b(C19730e eVar, boolean z, Continuation continuation) {
            super(1, continuation);
            this.f54087i = eVar;
            this.f54088j = z;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f54086h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C19370a c2 = this.f54087i.f54081b;
                boolean z = this.f54088j;
                this.f54086h = 1;
                if (c2.mo47584e(z, this) == c) {
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
        public final Continuation mo47936n(Continuation continuation) {
            return new C19732b(this.f54087i, this.f54088j, continuation);
        }

        /* renamed from: o */
        public final Object invoke(Continuation continuation) {
            return ((C19732b) mo47936n(continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: cd0.e$c */
    static final class C19733c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19733c f54089d = new C19733c();

        C19733c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "error");
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19730e(C19370a aVar, C40793d0 d0Var) {
        super(d0Var);
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(d0Var, "coroutineDispatcher");
        this.f54081b = aVar;
        this.f54082c = d0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo47935a(boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cd0.C19730e.C19731a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            cd0.e$a r0 = (cd0.C19730e.C19731a) r0
            int r1 = r0.f54085i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f54085i = r1
            goto L_0x0018
        L_0x0013:
            cd0.e$a r0 = new cd0.e$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f54083g
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f54085i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            he1.C41228o.m119483b(r7)
            goto L_0x0043
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            he1.C41228o.m119483b(r7)
            cd0.e$b r7 = new cd0.e$b
            r7.<init>(r5, r6, r3)
            r0.f54085i = r4
            java.lang.Object r7 = r5.mo93837b(r7, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            b41.a r7 = (b41.C31128a) r7
            cd0.e$c r6 = cd0.C19730e.C19733c.f54089d
            b41.C31132b.m92643e(r7, r3, r6, r4, r3)
            he1.w r6 = he1.C41238w.f97225a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cd0.C19730e.mo47935a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
