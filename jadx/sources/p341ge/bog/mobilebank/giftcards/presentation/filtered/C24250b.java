package p341ge.bog.mobilebank.giftcards.presentation.filtered;

import java.util.Set;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.b */
public interface C24250b {

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.b$a */
    public static final class C24251a implements C24250b {

        /* renamed from: a */
        private final Set f62719a;

        public C24251a(Set set) {
            C41536l.m120489i(set, "categories");
            this.f62719a = set;
        }

        /* renamed from: a */
        public final Set mo61900a() {
            return this.f62719a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24251a) && C41536l.m120484d(this.f62719a, ((C24251a) obj).f62719a);
        }

        public int hashCode() {
            return this.f62719a.hashCode();
        }

        public String toString() {
            Set set = this.f62719a;
            return "OpenFilter(categories=" + set + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.b$b */
    public static final class C24252b implements C24250b {

        /* renamed from: a */
        private final GiftCardsMerchantAnimationsModel f62720a;

        public C24252b(GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel) {
            C41536l.m120489i(giftCardsMerchantAnimationsModel, "model");
            this.f62720a = giftCardsMerchantAnimationsModel;
        }

        /* renamed from: a */
        public final GiftCardsMerchantAnimationsModel mo61904a() {
            return this.f62720a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24252b) && C41536l.m120484d(this.f62720a, ((C24252b) obj).f62720a);
        }

        public int hashCode() {
            return this.f62720a.hashCode();
        }

        public String toString() {
            GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel = this.f62720a;
            return "OpenOffer(model=" + giftCardsMerchantAnimationsModel + ")";
        }
    }
}
