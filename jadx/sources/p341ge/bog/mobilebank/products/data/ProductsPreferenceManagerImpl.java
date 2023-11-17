package p341ge.bog.mobilebank.products.data;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sy0.C38605a;
import w41.C39517c;
import w41.C39520e;

/* renamed from: ge.bog.mobilebank.products.data.ProductsPreferenceManagerImpl */
public final class ProductsPreferenceManagerImpl implements C38605a, C39517c.C39518a {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String PREFERENCE_KEY_HIDE_CARDS_INSURANCE_BANNER = "PREFERENCE_KEY_HIDE_CARDS_INSURANCE_BANNER";
    private final SharedPreferences sharedPreferences;

    /* renamed from: ge.bog.mobilebank.products.data.ProductsPreferenceManagerImpl$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProductsPreferenceManagerImpl(SharedPreferences sharedPreferences2) {
        C41536l.m120489i(sharedPreferences2, "sharedPreferences");
        this.sharedPreferences = sharedPreferences2;
    }

    public SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public void hideCardsInsuranceBanner(long j, long j2) {
        C39520e eVar = C39520e.f93965a;
        C39520e.m114861l(eVar, this, j, "PREFERENCE_KEY_HIDE_CARDS_INSURANCE_BANNER#" + j2, true, false, 8, (Object) null);
    }

    public boolean isCardsInsuranceBannerHidden(long j, long j2) {
        C39520e eVar = C39520e.f93965a;
        return eVar.mo93156c(this, j, "PREFERENCE_KEY_HIDE_CARDS_INSURANCE_BANNER#" + j2, false);
    }
}
