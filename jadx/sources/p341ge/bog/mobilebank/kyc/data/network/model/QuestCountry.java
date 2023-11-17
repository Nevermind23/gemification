package p341ge.bog.mobilebank.kyc.data.network.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.kyc.data.network.model.QuestCountry */
public final class QuestCountry {
    private final String countryCode;
    private final String countryName;
    private final String langCode;

    public QuestCountry(String str, String str2, String str3) {
        C41536l.m120489i(str, "countryCode");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(str3, "countryName");
        this.countryCode = str;
        this.langCode = str2;
        this.countryName = str3;
    }

    public static /* synthetic */ QuestCountry copy$default(QuestCountry questCountry, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questCountry.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = questCountry.langCode;
        }
        if ((i & 4) != 0) {
            str3 = questCountry.countryName;
        }
        return questCountry.copy(str, str2, str3);
    }

    public final String component1() {
        return this.countryCode;
    }

    public final String component2() {
        return this.langCode;
    }

    public final String component3() {
        return this.countryName;
    }

    public final QuestCountry copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "countryCode");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(str3, "countryName");
        return new QuestCountry(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestCountry)) {
            return false;
        }
        QuestCountry questCountry = (QuestCountry) obj;
        return C41536l.m120484d(this.countryCode, questCountry.countryCode) && C41536l.m120484d(this.langCode, questCountry.langCode) && C41536l.m120484d(this.countryName, questCountry.countryName);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public int hashCode() {
        return (((this.countryCode.hashCode() * 31) + this.langCode.hashCode()) * 31) + this.countryName.hashCode();
    }

    public String toString() {
        String str = this.countryCode;
        String str2 = this.langCode;
        String str3 = this.countryName;
        return "QuestCountry(countryCode=" + str + ", langCode=" + str2 + ", countryName=" + str3 + ")";
    }
}
