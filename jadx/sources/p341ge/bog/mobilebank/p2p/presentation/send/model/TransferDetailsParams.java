package p341ge.bog.mobilebank.p2p.presentation.send.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.p2p.presentation.send.model.TransferDetailsParams */
public final class TransferDetailsParams extends OtpParams {
    public static final C33538a Companion = new C33538a((DefaultConstructorMarker) null);
    private static final String P2P_CREATE_OUTGOING_PAYMENT_REQUEST = "P2P_CREATE_OUTGOING_PAYMENT_REQUEST";
    private final long acctKey;
    private final double amount;
    private final long cardId;
    private final String ccy;
    private final String contactId;
    private final String nomination;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.model.TransferDetailsParams$a */
    public static final class C33538a {
        private C33538a() {
        }

        public /* synthetic */ C33538a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransferDetailsParams(long r17, java.lang.String r19, long r20, double r22, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 64
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = "P2P_CREATE_OUTGOING_PAYMENT_REQUEST"
            r12 = r1
            goto L_0x000c
        L_0x000a:
            r12 = r26
        L_0x000c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r13 = r2
            goto L_0x0015
        L_0x0013:
            r13 = r27
        L_0x0015:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x001b
            r14 = r2
            goto L_0x001d
        L_0x001b:
            r14 = r28
        L_0x001d:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0023
            r15 = r2
            goto L_0x0025
        L_0x0023:
            r15 = r29
        L_0x0025:
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r8 = r22
            r10 = r24
            r11 = r25
            r2.<init>(r3, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p2p.presentation.send.model.TransferDetailsParams.<init>(long, java.lang.String, long, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getNomination() {
        return this.nomination;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferDetailsParams(long j, String str, long j2, double d, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str4, str6, str7, (String) null, 8, (DefaultConstructorMarker) null);
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str8, "ccy");
        C41536l.m120489i(str9, "nomination");
        C41536l.m120489i(str10, IRetrofitService.SERVICE_ID);
        this.cardId = j;
        this.contactId = str;
        this.acctKey = j2;
        this.amount = d;
        this.ccy = str8;
        this.nomination = str9;
        this.serviceId = str10;
        this.operationId = str5;
        this.operationReference = str6;
        this.scaAuthCode = str7;
    }
}
