package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.BonusPrloEntity */
public final class BonusPrloEntity {
    public final long nextDrawDate;
    public final ArrayList<PrloTicketWrapperEntity> tickets;

    public BonusPrloEntity() {
        this(0, (ArrayList) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BonusPrloEntity copy$default(BonusPrloEntity bonusPrloEntity, long j, ArrayList<PrloTicketWrapperEntity> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bonusPrloEntity.nextDrawDate;
        }
        if ((i & 2) != 0) {
            arrayList = bonusPrloEntity.tickets;
        }
        return bonusPrloEntity.copy(j, arrayList);
    }

    public final long component1() {
        return this.nextDrawDate;
    }

    public final ArrayList<PrloTicketWrapperEntity> component2() {
        return this.tickets;
    }

    public final BonusPrloEntity copy(long j, ArrayList<PrloTicketWrapperEntity> arrayList) {
        return new BonusPrloEntity(j, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusPrloEntity)) {
            return false;
        }
        BonusPrloEntity bonusPrloEntity = (BonusPrloEntity) obj;
        return this.nextDrawDate == bonusPrloEntity.nextDrawDate && C41536l.m120484d(this.tickets, bonusPrloEntity.tickets);
    }

    public final int getCount() {
        ArrayList<PrloTicketWrapperEntity> arrayList = this.tickets;
        int i = 0;
        if (arrayList != null) {
            for (PrloTicketWrapperEntity prloTicketWrapperEntity : arrayList) {
                i += prloTicketWrapperEntity.ticketCount;
            }
        }
        return i;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.nextDrawDate) * 31;
        ArrayList<PrloTicketWrapperEntity> arrayList = this.tickets;
        return a + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        long j = this.nextDrawDate;
        ArrayList<PrloTicketWrapperEntity> arrayList = this.tickets;
        return "BonusPrloEntity(nextDrawDate=" + j + ", tickets=" + arrayList + ")";
    }

    public BonusPrloEntity(long j, ArrayList<PrloTicketWrapperEntity> arrayList) {
        this.nextDrawDate = j;
        this.tickets = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BonusPrloEntity(long j, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : arrayList);
    }
}
