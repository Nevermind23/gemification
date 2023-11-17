package p341ge.bog.mobilebank.cardapplications.data.entity.instantcards;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.instantcards.InstantDeliveryPointEntity */
public final class InstantDeliveryPointEntity {

    /* renamed from: id */
    private final long f41312id;
    private final String langCode;
    private final String parentId;
    private final String pointDesc;
    private final PointTypeEntity pointType;
    private final String pointValue;
    private final List<InstantDeliveryPointEntity> points;

    public InstantDeliveryPointEntity(long j, String str, String str2, PointTypeEntity pointTypeEntity, String str3, String str4, List<InstantDeliveryPointEntity> list) {
        C41536l.m120489i(str, "parentId");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(pointTypeEntity, "pointType");
        C41536l.m120489i(str3, "pointValue");
        C41536l.m120489i(str4, "pointDesc");
        this.f41312id = j;
        this.parentId = str;
        this.langCode = str2;
        this.pointType = pointTypeEntity;
        this.pointValue = str3;
        this.pointDesc = str4;
        this.points = list;
    }

    public static /* synthetic */ InstantDeliveryPointEntity copy$default(InstantDeliveryPointEntity instantDeliveryPointEntity, long j, String str, String str2, PointTypeEntity pointTypeEntity, String str3, String str4, List list, int i, Object obj) {
        InstantDeliveryPointEntity instantDeliveryPointEntity2 = instantDeliveryPointEntity;
        return instantDeliveryPointEntity.copy((i & 1) != 0 ? instantDeliveryPointEntity2.f41312id : j, (i & 2) != 0 ? instantDeliveryPointEntity2.parentId : str, (i & 4) != 0 ? instantDeliveryPointEntity2.langCode : str2, (i & 8) != 0 ? instantDeliveryPointEntity2.pointType : pointTypeEntity, (i & 16) != 0 ? instantDeliveryPointEntity2.pointValue : str3, (i & 32) != 0 ? instantDeliveryPointEntity2.pointDesc : str4, (i & 64) != 0 ? instantDeliveryPointEntity2.points : list);
    }

    public final long component1() {
        return this.f41312id;
    }

    public final String component2() {
        return this.parentId;
    }

    public final String component3() {
        return this.langCode;
    }

    public final PointTypeEntity component4() {
        return this.pointType;
    }

    public final String component5() {
        return this.pointValue;
    }

    public final String component6() {
        return this.pointDesc;
    }

    public final List<InstantDeliveryPointEntity> component7() {
        return this.points;
    }

    public final InstantDeliveryPointEntity copy(long j, String str, String str2, PointTypeEntity pointTypeEntity, String str3, String str4, List<InstantDeliveryPointEntity> list) {
        C41536l.m120489i(str, "parentId");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(pointTypeEntity, "pointType");
        String str5 = str3;
        C41536l.m120489i(str5, "pointValue");
        String str6 = str4;
        C41536l.m120489i(str6, "pointDesc");
        return new InstantDeliveryPointEntity(j, str, str2, pointTypeEntity, str5, str6, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantDeliveryPointEntity)) {
            return false;
        }
        InstantDeliveryPointEntity instantDeliveryPointEntity = (InstantDeliveryPointEntity) obj;
        return this.f41312id == instantDeliveryPointEntity.f41312id && C41536l.m120484d(this.parentId, instantDeliveryPointEntity.parentId) && C41536l.m120484d(this.langCode, instantDeliveryPointEntity.langCode) && this.pointType == instantDeliveryPointEntity.pointType && C41536l.m120484d(this.pointValue, instantDeliveryPointEntity.pointValue) && C41536l.m120484d(this.pointDesc, instantDeliveryPointEntity.pointDesc) && C41536l.m120484d(this.points, instantDeliveryPointEntity.points);
    }

    public final long getId() {
        return this.f41312id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getPointDesc() {
        return this.pointDesc;
    }

    public final PointTypeEntity getPointType() {
        return this.pointType;
    }

    public final String getPointValue() {
        return this.pointValue;
    }

    public final List<InstantDeliveryPointEntity> getPoints() {
        return this.points;
    }

    public int hashCode() {
        int a = ((((((((((C7397t.m28148a(this.f41312id) * 31) + this.parentId.hashCode()) * 31) + this.langCode.hashCode()) * 31) + this.pointType.hashCode()) * 31) + this.pointValue.hashCode()) * 31) + this.pointDesc.hashCode()) * 31;
        List<InstantDeliveryPointEntity> list = this.points;
        return a + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        long j = this.f41312id;
        String str = this.parentId;
        String str2 = this.langCode;
        PointTypeEntity pointTypeEntity = this.pointType;
        String str3 = this.pointValue;
        String str4 = this.pointDesc;
        List<InstantDeliveryPointEntity> list = this.points;
        return "InstantDeliveryPointEntity(id=" + j + ", parentId=" + str + ", langCode=" + str2 + ", pointType=" + pointTypeEntity + ", pointValue=" + str3 + ", pointDesc=" + str4 + ", points=" + list + ")";
    }
}
