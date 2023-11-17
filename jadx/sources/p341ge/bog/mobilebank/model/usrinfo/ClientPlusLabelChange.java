package p341ge.bog.mobilebank.model.usrinfo;

import hd0.C24978b;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.model.usrinfo.ClientPlusLabelChange */
public final class ClientPlusLabelChange {
    private final Long clientKey;
    private final String dictionaryKey;
    private final String dictionaryValue;
    private final String labelTypeNew;
    private final String labelTypeNewDesc;
    private final String labelTypeOld;
    private final String statusProgress;
    private final C24978b viewFlag;

    public ClientPlusLabelChange(Long l, String str, String str2, String str3, String str4, C24978b bVar, String str5, String str6) {
        this.clientKey = l;
        this.labelTypeOld = str;
        this.labelTypeNew = str2;
        this.labelTypeNewDesc = str3;
        this.statusProgress = str4;
        this.viewFlag = bVar;
        this.dictionaryKey = str5;
        this.dictionaryValue = str6;
    }

    public static /* synthetic */ ClientPlusLabelChange copy$default(ClientPlusLabelChange clientPlusLabelChange, Long l, String str, String str2, String str3, String str4, C24978b bVar, String str5, String str6, int i, Object obj) {
        ClientPlusLabelChange clientPlusLabelChange2 = clientPlusLabelChange;
        int i2 = i;
        return clientPlusLabelChange.copy((i2 & 1) != 0 ? clientPlusLabelChange2.clientKey : l, (i2 & 2) != 0 ? clientPlusLabelChange2.labelTypeOld : str, (i2 & 4) != 0 ? clientPlusLabelChange2.labelTypeNew : str2, (i2 & 8) != 0 ? clientPlusLabelChange2.labelTypeNewDesc : str3, (i2 & 16) != 0 ? clientPlusLabelChange2.statusProgress : str4, (i2 & 32) != 0 ? clientPlusLabelChange2.viewFlag : bVar, (i2 & 64) != 0 ? clientPlusLabelChange2.dictionaryKey : str5, (i2 & 128) != 0 ? clientPlusLabelChange2.dictionaryValue : str6);
    }

    public final Long component1() {
        return this.clientKey;
    }

    public final String component2() {
        return this.labelTypeOld;
    }

    public final String component3() {
        return this.labelTypeNew;
    }

    public final String component4() {
        return this.labelTypeNewDesc;
    }

    public final String component5() {
        return this.statusProgress;
    }

    public final C24978b component6() {
        return this.viewFlag;
    }

    public final String component7() {
        return this.dictionaryKey;
    }

    public final String component8() {
        return this.dictionaryValue;
    }

    public final ClientPlusLabelChange copy(Long l, String str, String str2, String str3, String str4, C24978b bVar, String str5, String str6) {
        return new ClientPlusLabelChange(l, str, str2, str3, str4, bVar, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientPlusLabelChange)) {
            return false;
        }
        ClientPlusLabelChange clientPlusLabelChange = (ClientPlusLabelChange) obj;
        return C41536l.m120484d(this.clientKey, clientPlusLabelChange.clientKey) && C41536l.m120484d(this.labelTypeOld, clientPlusLabelChange.labelTypeOld) && C41536l.m120484d(this.labelTypeNew, clientPlusLabelChange.labelTypeNew) && C41536l.m120484d(this.labelTypeNewDesc, clientPlusLabelChange.labelTypeNewDesc) && C41536l.m120484d(this.statusProgress, clientPlusLabelChange.statusProgress) && this.viewFlag == clientPlusLabelChange.viewFlag && C41536l.m120484d(this.dictionaryKey, clientPlusLabelChange.dictionaryKey) && C41536l.m120484d(this.dictionaryValue, clientPlusLabelChange.dictionaryValue);
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public final String getLabelTypeNew() {
        return this.labelTypeNew;
    }

    public final String getLabelTypeNewDesc() {
        return this.labelTypeNewDesc;
    }

    public final String getLabelTypeOld() {
        return this.labelTypeOld;
    }

    public final String getStatusProgress() {
        return this.statusProgress;
    }

    public final C24978b getViewFlag() {
        return this.viewFlag;
    }

    public int hashCode() {
        Long l = this.clientKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.labelTypeOld;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.labelTypeNew;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.labelTypeNewDesc;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.statusProgress;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C24978b bVar = this.viewFlag;
        int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str5 = this.dictionaryKey;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dictionaryValue;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        Long l = this.clientKey;
        String str = this.labelTypeOld;
        String str2 = this.labelTypeNew;
        String str3 = this.labelTypeNewDesc;
        String str4 = this.statusProgress;
        C24978b bVar = this.viewFlag;
        String str5 = this.dictionaryKey;
        String str6 = this.dictionaryValue;
        return "ClientPlusLabelChange(clientKey=" + l + ", labelTypeOld=" + str + ", labelTypeNew=" + str2 + ", labelTypeNewDesc=" + str3 + ", statusProgress=" + str4 + ", viewFlag=" + bVar + ", dictionaryKey=" + str5 + ", dictionaryValue=" + str6 + ")";
    }
}
