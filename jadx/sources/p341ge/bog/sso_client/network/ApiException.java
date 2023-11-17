package p341ge.bog.sso_client.network;

import androidx.annotation.Keep;
import ba1.C10146d0;
import ba1.C10195g0;
import fh1.C40951a;
import gh1.C41125a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import ue1.C43064a;

@Keep
/* renamed from: ge.bog.sso_client.network.ApiException */
public final class ApiException extends RuntimeException {
    private final Integer errorCode;
    private final String errorDictionaryKey;
    private final String errorKey;
    private final String errorMessage;

    /* renamed from: ge.bog.sso_client.network.ApiException$a */
    public static final class C35968a implements C41125a {

        /* renamed from: a */
        private final Object f87023a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo88590b() {
            return this.f87023a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiException(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ ApiException copy$default(ApiException apiException, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = apiException.errorCode;
        }
        if ((i & 2) != 0) {
            str = apiException.errorMessage;
        }
        if ((i & 4) != 0) {
            str2 = apiException.errorKey;
        }
        if ((i & 8) != 0) {
            str3 = apiException.errorDictionaryKey;
        }
        return apiException.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final String component3() {
        return this.errorKey;
    }

    public final String component4() {
        return this.errorDictionaryKey;
    }

    public final ApiException copy(Integer num, String str, String str2, String str3) {
        return new ApiException(num, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiException)) {
            return false;
        }
        ApiException apiException = (ApiException) obj;
        return C41536l.m120484d(this.errorCode, apiException.errorCode) && C41536l.m120484d(this.errorMessage, apiException.errorMessage) && C41536l.m120484d(this.errorKey, apiException.errorKey) && C41536l.m120484d(this.errorDictionaryKey, apiException.errorDictionaryKey);
    }

    public final String errorDisplayText(ApiException apiException) {
        C10195g0 g;
        C41536l.m120489i(apiException, "<this>");
        if (apiException.errorDictionaryKey == null || (g = ((C10146d0.C10172e) new C35968a().mo88590b()).mo26716g()) == null) {
            return null;
        }
        return g.mo26763a(apiException.errorDictionaryKey, new Object[0]);
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDictionaryKey() {
        return this.errorDictionaryKey;
    }

    public final String getErrorKey() {
        return this.errorKey;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        Integer num = this.errorCode;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorDictionaryKey;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ApiException(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", errorKey=" + this.errorKey + ", errorDictionaryKey=" + this.errorDictionaryKey + ')';
    }

    public ApiException(Integer num, String str, String str2, String str3) {
        super(str);
        this.errorCode = num;
        this.errorMessage = str;
        this.errorKey = str2;
        this.errorDictionaryKey = str3;
    }
}
