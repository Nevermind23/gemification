package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.CardBenefitsEntity */
public final class CardBenefitsEntity {

    /* renamed from: id */
    private final long f41304id;
    private final String languageCode;
    private final String objectCode;
    private final String objectType;
    private final String objectUrl;

    public CardBenefitsEntity(long j, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "objectType");
        C41536l.m120489i(str2, "objectCode");
        C41536l.m120489i(str3, "objectUrl");
        C41536l.m120489i(str4, "languageCode");
        this.f41304id = j;
        this.objectType = str;
        this.objectCode = str2;
        this.objectUrl = str3;
        this.languageCode = str4;
    }

    public static /* synthetic */ CardBenefitsEntity copy$default(CardBenefitsEntity cardBenefitsEntity, long j, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cardBenefitsEntity.f41304id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = cardBenefitsEntity.objectType;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = cardBenefitsEntity.objectCode;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = cardBenefitsEntity.objectUrl;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = cardBenefitsEntity.languageCode;
        }
        return cardBenefitsEntity.copy(j2, str5, str6, str7, str4);
    }

    public final long component1() {
        return this.f41304id;
    }

    public final String component2() {
        return this.objectType;
    }

    public final String component3() {
        return this.objectCode;
    }

    public final String component4() {
        return this.objectUrl;
    }

    public final String component5() {
        return this.languageCode;
    }

    public final CardBenefitsEntity copy(long j, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "objectType");
        C41536l.m120489i(str2, "objectCode");
        C41536l.m120489i(str3, "objectUrl");
        C41536l.m120489i(str4, "languageCode");
        return new CardBenefitsEntity(j, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBenefitsEntity)) {
            return false;
        }
        CardBenefitsEntity cardBenefitsEntity = (CardBenefitsEntity) obj;
        return this.f41304id == cardBenefitsEntity.f41304id && C41536l.m120484d(this.objectType, cardBenefitsEntity.objectType) && C41536l.m120484d(this.objectCode, cardBenefitsEntity.objectCode) && C41536l.m120484d(this.objectUrl, cardBenefitsEntity.objectUrl) && C41536l.m120484d(this.languageCode, cardBenefitsEntity.languageCode);
    }

    public final long getId() {
        return this.f41304id;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getObjectCode() {
        return this.objectCode;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final String getObjectUrl() {
        return this.objectUrl;
    }

    public int hashCode() {
        return (((((((C7397t.m28148a(this.f41304id) * 31) + this.objectType.hashCode()) * 31) + this.objectCode.hashCode()) * 31) + this.objectUrl.hashCode()) * 31) + this.languageCode.hashCode();
    }

    public String toString() {
        long j = this.f41304id;
        String str = this.objectType;
        String str2 = this.objectCode;
        String str3 = this.objectUrl;
        String str4 = this.languageCode;
        return "CardBenefitsEntity(id=" + j + ", objectType=" + str + ", objectCode=" + str2 + ", objectUrl=" + str3 + ", languageCode=" + str4 + ")";
    }
}
