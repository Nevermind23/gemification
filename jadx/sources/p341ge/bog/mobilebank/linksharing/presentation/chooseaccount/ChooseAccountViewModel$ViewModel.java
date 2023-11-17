package p341ge.bog.mobilebank.linksharing.presentation.chooseaccount;

import androidx.lifecycle.C1644x;
import cp0.C12023b;
import ed1.C40762x;
import g91.C32343x;
import gp0.C15448c;
import gp0.C15449d;
import gp0.C15450e;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import ip0.C15733a;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountViewModel$ViewModel */
public final class ChooseAccountViewModel$ViewModel extends C21481a implements C15448c {

    /* renamed from: d */
    private final C15448c f43446d = this;

    /* renamed from: e */
    private final C1644x f43447e = new C1644x();

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountViewModel$ViewModel$a */
    /* synthetic */ class C15140a extends C41535k implements C43075l {
        C15140a(Object obj) {
            super(1, obj, C15733a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C15733a) this.receiver).mo43113b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountViewModel$ViewModel$b */
    static final class C15141b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ChooseAccountViewModel$ViewModel f43448d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15141b(ChooseAccountViewModel$ViewModel chooseAccountViewModel$ViewModel) {
            super(1);
            this.f43448d = chooseAccountViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42169a(List list) {
            this.f43448d.mo42165g().mo4826r(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42169a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChooseAccountViewModel$ViewModel(C12023b bVar, C15733a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "p2pGetAccountsUseCase");
        C41536l.m120489i(aVar, "mapper");
        C40762x A = C12023b.m44158b(bVar, false, 1, (Object) null).mo95062A(new C15449d(new C15140a(aVar)));
        C41536l.m120488h(A, "p2pGetAccountsUseCase()\n…    .map(mapper::convert)");
        C41205b H = C32343x.m95415S0(A).mo95069H(new C15450e(new C15141b(this)));
        C41536l.m120488h(H, "p2pGetAccountsUseCase()\n…ataList\n                }");
        bindToLifecycle(H);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final List m55345fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m55346gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public C1644x mo42165g() {
        return this.f43447e;
    }

    /* renamed from: iw */
    public final C15448c mo42167iw() {
        return this.f43446d;
    }
}
