package p341ge.bog.chat.data.entitiy.response;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.response.CheckPolicyApi */
public final class CheckPolicyApi {
    private final Boolean approved;
    private final Integer code;
    private final String status;

    public CheckPolicyApi(Integer num, String str, Boolean bool) {
        this.code = num;
        this.status = str;
        this.approved = bool;
    }

    public static /* synthetic */ CheckPolicyApi copy$default(CheckPolicyApi checkPolicyApi, Integer num, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = checkPolicyApi.code;
        }
        if ((i & 2) != 0) {
            str = checkPolicyApi.status;
        }
        if ((i & 4) != 0) {
            bool = checkPolicyApi.approved;
        }
        return checkPolicyApi.copy(num, str, bool);
    }

    public final Integer component1() {
        return this.code;
    }

    public final String component2() {
        return this.status;
    }

    public final Boolean component3() {
        return this.approved;
    }

    public final CheckPolicyApi copy(Integer num, String str, Boolean bool) {
        return new CheckPolicyApi(num, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckPolicyApi)) {
            return false;
        }
        CheckPolicyApi checkPolicyApi = (CheckPolicyApi) obj;
        return C41536l.m120484d(this.code, checkPolicyApi.code) && C41536l.m120484d(this.status, checkPolicyApi.status) && C41536l.m120484d(this.approved, checkPolicyApi.approved);
    }

    public final Boolean getApproved() {
        return this.approved;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.code;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.approved;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Integer num = this.code;
        String str = this.status;
        Boolean bool = this.approved;
        return "CheckPolicyApi(code=" + num + ", status=" + str + ", approved=" + bool + ")";
    }
}
