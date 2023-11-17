package p341ge.bog.mobilebank.dictionary.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity */
public final class DictionaryEntity {
    private final DictionaryDataEntity data;
    private final long hashCode;
    private final DictionaryDataEntity providerData;

    public DictionaryEntity(DictionaryDataEntity dictionaryDataEntity, DictionaryDataEntity dictionaryDataEntity2, long j) {
        this.data = dictionaryDataEntity;
        this.providerData = dictionaryDataEntity2;
        this.hashCode = j;
    }

    public static /* synthetic */ DictionaryEntity copy$default(DictionaryEntity dictionaryEntity, DictionaryDataEntity dictionaryDataEntity, DictionaryDataEntity dictionaryDataEntity2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            dictionaryDataEntity = dictionaryEntity.data;
        }
        if ((i & 2) != 0) {
            dictionaryDataEntity2 = dictionaryEntity.providerData;
        }
        if ((i & 4) != 0) {
            j = dictionaryEntity.hashCode;
        }
        return dictionaryEntity.copy(dictionaryDataEntity, dictionaryDataEntity2, j);
    }

    public final DictionaryDataEntity component1() {
        return this.data;
    }

    public final DictionaryDataEntity component2() {
        return this.providerData;
    }

    public final long component3() {
        return this.hashCode;
    }

    public final DictionaryEntity copy(DictionaryDataEntity dictionaryDataEntity, DictionaryDataEntity dictionaryDataEntity2, long j) {
        return new DictionaryEntity(dictionaryDataEntity, dictionaryDataEntity2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryEntity)) {
            return false;
        }
        DictionaryEntity dictionaryEntity = (DictionaryEntity) obj;
        return C41536l.m120484d(this.data, dictionaryEntity.data) && C41536l.m120484d(this.providerData, dictionaryEntity.providerData) && this.hashCode == dictionaryEntity.hashCode;
    }

    public final DictionaryDataEntity getData() {
        return this.data;
    }

    public final long getHashCode() {
        return this.hashCode;
    }

    public final DictionaryDataEntity getProviderData() {
        return this.providerData;
    }

    public int hashCode() {
        DictionaryDataEntity dictionaryDataEntity = this.data;
        int i = 0;
        int hashCode2 = (dictionaryDataEntity == null ? 0 : dictionaryDataEntity.hashCode()) * 31;
        DictionaryDataEntity dictionaryDataEntity2 = this.providerData;
        if (dictionaryDataEntity2 != null) {
            i = dictionaryDataEntity2.hashCode();
        }
        return ((hashCode2 + i) * 31) + C7397t.m28148a(this.hashCode);
    }

    public String toString() {
        DictionaryDataEntity dictionaryDataEntity = this.data;
        DictionaryDataEntity dictionaryDataEntity2 = this.providerData;
        long j = this.hashCode;
        return "DictionaryEntity(data=" + dictionaryDataEntity + ", providerData=" + dictionaryDataEntity2 + ", hashCode=" + j + ")";
    }
}
