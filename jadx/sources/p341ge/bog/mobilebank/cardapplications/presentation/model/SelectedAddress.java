package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p674xm.C18781a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress */
public final class SelectedAddress implements Parcelable {
    public static final Parcelable.Creator<SelectedAddress> CREATOR = new C14234a();

    /* renamed from: d */
    private final C18781a f41800d;

    /* renamed from: e */
    private final long f41801e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress$a */
    public static final class C14234a implements Parcelable.Creator {
        /* renamed from: a */
        public final SelectedAddress createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SelectedAddress(C18781a.valueOf(parcel.readString()), parcel.readLong());
        }

        /* renamed from: b */
        public final SelectedAddress[] newArray(int i) {
            return new SelectedAddress[i];
        }
    }

    public SelectedAddress(C18781a aVar, long j) {
        C41536l.m120489i(aVar, "step");
        this.f41800d = aVar;
        this.f41801e = j;
    }

    /* renamed from: a */
    public final long mo39869a() {
        return this.f41801e;
    }

    /* renamed from: b */
    public final C18781a mo39870b() {
        return this.f41800d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedAddress)) {
            return false;
        }
        SelectedAddress selectedAddress = (SelectedAddress) obj;
        return this.f41800d == selectedAddress.f41800d && this.f41801e == selectedAddress.f41801e;
    }

    public int hashCode() {
        return (this.f41800d.hashCode() * 31) + C7397t.m28148a(this.f41801e);
    }

    public String toString() {
        C18781a aVar = this.f41800d;
        long j = this.f41801e;
        return "SelectedAddress(step=" + aVar + ", addressId=" + j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41800d.name());
        parcel.writeLong(this.f41801e);
    }
}
