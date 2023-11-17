package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.PrloTicketWrapperEntity */
public final class PrloTicketWrapperEntity {
    public final long month;
    public final int ticketCount;
    public final ArrayList<PrloTicketEntity> tickets;

    public PrloTicketWrapperEntity() {
        this(0, 0, (ArrayList) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PrloTicketWrapperEntity copy$default(PrloTicketWrapperEntity prloTicketWrapperEntity, long j, int i, ArrayList<PrloTicketEntity> arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = prloTicketWrapperEntity.month;
        }
        if ((i2 & 2) != 0) {
            i = prloTicketWrapperEntity.ticketCount;
        }
        if ((i2 & 4) != 0) {
            arrayList = prloTicketWrapperEntity.tickets;
        }
        return prloTicketWrapperEntity.copy(j, i, arrayList);
    }

    public final long component1() {
        return this.month;
    }

    public final int component2() {
        return this.ticketCount;
    }

    public final ArrayList<PrloTicketEntity> component3() {
        return this.tickets;
    }

    public final PrloTicketWrapperEntity copy(long j, int i, ArrayList<PrloTicketEntity> arrayList) {
        return new PrloTicketWrapperEntity(j, i, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrloTicketWrapperEntity)) {
            return false;
        }
        PrloTicketWrapperEntity prloTicketWrapperEntity = (PrloTicketWrapperEntity) obj;
        return this.month == prloTicketWrapperEntity.month && this.ticketCount == prloTicketWrapperEntity.ticketCount && C41536l.m120484d(this.tickets, prloTicketWrapperEntity.tickets);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.month) * 31) + this.ticketCount) * 31;
        ArrayList<PrloTicketEntity> arrayList = this.tickets;
        return a + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        long j = this.month;
        int i = this.ticketCount;
        ArrayList<PrloTicketEntity> arrayList = this.tickets;
        return "PrloTicketWrapperEntity(month=" + j + ", ticketCount=" + i + ", tickets=" + arrayList + ")";
    }

    public PrloTicketWrapperEntity(long j, int i, ArrayList<PrloTicketEntity> arrayList) {
        this.month = j;
        this.ticketCount = i;
        this.tickets = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrloTicketWrapperEntity(long j, int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : arrayList);
    }
}
