package p341ge.bog.mobilebank.kyc.data.network.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.kyc.data.network.model.QuestSourceProperty */
public final class QuestSourceProperty {

    /* renamed from: id */
    private final int f42870id;
    private final String langCode;
    private final String note;
    private final String noteMandatory;
    private final String sourcePropertyDesc;

    public QuestSourceProperty(int i, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "sourcePropertyDesc");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(str3, "noteMandatory");
        this.f42870id = i;
        this.sourcePropertyDesc = str;
        this.langCode = str2;
        this.noteMandatory = str3;
        this.note = str4;
    }

    public static /* synthetic */ QuestSourceProperty copy$default(QuestSourceProperty questSourceProperty, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = questSourceProperty.f42870id;
        }
        if ((i2 & 2) != 0) {
            str = questSourceProperty.sourcePropertyDesc;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = questSourceProperty.langCode;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = questSourceProperty.noteMandatory;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = questSourceProperty.note;
        }
        return questSourceProperty.copy(i, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.f42870id;
    }

    public final String component2() {
        return this.sourcePropertyDesc;
    }

    public final String component3() {
        return this.langCode;
    }

    public final String component4() {
        return this.noteMandatory;
    }

    public final String component5() {
        return this.note;
    }

    public final QuestSourceProperty copy(int i, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "sourcePropertyDesc");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(str3, "noteMandatory");
        return new QuestSourceProperty(i, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestSourceProperty)) {
            return false;
        }
        QuestSourceProperty questSourceProperty = (QuestSourceProperty) obj;
        return this.f42870id == questSourceProperty.f42870id && C41536l.m120484d(this.sourcePropertyDesc, questSourceProperty.sourcePropertyDesc) && C41536l.m120484d(this.langCode, questSourceProperty.langCode) && C41536l.m120484d(this.noteMandatory, questSourceProperty.noteMandatory) && C41536l.m120484d(this.note, questSourceProperty.note);
    }

    public final int getId() {
        return this.f42870id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getNoteMandatory() {
        return this.noteMandatory;
    }

    public final String getSourcePropertyDesc() {
        return this.sourcePropertyDesc;
    }

    public int hashCode() {
        int hashCode = ((((((this.f42870id * 31) + this.sourcePropertyDesc.hashCode()) * 31) + this.langCode.hashCode()) * 31) + this.noteMandatory.hashCode()) * 31;
        String str = this.note;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.f42870id;
        String str = this.sourcePropertyDesc;
        String str2 = this.langCode;
        String str3 = this.noteMandatory;
        String str4 = this.note;
        return "QuestSourceProperty(id=" + i + ", sourcePropertyDesc=" + str + ", langCode=" + str2 + ", noteMandatory=" + str3 + ", note=" + str4 + ")";
    }
}
