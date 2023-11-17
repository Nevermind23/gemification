package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.PrloTicketEntity */
public final class PrloTicketEntity {
    private long clientKey;

    /* renamed from: id */
    private long f56692id;
    private long runDate;
    private String status;
    public String ticketNo;

    public PrloTicketEntity() {
        this(0, 0, (String) null, (String) null, 0, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PrloTicketEntity copy$default(PrloTicketEntity prloTicketEntity, long j, long j2, String str, String str2, long j3, int i, Object obj) {
        PrloTicketEntity prloTicketEntity2 = prloTicketEntity;
        return prloTicketEntity.copy((i & 1) != 0 ? prloTicketEntity2.f56692id : j, (i & 2) != 0 ? prloTicketEntity2.clientKey : j2, (i & 4) != 0 ? prloTicketEntity2.ticketNo : str, (i & 8) != 0 ? prloTicketEntity2.status : str2, (i & 16) != 0 ? prloTicketEntity2.runDate : j3);
    }

    public final long component1() {
        return this.f56692id;
    }

    public final long component2() {
        return this.clientKey;
    }

    public final String component3() {
        return this.ticketNo;
    }

    public final String component4() {
        return this.status;
    }

    public final long component5() {
        return this.runDate;
    }

    public final PrloTicketEntity copy(long j, long j2, String str, String str2, long j3) {
        return new PrloTicketEntity(j, j2, str, str2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrloTicketEntity)) {
            return false;
        }
        PrloTicketEntity prloTicketEntity = (PrloTicketEntity) obj;
        return this.f56692id == prloTicketEntity.f56692id && this.clientKey == prloTicketEntity.clientKey && C41536l.m120484d(this.ticketNo, prloTicketEntity.ticketNo) && C41536l.m120484d(this.status, prloTicketEntity.status) && this.runDate == prloTicketEntity.runDate;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getId() {
        return this.f56692id;
    }

    public final long getRunDate() {
        return this.runDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f56692id) * 31) + C7397t.m28148a(this.clientKey)) * 31;
        String str = this.ticketNo;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + C7397t.m28148a(this.runDate);
    }

    public final void setClientKey(long j) {
        this.clientKey = j;
    }

    public final void setId(long j) {
        this.f56692id = j;
    }

    public final void setRunDate(long j) {
        this.runDate = j;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        long j = this.f56692id;
        long j2 = this.clientKey;
        String str = this.ticketNo;
        String str2 = this.status;
        long j3 = this.runDate;
        return "PrloTicketEntity(id=" + j + ", clientKey=" + j2 + ", ticketNo=" + str + ", status=" + str2 + ", runDate=" + j3 + ")";
    }

    public PrloTicketEntity(long j, long j2, String str, String str2, long j3) {
        this.f56692id = j;
        this.clientKey = j2;
        this.ticketNo = str;
        this.status = str2;
        this.runDate = j3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PrloTicketEntity(long r10, long r12, java.lang.String r14, java.lang.String r15, long r16, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r10
        L_0x0009:
            r0 = r18 & 2
            if (r0 == 0) goto L_0x000f
            r5 = r1
            goto L_0x0010
        L_0x000f:
            r5 = r12
        L_0x0010:
            r0 = r18 & 4
            r7 = 0
            if (r0 == 0) goto L_0x0017
            r0 = r7
            goto L_0x0018
        L_0x0017:
            r0 = r14
        L_0x0018:
            r8 = r18 & 8
            if (r8 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r7 = r15
        L_0x001e:
            r8 = r18 & 16
            if (r8 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = r16
        L_0x0025:
            r10 = r9
            r11 = r3
            r13 = r5
            r15 = r0
            r16 = r7
            r17 = r1
            r10.<init>(r11, r13, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.PrloTicketEntity.<init>(long, long, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
