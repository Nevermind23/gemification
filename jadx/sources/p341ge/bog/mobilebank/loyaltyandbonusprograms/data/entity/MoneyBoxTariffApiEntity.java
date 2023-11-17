package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.MoneyBoxTariffApiEntity */
public final class MoneyBoxTariffApiEntity {
    private final String dfltCcy;

    /* renamed from: id */
    private final long f80604id;
    private final String schemeType;
    private final BigDecimal tariff;

    public MoneyBoxTariffApiEntity(long j, String str, BigDecimal bigDecimal, String str2) {
        C41536l.m120489i(str, "schemeType");
        C41536l.m120489i(bigDecimal, "tariff");
        this.f80604id = j;
        this.schemeType = str;
        this.tariff = bigDecimal;
        this.dfltCcy = str2;
    }

    public static /* synthetic */ MoneyBoxTariffApiEntity copy$default(MoneyBoxTariffApiEntity moneyBoxTariffApiEntity, long j, String str, BigDecimal bigDecimal, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = moneyBoxTariffApiEntity.f80604id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = moneyBoxTariffApiEntity.schemeType;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            bigDecimal = moneyBoxTariffApiEntity.tariff;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i & 8) != 0) {
            str2 = moneyBoxTariffApiEntity.dfltCcy;
        }
        return moneyBoxTariffApiEntity.copy(j2, str3, bigDecimal2, str2);
    }

    public final long component1() {
        return this.f80604id;
    }

    public final String component2() {
        return this.schemeType;
    }

    public final BigDecimal component3() {
        return this.tariff;
    }

    public final String component4() {
        return this.dfltCcy;
    }

    public final MoneyBoxTariffApiEntity copy(long j, String str, BigDecimal bigDecimal, String str2) {
        C41536l.m120489i(str, "schemeType");
        C41536l.m120489i(bigDecimal, "tariff");
        return new MoneyBoxTariffApiEntity(j, str, bigDecimal, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyBoxTariffApiEntity)) {
            return false;
        }
        MoneyBoxTariffApiEntity moneyBoxTariffApiEntity = (MoneyBoxTariffApiEntity) obj;
        return this.f80604id == moneyBoxTariffApiEntity.f80604id && C41536l.m120484d(this.schemeType, moneyBoxTariffApiEntity.schemeType) && C41536l.m120484d(this.tariff, moneyBoxTariffApiEntity.tariff) && C41536l.m120484d(this.dfltCcy, moneyBoxTariffApiEntity.dfltCcy);
    }

    public final String getDfltCcy() {
        return this.dfltCcy;
    }

    public final long getId() {
        return this.f80604id;
    }

    public final String getSchemeType() {
        return this.schemeType;
    }

    public final BigDecimal getTariff() {
        return this.tariff;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f80604id) * 31) + this.schemeType.hashCode()) * 31) + this.tariff.hashCode()) * 31;
        String str = this.dfltCcy;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f80604id;
        String str = this.schemeType;
        BigDecimal bigDecimal = this.tariff;
        String str2 = this.dfltCcy;
        return "MoneyBoxTariffApiEntity(id=" + j + ", schemeType=" + str + ", tariff=" + bigDecimal + ", dfltCcy=" + str2 + ")";
    }
}
