package ew0;

import androidx.lifecycle.C1644x;
import aw0.C31093h;
import g91.C32343x;
import gw0.C36085a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;

/* renamed from: ew0.h */
public final class C31865h extends C21481a implements C31861d, C31862e {

    /* renamed from: d */
    private final C31861d f78574d = this;

    /* renamed from: e */
    private final C31862e f78575e = this;

    /* renamed from: f */
    private final C1644x f78576f = new C1644x();

    /* renamed from: ew0.h$a */
    static final class C31866a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36085a f78577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31866a(C36085a aVar) {
            super(1);
            this.f78577d = aVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f78577d.mo88821b(list);
        }
    }

    /* renamed from: ew0.h$b */
    static final class C31867b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f78578d;

        /* renamed from: e */
        final /* synthetic */ C31865h f78579e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31867b(int i, C31865h hVar) {
            super(1);
            this.f78578d = i;
            this.f78579e = hVar;
        }

        /* renamed from: a */
        public final void mo72298a(List list) {
            ((CreditCardView.C13270b) list.get(this.f78578d)).mo35453m(true);
            this.f78579e.mo72294s().mo4826r(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72298a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ew0.h$c */
    public interface C31868c {
        /* renamed from: a */
        C31865h mo32838a(int i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31865h(C31093h hVar, C36085a aVar, int i) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "getLastLoadedCardsUseCase");
        C41536l.m120489i(aVar, "p2PCardsUiMapper");
        C41205b F0 = C32343x.m95462k1(hVar.mo71294a()).mo95026k0(new C31863f(new C31866a(aVar))).mo94981F0(new C31864g(new C31867b(i, this)));
        C41536l.m120488h(F0, "getLastLoadedCardsUseCas…ue = it\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final List m94191fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m94192gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public C1644x mo72294s() {
        return this.f78576f;
    }

    /* renamed from: iw */
    public final C31862e mo72296iw() {
        return this.f78575e;
    }
}
