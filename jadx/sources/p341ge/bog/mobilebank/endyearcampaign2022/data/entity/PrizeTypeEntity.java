package p341ge.bog.mobilebank.endyearcampaign2022.data.entity;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.endyearcampaign2022.data.entity.PrizeTypeEntity */
public enum PrizeTypeEntity {
    PLUS("PLS"),
    GEL("GEL"),
    GB("GB");
    
    private final String value;

    private PrizeTypeEntity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
