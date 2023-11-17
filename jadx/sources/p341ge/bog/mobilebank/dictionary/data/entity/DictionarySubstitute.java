package p341ge.bog.mobilebank.dictionary.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.dictionary.data.entity.DictionarySubstitute */
public final class DictionarySubstitute {
    private final String originalSegmentDct;
    private final String priority;
    private final String substituteSegment;

    public DictionarySubstitute(String str, String str2, String str3) {
        this.originalSegmentDct = str;
        this.substituteSegment = str2;
        this.priority = str3;
    }

    public static /* synthetic */ DictionarySubstitute copy$default(DictionarySubstitute dictionarySubstitute, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dictionarySubstitute.originalSegmentDct;
        }
        if ((i & 2) != 0) {
            str2 = dictionarySubstitute.substituteSegment;
        }
        if ((i & 4) != 0) {
            str3 = dictionarySubstitute.priority;
        }
        return dictionarySubstitute.copy(str, str2, str3);
    }

    public final String component1() {
        return this.originalSegmentDct;
    }

    public final String component2() {
        return this.substituteSegment;
    }

    public final String component3() {
        return this.priority;
    }

    public final DictionarySubstitute copy(String str, String str2, String str3) {
        return new DictionarySubstitute(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionarySubstitute)) {
            return false;
        }
        DictionarySubstitute dictionarySubstitute = (DictionarySubstitute) obj;
        return C41536l.m120484d(this.originalSegmentDct, dictionarySubstitute.originalSegmentDct) && C41536l.m120484d(this.substituteSegment, dictionarySubstitute.substituteSegment) && C41536l.m120484d(this.priority, dictionarySubstitute.priority);
    }

    public final String getOriginalSegmentDct() {
        return this.originalSegmentDct;
    }

    public final String getPriority() {
        return this.priority;
    }

    public final String getSubstituteSegment() {
        return this.substituteSegment;
    }

    public int hashCode() {
        String str = this.originalSegmentDct;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.substituteSegment;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priority;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.originalSegmentDct;
        String str2 = this.substituteSegment;
        String str3 = this.priority;
        return "DictionarySubstitute(originalSegmentDct=" + str + ", substituteSegment=" + str2 + ", priority=" + str3 + ")";
    }
}
