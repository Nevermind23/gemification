package p341ge.bog.mobilebank.serverstatus;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c11.C31254c;
import c11.C31255d;
import c11.C31256e;
import c11.C31257f;
import c51.C31275a;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37223a;
import ue1.C43075l;
import ue1.C43079p;
import x41.C39780a;
import zd1.C43413a;

/* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceViewModel */
public final class OutOfServiceViewModel extends C1613n0 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1644x f83499d = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1644x f83500e = new C1644x();

    /* renamed from: f */
    private final C41204a f83501f;

    /* renamed from: g */
    private final C40767b f83502g;

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceViewModel$a */
    public enum C34554a {
        CALL_SUPPORT,
        OPEN_PLAYSTORE_LINK,
        CLOSE_ACTIVITY
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceViewModel$b */
    static final class C34555b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OutOfServiceViewModel f83507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34555b(OutOfServiceViewModel outOfServiceViewModel) {
            super(1);
            this.f83507d = outOfServiceViewModel;
        }

        /* renamed from: a */
        public final void mo84062a(C31275a aVar) {
            String str;
            if (aVar.mo71528d() || aVar.mo71525a()) {
                C1644x jw = this.f83507d.f83499d;
                boolean d = aVar.mo71528d();
                if (aVar.mo71528d()) {
                    str = aVar.mo71527c();
                } else {
                    str = aVar.mo71526b();
                }
                jw.mo4826r(new C31254c(d, str));
                return;
            }
            this.f83507d.f83500e.mo4826r(new C37223a(C34554a.CLOSE_ACTIVITY));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84062a((C31275a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceViewModel$c */
    static final class C34556c extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C34556c f83508d = new C34556c();

        C34556c() {
            super(2);
        }

        /* renamed from: a */
        public final C31275a invoke(C41238w wVar, C31275a aVar) {
            C41536l.m120489i(wVar, "<anonymous parameter 0>");
            C41536l.m120489i(aVar, "status");
            return aVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.serverstatus.OutOfServiceViewModel$d */
    static final class C34557d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OutOfServiceViewModel f83509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34557d(OutOfServiceViewModel outOfServiceViewModel) {
            super(1);
            this.f83509d = outOfServiceViewModel;
        }

        /* renamed from: a */
        public final void mo84064a(C31275a aVar) {
            if (aVar.mo71528d()) {
                this.f83509d.f83500e.mo4826r(new C37223a(C34554a.CALL_SUPPORT));
            } else if (aVar.mo71525a()) {
                this.f83509d.f83500e.mo4826r(new C37223a(C34554a.OPEN_PLAYSTORE_LINK));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84064a((C31275a) obj);
            return C41238w.f97225a;
        }
    }

    public OutOfServiceViewModel(C39780a aVar) {
        C41536l.m120489i(aVar, "serverStatusMonitor");
        C41204a aVar2 = new C41204a();
        this.f83501f = aVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f83502g = h1;
        C43413a w0 = aVar.mo93512a().mo95040w0();
        C41205b F0 = w0.mo95027o0(C40992a.m118827a()).mo94981F0(new C31255d(new C34555b(this)));
        C41205b F02 = h1.mo95014Y0(w0, new C31256e(C34556c.f83508d)).mo95027o0(C40992a.m118827a()).mo94981F0(new C31257f(new C34557d(this)));
        w0.mo102094i1();
        aVar2.mo95662d(F0, F02);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C31275a m101354gw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C31275a) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final void m101355hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Is */
    public final void mo84059Is() {
        this.f83502g.onNext(C41238w.f97225a);
    }

    public final LiveData getState() {
        return this.f83499d;
    }

    /* renamed from: kw */
    public final LiveData mo84061kw() {
        return this.f83500e;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f83501f.dispose();
    }
}
