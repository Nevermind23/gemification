package p341ge.bog.mobilebank.consumerloanapplication.data.lookup.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.lookup.entity.CountryEntity */
public final class CountryEntity {
    private final String code;
    private final String code2;
    private final String name;
    private final Integer order;

    public CountryEntity(String str, String str2, String str3, Integer num) {
        this.code = str;
        this.code2 = str2;
        this.name = str3;
        this.order = num;
    }

    public static /* synthetic */ CountryEntity copy$default(CountryEntity countryEntity, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryEntity.code;
        }
        if ((i & 2) != 0) {
            str2 = countryEntity.code2;
        }
        if ((i & 4) != 0) {
            str3 = countryEntity.name;
        }
        if ((i & 8) != 0) {
            num = countryEntity.order;
        }
        return countryEntity.copy(str, str2, str3, num);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.code2;
    }

    public final String component3() {
        return this.name;
    }

    public final Integer component4() {
        return this.order;
    }

    public final CountryEntity copy(String str, String str2, String str3, Integer num) {
        return new CountryEntity(str, str2, str3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryEntity)) {
            return false;
        }
        CountryEntity countryEntity = (CountryEntity) obj;
        return C41536l.m120484d(this.code, countryEntity.code) && C41536l.m120484d(this.code2, countryEntity.code2) && C41536l.m120484d(this.name, countryEntity.name) && C41536l.m120484d(this.order, countryEntity.order);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCode2() {
        return this.code2;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.order;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.code;
        String str2 = this.code2;
        String str3 = this.name;
        Integer num = this.order;
        return "CountryEntity(code=" + str + ", code2=" + str2 + ", name=" + str3 + ", order=" + num + ")";
    }
}
