package p341ge.bog.mobilebank.giftcards.presentation.details;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.FragmentManager;
import g91.C32359z0;
import he1.C41233s;
import hj0.C25034b;
import java.util.List;
import ji0.C25456a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh0.C27010e;
import oh0.C27014i;
import p190o1.C7397t;
import p202p0.C7556l;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsActivity;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel;
import p420fh.C12902d;
import p420fh.C12910e;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.details.a */
public interface C24186a {

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.a$a */
    public static final class C24187a implements C24186a {

        /* renamed from: a */
        private final String f62626a;

        /* renamed from: b */
        private final C25034b f62627b;

        public C24187a(String str, C25034b bVar) {
            C41536l.m120489i(str, "giftCardCode");
            C41536l.m120489i(bVar, "provideDictValue");
            this.f62626a = str;
            this.f62627b = bVar;
        }

        /* renamed from: a */
        public void mo61808a(C1505h hVar, C7556l lVar, FragmentManager fragmentManager) {
            C41536l.m120489i(hVar, "requireActivity");
            C41536l.m120489i(lVar, "navController");
            C41536l.m120489i(fragmentManager, "fragmentManager");
            C32359z0.m95596x(this.f62626a);
            C12910e.m48787e(hVar, this.f62627b.mo63467a("giftcard.owner.card.code.copied"), (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24187a)) {
                return false;
            }
            C24187a aVar = (C24187a) obj;
            return C41536l.m120484d(this.f62626a, aVar.f62626a) && C41536l.m120484d(this.f62627b, aVar.f62627b);
        }

        public int hashCode() {
            return (this.f62626a.hashCode() * 31) + this.f62627b.hashCode();
        }

        public String toString() {
            String str = this.f62626a;
            C25034b bVar = this.f62627b;
            return "CopyGiftCardCode(giftCardCode=" + str + ", provideDictValue=" + bVar + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.a$b */
    public static final class C24188b implements C24186a {

        /* renamed from: a */
        private final GiftCardsMerchantAnimationsModel f62628a;

        public C24188b(GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel) {
            C41536l.m120489i(giftCardsMerchantAnimationsModel, "model");
            this.f62628a = giftCardsMerchantAnimationsModel;
        }

        /* renamed from: a */
        public void mo61808a(C1505h hVar, C7556l lVar, FragmentManager fragmentManager) {
            C41536l.m120489i(hVar, "requireActivity");
            C41536l.m120489i(lVar, "navController");
            C41536l.m120489i(fragmentManager, "fragmentManager");
            GiftCardsActivity.f62414H.mo61584a(hVar, new GiftCardsFlow.Animations(false, this.f62628a, GiftCardFlowMode.GiveAwayGiftCard.f62412d, 1, (DefaultConstructorMarker) null));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24188b) && C41536l.m120484d(this.f62628a, ((C24188b) obj).f62628a);
        }

        public int hashCode() {
            return this.f62628a.hashCode();
        }

        public String toString() {
            GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel = this.f62628a;
            return "GiveAwayGiftCard(model=" + giftCardsMerchantAnimationsModel + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.a$c */
    public static final class C24189c implements C24186a {

        /* renamed from: a */
        private final List f62629a;

        public C24189c(List list) {
            C41536l.m120489i(list, "stores");
            this.f62629a = list;
        }

        /* renamed from: a */
        public void mo61808a(C1505h hVar, C7556l lVar, FragmentManager fragmentManager) {
            C41536l.m120489i(hVar, "requireActivity");
            C41536l.m120489i(lVar, "navController");
            C41536l.m120489i(fragmentManager, "fragmentManager");
            C25456a.f65116J.mo64026a(this.f62629a).mo4576A1(fragmentManager, (String) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24189c) && C41536l.m120484d(this.f62629a, ((C24189c) obj).f62629a);
        }

        public int hashCode() {
            return this.f62629a.hashCode();
        }

        public String toString() {
            List list = this.f62629a;
            return "OpenStoresActionSheet(stores=" + list + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.a$d */
    public static final class C24190d implements C24186a {

        /* renamed from: a */
        private final long f62630a;

        public C24190d(long j) {
            this.f62630a = j;
        }

        /* renamed from: a */
        public void mo61808a(C1505h hVar, C7556l lVar, FragmentManager fragmentManager) {
            C41536l.m120489i(hVar, "requireActivity");
            C41536l.m120489i(lVar, "navController");
            C41536l.m120489i(fragmentManager, "fragmentManager");
            lVar.mo22118M(C27010e.action_giftCardsDetailsFragment_to_giftCardsTermsAndConditionsFragment, C0908e.m3336b(C41233s.m119492a(hVar.getString(C27014i.gift_cards_flow_extra), new GiftCardsFlow.GiftCardIntroduction(false, true, this.f62630a, 1, (DefaultConstructorMarker) null))));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24190d) && this.f62630a == ((C24190d) obj).f62630a;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f62630a);
        }

        public String toString() {
            long j = this.f62630a;
            return "OpenTermsAndConditions(cardId=" + j + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.a$e */
    public static final class C24191e implements C24186a {

        /* renamed from: a */
        private final C25034b f62631a;

        public C24191e(C25034b bVar) {
            C41536l.m120489i(bVar, "provideDictValue");
            this.f62631a = bVar;
        }

        /* renamed from: a */
        public void mo61808a(C1505h hVar, C7556l lVar, FragmentManager fragmentManager) {
            C41536l.m120489i(hVar, "requireActivity");
            C41536l.m120489i(lVar, "navController");
            C41536l.m120489i(fragmentManager, "fragmentManager");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f62631a.mo63467a("giftcard.application.summary.page.checkbox.link.url")));
            PackageManager packageManager = hVar.getPackageManager();
            if (packageManager != null && intent.resolveActivity(packageManager) != null) {
                hVar.startActivity(intent);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24191e) && C41536l.m120484d(this.f62631a, ((C24191e) obj).f62631a);
        }

        public int hashCode() {
            return this.f62631a.hashCode();
        }

        public String toString() {
            C25034b bVar = this.f62631a;
            return "OpenTermsLink(provideDictValue=" + bVar + ")";
        }
    }

    /* renamed from: a */
    void mo61808a(C1505h hVar, C7556l lVar, FragmentManager fragmentManager);
}
