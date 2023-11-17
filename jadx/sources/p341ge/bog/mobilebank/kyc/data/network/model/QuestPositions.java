package p341ge.bog.mobilebank.kyc.data.network.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.kyc.data.network.model.QuestPositions */
public final class QuestPositions {

    /* renamed from: id */
    private final int f42868id;
    private final String langCode;
    private final String positionName;

    public QuestPositions(int i, String str, String str2) {
        C41536l.m120489i(str, "positionName");
        C41536l.m120489i(str2, "langCode");
        this.f42868id = i;
        this.positionName = str;
        this.langCode = str2;
    }

    public static /* synthetic */ QuestPositions copy$default(QuestPositions questPositions, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = questPositions.f42868id;
        }
        if ((i2 & 2) != 0) {
            str = questPositions.positionName;
        }
        if ((i2 & 4) != 0) {
            str2 = questPositions.langCode;
        }
        return questPositions.copy(i, str, str2);
    }

    public final int component1() {
        return this.f42868id;
    }

    public final String component2() {
        return this.positionName;
    }

    public final String component3() {
        return this.langCode;
    }

    public final QuestPositions copy(int i, String str, String str2) {
        C41536l.m120489i(str, "positionName");
        C41536l.m120489i(str2, "langCode");
        return new QuestPositions(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestPositions)) {
            return false;
        }
        QuestPositions questPositions = (QuestPositions) obj;
        return this.f42868id == questPositions.f42868id && C41536l.m120484d(this.positionName, questPositions.positionName) && C41536l.m120484d(this.langCode, questPositions.langCode);
    }

    public final int getId() {
        return this.f42868id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final String getPositionName() {
        return this.positionName;
    }

    public int hashCode() {
        return (((this.f42868id * 31) + this.positionName.hashCode()) * 31) + this.langCode.hashCode();
    }

    public String toString() {
        int i = this.f42868id;
        String str = this.positionName;
        String str2 = this.langCode;
        return "QuestPositions(id=" + i + ", positionName=" + str + ", langCode=" + str2 + ")";
    }
}
