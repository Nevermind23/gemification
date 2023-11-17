package p341ge.bog.mobilebank.dictionary.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.dictionary.data.entity.DictionarySegmentRelations */
public final class DictionarySegmentRelations {
    private final List<DictionarySubstitute> substitutes;

    public DictionarySegmentRelations(List<DictionarySubstitute> list) {
        this.substitutes = list;
    }

    public static /* synthetic */ DictionarySegmentRelations copy$default(DictionarySegmentRelations dictionarySegmentRelations, List<DictionarySubstitute> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dictionarySegmentRelations.substitutes;
        }
        return dictionarySegmentRelations.copy(list);
    }

    public final List<DictionarySubstitute> component1() {
        return this.substitutes;
    }

    public final DictionarySegmentRelations copy(List<DictionarySubstitute> list) {
        return new DictionarySegmentRelations(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DictionarySegmentRelations) && C41536l.m120484d(this.substitutes, ((DictionarySegmentRelations) obj).substitutes);
    }

    public final List<DictionarySubstitute> getSubstitutes() {
        return this.substitutes;
    }

    public int hashCode() {
        List<DictionarySubstitute> list = this.substitutes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<DictionarySubstitute> list = this.substitutes;
        return "DictionarySegmentRelations(substitutes=" + list + ")";
    }
}
