package p341ge.bog.mobilebank.giftcards.presentation;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import wh0.C29418y;
import yh0.C30059d;
import yh0.C30060e;
import yh0.C30061f;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.DiscoveryFragmentContainerViewModel$ViewModel */
public final class DiscoveryFragmentContainerViewModel$ViewModel extends C21481a implements C30059d, C30060e {

    /* renamed from: d */
    private final C30059d f62393d = this;

    /* renamed from: e */
    private final C30060e f62394e = this;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f62395f = new C1644x(Boolean.FALSE);

    /* renamed from: g */
    private boolean f62396g;

    /* renamed from: h */
    private int f62397h;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.DiscoveryFragmentContainerViewModel$ViewModel$a */
    static final class C24053a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DiscoveryFragmentContainerViewModel$ViewModel f62398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24053a(DiscoveryFragmentContainerViewModel$ViewModel discoveryFragmentContainerViewModel$ViewModel) {
            super(1);
            this.f62398d = discoveryFragmentContainerViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f62398d.f62395f.mo4823o(bool);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveryFragmentContainerViewModel$ViewModel(C29418y yVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(yVar, "shouldShowGiftCards");
        C41205b F0 = yVar.invoke().mo95075O().mo94981F0(new C30061f(new C24053a(this)));
        C41536l.m120488h(F0, "shouldShowGiftCards().to…yLiveData.postValue(it) }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: fw */
    public final C30059d mo61557fw() {
        return this.f62393d;
    }

    /* renamed from: gw */
    public int mo61558gw() {
        return this.f62397h;
    }

    /* renamed from: hw */
    public LiveData mo61559hw() {
        return this.f62395f;
    }

    /* renamed from: iw */
    public boolean mo61560iw() {
        return this.f62396g;
    }

    /* renamed from: jw */
    public void mo61561jw(int i) {
        mo61563lw(i);
    }

    /* renamed from: kw */
    public void mo61562kw(boolean z) {
        this.f62396g = z;
    }

    /* renamed from: lw */
    public void mo61563lw(int i) {
        this.f62397h = i;
    }

    /* renamed from: qn */
    public void mo61564qn(boolean z) {
        mo61562kw(z);
    }
}
