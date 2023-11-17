package zh1;

import ef1.C40839n;
import ef1.C40843o;
import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import oe1.C41853d;
import oe1.C41857h;
import retrofit2.HttpException;
import ue1.C43075l;

/* renamed from: zh1.n */
public abstract class C43468n {

    /* renamed from: zh1.n$a */
    static final class C43469a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43443b f101340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43469a(C43443b bVar) {
            super(1);
            this.f101340d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f101340d.cancel();
        }
    }

    /* renamed from: zh1.n$b */
    static final class C43470b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43443b f101341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43470b(C43443b bVar) {
            super(1);
            this.f101341d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f101341d.cancel();
        }
    }

    /* renamed from: zh1.n$c */
    public static final class C43471c implements C43446d {

        /* renamed from: d */
        final /* synthetic */ C40839n f101342d;

        C43471c(C40839n nVar) {
            this.f101342d = nVar;
        }

        public void onFailure(C43443b bVar, Throwable th) {
            C41536l.m120490j(bVar, "call");
            C41536l.m120490j(th, "t");
            C40839n nVar = this.f101342d;
            C41225n.C41226a aVar = C41225n.f97210d;
            nVar.mo94382h(C41225n.m119478a(C41228o.m119482a(th)));
        }

        public void onResponse(C43443b bVar, C43510v vVar) {
            C41536l.m120490j(bVar, "call");
            C41536l.m120490j(vVar, "response");
            if (vVar.mo102216d()) {
                Object a = vVar.mo102214a();
                if (a == null) {
                    Object i = bVar.mo102160w().mo96680i(C43467m.class);
                    if (i == null) {
                        C41536l.m120500t();
                    }
                    C41536l.m120485e(i, "call.request().tag(Invocation::class.java)!!");
                    Method a2 = ((C43467m) i).mo102172a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    C41536l.m120485e(a2, "method");
                    Class<?> declaringClass = a2.getDeclaringClass();
                    C41536l.m120485e(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(a2.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                    C40839n nVar = this.f101342d;
                    C41225n.C41226a aVar = C41225n.f97210d;
                    nVar.mo94382h(C41225n.m119478a(C41228o.m119482a(kotlinNullPointerException)));
                    return;
                }
                this.f101342d.mo94382h(C41225n.m119478a(a));
                return;
            }
            C40839n nVar2 = this.f101342d;
            HttpException httpException = new HttpException(vVar);
            C41225n.C41226a aVar2 = C41225n.f97210d;
            nVar2.mo94382h(C41225n.m119478a(C41228o.m119482a(httpException)));
        }
    }

    /* renamed from: zh1.n$d */
    public static final class C43472d implements C43446d {

        /* renamed from: d */
        final /* synthetic */ C40839n f101343d;

        C43472d(C40839n nVar) {
            this.f101343d = nVar;
        }

        public void onFailure(C43443b bVar, Throwable th) {
            C41536l.m120490j(bVar, "call");
            C41536l.m120490j(th, "t");
            C40839n nVar = this.f101343d;
            C41225n.C41226a aVar = C41225n.f97210d;
            nVar.mo94382h(C41225n.m119478a(C41228o.m119482a(th)));
        }

        public void onResponse(C43443b bVar, C43510v vVar) {
            C41536l.m120490j(bVar, "call");
            C41536l.m120490j(vVar, "response");
            if (vVar.mo102216d()) {
                this.f101343d.mo94382h(C41225n.m119478a(vVar.mo102214a()));
                return;
            }
            C40839n nVar = this.f101343d;
            HttpException httpException = new HttpException(vVar);
            C41225n.C41226a aVar = C41225n.f97210d;
            nVar.mo94382h(C41225n.m119478a(C41228o.m119482a(httpException)));
        }
    }

    /* renamed from: zh1.n$e */
    static final class C43473e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43443b f101344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43473e(C43443b bVar) {
            super(1);
            this.f101344d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f101344d.cancel();
        }
    }

    /* renamed from: zh1.n$f */
    public static final class C43474f implements C43446d {

        /* renamed from: d */
        final /* synthetic */ C40839n f101345d;

        C43474f(C40839n nVar) {
            this.f101345d = nVar;
        }

        public void onFailure(C43443b bVar, Throwable th) {
            C41536l.m120490j(bVar, "call");
            C41536l.m120490j(th, "t");
            C40839n nVar = this.f101345d;
            C41225n.C41226a aVar = C41225n.f97210d;
            nVar.mo94382h(C41225n.m119478a(C41228o.m119482a(th)));
        }

        public void onResponse(C43443b bVar, C43510v vVar) {
            C41536l.m120490j(bVar, "call");
            C41536l.m120490j(vVar, "response");
            this.f101345d.mo94382h(C41225n.m119478a(vVar));
        }
    }

    /* renamed from: zh1.n$g */
    static final class C43475g implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Continuation f101346d;

        /* renamed from: e */
        final /* synthetic */ Exception f101347e;

        C43475g(Continuation continuation, Exception exc) {
            this.f101346d = continuation;
            this.f101347e = exc;
        }

        public final void run() {
            Continuation b = C41790c.m121154b(this.f101346d);
            Exception exc = this.f101347e;
            C41225n.C41226a aVar = C41225n.f97210d;
            b.mo94382h(C41225n.m119478a(C41228o.m119482a(exc)));
        }
    }

    /* renamed from: zh1.n$h */
    static final class C43476h extends C41853d {

        /* renamed from: g */
        /* synthetic */ Object f101348g;

        /* renamed from: h */
        int f101349h;

        /* renamed from: i */
        Object f101350i;

        C43476h(Continuation continuation) {
            super(continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f101348g = obj;
            this.f101349h |= Integer.MIN_VALUE;
            return C43468n.m124683d((Exception) null, this);
        }
    }

    /* renamed from: a */
    public static final Object m124680a(C43443b bVar, Continuation continuation) {
        C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
        oVar.mo95186i(new C43469a(bVar));
        bVar.mo102158i(new C43471c(oVar));
        Object x = oVar.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        return x;
    }

    /* renamed from: b */
    public static final Object m124681b(C43443b bVar, Continuation continuation) {
        C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
        oVar.mo95186i(new C43470b(bVar));
        bVar.mo102158i(new C43472d(oVar));
        Object x = oVar.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        return x;
    }

    /* renamed from: c */
    public static final Object m124682c(C43443b bVar, Continuation continuation) {
        C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
        oVar.mo95186i(new C43473e(bVar));
        bVar.mo102158i(new C43474f(oVar));
        Object x = oVar.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        return x;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m124683d(java.lang.Exception r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof zh1.C43468n.C43476h
            if (r0 == 0) goto L_0x0013
            r0 = r5
            zh1.n$h r0 = (zh1.C43468n.C43476h) r0
            int r1 = r0.f101349h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101349h = r1
            goto L_0x0018
        L_0x0013:
            zh1.n$h r0 = new zh1.n$h
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f101348g
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f101349h
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f101350i
            java.lang.Exception r4 = (java.lang.Exception) r4
            he1.C41228o.m119483b(r5)
            goto L_0x005c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            he1.C41228o.m119483b(r5)
            r0.f101350i = r4
            r0.f101349h = r3
            ef1.d0 r5 = ef1.C40867u0.m118467a()
            me1.f r2 = r0.mo94380b()
            zh1.n$g r3 = new zh1.n$g
            r3.<init>(r0, r4)
            r5.mo95148h(r2, r3)
            java.lang.Object r4 = ne1.C41793d.m121157c()
            java.lang.Object r5 = ne1.C41793d.m121157c()
            if (r4 != r5) goto L_0x0059
            oe1.C41857h.m121275c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            he1.w r4 = he1.C41238w.f97225a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zh1.C43468n.m124683d(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
