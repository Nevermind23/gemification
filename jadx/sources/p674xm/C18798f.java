package p674xm;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardClientCountryInfoUiModel;

/* renamed from: xm.f */
public final class C18798f {

    /* renamed from: a */
    private final List f52532a;

    /* renamed from: b */
    private final CardClientCountryInfoUiModel f52533b;

    public C18798f(List list, CardClientCountryInfoUiModel cardClientCountryInfoUiModel) {
        C41536l.m120489i(list, "orderTypes");
        C41536l.m120489i(cardClientCountryInfoUiModel, "countryInfo");
        this.f52532a = list;
        this.f52533b = cardClientCountryInfoUiModel;
    }

    /* renamed from: b */
    public static /* synthetic */ C18798f m63569b(C18798f fVar, List list, CardClientCountryInfoUiModel cardClientCountryInfoUiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fVar.f52532a;
        }
        if ((i & 2) != 0) {
            cardClientCountryInfoUiModel = fVar.f52533b;
        }
        return fVar.mo46624a(list, cardClientCountryInfoUiModel);
    }

    /* renamed from: a */
    public final C18798f mo46624a(List list, CardClientCountryInfoUiModel cardClientCountryInfoUiModel) {
        C41536l.m120489i(list, "orderTypes");
        C41536l.m120489i(cardClientCountryInfoUiModel, "countryInfo");
        return new C18798f(list, cardClientCountryInfoUiModel);
    }

    /* renamed from: c */
    public final CardClientCountryInfoUiModel mo46625c() {
        return this.f52533b;
    }

    /* renamed from: d */
    public final List mo46626d() {
        return this.f52532a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18798f)) {
            return false;
        }
        C18798f fVar = (C18798f) obj;
        return C41536l.m120484d(this.f52532a, fVar.f52532a) && C41536l.m120484d(this.f52533b, fVar.f52533b);
    }

    public int hashCode() {
        return (this.f52532a.hashCode() * 31) + this.f52533b.hashCode();
    }

    public String toString() {
        List list = this.f52532a;
        CardClientCountryInfoUiModel cardClientCountryInfoUiModel = this.f52533b;
        return "CardOrderPurposeDataUiModel(orderTypes=" + list + ", countryInfo=" + cardClientCountryInfoUiModel + ")";
    }
}
