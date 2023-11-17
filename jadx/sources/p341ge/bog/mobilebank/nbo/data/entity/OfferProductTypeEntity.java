package p341ge.bog.mobilebank.nbo.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.nbo.data.entity.OfferProductTypeEntity */
public enum OfferProductTypeEntity {
    LOAN("LOAN"),
    CREDIT_CARD("CREDITCARD"),
    OFFER("OFFER"),
    LIMIT_BANNER("LIMIT_BANNER");
    
    public static final C33284a Companion = null;
    private final String value;

    /* renamed from: ge.bog.mobilebank.nbo.data.entity.OfferProductTypeEntity$a */
    public static final class C33284a {
        private C33284a() {
        }

        public /* synthetic */ C33284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Companion = new C33284a((DefaultConstructorMarker) null);
    }

    private OfferProductTypeEntity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
