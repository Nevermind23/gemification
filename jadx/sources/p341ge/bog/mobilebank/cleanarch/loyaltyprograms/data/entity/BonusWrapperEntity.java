package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import com.google.gson.C5494h;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.BonusPrloEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusWrapperEntity */
public final class BonusWrapperEntity {
    private final BonusAmexEntity amex;
    @C8664c("prllot")
    private final BonusPrloEntity bonusPrlo;
    private final ArrayList<BonusCasServiceEntity> casServices;
    private final ArrayList<CasTotalEntity> casServicesTotal;
    @C8664c("cashBack")
    private final C5494h cashBack;
    private final BonusPlusEntity plus;
    private final ArrayList<BonusScoolEntity> schoolCards;
    private final int totalSclPoints;

    public BonusWrapperEntity() {
        this((BonusAmexEntity) null, (BonusPlusEntity) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (C5494h) null, 0, (BonusPrloEntity) null, C11051p3.f31759c, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BonusWrapperEntity copy$default(BonusWrapperEntity bonusWrapperEntity, BonusAmexEntity bonusAmexEntity, BonusPlusEntity bonusPlusEntity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C5494h hVar, int i, BonusPrloEntity bonusPrloEntity, int i2, Object obj) {
        BonusWrapperEntity bonusWrapperEntity2 = bonusWrapperEntity;
        int i3 = i2;
        return bonusWrapperEntity.copy((i3 & 1) != 0 ? bonusWrapperEntity2.amex : bonusAmexEntity, (i3 & 2) != 0 ? bonusWrapperEntity2.plus : bonusPlusEntity, (i3 & 4) != 0 ? bonusWrapperEntity2.casServices : arrayList, (i3 & 8) != 0 ? bonusWrapperEntity2.casServicesTotal : arrayList2, (i3 & 16) != 0 ? bonusWrapperEntity2.schoolCards : arrayList3, (i3 & 32) != 0 ? bonusWrapperEntity2.cashBack : hVar, (i3 & 64) != 0 ? bonusWrapperEntity2.totalSclPoints : i, (i3 & 128) != 0 ? bonusWrapperEntity2.bonusPrlo : bonusPrloEntity);
    }

    public final BonusAmexEntity component1() {
        return this.amex;
    }

    public final BonusPlusEntity component2() {
        return this.plus;
    }

    public final ArrayList<BonusCasServiceEntity> component3() {
        return this.casServices;
    }

    public final ArrayList<CasTotalEntity> component4() {
        return this.casServicesTotal;
    }

    public final ArrayList<BonusScoolEntity> component5() {
        return this.schoolCards;
    }

    public final C5494h component6() {
        return this.cashBack;
    }

    public final int component7() {
        return this.totalSclPoints;
    }

    public final BonusPrloEntity component8() {
        return this.bonusPrlo;
    }

    public final BonusWrapperEntity copy(BonusAmexEntity bonusAmexEntity, BonusPlusEntity bonusPlusEntity, ArrayList<BonusCasServiceEntity> arrayList, ArrayList<CasTotalEntity> arrayList2, ArrayList<BonusScoolEntity> arrayList3, C5494h hVar, int i, BonusPrloEntity bonusPrloEntity) {
        return new BonusWrapperEntity(bonusAmexEntity, bonusPlusEntity, arrayList, arrayList2, arrayList3, hVar, i, bonusPrloEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusWrapperEntity)) {
            return false;
        }
        BonusWrapperEntity bonusWrapperEntity = (BonusWrapperEntity) obj;
        return C41536l.m120484d(this.amex, bonusWrapperEntity.amex) && C41536l.m120484d(this.plus, bonusWrapperEntity.plus) && C41536l.m120484d(this.casServices, bonusWrapperEntity.casServices) && C41536l.m120484d(this.casServicesTotal, bonusWrapperEntity.casServicesTotal) && C41536l.m120484d(this.schoolCards, bonusWrapperEntity.schoolCards) && C41536l.m120484d(this.cashBack, bonusWrapperEntity.cashBack) && this.totalSclPoints == bonusWrapperEntity.totalSclPoints && C41536l.m120484d(this.bonusPrlo, bonusWrapperEntity.bonusPrlo);
    }

    public final BonusAmexEntity getAmex() {
        return this.amex;
    }

    public final BonusPrloEntity getBonusPrlo() {
        return this.bonusPrlo;
    }

    public final ArrayList<BonusCasServiceEntity> getCasServices() {
        return this.casServices;
    }

    public final ArrayList<CasTotalEntity> getCasServicesTotal() {
        return this.casServicesTotal;
    }

    public final C5494h getCashBack() {
        return this.cashBack;
    }

    public final BonusPlusEntity getPlus() {
        return this.plus;
    }

    public final ArrayList<BonusScoolEntity> getSchoolCards() {
        return this.schoolCards;
    }

    public final int getTotalSclPoints() {
        return this.totalSclPoints;
    }

    public int hashCode() {
        BonusAmexEntity bonusAmexEntity = this.amex;
        int i = 0;
        int hashCode = (bonusAmexEntity == null ? 0 : bonusAmexEntity.hashCode()) * 31;
        BonusPlusEntity bonusPlusEntity = this.plus;
        int hashCode2 = (hashCode + (bonusPlusEntity == null ? 0 : bonusPlusEntity.hashCode())) * 31;
        ArrayList<BonusCasServiceEntity> arrayList = this.casServices;
        int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<CasTotalEntity> arrayList2 = this.casServicesTotal;
        int hashCode4 = (hashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<BonusScoolEntity> arrayList3 = this.schoolCards;
        int hashCode5 = (hashCode4 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        C5494h hVar = this.cashBack;
        int hashCode6 = (((hashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.totalSclPoints) * 31;
        BonusPrloEntity bonusPrloEntity = this.bonusPrlo;
        if (bonusPrloEntity != null) {
            i = bonusPrloEntity.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        BonusAmexEntity bonusAmexEntity = this.amex;
        BonusPlusEntity bonusPlusEntity = this.plus;
        ArrayList<BonusCasServiceEntity> arrayList = this.casServices;
        ArrayList<CasTotalEntity> arrayList2 = this.casServicesTotal;
        ArrayList<BonusScoolEntity> arrayList3 = this.schoolCards;
        C5494h hVar = this.cashBack;
        int i = this.totalSclPoints;
        BonusPrloEntity bonusPrloEntity = this.bonusPrlo;
        return "BonusWrapperEntity(amex=" + bonusAmexEntity + ", plus=" + bonusPlusEntity + ", casServices=" + arrayList + ", casServicesTotal=" + arrayList2 + ", schoolCards=" + arrayList3 + ", cashBack=" + hVar + ", totalSclPoints=" + i + ", bonusPrlo=" + bonusPrloEntity + ")";
    }

    public BonusWrapperEntity(BonusAmexEntity bonusAmexEntity, BonusPlusEntity bonusPlusEntity, ArrayList<BonusCasServiceEntity> arrayList, ArrayList<CasTotalEntity> arrayList2, ArrayList<BonusScoolEntity> arrayList3, C5494h hVar, int i, BonusPrloEntity bonusPrloEntity) {
        this.amex = bonusAmexEntity;
        this.plus = bonusPlusEntity;
        this.casServices = arrayList;
        this.casServicesTotal = arrayList2;
        this.schoolCards = arrayList3;
        this.cashBack = hVar;
        this.totalSclPoints = i;
        this.bonusPrlo = bonusPrloEntity;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BonusWrapperEntity(p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusAmexEntity r10, p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusPlusEntity r11, java.util.ArrayList r12, java.util.ArrayList r13, java.util.ArrayList r14, com.google.gson.C5494h r15, int r16, p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.BonusPrloEntity r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = 0
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusWrapperEntity.<init>(ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusAmexEntity, ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusPlusEntity, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, com.google.gson.h, int, ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.BonusPrloEntity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
