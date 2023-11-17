package gj0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import gj0.C24754h;
import hd1.C41204a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import wh0.C29405l;
import wh0.C29407n;

/* renamed from: gj0.j */
public final class C24759j extends C21481a {

    /* renamed from: d */
    private final List f63642d;

    /* renamed from: e */
    private final boolean f63643e;

    /* renamed from: f */
    private final C29405l f63644f;

    /* renamed from: g */
    private final C29407n f63645g;

    /* renamed from: h */
    private final C24759j f63646h = this;

    /* renamed from: i */
    private final LiveData f63647i;

    /* renamed from: j */
    private final LiveData f63648j;

    /* renamed from: k */
    private final C1644x f63649k;

    /* renamed from: l */
    private final C1644x f63650l;

    /* renamed from: m */
    private final Set f63651m;

    /* renamed from: n */
    private ReceivedGiftCardUiModel f63652n;

    /* renamed from: gj0.j$a */
    public interface C24760a {
        /* renamed from: a */
        C24759j mo32837a(List list, boolean z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24759j(List list, boolean z, C29405l lVar, C29407n nVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(list, PaymentServiceConfig.TYPE_GIFT_CARD);
        C41536l.m120489i(lVar, "giftCardMarkAsSeen");
        C41536l.m120489i(nVar, "hasGiftCardsIntroAlreadySeenUseCase");
        this.f63642d = list;
        this.f63643e = z;
        this.f63644f = lVar;
        this.f63645g = nVar;
        this.f63647i = new C1644x(list);
        this.f63648j = new C1644x(Boolean.valueOf(!z));
        this.f63649k = new C1644x();
        this.f63650l = new C1644x();
        this.f63651m = new LinkedHashSet();
    }

    /* renamed from: hw */
    private final void m79336hw() {
        ReceivedGiftCardUiModel receivedGiftCardUiModel = this.f63652n;
        if (receivedGiftCardUiModel != null) {
            long d = receivedGiftCardUiModel.mo62061d();
            if (!this.f63651m.contains(Long.valueOf(d))) {
                this.f63644f.mo69245a(d).mo94886E();
                this.f63651m.add(Long.valueOf(d));
            }
        }
    }

    /* renamed from: lw */
    private final void m79337lw(C24754h hVar) {
        C37224b.m109966e(this.f63650l, hVar);
    }

    /* renamed from: dw */
    public LiveData mo63148dw() {
        return this.f63648j;
    }

    /* renamed from: ew */
    public final C24759j mo63149ew() {
        return this.f63646h;
    }

    /* renamed from: fw */
    public LiveData mo63150fw() {
        return this.f63650l;
    }

    /* renamed from: gw */
    public LiveData mo63151gw() {
        return this.f63649k;
    }

    /* renamed from: iw */
    public void mo63152iw() {
        m79336hw();
    }

    /* renamed from: jw */
    public void mo63153jw(int i) {
        long d = ((ReceivedGiftCardUiModel) this.f63642d.get(i)).mo62061d();
        if (this.f63645g.mo69247a()) {
            m79337lw(new C24754h.C24755a(d));
        } else {
            m79337lw(new C24754h.C24756b(d));
        }
        m79336hw();
    }

    /* renamed from: kw */
    public void mo63154kw(int i) {
        if (i != 0) {
            m79336hw();
        }
        ReceivedGiftCardUiModel receivedGiftCardUiModel = (ReceivedGiftCardUiModel) C41358y.m120010Z(this.f63642d, i);
        this.f63652n = receivedGiftCardUiModel;
        if (receivedGiftCardUiModel != null) {
            this.f63649k.mo4823o(receivedGiftCardUiModel);
        }
    }

    /* renamed from: s */
    public LiveData mo63155s() {
        return this.f63647i;
    }
}
