package p341ge.bog.mobilebank.kyc.data.network.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.kyc.data.network.model.QuestSourceAmount */
public final class QuestSourceAmount {

    /* renamed from: id */
    private final int f42869id;
    private final String langCode;
    private final String note;
    private final String noteMandatory;
    private final String sourceAmountDesc;

    public QuestSourceAmount(int i, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "sourceAmountDesc");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(str3, "noteMandatory");
        C41536l.m120489i(str4, "note");
        this.f42869id = i;
        this.sourceAmountDesc = str;
        this.langCode = str2;
        this.noteMandatory = str3;
        this.note = str4;
    }

    public static /* synthetic */ QuestSourceAmount copy$default(QuestSourceAmount questSourceAmount, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = questSourceAmount.f42869id;
        }
        if ((i2 & 2) != 0) {
            str = questSourceAmount.sourceAmountDesc;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = questSourceAmount.langCode;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = questSourceAmount.noteMandatory;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = questSourceAmount.note;
        }
        return questSourceAmount.copy(i, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.f42869id;
    }

    public final String component2() {
        return this.sourceAmountDesc;
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

    public final QuestSourceAmount copy(int i, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "sourceAmountDesc");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(str3, "noteMandatory");
        C41536l.m120489i(str4, "note");
        return new QuestSourceAmount(i, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestSourceAmount)) {
            return false;
        }
        QuestSourceAmount questSourceAmount = (QuestSourceAmount) obj;
        return this.f42869id == questSourceAmount.f42869id && C41536l.m120484d(this.sourceAmountDesc, questSourceAmount.sourceAmountDesc) && C41536l.m120484d(this.langCode, questSourceAmount.langCode) && C41536l.m120484d(this.noteMandatory, questSourceAmount.noteMandatory) && C41536l.m120484d(this.note, questSourceAmount.note);
    }

    public final int getId() {
        return this.f42869id;
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

    public final String getSourceAmountDesc() {
        return this.sourceAmountDesc;
    }

    public int hashCode() {
        return (((((((this.f42869id * 31) + this.sourceAmountDesc.hashCode()) * 31) + this.langCode.hashCode()) * 31) + this.noteMandatory.hashCode()) * 31) + this.note.hashCode();
    }

    public String toString() {
        int i = this.f42869id;
        String str = this.sourceAmountDesc;
        String str2 = this.langCode;
        String str3 = this.noteMandatory;
        String str4 = this.note;
        return "QuestSourceAmount(id=" + i + ", sourceAmountDesc=" + str + ", langCode=" + str2 + ", noteMandatory=" + str3 + ", note=" + str4 + ")";
    }
}
