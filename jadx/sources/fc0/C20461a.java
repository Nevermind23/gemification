package fc0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p31.C37896a;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;

/* renamed from: fc0.a */
public final class C20461a extends C37896a {

    /* renamed from: d */
    private final CardAccountSelectorUiModel f55460d;

    public C20461a(CardAccountSelectorUiModel cardAccountSelectorUiModel) {
        super(cardAccountSelectorUiModel, false, false, 6, (DefaultConstructorMarker) null);
        this.f55460d = cardAccountSelectorUiModel;
    }

    /* renamed from: a */
    public CardAccountSelectorUiModel mo48991a() {
        return this.f55460d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20461a) && C41536l.m120484d(this.f55460d, ((C20461a) obj).f55460d);
    }

    public int hashCode() {
        CardAccountSelectorUiModel cardAccountSelectorUiModel = this.f55460d;
        if (cardAccountSelectorUiModel == null) {
            return 0;
        }
        return cardAccountSelectorUiModel.hashCode();
    }

    public String toString() {
        CardAccountSelectorUiModel cardAccountSelectorUiModel = this.f55460d;
        return "DepositBreakAccountField(data=" + cardAccountSelectorUiModel + ")";
    }
}
