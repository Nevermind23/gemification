package hf1;

import ef1.C40814h0;
import ef1.C40818i0;
import ef1.C40822j0;
import ef1.C40832l0;
import gf1.C41097e;
import gf1.C41111o;
import gf1.C41113q;
import gf1.C41115s;
import he1.C41228o;
import he1.C41238w;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlinx.coroutines.flow.C41556a;
import kotlinx.coroutines.flow.C41557b;
import kotlinx.coroutines.flow.C41558c;
import me1.C41752f;
import me1.C41758g;
import oe1.C41862l;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: hf1.d */
public abstract class C41243d implements C41255i {

    /* renamed from: a */
    public final C41752f f97232a;

    /* renamed from: b */
    public final int f97233b;

    /* renamed from: c */
    public final C41097e f97234c;

    /* renamed from: hf1.d$a */
    static final class C41244a extends C41862l implements C43079p {

        /* renamed from: h */
        int f97235h;

        /* renamed from: i */
        private /* synthetic */ Object f97236i;

        /* renamed from: j */
        final /* synthetic */ C41557b f97237j;

        /* renamed from: k */
        final /* synthetic */ C41243d f97238k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41244a(C41557b bVar, C41243d dVar, Continuation continuation) {
            super(2, continuation);
            this.f97237j = bVar;
            this.f97238k = dVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C41244a aVar = new C41244a(this.f97237j, this.f97238k, continuation);
            aVar.f97236i = obj;
            return aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f97235h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C41557b bVar = this.f97237j;
                C41115s k = this.f97238k.mo95714k((C40814h0) this.f97236i);
                this.f97235h = 1;
                if (C41558c.m120520g(bVar, k, this) == c) {
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
            return ((C41244a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: hf1.d$b */
    static final class C41245b extends C41862l implements C43079p {

        /* renamed from: h */
        int f97239h;

        /* renamed from: i */
        /* synthetic */ Object f97240i;

        /* renamed from: j */
        final /* synthetic */ C41243d f97241j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41245b(C41243d dVar, Continuation continuation) {
            super(2, continuation);
            this.f97241j = dVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C41245b bVar = new C41245b(this.f97241j, continuation);
            bVar.f97240i = obj;
            return bVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f97239h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C41243d dVar = this.f97241j;
                this.f97239h = 1;
                if (dVar.mo95710g((C41113q) this.f97240i, this) == c) {
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
        public final Object invoke(C41113q qVar, Continuation continuation) {
            return ((C41245b) mo3708a(qVar, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public C41243d(C41752f fVar, int i, C41097e eVar) {
        this.f97232a = fVar;
        this.f97233b = i;
        this.f97234c = eVar;
    }

    /* renamed from: f */
    static /* synthetic */ Object m119510f(C41243d dVar, C41557b bVar, Continuation continuation) {
        Object b = C40818i0.m118310b(new C41244a(bVar, dVar, (Continuation) null), continuation);
        return b == C41793d.m121157c() ? b : C41238w.f97225a;
    }

    /* renamed from: a */
    public Object mo95707a(C41557b bVar, Continuation continuation) {
        return m119510f(this, bVar, continuation);
    }

    /* renamed from: d */
    public C41556a mo95708d(C41752f fVar, int i, C41097e eVar) {
        C41752f u = fVar.mo23741u(this.f97232a);
        if (eVar == C41097e.SUSPEND) {
            int i2 = this.f97233b;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            eVar = this.f97234c;
        }
        if (C41536l.m120484d(u, this.f97232a) && i == this.f97233b && eVar == this.f97234c) {
            return this;
        }
        return mo95711h(u, i, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo95709e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract Object mo95710g(C41113q qVar, Continuation continuation);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C41243d mo95711h(C41752f fVar, int i, C41097e eVar);

    /* renamed from: i */
    public final C43079p mo95712i() {
        return new C41245b(this, (Continuation) null);
    }

    /* renamed from: j */
    public final int mo95713j() {
        int i = this.f97233b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: k */
    public C41115s mo95714k(C40814h0 h0Var) {
        return C41111o.m119190b(h0Var, this.f97232a, mo95713j(), this.f97234c, C40822j0.ATOMIC, (C43075l) null, mo95712i(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e = mo95709e();
        if (e != null) {
            arrayList.add(e);
        }
        if (this.f97232a != C41758g.f98029d) {
            arrayList.add("context=" + this.f97232a);
        }
        if (this.f97233b != -3) {
            arrayList.add("capacity=" + this.f97233b);
        }
        if (this.f97234c != C41097e.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f97234c);
        }
        return C40832l0.m118329a(this) + '[' + C41358y.m120017g0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null) + ']';
    }
}
