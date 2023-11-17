package zi0;

import cj0.C19762a;
import cj0.C19763b;
import g91.C32343x;
import gi0.C24726a;
import hj0.C25034b;
import kotlin.jvm.internal.C41536l;
import oh0.C27009d;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationDetailsUiModel;

/* renamed from: zi0.c */
public final class C30312c {

    /* renamed from: a */
    private final C25034b f76220a;

    /* renamed from: b */
    private final C24726a f76221b;

    /* renamed from: zi0.c$a */
    private static final class C30313a {

        /* renamed from: a */
        private final String f76222a;

        /* renamed from: b */
        private final InfoBadgeView.C13346b f76223b;

        public C30313a(String str, InfoBadgeView.C13346b bVar) {
            C41536l.m120489i(str, "infoText");
            C41536l.m120489i(bVar, "infoBadgeType");
            this.f76222a = str;
            this.f76223b = bVar;
        }

        /* renamed from: a */
        public final InfoBadgeView.C13346b mo70631a() {
            return this.f76223b;
        }

        /* renamed from: b */
        public final String mo70632b() {
            return this.f76222a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30313a)) {
                return false;
            }
            C30313a aVar = (C30313a) obj;
            return C41536l.m120484d(this.f76222a, aVar.f76222a) && this.f76223b == aVar.f76223b;
        }

        public int hashCode() {
            return (this.f76222a.hashCode() * 31) + this.f76223b.hashCode();
        }

        public String toString() {
            String str = this.f76222a;
            InfoBadgeView.C13346b bVar = this.f76223b;
            return "InfoBadgeStatus(infoText=" + str + ", infoBadgeType=" + bVar + ")";
        }
    }

    public C30312c(C25034b bVar, C24726a aVar) {
        C41536l.m120489i(bVar, "provideDictValue");
        C41536l.m120489i(aVar, "phoneMapper");
        this.f76220a = bVar;
        this.f76221b = aVar;
    }

    /* renamed from: b */
    private final C30313a m91419b(OffersAndApplicationDetailsUiModel offersAndApplicationDetailsUiModel) {
        if (offersAndApplicationDetailsUiModel.mo61981e()) {
            return new C30313a(this.f76220a.mo63467a("giftcard.giver.gift.card.seen.by.owner.true"), InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_POSITIVE);
        }
        return new C30313a(this.f76220a.mo63467a("giftcard.giver.gift.card.seen.by.owner.false"), InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_PENDING);
    }

    /* renamed from: a */
    public final C30314d mo70630a(OffersAndApplicationDetailsUiModel offersAndApplicationDetailsUiModel) {
        C41536l.m120489i(offersAndApplicationDetailsUiModel, "model");
        int i = C27009d.f67786b;
        int i2 = C27009d.icons_16_system_retry;
        String a = this.f76220a.mo63467a("giftcard.giver.product.name");
        return new C30314d(new C19763b(i2, i, C32343x.m95408P(offersAndApplicationDetailsUiModel.mo61977a(), "GEL"), m91419b(offersAndApplicationDetailsUiModel).mo70632b(), a, C32343x.m95388F("giftcard.giver.link.date.text", offersAndApplicationDetailsUiModel.mo61978b()), this.f76220a.mo63467a("giftcard.giver.resend.link.button"), this.f76220a.mo63467a("giftcard.giver.see.gift.button"), m91419b(offersAndApplicationDetailsUiModel).mo70631a()), new C19762a(this.f76221b.mo63117a(offersAndApplicationDetailsUiModel.mo61984g()), C32343x.m95408P(offersAndApplicationDetailsUiModel.mo61977a(), "GEL"), offersAndApplicationDetailsUiModel.mo61988j(), offersAndApplicationDetailsUiModel.mo61987i()));
    }
}
