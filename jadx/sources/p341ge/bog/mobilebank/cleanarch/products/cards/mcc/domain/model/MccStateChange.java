package p341ge.bog.mobilebank.cleanarch.products.cards.mcc.domain.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.domain.model.MccStateChange */
public final class MccStateChange {
    private final String cardId;
    private final String mccGroupCode;
    private final String mccGroupStatusFlag;

    public MccStateChange(String str, String str2, String str3) {
        C41536l.m120489i(str, "cardId");
        C41536l.m120489i(str2, "mccGroupCode");
        C41536l.m120489i(str3, "mccGroupStatusFlag");
        this.cardId = str;
        this.mccGroupCode = str2;
        this.mccGroupStatusFlag = str3;
    }

    public static /* synthetic */ MccStateChange copy$default(MccStateChange mccStateChange, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mccStateChange.cardId;
        }
        if ((i & 2) != 0) {
            str2 = mccStateChange.mccGroupCode;
        }
        if ((i & 4) != 0) {
            str3 = mccStateChange.mccGroupStatusFlag;
        }
        return mccStateChange.copy(str, str2, str3);
    }

    public final String component1() {
        return this.cardId;
    }

    public final String component2() {
        return this.mccGroupCode;
    }

    public final String component3() {
        return this.mccGroupStatusFlag;
    }

    public final MccStateChange copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "cardId");
        C41536l.m120489i(str2, "mccGroupCode");
        C41536l.m120489i(str3, "mccGroupStatusFlag");
        return new MccStateChange(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MccStateChange)) {
            return false;
        }
        MccStateChange mccStateChange = (MccStateChange) obj;
        return C41536l.m120484d(this.cardId, mccStateChange.cardId) && C41536l.m120484d(this.mccGroupCode, mccStateChange.mccGroupCode) && C41536l.m120484d(this.mccGroupStatusFlag, mccStateChange.mccGroupStatusFlag);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getMccGroupCode() {
        return this.mccGroupCode;
    }

    public final String getMccGroupStatusFlag() {
        return this.mccGroupStatusFlag;
    }

    public int hashCode() {
        return (((this.cardId.hashCode() * 31) + this.mccGroupCode.hashCode()) * 31) + this.mccGroupStatusFlag.hashCode();
    }

    public String toString() {
        String str = this.cardId;
        String str2 = this.mccGroupCode;
        String str3 = this.mccGroupStatusFlag;
        return "MccStateChange(cardId=" + str + ", mccGroupCode=" + str2 + ", mccGroupStatusFlag=" + str3 + ")";
    }
}
