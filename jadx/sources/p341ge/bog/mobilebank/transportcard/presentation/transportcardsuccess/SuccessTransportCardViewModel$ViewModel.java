package p341ge.bog.mobilebank.transportcard.presentation.transportcardsuccess;

import androidx.lifecycle.C1644x;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import j71.C36754g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l71.C37097g;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import x71.C39825b;
import x71.C39826c;
import x71.C39827d;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardViewModel$ViewModel */
public final class SuccessTransportCardViewModel$ViewModel extends C21481a implements C39825b, C39826c, C37097g {

    /* renamed from: d */
    private final /* synthetic */ C37097g f84723d;

    /* renamed from: e */
    private final C39825b f84724e = this;

    /* renamed from: f */
    private final C39826c f84725f = this;

    /* renamed from: g */
    private final C1644x f84726g = new C1644x();

    /* renamed from: h */
    private final C1644x f84727h = new C1644x();

    /* renamed from: i */
    private final C1644x f84728i = new C1644x();

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardViewModel$ViewModel$a */
    static final class C35156a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SuccessTransportCardViewModel$ViewModel f84729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35156a(SuccessTransportCardViewModel$ViewModel successTransportCardViewModel$ViewModel) {
            super(1);
            this.f84729d = successTransportCardViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo86056a(C36754g gVar) {
            this.f84729d.mo86046Rs().mo4826r(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86056a((C36754g) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuccessTransportCardViewModel$ViewModel(C37097g gVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(gVar, "delegate");
        this.f84723d = gVar;
        C41205b F0 = C32343x.m95413R0(mo86055ut()).mo94981F0(new C39827d(new C35156a(this)));
        C41536l.m120488h(F0, "purchasedPass.observeOnM….value = it\n            }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Tn */
    public void mo86048Tn() {
        C37224b.m109962a(mo86049dc());
    }

    /* renamed from: ew */
    public C1644x mo86049dc() {
        return this.f84727h;
    }

    /* renamed from: fw */
    public final C39826c mo86051fw() {
        return this.f84725f;
    }

    /* renamed from: gw */
    public C1644x mo86046Rs() {
        return this.f84726g;
    }

    /* renamed from: hw */
    public C1644x mo86047T8() {
        return this.f84728i;
    }

    /* renamed from: iw */
    public void mo86054iw() {
        C37224b.m109962a(mo86047T8());
    }

    /* renamed from: ut */
    public C40749p mo86055ut() {
        return this.f84723d.mo86055ut();
    }
}
