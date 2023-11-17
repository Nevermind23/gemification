package p341ge.bog.mobilebank.shared2.network.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.shared2.network.models.BffApiResponse */
public final class BffApiResponse<ContentType> {
    public static final C34680a Companion = new C34680a((DefaultConstructorMarker) null);
    private static final String ERROR_CODE_INVALID_SESSION = "20";
    private static final String ERROR_CODE_SERVER_UNDER_MAINTENANCE = "100";
    private final String code;
    private final BffApiErrorResponse error;
    private final ContentType result;

    /* renamed from: ge.bog.mobilebank.shared2.network.models.BffApiResponse$a */
    public static final class C34680a {
        private C34680a() {
        }

        public /* synthetic */ C34680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BffApiResponse() {
        this((Object) null, (String) null, (BffApiErrorResponse) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffApiResponse copy$default(BffApiResponse bffApiResponse, ContentType contenttype, String str, BffApiErrorResponse bffApiErrorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            contenttype = bffApiResponse.result;
        }
        if ((i & 2) != 0) {
            str = bffApiResponse.code;
        }
        if ((i & 4) != 0) {
            bffApiErrorResponse = bffApiResponse.error;
        }
        return bffApiResponse.copy(contenttype, str, bffApiErrorResponse);
    }

    public final ContentType component1() {
        return this.result;
    }

    public final String component2() {
        return this.code;
    }

    public final BffApiErrorResponse component3() {
        return this.error;
    }

    public final BffApiResponse<ContentType> copy(ContentType contenttype, String str, BffApiErrorResponse bffApiErrorResponse) {
        return new BffApiResponse<>(contenttype, str, bffApiErrorResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffApiResponse)) {
            return false;
        }
        BffApiResponse bffApiResponse = (BffApiResponse) obj;
        return C41536l.m120484d(this.result, bffApiResponse.result) && C41536l.m120484d(this.code, bffApiResponse.code) && C41536l.m120484d(this.error, bffApiResponse.error);
    }

    public final String getCode() {
        return this.code;
    }

    public final BffApiErrorResponse getError() {
        return this.error;
    }

    public final ContentType getResult() {
        return this.result;
    }

    public int hashCode() {
        ContentType contenttype = this.result;
        int i = 0;
        int hashCode = (contenttype == null ? 0 : contenttype.hashCode()) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BffApiErrorResponse bffApiErrorResponse = this.error;
        if (bffApiErrorResponse != null) {
            i = bffApiErrorResponse.hashCode();
        }
        return hashCode2 + i;
    }

    public final boolean isInvalidSession() {
        return C41536l.m120484d(this.code, "20");
    }

    public final boolean isServerUnderMaintenance() {
        return C41536l.m120484d(this.code, "100");
    }

    public String toString() {
        ContentType contenttype = this.result;
        String str = this.code;
        BffApiErrorResponse bffApiErrorResponse = this.error;
        return "BffApiResponse(result=" + contenttype + ", code=" + str + ", error=" + bffApiErrorResponse + ")";
    }

    public BffApiResponse(ContentType contenttype) {
        this(contenttype, (String) null, (BffApiErrorResponse) null, 6, (DefaultConstructorMarker) null);
    }

    public BffApiResponse(ContentType contenttype, String str) {
        this(contenttype, str, (BffApiErrorResponse) null, 4, (DefaultConstructorMarker) null);
    }

    public BffApiResponse(ContentType contenttype, String str, BffApiErrorResponse bffApiErrorResponse) {
        this.result = contenttype;
        this.code = str;
        this.error = bffApiErrorResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffApiResponse(Object obj, String str, BffApiErrorResponse bffApiErrorResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bffApiErrorResponse);
    }
}
