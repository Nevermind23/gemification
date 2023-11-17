package p341ge.bog.mobilebank.model.usrinfo;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.model.usrinfo.ClientStarInfo */
public final class ClientStarInfo {
    private final Long clientKey;
    private final String currentLabel;
    private final String currentLabelType;
    private final Integer sumStatusPoint;

    public ClientStarInfo(Long l, String str, String str2, Integer num) {
        this.clientKey = l;
        this.currentLabelType = str;
        this.currentLabel = str2;
        this.sumStatusPoint = num;
    }

    public static /* synthetic */ ClientStarInfo copy$default(ClientStarInfo clientStarInfo, Long l, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            l = clientStarInfo.clientKey;
        }
        if ((i & 2) != 0) {
            str = clientStarInfo.currentLabelType;
        }
        if ((i & 4) != 0) {
            str2 = clientStarInfo.currentLabel;
        }
        if ((i & 8) != 0) {
            num = clientStarInfo.sumStatusPoint;
        }
        return clientStarInfo.copy(l, str, str2, num);
    }

    public final Long component1() {
        return this.clientKey;
    }

    public final String component2() {
        return this.currentLabelType;
    }

    public final String component3() {
        return this.currentLabel;
    }

    public final Integer component4() {
        return this.sumStatusPoint;
    }

    public final ClientStarInfo copy(Long l, String str, String str2, Integer num) {
        return new ClientStarInfo(l, str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientStarInfo)) {
            return false;
        }
        ClientStarInfo clientStarInfo = (ClientStarInfo) obj;
        return C41536l.m120484d(this.clientKey, clientStarInfo.clientKey) && C41536l.m120484d(this.currentLabelType, clientStarInfo.currentLabelType) && C41536l.m120484d(this.currentLabel, clientStarInfo.currentLabel) && C41536l.m120484d(this.sumStatusPoint, clientStarInfo.sumStatusPoint);
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getCurrentLabel() {
        return this.currentLabel;
    }

    public final String getCurrentLabelType() {
        return this.currentLabelType;
    }

    public final Integer getSumStatusPoint() {
        return this.sumStatusPoint;
    }

    public int hashCode() {
        Long l = this.clientKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.currentLabelType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentLabel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sumStatusPoint;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        Long l = this.clientKey;
        String str = this.currentLabelType;
        String str2 = this.currentLabel;
        Integer num = this.sumStatusPoint;
        return "ClientStarInfo(clientKey=" + l + ", currentLabelType=" + str + ", currentLabel=" + str2 + ", sumStatusPoint=" + num + ")";
    }
}
