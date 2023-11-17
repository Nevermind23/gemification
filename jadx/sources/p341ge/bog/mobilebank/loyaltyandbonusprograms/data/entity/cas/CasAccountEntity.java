package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasAccountEntity */
public final class CasAccountEntity {
    private final long acctKey;
    private final String acctName;
    private final double availableAmount;
    private final String ccy;
    private final long clientServiceId;

    /* renamed from: id */
    private final long f80605id;

    public CasAccountEntity(long j, long j2, long j3, String str, double d, String str2) {
        C41536l.m120489i(str, "acctName");
        this.f80605id = j;
        this.clientServiceId = j2;
        this.acctKey = j3;
        this.acctName = str;
        this.availableAmount = d;
        this.ccy = str2;
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctName() {
        return this.acctName;
    }

    public final double getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getClientServiceId() {
        return this.clientServiceId;
    }

    public final long getId() {
        return this.f80605id;
    }
}
