package p341ge.bog.mobilebank.cleanarch.data.common.entity;

import androidx.annotation.Keep;
import androidx.collection.ArrayMap;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.common.entity.CommonDictionaryDataApiEntity */
public final class CommonDictionaryDataApiEntity {
    @C8664c("EN")

    /* renamed from: en */
    private final ArrayMap<String, String> f56398en;
    @C8664c("GE")

    /* renamed from: ge */
    private final ArrayMap<String, String> f56399ge;

    public CommonDictionaryDataApiEntity(ArrayMap<String, String> arrayMap, ArrayMap<String, String> arrayMap2) {
        this.f56398en = arrayMap;
        this.f56399ge = arrayMap2;
    }

    public static /* synthetic */ CommonDictionaryDataApiEntity copy$default(CommonDictionaryDataApiEntity commonDictionaryDataApiEntity, ArrayMap<String, String> arrayMap, ArrayMap<String, String> arrayMap2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayMap = commonDictionaryDataApiEntity.f56398en;
        }
        if ((i & 2) != 0) {
            arrayMap2 = commonDictionaryDataApiEntity.f56399ge;
        }
        return commonDictionaryDataApiEntity.copy(arrayMap, arrayMap2);
    }

    public final ArrayMap<String, String> component1() {
        return this.f56398en;
    }

    public final ArrayMap<String, String> component2() {
        return this.f56399ge;
    }

    public final CommonDictionaryDataApiEntity copy(ArrayMap<String, String> arrayMap, ArrayMap<String, String> arrayMap2) {
        return new CommonDictionaryDataApiEntity(arrayMap, arrayMap2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonDictionaryDataApiEntity)) {
            return false;
        }
        CommonDictionaryDataApiEntity commonDictionaryDataApiEntity = (CommonDictionaryDataApiEntity) obj;
        return C41536l.m120484d(this.f56398en, commonDictionaryDataApiEntity.f56398en) && C41536l.m120484d(this.f56399ge, commonDictionaryDataApiEntity.f56399ge);
    }

    public final ArrayMap<String, String> getEn() {
        return this.f56398en;
    }

    public final ArrayMap<String, String> getGe() {
        return this.f56399ge;
    }

    public int hashCode() {
        ArrayMap<String, String> arrayMap = this.f56398en;
        int i = 0;
        int hashCode = (arrayMap == null ? 0 : arrayMap.hashCode()) * 31;
        ArrayMap<String, String> arrayMap2 = this.f56399ge;
        if (arrayMap2 != null) {
            i = arrayMap2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        ArrayMap<String, String> arrayMap = this.f56398en;
        ArrayMap<String, String> arrayMap2 = this.f56399ge;
        return "CommonDictionaryDataApiEntity(en=" + arrayMap + ", ge=" + arrayMap2 + ")";
    }
}
