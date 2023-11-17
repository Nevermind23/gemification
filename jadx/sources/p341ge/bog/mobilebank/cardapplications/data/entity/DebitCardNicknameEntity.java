package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardNicknameEntity */
public final class DebitCardNicknameEntity {
    private final String cardNickname;
    private final String clientNickname;

    public DebitCardNicknameEntity(String str, String str2) {
        C41536l.m120489i(str, "cardNickname");
        C41536l.m120489i(str2, "clientNickname");
        this.cardNickname = str;
        this.clientNickname = str2;
    }

    public static /* synthetic */ DebitCardNicknameEntity copy$default(DebitCardNicknameEntity debitCardNicknameEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debitCardNicknameEntity.cardNickname;
        }
        if ((i & 2) != 0) {
            str2 = debitCardNicknameEntity.clientNickname;
        }
        return debitCardNicknameEntity.copy(str, str2);
    }

    public final String component1() {
        return this.cardNickname;
    }

    public final String component2() {
        return this.clientNickname;
    }

    public final DebitCardNicknameEntity copy(String str, String str2) {
        C41536l.m120489i(str, "cardNickname");
        C41536l.m120489i(str2, "clientNickname");
        return new DebitCardNicknameEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardNicknameEntity)) {
            return false;
        }
        DebitCardNicknameEntity debitCardNicknameEntity = (DebitCardNicknameEntity) obj;
        return C41536l.m120484d(this.cardNickname, debitCardNicknameEntity.cardNickname) && C41536l.m120484d(this.clientNickname, debitCardNicknameEntity.clientNickname);
    }

    public final String getCardNickname() {
        return this.cardNickname;
    }

    public final String getClientNickname() {
        return this.clientNickname;
    }

    public int hashCode() {
        return (this.cardNickname.hashCode() * 31) + this.clientNickname.hashCode();
    }

    public String toString() {
        String str = this.cardNickname;
        String str2 = this.clientNickname;
        return "DebitCardNicknameEntity(cardNickname=" + str + ", clientNickname=" + str2 + ")";
    }
}
