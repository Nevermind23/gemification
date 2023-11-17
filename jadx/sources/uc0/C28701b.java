package uc0;

import he1.C41238w;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import oe1.C41853d;
import vc0.C29035a;
import wc0.C29300a;

/* renamed from: uc0.b */
public final class C28701b implements C28700a {

    /* renamed from: a */
    private final C29300a f73086a;

    /* renamed from: b */
    private final C29035a f73087b;

    /* renamed from: uc0.b$a */
    static final class C28702a extends C41853d {

        /* renamed from: g */
        Object f73088g;

        /* renamed from: h */
        /* synthetic */ Object f73089h;

        /* renamed from: i */
        final /* synthetic */ C28701b f73090i;

        /* renamed from: j */
        int f73091j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28702a(C28701b bVar, Continuation continuation) {
            super(continuation);
            this.f73090i = bVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f73089h = obj;
            this.f73091j |= Integer.MIN_VALUE;
            return this.f73090i.mo68439d(this);
        }
    }

    /* renamed from: uc0.b$b */
    static final class C28703b extends C41853d {

        /* renamed from: g */
        Object f73092g;

        /* renamed from: h */
        /* synthetic */ Object f73093h;

        /* renamed from: i */
        final /* synthetic */ C28701b f73094i;

        /* renamed from: j */
        int f73095j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28703b(C28701b bVar, Continuation continuation) {
            super(continuation);
            this.f73094i = bVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f73093h = obj;
            this.f73095j |= Integer.MIN_VALUE;
            return this.f73094i.mo68437b(this);
        }
    }

    /* renamed from: uc0.b$c */
    static final class C28704c extends C41853d {

        /* renamed from: g */
        Object f73096g;

        /* renamed from: h */
        /* synthetic */ Object f73097h;

        /* renamed from: i */
        final /* synthetic */ C28701b f73098i;

        /* renamed from: j */
        int f73099j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28704c(C28701b bVar, Continuation continuation) {
            super(continuation);
            this.f73098i = bVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f73097h = obj;
            this.f73099j |= Integer.MIN_VALUE;
            return this.f73098i.mo68440e(this);
        }
    }

    public C28701b(C29300a aVar, C29035a aVar2) {
        C41536l.m120489i(aVar, "dictionaryDao");
        C41536l.m120489i(aVar2, "mapper");
        this.f73086a = aVar;
        this.f73087b = aVar2;
    }

    /* renamed from: a */
    public Object mo68436a(List list, List list2, Continuation continuation) {
        Object a = this.f73086a.mo69148a(list, list2, continuation);
        return a == C41793d.m121157c() ? a : C41238w.f97225a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[LOOP:0: B:17:0x0059->B:19:0x005f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo68437b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uc0.C28701b.C28703b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uc0.b$b r0 = (uc0.C28701b.C28703b) r0
            int r1 = r0.f73095j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f73095j = r1
            goto L_0x0018
        L_0x0013:
            uc0.b$b r0 = new uc0.b$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f73093h
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f73095j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f73092g
            uc0.b r0 = (uc0.C28701b) r0
            he1.C41228o.m119483b(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            he1.C41228o.m119483b(r5)
            wc0.a r5 = r4.f73086a
            r0.f73092g = r4
            r0.f73095j = r3
            java.lang.Object r5 = r5.mo69149b(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            vc0.a r0 = r0.f73087b
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = ie1.C41343r.m119925u(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0059:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r5.next()
            xc0.b r2 = (xc0.C29740b) r2
            ad0.a r2 = r0.mo68904a(r2)
            r1.add(r2)
            goto L_0x0059
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uc0.C28701b.mo68437b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: c */
    public Object mo68438c(Continuation continuation) {
        Object c = this.f73086a.mo69150c(continuation);
        return c == C41793d.m121157c() ? c : C41238w.f97225a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[LOOP:0: B:17:0x0059->B:19:0x005f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo68439d(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uc0.C28701b.C28702a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uc0.b$a r0 = (uc0.C28701b.C28702a) r0
            int r1 = r0.f73091j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f73091j = r1
            goto L_0x0018
        L_0x0013:
            uc0.b$a r0 = new uc0.b$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f73089h
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f73091j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f73088g
            uc0.b r0 = (uc0.C28701b) r0
            he1.C41228o.m119483b(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            he1.C41228o.m119483b(r5)
            wc0.a r5 = r4.f73086a
            r0.f73088g = r4
            r0.f73091j = r3
            java.lang.Object r5 = r5.mo69151d(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            vc0.a r0 = r0.f73087b
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = ie1.C41343r.m119925u(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0059:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r5.next()
            xc0.b r2 = (xc0.C29740b) r2
            ad0.a r2 = r0.mo68904a(r2)
            r1.add(r2)
            goto L_0x0059
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uc0.C28701b.mo68439d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo68440e(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof uc0.C28701b.C28704c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uc0.b$c r0 = (uc0.C28701b.C28704c) r0
            int r1 = r0.f73099j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f73099j = r1
            goto L_0x0018
        L_0x0013:
            uc0.b$c r0 = new uc0.b$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f73097h
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f73099j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            he1.C41228o.m119483b(r6)
            goto L_0x005d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.f73096g
            uc0.b r2 = (uc0.C28701b) r2
            he1.C41228o.m119483b(r6)
            goto L_0x004d
        L_0x003c:
            he1.C41228o.m119483b(r6)
            wc0.a r6 = r5.f73086a
            r0.f73096g = r5
            r0.f73099j = r4
            java.lang.Object r6 = r6.mo69157j(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            if (r6 == 0) goto L_0x0061
            wc0.a r6 = r2.f73086a
            r2 = 0
            r0.f73096g = r2
            r0.f73099j = r3
            java.lang.Object r6 = r6.mo69152e(r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            if (r6 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r4 = 0
        L_0x0061:
            java.lang.Boolean r6 = oe1.C41851b.m121254a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uc0.C28701b.mo68440e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
