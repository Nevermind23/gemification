package p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription;

import androidx.core.p016os.C0908e;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import oh0.C27010e;
import p202p0.C7556l;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.c */
public interface C24395c {

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.c$a */
    public static final class C24396a implements C24395c {

        /* renamed from: a */
        private final GiftCardsFlow.GiftCardDetails f62979a;

        public C24396a(GiftCardsFlow.GiftCardDetails giftCardDetails) {
            C41536l.m120489i(giftCardDetails, "detailsModel");
            this.f62979a = giftCardDetails;
        }

        /* renamed from: a */
        public void mo62099a(C7556l lVar, String str) {
            C41536l.m120489i(lVar, "navController");
            C41536l.m120489i(str, "id");
            lVar.mo22118M(C27010e.action_giftCardsTermsAndConditionsFragment_to_giftCardsDetailsFragment, C0908e.m3336b(C41233s.m119492a(str, this.f62979a)));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.c$b */
    public static final class C24397b implements C24395c {
        /* renamed from: a */
        public void mo62099a(C7556l lVar, String str) {
            C41536l.m120489i(lVar, "navController");
            C41536l.m120489i(str, "id");
            lVar.mo22123U();
        }
    }

    /* renamed from: a */
    void mo62099a(C7556l lVar, String str);
}
