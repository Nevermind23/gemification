package p341ge.bog.mobilebank.kyc.data.network.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.kyc.data.network.model.QuestActivities */
public final class QuestActivities {
    private final String activityDesc;
    private final String code;

    /* renamed from: id */
    private final int f42867id;
    private final String langCode;

    public QuestActivities(int i, String str, String str2, String str3) {
        C41536l.m120489i(str, "activityDesc");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(str3, "code");
        this.f42867id = i;
        this.activityDesc = str;
        this.langCode = str2;
        this.code = str3;
    }

    public static /* synthetic */ QuestActivities copy$default(QuestActivities questActivities, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = questActivities.f42867id;
        }
        if ((i2 & 2) != 0) {
            str = questActivities.activityDesc;
        }
        if ((i2 & 4) != 0) {
            str2 = questActivities.langCode;
        }
        if ((i2 & 8) != 0) {
            str3 = questActivities.code;
        }
        return questActivities.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.f42867id;
    }

    public final String component2() {
        return this.activityDesc;
    }

    public final String component3() {
        return this.langCode;
    }

    public final String component4() {
        return this.code;
    }

    public final QuestActivities copy(int i, String str, String str2, String str3) {
        C41536l.m120489i(str, "activityDesc");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(str3, "code");
        return new QuestActivities(i, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestActivities)) {
            return false;
        }
        QuestActivities questActivities = (QuestActivities) obj;
        return this.f42867id == questActivities.f42867id && C41536l.m120484d(this.activityDesc, questActivities.activityDesc) && C41536l.m120484d(this.langCode, questActivities.langCode) && C41536l.m120484d(this.code, questActivities.code);
    }

    public final String getActivityDesc() {
        return this.activityDesc;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getId() {
        return this.f42867id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public int hashCode() {
        return (((((this.f42867id * 31) + this.activityDesc.hashCode()) * 31) + this.langCode.hashCode()) * 31) + this.code.hashCode();
    }

    public String toString() {
        int i = this.f42867id;
        String str = this.activityDesc;
        String str2 = this.langCode;
        String str3 = this.code;
        return "QuestActivities(id=" + i + ", activityDesc=" + str + ", langCode=" + str2 + ", code=" + str3 + ")";
    }
}
