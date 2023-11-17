package p341ge.bog.mobilebank.templates.data.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.templates.data.models.TemplateTransportPassApiModel */
public final class TemplateTransportPassApiModel {
    private final String logo;
    private final Long orderId;
    private final String titleDictionaryKey;

    public TemplateTransportPassApiModel() {
        this((String) null, (String) null, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TemplateTransportPassApiModel copy$default(TemplateTransportPassApiModel templateTransportPassApiModel, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = templateTransportPassApiModel.logo;
        }
        if ((i & 2) != 0) {
            str2 = templateTransportPassApiModel.titleDictionaryKey;
        }
        if ((i & 4) != 0) {
            l = templateTransportPassApiModel.orderId;
        }
        return templateTransportPassApiModel.copy(str, str2, l);
    }

    public final String component1() {
        return this.logo;
    }

    public final String component2() {
        return this.titleDictionaryKey;
    }

    public final Long component3() {
        return this.orderId;
    }

    public final TemplateTransportPassApiModel copy(String str, String str2, Long l) {
        return new TemplateTransportPassApiModel(str, str2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateTransportPassApiModel)) {
            return false;
        }
        TemplateTransportPassApiModel templateTransportPassApiModel = (TemplateTransportPassApiModel) obj;
        return C41536l.m120484d(this.logo, templateTransportPassApiModel.logo) && C41536l.m120484d(this.titleDictionaryKey, templateTransportPassApiModel.titleDictionaryKey) && C41536l.m120484d(this.orderId, templateTransportPassApiModel.orderId);
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Long getOrderId() {
        return this.orderId;
    }

    public final String getTitleDictionaryKey() {
        return this.titleDictionaryKey;
    }

    public int hashCode() {
        String str = this.logo;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleDictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.orderId;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.logo;
        String str2 = this.titleDictionaryKey;
        Long l = this.orderId;
        return "TemplateTransportPassApiModel(logo=" + str + ", titleDictionaryKey=" + str2 + ", orderId=" + l + ")";
    }

    public TemplateTransportPassApiModel(String str, String str2, Long l) {
        this.logo = str;
        this.titleDictionaryKey = str2;
        this.orderId = l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TemplateTransportPassApiModel(String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l);
    }
}
