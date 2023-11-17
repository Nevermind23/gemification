package p925vv;

import ed1.C40749p;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p936wv.C29581g;
import p947xv.C29860a;
import ue1.C43075l;

/* renamed from: vv.c */
public final class C29167c {

    /* renamed from: a */
    private final C29860a f74184a;

    /* renamed from: b */
    private C41205b f74185b;

    /* renamed from: vv.c$a */
    static final class C29168a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29168a f74186d = new C29168a();

        C29168a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo69009a(C29581g gVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69009a((C29581g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vv.c$b */
    static final class C29169b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29169b f74187d = new C29169b();

        C29169b() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    public C29167c(C29860a aVar) {
        C41536l.m120489i(aVar, "budgetingRepository");
        this.f74184a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m89101e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m89102f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: c */
    public final void mo69007c() {
        C41205b bVar = this.f74185b;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: d */
    public final C40749p mo69008d() {
        if (!this.f74184a.mo70104q2()) {
            this.f74185b = this.f74184a.mo70101L1().mo95070I(new C29165a(C29168a.f74186d), new C29166b(C29169b.f74187d));
        }
        return this.f74184a.mo70100K0();
    }
}
