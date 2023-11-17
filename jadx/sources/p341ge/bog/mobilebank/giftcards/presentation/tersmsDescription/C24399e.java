package p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import oj0.C27020a;
import oj0.C27024d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription.C24395c;
import ue1.C43075l;
import wh0.C29408o;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.e */
public final class C24399e extends C21481a {

    /* renamed from: d */
    private final GiftCardsFlow.GiftCardIntroduction f62980d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C27020a f62981e;

    /* renamed from: f */
    private final C1644x f62982f;

    /* renamed from: g */
    private final C1644x f62983g = new C1644x();

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.e$a */
    public interface C24400a {
        /* renamed from: a */
        C24399e mo32839a(GiftCardsFlow.GiftCardIntroduction giftCardIntroduction);
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.e$b */
    static final class C24401b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f62984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24401b(int i) {
            super(1);
            this.f62984d = i;
        }

        /* renamed from: a */
        public final C27024d invoke(C27024d dVar) {
            C41536l.m120488h(dVar, "state");
            return C27024d.m83846b(dVar, (String) null, this.f62984d + 1, (List) null, 5, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.e$c */
    static final class C24402c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24399e f62985d;

        /* renamed from: e */
        final /* synthetic */ int f62986e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24402c(C24399e eVar, int i) {
            super(1);
            this.f62985d = eVar;
            this.f62986e = i;
        }

        /* renamed from: a */
        public final C27024d invoke(C27024d dVar) {
            String str;
            C41536l.m120488h(dVar, "state");
            if (this.f62985d.f62981e.mo66252a(this.f62986e)) {
                str = "giftcard.terms.of.use.finish.button";
            } else {
                str = "giftcard.terms.of.use.next.button";
            }
            return C27024d.m83846b(dVar, str, this.f62986e, (List) null, 4, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24399e(GiftCardsFlow.GiftCardIntroduction giftCardIntroduction, C27020a aVar, C29408o oVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(giftCardIntroduction, "introductionModel");
        C41536l.m120489i(aVar, "provideSliderItems");
        C41536l.m120489i(oVar, "hideGiftCardsIntroPageUseCase");
        this.f62980d = giftCardIntroduction;
        this.f62981e = aVar;
        this.f62982f = new C1644x(new C27024d((String) null, 0, aVar.mo66253b(), 3, (DefaultConstructorMarker) null));
        oVar.mo69248a();
    }

    /* renamed from: Q */
    public void mo62100Q(int i) {
        C37224b.m109967f(this.f62982f, new C24402c(this, i));
    }

    /* renamed from: ew */
    public LiveData mo62101ew() {
        return this.f62983g;
    }

    /* renamed from: fw */
    public LiveData mo62102fw() {
        return this.f62982f;
    }

    /* renamed from: gw */
    public void mo62103gw(int i) {
        if (!this.f62981e.mo66252a(i)) {
            C37224b.m109967f(this.f62982f, new C24401b(i));
        } else if (!this.f62980d.mo61632d()) {
            C37224b.m109965d(this.f62983g, new C24395c.C24396a(new GiftCardsFlow.GiftCardDetails(false, this.f62980d.mo61631b(), 1, (DefaultConstructorMarker) null)));
        } else {
            C37224b.m109965d(this.f62983g, new C24395c.C24397b());
        }
    }
}
