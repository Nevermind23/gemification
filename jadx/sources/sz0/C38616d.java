package sz0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.productcards.AccountCardView;

/* renamed from: sz0.d */
public final class C38616d {

    /* renamed from: a */
    private final AccountCardView.C13445a f92480a;

    public C38616d(AccountCardView.C13445a aVar) {
        C41536l.m120489i(aVar, "accountData");
        this.f92480a = aVar;
    }

    /* renamed from: a */
    public final AccountCardView.C13445a mo92262a() {
        return this.f92480a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38616d) && C41536l.m120484d(this.f92480a, ((C38616d) obj).f92480a);
    }

    public int hashCode() {
        return this.f92480a.hashCode();
    }

    public String toString() {
        AccountCardView.C13445a aVar = this.f92480a;
        return "GiftCardsProductUiModel(accountData=" + aVar + ")";
    }
}
