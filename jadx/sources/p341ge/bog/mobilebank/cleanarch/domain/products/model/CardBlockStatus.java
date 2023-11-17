package p341ge.bog.mobilebank.cleanarch.domain.products.model;

import android.os.Parcel;
import android.os.Parcelable;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.products.model.CardBlockStatus */
public final class CardBlockStatus implements Parcelable {
    public static final Parcelable.Creator<CardBlockStatus> CREATOR = new C21037a();

    /* renamed from: d */
    private final long f56493d;

    /* renamed from: e */
    private final C24978b f56494e;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.products.model.CardBlockStatus$a */
    public static final class C21037a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardBlockStatus createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardBlockStatus(parcel.readLong(), C24978b.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final CardBlockStatus[] newArray(int i) {
            return new CardBlockStatus[i];
        }
    }

    public CardBlockStatus(long j, C24978b bVar) {
        C41536l.m120489i(bVar, "isCardBlocked");
        this.f56493d = j;
        this.f56494e = bVar;
    }

    /* renamed from: a */
    public final long mo52082a() {
        return this.f56493d;
    }

    /* renamed from: b */
    public final C24978b mo52083b() {
        return this.f56494e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBlockStatus)) {
            return false;
        }
        CardBlockStatus cardBlockStatus = (CardBlockStatus) obj;
        return this.f56493d == cardBlockStatus.f56493d && this.f56494e == cardBlockStatus.f56494e;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.f56493d) * 31) + this.f56494e.hashCode();
    }

    public String toString() {
        long j = this.f56493d;
        C24978b bVar = this.f56494e;
        return "CardBlockStatus(cardId=" + j + ", isCardBlocked=" + bVar + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f56493d);
        parcel.writeString(this.f56494e.name());
    }
}
