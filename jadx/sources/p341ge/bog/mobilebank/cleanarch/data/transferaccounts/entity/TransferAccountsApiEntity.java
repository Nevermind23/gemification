package p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsApiEntity */
public final class TransferAccountsApiEntity {
    @C8664c("PAYMENT_WITHIN_BANK")
    private final TransferAccountApiEntity bank;
    @C8664c("PAYMENT_CONVERSION")
    private final TransferAccountApiEntity conversion;
    @C8664c("PAYMENT_OWN_ACCOUNTS")
    private final TransferAccountApiEntity domestic;
    @C8664c("PAYMENT_FOREIGN")
    private final TransferAccountApiEntity foreign;
    @C8664c("PAYMENT_WITHIN_BANK_FOR_GALT")
    private final TransferAccountApiEntity galtAndTaggart;
    @C8664c("PAYMENT_WITHIN_GEORGIA")
    private final TransferAccountApiEntity georgia;
    @C8664c("MONEY_REQUEST")
    private final TransferAccountApiEntity moneyRequest;

    public TransferAccountsApiEntity() {
        this((TransferAccountApiEntity) null, (TransferAccountApiEntity) null, (TransferAccountApiEntity) null, (TransferAccountApiEntity) null, (TransferAccountApiEntity) null, (TransferAccountApiEntity) null, (TransferAccountApiEntity) null, C11051p3.f31760d, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TransferAccountsApiEntity copy$default(TransferAccountsApiEntity transferAccountsApiEntity, TransferAccountApiEntity transferAccountApiEntity, TransferAccountApiEntity transferAccountApiEntity2, TransferAccountApiEntity transferAccountApiEntity3, TransferAccountApiEntity transferAccountApiEntity4, TransferAccountApiEntity transferAccountApiEntity5, TransferAccountApiEntity transferAccountApiEntity6, TransferAccountApiEntity transferAccountApiEntity7, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccountApiEntity = transferAccountsApiEntity.bank;
        }
        if ((i & 2) != 0) {
            transferAccountApiEntity2 = transferAccountsApiEntity.domestic;
        }
        TransferAccountApiEntity transferAccountApiEntity8 = transferAccountApiEntity2;
        if ((i & 4) != 0) {
            transferAccountApiEntity3 = transferAccountsApiEntity.conversion;
        }
        TransferAccountApiEntity transferAccountApiEntity9 = transferAccountApiEntity3;
        if ((i & 8) != 0) {
            transferAccountApiEntity4 = transferAccountsApiEntity.foreign;
        }
        TransferAccountApiEntity transferAccountApiEntity10 = transferAccountApiEntity4;
        if ((i & 16) != 0) {
            transferAccountApiEntity5 = transferAccountsApiEntity.georgia;
        }
        TransferAccountApiEntity transferAccountApiEntity11 = transferAccountApiEntity5;
        if ((i & 32) != 0) {
            transferAccountApiEntity6 = transferAccountsApiEntity.moneyRequest;
        }
        TransferAccountApiEntity transferAccountApiEntity12 = transferAccountApiEntity6;
        if ((i & 64) != 0) {
            transferAccountApiEntity7 = transferAccountsApiEntity.galtAndTaggart;
        }
        return transferAccountsApiEntity.copy(transferAccountApiEntity, transferAccountApiEntity8, transferAccountApiEntity9, transferAccountApiEntity10, transferAccountApiEntity11, transferAccountApiEntity12, transferAccountApiEntity7);
    }

    public final TransferAccountApiEntity component1() {
        return this.bank;
    }

    public final TransferAccountApiEntity component2() {
        return this.domestic;
    }

    public final TransferAccountApiEntity component3() {
        return this.conversion;
    }

    public final TransferAccountApiEntity component4() {
        return this.foreign;
    }

    public final TransferAccountApiEntity component5() {
        return this.georgia;
    }

    public final TransferAccountApiEntity component6() {
        return this.moneyRequest;
    }

    public final TransferAccountApiEntity component7() {
        return this.galtAndTaggart;
    }

    public final TransferAccountsApiEntity copy(TransferAccountApiEntity transferAccountApiEntity, TransferAccountApiEntity transferAccountApiEntity2, TransferAccountApiEntity transferAccountApiEntity3, TransferAccountApiEntity transferAccountApiEntity4, TransferAccountApiEntity transferAccountApiEntity5, TransferAccountApiEntity transferAccountApiEntity6, TransferAccountApiEntity transferAccountApiEntity7) {
        return new TransferAccountsApiEntity(transferAccountApiEntity, transferAccountApiEntity2, transferAccountApiEntity3, transferAccountApiEntity4, transferAccountApiEntity5, transferAccountApiEntity6, transferAccountApiEntity7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferAccountsApiEntity)) {
            return false;
        }
        TransferAccountsApiEntity transferAccountsApiEntity = (TransferAccountsApiEntity) obj;
        return C41536l.m120484d(this.bank, transferAccountsApiEntity.bank) && C41536l.m120484d(this.domestic, transferAccountsApiEntity.domestic) && C41536l.m120484d(this.conversion, transferAccountsApiEntity.conversion) && C41536l.m120484d(this.foreign, transferAccountsApiEntity.foreign) && C41536l.m120484d(this.georgia, transferAccountsApiEntity.georgia) && C41536l.m120484d(this.moneyRequest, transferAccountsApiEntity.moneyRequest) && C41536l.m120484d(this.galtAndTaggart, transferAccountsApiEntity.galtAndTaggart);
    }

