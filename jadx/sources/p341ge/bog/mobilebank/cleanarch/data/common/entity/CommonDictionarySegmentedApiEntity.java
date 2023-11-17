package p341ge.bog.mobilebank.cleanarch.data.common.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.common.entity.CommonDictionarySegmentedApiEntity */
public final class CommonDictionarySegmentedApiEntity {
    private final CommonDictionaryApiEntity common;

    /* renamed from: rb */
    private final CommonDictionaryApiEntity f56400rb;
    private final CommonDictionaryApiEntity solo;
    private final CommonDictionaryApiEntity wealth;

    public CommonDictionarySegmentedApiEntity(CommonDictionaryApiEntity commonDictionaryApiEntity, CommonDictionaryApiEntity commonDictionaryApiEntity2, CommonDictionaryApiEntity commonDictionaryApiEntity3, CommonDictionaryApiEntity commonDictionaryApiEntity4) {
        C41536l.m120489i(commonDictionaryApiEntity, "common");
        C41536l.m120489i(commonDictionaryApiEntity2, "rb");
        C41536l.m120489i(commonDictionaryApiEntity3, "solo");
        C41536l.m120489i(commonDictionaryApiEntity4, "wealth");
        this.common = commonDictionaryApiEntity;
        this.f56400rb = commonDictionaryApiEntity2;
        this.solo = commonDictionaryApiEntity3;
        this.wealth = commonDictionaryApiEntity4;
    }

    public static /* synthetic */ CommonDictionarySegmentedApiEntity copy$default(CommonDictionarySegmentedApiEntity commonDictionarySegmentedApiEntity, CommonDictionaryApiEntity commonDictionaryApiEntity, CommonDictionaryApiEntity commonDictionaryApiEntity2, CommonDictionaryApiEntity commonDictionaryApiEntity3, CommonDictionaryApiEntity commonDictionaryApiEntity4, int i, Object obj) {
        if ((i & 1) != 0) {
            commonDictionaryApiEntity = commonDictionarySegmentedApiEntity.common;
        }
        if ((i & 2) != 0) {
            commonDictionaryApiEntity2 = commonDictionarySegmentedApiEntity.f56400rb;
        }
        if ((i & 4) != 0) {
            commonDictionaryApiEntity3 = commonDictionarySegmentedApiEntity.solo;
        }
        if ((i & 8) != 0) {
            commonDictionaryApiEntity4 = commonDictionarySegmentedApiEntity.wealth;
        }
        return commonDictionarySegmentedApiEntity.copy(commonDictionaryApiEntity, commonDictionaryApiEntity2, commonDictionaryApiEntity3, commonDictionaryApiEntity4);
    }

    public final CommonDictionaryApiEntity component1() {
        return this.common;
    }

    public final CommonDictionaryApiEntity component2() {
        return this.f56400rb;
    }

    public final CommonDictionaryApiEntity component3() {
        return this.solo;
    }

    public final CommonDictionaryApiEntity component4() {
        return this.wealth;
    }

    public final CommonDictionarySegmentedApiEntity copy(CommonDictionaryApiEntity commonDictionaryApiEntity, CommonDictionaryApiEntity commonDictionaryApiEntity2, CommonDictionaryApiEntity commonDictionaryApiEntity3, CommonDictionaryApiEntity commonDictionaryApiEntity4) {
        C41536l.m120489i(commonDictionaryApiEntity, "common");
        C41536l.m120489i(commonDictionaryApiEntity2, "rb");
        C41536l.m120489i(commonDictionaryApiEntity3, "solo");
        C41536l.m120489i(commonDictionaryApiEntity4, "wealth");
        return new CommonDictionarySegmentedApiEntity(commonDictionaryApiEntity, commonDictionaryApiEntity2, commonDictionaryApiEntity3, commonDictionaryApiEntity4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonDictionarySegmentedApiEntity)) {
            return false;
        }
        CommonDictionarySegmentedApiEntity commonDictionarySegmentedApiEntity = (CommonDictionarySegmentedApiEntity) obj;
        return C41536l.m120484d(this.common, commonDictionarySegmentedApiEntity.common) && C41536l.m120484d(this.f56400rb, commonDictionarySegmentedApiEntity.f56400rb) && C41536l.m120484d(this.solo, commonDictionarySegmentedApiEntity.solo) && C41536l.m120484d(this.wealth, commonDictionarySegmentedApiEntity.wealth);
    }

    public final CommonDictionaryApiEntity getCommon() {
        return this.common;
    }

    public final CommonDictionaryApiEntity getRb() {
        return this.f56400rb;
    }

    public final CommonDictionaryApiEntity getSolo() {
        return this.solo;
    }

    public final CommonDictionaryApiEntity getWealth() {
        return this.wealth;
    }

    public int hashCode() {
        return (((((this.common.hashCode() * 31) + this.f56400rb.hashCode()) * 31) + this.solo.hashCode()) * 31) + this.wealth.hashCode();
    }

    public String toString() {
        CommonDictionaryApiEntity commonDictionaryApiEntity = this.common;
        CommonDictionaryApiEntity commonDictionaryApiEntity2 = this.f56400rb;
        CommonDictionaryApiEntity commonDictionaryApiEntity3 = this.solo;
        CommonDictionaryApiEntity commonDictionaryApiEntity4 = this.wealth;
        return "CommonDictionarySegmentedApiEntity(common=" + commonDictionaryApiEntity + ", rb=" + commonDictionaryApiEntity2 + ", solo=" + commonDictionaryApiEntity3 + ", wealth=" + commonDictionaryApiEntity4 + ")";
    }
}
