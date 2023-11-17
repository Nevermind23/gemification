package p341ge.bog.sso_client.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.sso_client.models.LogFaceTecErrorResponse */
public final class LogFaceTecErrorResponse {
    private final Integer errorCode;
    private final String errorKey;

    public LogFaceTecErrorResponse(Integer num, String str) {
        this.errorCode = num;
        this.errorKey = str;
    }

    public static /* synthetic */ LogFaceTecErrorResponse copy$default(LogFaceTecErrorResponse logFaceTecErrorResponse, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = logFaceTecErrorResponse.errorCode;
        }
        if ((i & 2) != 0) {
            str = logFaceTecErrorResponse.errorKey;
        }
        return logFaceTecErrorResponse.copy(num, str);
    }

    public final Integer component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorKey;
    }

    public final LogFaceTecErrorResponse copy(Integer num, String str) {
        return new LogFaceTecErrorResponse(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogFaceTecErrorResponse)) {
            return false;
        }
        LogFaceTecErrorResponse logFaceTecErrorResponse = (LogFaceTecErrorResponse) obj;
        return C41536l.m120484d(this.errorCode, logFaceTecErrorResponse.errorCode) && C41536l.m120484d(this.errorKey, logFaceTecErrorResponse.errorKey);
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorKey() {
        return this.errorKey;
    }

    public int hashCode() {
        Integer num = this.errorCode;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorKey;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "LogFaceTecErrorResponse(errorCode=" + this.errorCode + ", errorKey=" + this.errorKey + ')';
    }
}
