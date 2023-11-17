package p341ge.bog.mobilebank.cleanarch.data.home.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.home.entity.CampaignInfoApiEntity */
public final class CampaignInfoApiEntity {
    private String campaignCode;
    private boolean isInCampaign;

    public CampaignInfoApiEntity(boolean z, String str) {
        this.isInCampaign = z;
        this.campaignCode = str;
    }

    public static /* synthetic */ CampaignInfoApiEntity copy$default(CampaignInfoApiEntity campaignInfoApiEntity, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = campaignInfoApiEntity.isInCampaign;
        }
        if ((i & 2) != 0) {
            str = campaignInfoApiEntity.campaignCode;
        }
        return campaignInfoApiEntity.copy(z, str);
    }

    public final boolean component1() {
        return this.isInCampaign;
    }

    public final String component2() {
        return this.campaignCode;
    }

    public final CampaignInfoApiEntity copy(boolean z, String str) {
        return new CampaignInfoApiEntity(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignInfoApiEntity)) {
            return false;
        }
        CampaignInfoApiEntity campaignInfoApiEntity = (CampaignInfoApiEntity) obj;
        return this.isInCampaign == campaignInfoApiEntity.isInCampaign && C41536l.m120484d(this.campaignCode, campaignInfoApiEntity.campaignCode);
    }

    public final String getCampaignCode() {
        return this.campaignCode;
    }

    public int hashCode() {
        boolean z = this.isInCampaign;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.campaignCode;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final boolean isInCampaign() {
        return this.isInCampaign;
    }

    public final void setCampaignCode(String str) {
        this.campaignCode = str;
    }

    public final void setInCampaign(boolean z) {
        this.isInCampaign = z;
    }

    public String toString() {
        boolean z = this.isInCampaign;
        String str = this.campaignCode;
        return "CampaignInfoApiEntity(isInCampaign=" + z + ", campaignCode=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CampaignInfoApiEntity(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
