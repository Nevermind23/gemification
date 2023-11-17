package p341ge.bog.mobilebank.cleanarch.utm.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity */
public final class UtmParamsEntity {
    private final String campaign;
    private final long clickDate;
    private final String medium;
    private final String source;

    public UtmParamsEntity(long j, String str, String str2, String str3) {
        this.clickDate = j;
        this.campaign = str;
        this.medium = str2;
        this.source = str3;
    }

    public static /* synthetic */ UtmParamsEntity copy$default(UtmParamsEntity utmParamsEntity, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = utmParamsEntity.clickDate;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = utmParamsEntity.campaign;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = utmParamsEntity.medium;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = utmParamsEntity.source;
        }
        return utmParamsEntity.copy(j2, str4, str5, str3);
    }

    public final long component1() {
        return this.clickDate;
    }

    public final String component2() {
        return this.campaign;
    }

    public final String component3() {
        return this.medium;
    }

    public final String component4() {
        return this.source;
    }

    public final UtmParamsEntity copy(long j, String str, String str2, String str3) {
        return new UtmParamsEntity(j, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtmParamsEntity)) {
            return false;
        }
        UtmParamsEntity utmParamsEntity = (UtmParamsEntity) obj;
        return this.clickDate == utmParamsEntity.clickDate && C41536l.m120484d(this.campaign, utmParamsEntity.campaign) && C41536l.m120484d(this.medium, utmParamsEntity.medium) && C41536l.m120484d(this.source, utmParamsEntity.source);
    }

    public final String getCampaign() {
        return this.campaign;
    }

    public final long getClickDate() {
        return this.clickDate;
    }

    public final String getMedium() {
        return this.medium;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.clickDate) * 31;
        String str = this.campaign;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.medium;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.clickDate;
        String str = this.campaign;
        String str2 = this.medium;
        String str3 = this.source;
        return "UtmParamsEntity(clickDate=" + j + ", campaign=" + str + ", medium=" + str2 + ", source=" + str3 + ")";
    }
}
