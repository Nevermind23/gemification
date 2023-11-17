package p713ay;

import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import hd0.C24978b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p707as.C19273c;
import p717bs.C19401a;
import p752ey.C20304a;
import p971zx.C30413a;
import ue1.C43075l;

/* renamed from: ay.d */
public final class C19284d implements C20304a {

    /* renamed from: a */
    private final C30413a f53495a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C40765a f53496b;

    /* renamed from: ay.d$a */
    static final class C19285a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19285a f53497d = new C19285a();

        C19285a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(YesNoApiEntity yesNoApiEntity) {
            boolean z;
            C41536l.m120489i(yesNoApiEntity, "it");
            if (C19401a.m64892a(yesNoApiEntity) == C24978b.YES) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ay.d$b */
    static final class C19286b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19284d f53498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19286b(C19284d dVar) {
            super(1);
            this.f53498d = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f53498d.f53496b.onNext(bool);
        }
    }

    /* renamed from: ay.d$c */
    static final class C19287c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19284d f53499d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19287c(C19284d dVar) {
            super(1);
            this.f53499d = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f53499d.f53496b.onNext(Boolean.FALSE);
        }
    }

    public C19284d(C30413a aVar) {
        C41536l.m120489i(aVar, "service");
        this.f53495a = aVar;
        C40765a i1 = C40765a.m118199i1(Boolean.FALSE);
        C41536l.m120488h(i1, "createDefault(false)");
        this.f53496b = i1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final Boolean m64742g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m64743h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m64744i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40749p mo47507a() {
        return this.f53496b;
    }

    /* renamed from: b */
    public C40762x mo47508b() {
        C40762x k = C19273c.m64722h(this.f53495a.mo70771a()).mo95062A(new C19281a(C19285a.f53497d)).mo95084m(new C19282b(new C19286b(this))).mo95082k(new C19283c(new C19287c(this)));
        C41536l.m120488h(k, "override fun getKycStatu…xt(false)\n        }\n    }");
        return k;
    }
}
