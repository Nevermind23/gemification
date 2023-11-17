package p341ge.bog.mobilebank.cleanarch.data.common.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.common.entity.CommonDictionaryApiEntity */
public final class CommonDictionaryApiEntity {
    private final CommonDictionaryDataApiEntity data;
    private final long hashCode;
    private final CommonDictionaryDataApiEntity providerData;

    public CommonDictionaryApiEntity(CommonDictionaryDataApiEntity commonDictionaryDataApiEntity, CommonDictionaryDataApiEntity commonDictionaryDataApiEntity2, long j) {
        C41536l.m120489i(commonDictionaryDataApiEntity, "data");
        C41536l.m120489i(commonDictionaryDataApiEntity2, "providerData");
        this.data = commonDictionaryDataApiEntity;
        this.providerData = commonDictionaryDataApiEntity2;
        this.hashCode = j;
    }

    public static /* synthetic */ CommonDictionaryApiEntity copy$default(CommonDictionaryApiEntity commonDictionaryApiEntity, CommonDictionaryDataApiEntity commonDictionaryDataApiEntity, CommonDictionaryDataApiEntity commonDictionaryDataApiEntity2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            commonDictionaryDataApiEntity = commonDictionaryApiEntity.data;
        }
        if ((i & 2) != 0) {
            commonDictionaryDataApiEntity2 = commonDictionaryApiEntity.providerData;
        }
        if ((i & 4) != 0) {
            j = commonDictionaryApiEntity.hashCode;
        }
        return commonDictionaryApiEntity.copy(commonDictionaryDataApiEntity, commonDictionaryDataApiEntity2, j);
    }

    public final CommonDictionaryDataApiEntity component1() {
        return this.data;
    }

    public final CommonDictionaryDataApiEntity component2() {
        return this.providerData;
    }

    public final long component3() {
        return this.hashCode;
    }

    public final CommonDictionaryApiEntity copy(CommonDictionaryDataApiEntity commonDictionaryDataApiEntity, CommonDictionaryDataApiEntity commonDictionaryDataApiEntity2, long j) {
        C41536l.m120489i(commonDictionaryDataApiEntity, "data");
        C41536l.m120489i(commonDictionaryDataApiEntity2, "providerData");
        return new CommonDictionaryApiEntity(commonDictionaryDataApiEntity, commonDictionaryDataApiEntity2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonDictionaryApiEntity)) {
            return false;
        }
        CommonDictionaryApiEntity commonDictionaryApiEntity = (CommonDictionaryApiEntity) obj;
        return C41536l.m120484d(this.data, commonDictionaryApiEntity.data) && C41536l.m120484d(this.providerData, commonDictionaryApiEntity.providerData) && this.hashCode == commonDictionaryApiEntity.hashCode;
    }

    public final CommonDictionaryDataApiEntity getData() {
        return this.data;
    }

    public final long getHashCode() {
        return this.hashCode;
    }

    public final CommonDictionaryDataApiEntity getProviderData() {
        return this.providerData;
    }

    public int hashCode() {
        return (((this.data.hashCode() * 31) + this.providerData.hashCode()) * 31) + C7397t.m28148a(this.hashCode);
    }

    public String toString() {
        CommonDictionaryDataApiEntity commonDictionaryDataApiEntity = this.data;
        CommonDictionaryDataApiEntity commonDictionaryDataApiEntity2 = this.providerData;
        long j = this.hashCode;
        return "CommonDictionaryApiEntity(data=" + commonDictionaryDataApiEntity + ", providerData=" + commonDictionaryDataApiEntity2 + ", hashCode=" + j + ")";
    }
}
