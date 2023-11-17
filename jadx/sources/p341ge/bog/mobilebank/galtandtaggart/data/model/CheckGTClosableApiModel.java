package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.CheckGTClosableApiModel */
public final class CheckGTClosableApiModel {
    private final String fieldDictionaryKey;
    private final String fieldTitle;
    private final Boolean fieldValue;

    public CheckGTClosableApiModel(String str, Boolean bool, String str2) {
        this.fieldTitle = str;
        this.fieldValue = bool;
        this.fieldDictionaryKey = str2;
    }

    public static /* synthetic */ CheckGTClosableApiModel copy$default(CheckGTClosableApiModel checkGTClosableApiModel, String str, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkGTClosableApiModel.fieldTitle;
        }
        if ((i & 2) != 0) {
            bool = checkGTClosableApiModel.fieldValue;
        }
        if ((i & 4) != 0) {
            str2 = checkGTClosableApiModel.fieldDictionaryKey;
        }
        return checkGTClosableApiModel.copy(str, bool, str2);
    }

    public final String component1() {
        return this.fieldTitle;
    }

    public final Boolean component2() {
        return this.fieldValue;
    }

    public final String component3() {
        return this.fieldDictionaryKey;
    }

    public final CheckGTClosableApiModel copy(String str, Boolean bool, String str2) {
        return new CheckGTClosableApiModel(str, bool, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckGTClosableApiModel)) {
            return false;
        }
        CheckGTClosableApiModel checkGTClosableApiModel = (CheckGTClosableApiModel) obj;
        return C41536l.m120484d(this.fieldTitle, checkGTClosableApiModel.fieldTitle) && C41536l.m120484d(this.fieldValue, checkGTClosableApiModel.fieldValue) && C41536l.m120484d(this.fieldDictionaryKey, checkGTClosableApiModel.fieldDictionaryKey);
    }

    public final String getFieldDictionaryKey() {
        return this.fieldDictionaryKey;
    }

    public final String getFieldTitle() {
        return this.fieldTitle;
    }

    public final Boolean getFieldValue() {
        return this.fieldValue;
    }

    public int hashCode() {
        String str = this.fieldTitle;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.fieldValue;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.fieldDictionaryKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.fieldTitle;
        Boolean bool = this.fieldValue;
        String str2 = this.fieldDictionaryKey;
        return "CheckGTClosableApiModel(fieldTitle=" + str + ", fieldValue=" + bool + ", fieldDictionaryKey=" + str2 + ")";
    }
}
