package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.ServiceCenterEntity */
public final class ServiceCenterEntity {
    private final String customerType;
    private final String hasSoloSc;

    /* renamed from: id */
    private final long f42160id;
    private final String langCode;
    private final long parentId;
    private String pointDesc;
    private final String pointType;
    private final String pointValue;
    private final List<ServiceCenterEntity> points;

    public ServiceCenterEntity(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, List<ServiceCenterEntity> list) {
        C41536l.m120489i(str, "langCode");
        C41536l.m120489i(str2, "pointType");
        C41536l.m120489i(str3, "pointValue");
        C41536l.m120489i(str5, "hasSoloSc");
        C41536l.m120489i(str6, "customerType");
        this.f42160id = j;
        this.parentId = j2;
        this.langCode = str;
        this.pointType = str2;
        this.pointValue = str3;
        this.pointDesc = str4;
        this.hasSoloSc = str5;
        this.customerType = str6;
        this.points = list;
    }

    public static /* synthetic */ ServiceCenterEntity copy$default(ServiceCenterEntity serviceCenterEntity, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        ServiceCenterEntity serviceCenterEntity2 = serviceCenterEntity;
        int i2 = i;
        return serviceCenterEntity.copy((i2 & 1) != 0 ? serviceCenterEntity2.f42160id : j, (i2 & 2) != 0 ? serviceCenterEntity2.parentId : j2, (i2 & 4) != 0 ? serviceCenterEntity2.langCode : str, (i2 & 8) != 0 ? serviceCenterEntity2.pointType : str2, (i2 & 16) != 0 ? serviceCenterEntity2.pointValue : str3, (i2 & 32) != 0 ? serviceCenterEntity2.pointDesc : str4, (i2 & 64) != 0 ? serviceCenterEntity2.hasSoloSc : str5, (i2 & 128) != 0 ? serviceCenterEntity2.customerType : str6, (i2 & C11398b.f33139r) != 0 ? serviceCenterEntity2.points : list);
    }

    public final long component1() {
        return this.f42160id;
    }

    public final long component2() {
        return this.parentId;
    }

    public final String component3() {
        return this.langCode;
    }

    public final String component4() {
        return this.pointType;
    }

    public final String component5() {
        return this.pointValue;
    }

    public final String component6() {
        return this.pointDesc;
    }

    public final String component7() {
        return this.hasSoloSc;
    }

    public final String component8() {
        return this.customerType;
    }

    public final List<ServiceCenterEntity> component9() {
        return this.points;
    }

    public final ServiceCenterEntity copy(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, List<ServiceCenterEntity> list) {
        String str7 = str;
        C41536l.m120489i(str7, "langCode");
        String str8 = str2;
        C41536l.m120489i(str8, "pointType");
        String str9 = str3;
        C41536l.m120489i(str9, "pointValue");
        String str10 = str5;
        C41536l.m120489i(str10, "hasSoloSc");
        String str11 = str6;
        C41536l.m120489i(str11, "customerType");
        return new ServiceCenterEntity(j, j2, str7, str8, str9, str4, str10, str11, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceCenterEntity)) {
            return false;
        }
        ServiceCenterEntity serviceCenterEntity = (ServiceCenterEntity) obj;
        return this.f42160id == serviceCenterEntity.f42160id && this.parentId == serviceCenterEntity.parentId && C41536l.m120484d(this.langCode, serviceCenterEntity.langCode) && C41536l.m120484d(this.pointType, serviceCenterEntity.pointType) && C41536l.m120484d(this.pointValue, serviceCenterEntity.pointValue) && C41536l.m120484d(this.pointDesc, serviceCenterEntity.pointDesc) && C41536l.m120484d(this.hasSoloSc, serviceCenterEntity.hasSoloSc) && C41536l.m120484d(this.customerType, serviceCenterEntity.customerType) && C41536l.m120484d(this.points, serviceCenterEntity.points);
    }

    public final String getCustomerType() {
        return this.customerType;
    }

    public final String getHasSoloSc() {
        return this.hasSoloSc;
    }

    public final long getId() {
        return this.f42160id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final long getParentId() {
        return this.parentId;
    }

    public final String getPointDesc() {
        return this.pointDesc;
    }

    public final String getPointType() {
        return this.pointType;
    }

    public final String getPointValue() {
        return this.pointValue;
    }

    public final List<ServiceCenterEntity> getPoints() {
        return this.points;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f42160id) * 31) + C7397t.m28148a(this.parentId)) * 31) + this.langCode.hashCode()) * 31) + this.pointType.hashCode()) * 31) + this.pointValue.hashCode()) * 31;
        String str = this.pointDesc;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + this.hasSoloSc.hashCode()) * 31) + this.customerType.hashCode()) * 31;
        List<ServiceCenterEntity> list = this.points;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final void setPointDesc(String str) {
        this.pointDesc = str;
    }

    public String toString() {
        long j = this.f42160id;
        long j2 = this.parentId;
        String str = this.langCode;
        String str2 = this.pointType;
        String str3 = this.pointValue;
        String str4 = this.pointDesc;
        String str5 = this.hasSoloSc;
        String str6 = this.customerType;
        List<ServiceCenterEntity> list = this.points;
        return "ServiceCenterEntity(id=" + j + ", parentId=" + j2 + ", langCode=" + str + ", pointType=" + str2 + ", pointValue=" + str3 + ", pointDesc=" + str4 + ", hasSoloSc=" + str5 + ", customerType=" + str6 + ", points=" + list + ")";
    }
}
