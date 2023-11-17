package p341ge.bog.mobilebank.cardproducts.presentation.carddetail.actionsheet;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardBenefitUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p580qn.C17551c;
import p580qn.C17552d;

/* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.actionsheet.CardBenefitsViewModel$ViewModel */
public final class CardBenefitsViewModel$ViewModel extends C21481a implements C17551c, C17552d {

    /* renamed from: d */
    private final C17551c f42002d = this;

    /* renamed from: e */
    private final C17552d f42003e = this;

    /* renamed from: f */
    private final C1644x f42004f = new C1644x();

    public CardBenefitsViewModel$ViewModel() {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: St */
    public LiveData mo40110St() {
        return this.f42004f;
    }

    /* renamed from: dw */
    public final C17551c mo40111dw() {
        return this.f42002d;
    }

    /* renamed from: ew */
    public final C17552d mo40112ew() {
        return this.f42003e;
    }

    /* renamed from: sl */
    public void mo40113sl(CardBenefitUiModel cardBenefitUiModel) {
        C41536l.m120489i(cardBenefitUiModel, "cardBenefitUiModel");
        C37224b.m109966e(this.f42004f, cardBenefitUiModel);
    }
}