    public final TransferAccountApiEntity getBank() {
        return this.bank;
    }

    public final TransferAccountApiEntity getConversion() {
        return this.conversion;
    }

    public final TransferAccountApiEntity getDomestic() {
        return this.domestic;
    }

    public final TransferAccountApiEntity getForeign() {
        return this.foreign;
    }

    public final TransferAccountApiEntity getGaltAndTaggart() {
        return this.galtAndTaggart;
    }

    public final TransferAccountApiEntity getGeorgia() {
        return this.georgia;
    }

    public final TransferAccountApiEntity getMoneyRequest() {
        return this.moneyRequest;
    }

    public int hashCode() {
        TransferAccountApiEntity transferAccountApiEntity = this.bank;
        int i = 0;
        int hashCode = (transferAccountApiEntity == null ? 0 : transferAccountApiEntity.hashCode()) * 31;
        TransferAccountApiEntity transferAccountApiEntity2 = this.domestic;
        int hashCode2 = (hashCode + (transferAccountApiEntity2 == null ? 0 : transferAccountApiEntity2.hashCode())) * 31;
        TransferAccountApiEntity transferAccountApiEntity3 = this.conversion;
        int hashCode3 = (hashCode2 + (transferAccountApiEntity3 == null ? 0 : transferAccountApiEntity3.hashCode())) * 31;
        TransferAccountApiEntity transferAccountApiEntity4 = this.foreign;
        int hashCode4 = (hashCode3 + (transferAccountApiEntity4 == null ? 0 : transferAccountApiEntity4.hashCode())) * 31;
        TransferAccountApiEntity transferAccountApiEntity5 = this.georgia;
        int hashCode5 = (hashCode4 + (transferAccountApiEntity5 == null ? 0 : transferAccountApiEntity5.hashCode())) * 31;
        TransferAccountApiEntity transferAccountApiEntity6 = this.moneyRequest;
        int hashCode6 = (hashCode5 + (transferAccountApiEntity6 == null ? 0 : transferAccountApiEntity6.hashCode())) * 31;
        TransferAccountApiEntity transferAccountApiEntity7 = this.galtAndTaggart;
        if (transferAccountApiEntity7 != null) {
            i = transferAccountApiEntity7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        TransferAccountApiEntity transferAccountApiEntity = this.bank;
        TransferAccountApiEntity transferAccountApiEntity2 = this.domestic;
        TransferAccountApiEntity transferAccountApiEntity3 = this.conversion;
        TransferAccountApiEntity transferAccountApiEntity4 = this.foreign;
        TransferAccountApiEntity transferAccountApiEntity5 = this.georgia;
        TransferAccountApiEntity transferAccountApiEntity6 = this.moneyRequest;
        TransferAccountApiEntity transferAccountApiEntity7 = this.galtAndTaggart;
        return "TransferAccountsApiEntity(bank=" + transferAccountApiEntity + ", domestic=" + transferAccountApiEntity2 + ", conversion=" + transferAccountApiEntity3 + ", foreign=" + transferAccountApiEntity4 + ", georgia=" + transferAccountApiEntity5 + ", moneyRequest=" + transferAccountApiEntity6 + ", galtAndTaggart=" + transferAccountApiEntity7 + ")";
    }

    public TransferAccountsApiEntity(TransferAccountApiEntity transferAccountApiEntity, TransferAccountApiEntity transferAccountApiEntity2, TransferAccountApiEntity transferAccountApiEntity3, TransferAccountApiEntity transferAccountApiEntity4, TransferAccountApiEntity transferAccountApiEntity5, TransferAccountApiEntity transferAccountApiEntity6, TransferAccountApiEntity transferAccountApiEntity7) {
        this.bank = transferAccountApiEntity;
        this.domestic = transferAccountApiEntity2;
        this.conversion = transferAccountApiEntity3;
        this.foreign = transferAccountApiEntity4;
        this.georgia = transferAccountApiEntity5;
        this.moneyRequest = transferAccountApiEntity6;
        this.galtAndTaggart = transferAccountApiEntity7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransferAccountsApiEntity(p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity r7, p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity r8, p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity r9, p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity r10, p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity r11, p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity r12, p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsApiEntity.<init>(ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity, ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity, ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity, ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity, ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity, ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity, ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
