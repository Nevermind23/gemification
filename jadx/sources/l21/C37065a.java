package l21;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;

/* renamed from: l21.a */
public final class C37065a {

    /* renamed from: a */
    private final CardDailyLimitUiModel f89215a;

    /* renamed from: b */
    private final boolean f89216b;

    public C37065a(CardDailyLimitUiModel cardDailyLimitUiModel, boolean z) {
        C41536l.m120489i(cardDailyLimitUiModel, "model");
        this.f89215a = cardDailyLimitUiModel;
        this.f89216b = z;
    }

    /* renamed from: a */
    public final CardDailyLimitUiModel mo89980a() {
        return this.f89215a;
    }

    /* renamed from: b */
    public final boolean mo89981b() {
        return this.f89216b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37065a)) {
            return false;
        }
        C37065a aVar = (C37065a) obj;
        return C41536l.m120484d(this.f89215a, aVar.f89215a) && this.f89216b == aVar.f89216b;
    }

    public int hashCode() {
        int hashCode = this.f89215a.hashCode() * 31;
        boolean z = this.f89216b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        CardDailyLimitUiModel cardDailyLimitUiModel = this.f89215a;
        boolean z = this.f89216b;
        return "CardDailyLimitListItem(model=" + cardDailyLimitUiModel + ", isSelected=" + z + ")";
    }
}
