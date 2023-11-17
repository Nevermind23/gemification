package p341ge.bog.mobilebank.shared2.network;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.shared2.network.BankApiResponse */
public final class BankApiResponse<ContentType> {
    public static final String CODE_STATUS_WARNING = "W";
    public static final C34678a Companion = new C34678a((DefaultConstructorMarker) null);
    public static final String INVALID_SESSION_CODE = "13";
    public static final String INVALID_SESSION_CODE_OTHER = "20";
    public static final String SCA_AUTH_ERROR_CODE = "25";
    public static final String SCA_AUTH_ERROR_CODE_WITH_LOCK = "26";
    public static final String SUCCESSFUL_RESPONSE_CODE = "0";
    public static final String UNDER_MAINTENANCE_RESPONSE_CODE = "100";
    private final String code;
    private final String codeStatus;
    private final String error;
    private final String errorValue;
    private final C34679b format;
    private boolean isNetworkFailure;
    private final String key;
    private Throwable networkFailure;
    private final ContentType result;

    /* renamed from: ge.bog.mobilebank.shared2.network.BankApiResponse$a */
    public static final class C34678a {
        private C34678a() {
        }

        public /* synthetic */ C34678a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.network.BankApiResponse$b */
    public enum C34679b {
        PLAIN,
        JSON,
        BINARY
    }

    public BankApiResponse() {
        this((Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C34679b) null, C11051p3.f31760d, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BankApiResponse copy$default(BankApiResponse bankApiResponse, ContentType contenttype, String str, String str2, String str3, String str4, String str5, C34679b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            contenttype = bankApiResponse.result;
        }
        if ((i & 2) != 0) {
            str = bankApiResponse.code;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = bankApiResponse.codeStatus;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = bankApiResponse.error;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = bankApiResponse.key;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = bankApiResponse.errorValue;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            bVar = bankApiResponse.format;
        }
        return bankApiResponse.copy(contenttype, str6, str7, str8, str9, str10, bVar);
    }

    public final ContentType component1() {
        return this.result;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.codeStatus;
    }

    public final String component4() {
        return this.error;
    }

    public final String component5() {
        return this.key;
    }

    public final String component6() {
        return this.errorValue;
    }

    public final C34679b component7() {
        return this.format;
    }

    public final BankApiResponse<ContentType> copy(ContentType contenttype, String str, String str2, String str3, String str4, String str5, C34679b bVar) {
        return new BankApiResponse(contenttype, str, str2, str3, str4, str5, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankApiResponse)) {
            return false;
        }
        BankApiResponse bankApiResponse = (BankApiResponse) obj;
        return C41536l.m120484d(this.result, bankApiResponse.result) && C41536l.m120484d(this.code, bankApiResponse.code) && C41536l.m120484d(this.codeStatus, bankApiResponse.codeStatus) && C41536l.m120484d(this.error, bankApiResponse.error) && C41536l.m120484d(this.key, bankApiResponse.key) && C41536l.m120484d(this.errorValue, bankApiResponse.errorValue) && this.format == bankApiResponse.format;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCodeStatus() {
        return this.codeStatus;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorValue() {
        return this.errorValue;
    }

    public final C34679b getFormat() {
        return this.format;
    }

    public final String getKey() {
        return this.key;
    }

    public final Throwable getNetworkFailure() {
        return this.networkFailure;
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
        String str2 = this.codeStatus;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.key;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorValue;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C34679b bVar = this.format;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode6 + i;
    }

    public final boolean isInvalidSession() {
        return C41358y.m119999O(C41357x0.m119989i(INVALID_SESSION_CODE, INVALID_SESSION_CODE_OTHER), this.code);
    }

    public final boolean isNetworkFailure() {
        return this.isNetworkFailure;
    }

    public final boolean isScaError() {
        return C41536l.m120484d(this.code, SCA_AUTH_ERROR_CODE);
    }

    public final boolean isServerUnderMaintenance() {
        return C41536l.m120484d(this.code, UNDER_MAINTENANCE_RESPONSE_CODE);
    }

    public final boolean isSuccess() {
        return C41536l.m120484d(this.code, SUCCESSFUL_RESPONSE_CODE);
    }

    public final void setNetworkFailure(boolean z) {
        this.isNetworkFailure = z;
    }

    public String toString() {
        ContentType contenttype = this.result;
        String str = this.code;
        String str2 = this.codeStatus;
        String str3 = this.error;
        String str4 = this.key;
        String str5 = this.errorValue;
        C34679b bVar = this.format;
        return "BankApiResponse(result=" + contenttype + ", code=" + str + ", codeStatus=" + str2 + ", error=" + str3 + ", key=" + str4 + ", errorValue=" + str5 + ", format=" + bVar + ")";
    }

    public BankApiResponse(ContentType contenttype) {
        this(contenttype, (String) null, (String) null, (String) null, (String) null, (String) null, (C34679b) null, 126, (DefaultConstructorMarker) null);
    }

    public final void setNetworkFailure(Throwable th) {
        this.networkFailure = th;
    }

    public BankApiResponse(ContentType contenttype, String str) {
        this(contenttype, str, (String) null, (String) null, (String) null, (String) null, (C34679b) null, 124, (DefaultConstructorMarker) null);
    }

    public BankApiResponse(ContentType contenttype, String str, String str2) {
        this(contenttype, str, str2, (String) null, (String) null, (String) null, (C34679b) null, 120, (DefaultConstructorMarker) null);
    }

    public BankApiResponse(ContentType contenttype, String str, String str2, String str3) {
        this(contenttype, str, str2, str3, (String) null, (String) null, (C34679b) null, 112, (DefaultConstructorMarker) null);
    }

    public BankApiResponse(ContentType contenttype, String str, String str2, String str3, String str4) {
        this(contenttype, str, str2, str3, str4, (String) null, (C34679b) null, 96, (DefaultConstructorMarker) null);
    }

    public BankApiResponse(ContentType contenttype, String str, String str2, String str3, String str4, String str5) {
        this(contenttype, str, str2, str3, str4, str5, (C34679b) null, 64, (DefaultConstructorMarker) null);
    }

    public BankApiResponse(ContentType contenttype, String str, String str2, String str3, String str4, String str5, C34679b bVar) {
        this.result = contenttype;
        this.code = str;
        this.codeStatus = str2;
        this.error = str3;
        this.key = str4;
        this.errorValue = str5;
        this.format = bVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BankApiResponse(java.lang.Object r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, p341ge.bog.mobilebank.shared2.network.BankApiResponse.C34679b r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared2.network.BankApiResponse.<init>(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.shared2.network.BankApiResponse$b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
