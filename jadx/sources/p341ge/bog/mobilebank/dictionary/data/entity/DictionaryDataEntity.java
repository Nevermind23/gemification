package p341ge.bog.mobilebank.dictionary.data.entity;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.dictionary.data.entity.DictionaryDataEntity */
public final class DictionaryDataEntity {

    /* renamed from: EN */
    private final Map<String, String> f60923EN;

    /* renamed from: GE */
    private final Map<String, String> f60924GE;

    public DictionaryDataEntity(Map<String, String> map, Map<String, String> map2) {
        this.f60923EN = map;
        this.f60924GE = map2;
    }

    public static /* synthetic */ DictionaryDataEntity copy$default(DictionaryDataEntity dictionaryDataEntity, Map<String, String> map, Map<String, String> map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = dictionaryDataEntity.f60923EN;
        }
        if ((i & 2) != 0) {
            map2 = dictionaryDataEntity.f60924GE;
        }
        return dictionaryDataEntity.copy(map, map2);
    }

    public final Map<String, String> component1() {
        return this.f60923EN;
    }

    public final Map<String, String> component2() {
        return this.f60924GE;
    }

    public final DictionaryDataEntity copy(Map<String, String> map, Map<String, String> map2) {
        return new DictionaryDataEntity(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryDataEntity)) {
            return false;
        }
        DictionaryDataEntity dictionaryDataEntity = (DictionaryDataEntity) obj;
        return C41536l.m120484d(this.f60923EN, dictionaryDataEntity.f60923EN) && C41536l.m120484d(this.f60924GE, dictionaryDataEntity.f60924GE);
    }

    public final Map<String, String> getEN() {
        return this.f60923EN;
    }

    public final Map<String, String> getGE() {
        return this.f60924GE;
    }

    public int hashCode() {
        Map<String, String> map = this.f60923EN;
        int i = 0;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.f60924GE;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Map<String, String> map = this.f60923EN;
        Map<String, String> map2 = this.f60924GE;
        return "DictionaryDataEntity(EN=" + map + ", GE=" + map2 + ")";
    }
}
