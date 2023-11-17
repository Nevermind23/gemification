package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CheckChildMBankActiveApiModel */
public final class CheckChildMBankActiveApiModel {
    private final long childClientKey;
    private final YesNoApiModel hasActiveChannel;
    private final YesNoApiModel hasActiveUser;
    private final Long userId;

    public CheckChildMBankActiveApiModel(long j, YesNoApiModel yesNoApiModel, YesNoApiModel yesNoApiModel2, Long l) {
        this.childClientKey = j;
        this.hasActiveUser = yesNoApiModel;
        this.hasActiveChannel = yesNoApiModel2;
        this.userId = l;
    }

    public static /* synthetic */ CheckChildMBankActiveApiModel copy$default(CheckChildMBankActiveApiModel checkChildMBankActiveApiModel, long j, YesNoApiModel yesNoApiModel, YesNoApiModel yesNoApiModel2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = checkChildMBankActiveApiModel.childClientKey;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            yesNoApiModel = checkChildMBankActiveApiModel.hasActiveUser;
        }
        YesNoApiModel yesNoApiModel3 = yesNoApiModel;
        if ((i & 4) != 0) {
            yesNoApiModel2 = checkChildMBankActiveApiModel.hasActiveChannel;
        }
        YesNoApiModel yesNoApiModel4 = yesNoApiModel2;
        if ((i & 8) != 0) {
            l = checkChildMBankActiveApiModel.userId;
        }
        return checkChildMBankActiveApiModel.copy(j2, yesNoApiModel3, yesNoApiModel4, l);
    }

    public final long component1() {
        return this.childClientKey;
    }

    public final YesNoApiModel component2() {
        return this.hasActiveUser;
    }

    public final YesNoApiModel component3() {
        return this.hasActiveChannel;
    }

    public final Long component4() {
        return this.userId;
    }

    public final CheckChildMBankActiveApiModel copy(long j, YesNoApiModel yesNoApiModel, YesNoApiModel yesNoApiModel2, Long l) {
        return new CheckChildMBankActiveApiModel(j, yesNoApiModel, yesNoApiModel2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckChildMBankActiveApiModel)) {
            return false;
        }
        CheckChildMBankActiveApiModel checkChildMBankActiveApiModel = (CheckChildMBankActiveApiModel) obj;
        return this.childClientKey == checkChildMBankActiveApiModel.childClientKey && this.hasActiveUser == checkChildMBankActiveApiModel.hasActiveUser && this.hasActiveChannel == checkChildMBankActiveApiModel.hasActiveChannel && C41536l.m120484d(this.userId, checkChildMBankActiveApiModel.userId);
    }

    public final long getChildClientKey() {
        return this.childClientKey;
    }

    public final YesNoApiModel getHasActiveChannel() {
        return this.hasActiveChannel;
    }

    public final YesNoApiModel getHasActiveUser() {
        return this.hasActiveUser;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.childClientKey) * 31;
        YesNoApiModel yesNoApiModel = this.hasActiveUser;
        int i = 0;
        int hashCode = (a + (yesNoApiModel == null ? 0 : yesNoApiModel.hashCode())) * 31;
        YesNoApiModel yesNoApiModel2 = this.hasActiveChannel;
        int hashCode2 = (hashCode + (yesNoApiModel2 == null ? 0 : yesNoApiModel2.hashCode())) * 31;
        Long l = this.userId;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.childClientKey;
        YesNoApiModel yesNoApiModel = this.hasActiveUser;
        YesNoApiModel yesNoApiModel2 = this.hasActiveChannel;
        Long l = this.userId;
        return "CheckChildMBankActiveApiModel(childClientKey=" + j + ", hasActiveUser=" + yesNoApiModel + ", hasActiveChannel=" + yesNoApiModel2 + ", userId=" + l + ")";
    }
}
