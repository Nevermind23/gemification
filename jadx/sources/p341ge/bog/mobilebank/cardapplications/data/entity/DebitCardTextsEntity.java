package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardTextsEntity */
public final class DebitCardTextsEntity {
    private final String advantagesKey;
    private final String advantagesValue;
    private final String cardDetailsKey;
    private final String cardDetailsValue;
    private final String cardPriceKey;
    private final String cardPriceValue;
    private final String expDateKey;
    private final String expDateValue;
    private final String minAmountKey;
    private final String minAmountValue;
    private final String shortDescKey;
    private final String shortDescValue;

    public DebitCardTextsEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.advantagesKey = str;
        this.advantagesValue = str2;
        this.expDateKey = str3;
        this.expDateValue = str4;
        this.minAmountKey = str5;
        this.minAmountValue = str6;
        this.cardDetailsKey = str7;
        this.cardDetailsValue = str8;
        this.cardPriceKey = str9;
        this.cardPriceValue = str10;
        this.shortDescKey = str11;
        this.shortDescValue = str12;
    }

    public static /* synthetic */ DebitCardTextsEntity copy$default(DebitCardTextsEntity debitCardTextsEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        DebitCardTextsEntity debitCardTextsEntity2 = debitCardTextsEntity;
        int i2 = i;
        return debitCardTextsEntity.copy((i2 & 1) != 0 ? debitCardTextsEntity2.advantagesKey : str, (i2 & 2) != 0 ? debitCardTextsEntity2.advantagesValue : str2, (i2 & 4) != 0 ? debitCardTextsEntity2.expDateKey : str3, (i2 & 8) != 0 ? debitCardTextsEntity2.expDateValue : str4, (i2 & 16) != 0 ? debitCardTextsEntity2.minAmountKey : str5, (i2 & 32) != 0 ? debitCardTextsEntity2.minAmountValue : str6, (i2 & 64) != 0 ? debitCardTextsEntity2.cardDetailsKey : str7, (i2 & 128) != 0 ? debitCardTextsEntity2.cardDetailsValue : str8, (i2 & C11398b.f33139r) != 0 ? debitCardTextsEntity2.cardPriceKey : str9, (i2 & C11398b.f33140s) != 0 ? debitCardTextsEntity2.cardPriceValue : str10, (i2 & C11398b.f33141t) != 0 ? debitCardTextsEntity2.shortDescKey : str11, (i2 & C11398b.f33142u) != 0 ? debitCardTextsEntity2.shortDescValue : str12);
    }

    public final String component1() {
        return this.advantagesKey;
    }

    public final String component10() {
        return this.cardPriceValue;
    }

    public final String component11() {
        return this.shortDescKey;
    }

    public final String component12() {
        return this.shortDescValue;
    }

    public final String component2() {
        return this.advantagesValue;
    }

    public final String component3() {
        return this.expDateKey;
    }

    public final String component4() {
        return this.expDateValue;
    }

    public final String component5() {
        return this.minAmountKey;
    }

    public final String component6() {
        return this.minAmountValue;
    }

    public final String component7() {
        return this.cardDetailsKey;
    }

    public final String component8() {
        return this.cardDetailsValue;
    }

    public final String component9() {
        return this.cardPriceKey;
    }

    public final DebitCardTextsEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return new DebitCardTextsEntity(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardTextsEntity)) {
            return false;
        }
        DebitCardTextsEntity debitCardTextsEntity = (DebitCardTextsEntity) obj;
        return C41536l.m120484d(this.advantagesKey, debitCardTextsEntity.advantagesKey) && C41536l.m120484d(this.advantagesValue, debitCardTextsEntity.advantagesValue) && C41536l.m120484d(this.expDateKey, debitCardTextsEntity.expDateKey) && C41536l.m120484d(this.expDateValue, debitCardTextsEntity.expDateValue) && C41536l.m120484d(this.minAmountKey, debitCardTextsEntity.minAmountKey) && C41536l.m120484d(this.minAmountValue, debitCardTextsEntity.minAmountValue) && C41536l.m120484d(this.cardDetailsKey, debitCardTextsEntity.cardDetailsKey) && C41536l.m120484d(this.cardDetailsValue, debitCardTextsEntity.cardDetailsValue) && C41536l.m120484d(this.cardPriceKey, debitCardTextsEntity.cardPriceKey) && C41536l.m120484d(this.cardPriceValue, debitCardTextsEntity.cardPriceValue) && C41536l.m120484d(this.shortDescKey, debitCardTextsEntity.shortDescKey) && C41536l.m120484d(this.shortDescValue, debitCardTextsEntity.shortDescValue);
    }

    public final String getAdvantagesKey() {
        return this.advantagesKey;
    }

    public final String getAdvantagesValue() {
        return this.advantagesValue;
    }

    public final String getCardDetailsKey() {
        return this.cardDetailsKey;
    }

    public final String getCardDetailsValue() {
        return this.cardDetailsValue;
    }

    public final String getCardPriceKey() {
        return this.cardPriceKey;
    }

    public final String getCardPriceValue() {
        return this.cardPriceValue;
    }

    public final String getExpDateKey() {
        return this.expDateKey;
    }

    public final String getExpDateValue() {
        return this.expDateValue;
    }

    public final String getMinAmountKey() {
        return this.minAmountKey;
    }

    public final String getMinAmountValue() {
        return this.minAmountValue;
    }

    public final String getShortDescKey() {
        return this.shortDescKey;
    }

    public final String getShortDescValue() {
        return this.shortDescValue;
    }

    public int hashCode() {
        String str = this.advantagesKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.advantagesValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expDateKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expDateValue;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minAmountKey;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.minAmountValue;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardDetailsKey;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cardDetailsValue;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardPriceKey;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cardPriceValue;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.shortDescKey;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.shortDescValue;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        String str = this.advantagesKey;
        String str2 = this.advantagesValue;
        String str3 = this.expDateKey;
        String str4 = this.expDateValue;
        String str5 = this.minAmountKey;
        String str6 = this.minAmountValue;
        String str7 = this.cardDetailsKey;
        String str8 = this.cardDetailsValue;
        String str9 = this.cardPriceKey;
        String str10 = this.cardPriceValue;
        String str11 = this.shortDescKey;
        String str12 = this.shortDescValue;
        return "DebitCardTextsEntity(advantagesKey=" + str + ", advantagesValue=" + str2 + ", expDateKey=" + str3 + ", expDateValue=" + str4 + ", minAmountKey=" + str5 + ", minAmountValue=" + str6 + ", cardDetailsKey=" + str7 + ", cardDetailsValue=" + str8 + ", cardPriceKey=" + str9 + ", cardPriceValue=" + str10 + ", shortDescKey=" + str11 + ", shortDescValue=" + str12 + ")";
    }
}
