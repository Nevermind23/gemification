package p341ge.bog.mobilebank.transfers;

import androidx.lifecycle.C1644x;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p881ru.C28103l;
import p891su.C28261a;
import s10.C28122a;
import ue1.C43075l;
import w61.C39602d;
import w61.C39603e;
import w61.C39604f;

/* renamed from: ge.bog.mobilebank.transfers.SelectContactAccountViewModel */
public final class SelectContactAccountViewModel extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1644x f84125d = new C1644x();

    /* renamed from: e */
    private final C40767b f84126e;

    /* renamed from: f */
    private long f84127f;

    /* renamed from: ge.bog.mobilebank.transfers.SelectContactAccountViewModel$a */
    static final class C34845a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28103l f84128d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34845a(C28103l lVar) {
            super(1);
            this.f84128d = lVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "it");
            return this.f84128d.mo67637b(l.longValue()).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.SelectContactAccountViewModel$b */
    static final class C34846b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectContactAccountViewModel f84129d;

        /* renamed from: e */
        final /* synthetic */ C28122a f84130e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34846b(SelectContactAccountViewModel selectContactAccountViewModel, C28122a aVar) {
            super(1);
            this.f84129d = selectContactAccountViewModel;
            this.f84130e = aVar;
        }

        /* renamed from: a */
        public final void mo85233a(C28261a aVar) {
            C1644x jw = this.f84129d.f84125d;
            C28122a aVar2 = this.f84130e;
            C41536l.m120488h(aVar, "it");
            jw.mo4826r(new ArrayList(aVar2.mo67655b(aVar)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85233a((C28261a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.SelectContactAccountViewModel$c */
    static final class C34847c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34847c f84131d = new C34847c();

        C34847c() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectContactAccountViewModel(C28103l lVar, C28122a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(lVar, "getContactByIdUseCase");
        C41536l.m120489i(aVar, "contactItemsMapper");
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Long>()");
        this.f84126e = h1;
        this.f84127f = -1;
        C41205b G0 = h1.mo94989L0(new C39602d(new C34845a(lVar))).mo95027o0(C40992a.m118827a()).mo94983G0(new C39603e(new C34846b(this, aVar)), new C39604f(C34847c.f84131d));
        C41536l.m120488h(G0, "contactIdSubject.switchM…\n\n            }\n        )");
        addDisposable(G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m102347gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final void m102348hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m102349iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }
}
