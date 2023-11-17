package p341ge.bog.mobilebank.galtandtaggart.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.domain.model.WatchList */
public final class WatchList implements Parcelable {
    public static final Parcelable.Creator<WatchList> CREATOR = new C23386a();

    /* renamed from: d */
    private final BigDecimal f61139d;

    /* renamed from: e */
    private final String f61140e;

    /* renamed from: f */
    private final int f61141f;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.domain.model.WatchList$a */
    public static final class C23386a implements Parcelable.Creator {
        /* renamed from: a */
        public final WatchList createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new WatchList((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final WatchList[] newArray(int i) {
            return new WatchList[i];
        }
    }

    public WatchList(BigDecimal bigDecimal, String str, int i) {
        C41536l.m120489i(bigDecimal, "id");
        C41536l.m120489i(str, "name");
        this.f61139d = bigDecimal;
        this.f61140e = str;
        this.f61141f = i;
    }

    /* renamed from: a */
    public final BigDecimal mo60081a() {
        return this.f61139d;
    }

    /* renamed from: b */
    public final String mo60082b() {
        return this.f61140e;
    }

    /* renamed from: d */
    public final int mo60083d() {
        return this.f61141f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchList)) {
            return false;
        }
        WatchList watchList = (WatchList) obj;
        return C41536l.m120484d(this.f61139d, watchList.f61139d) && C41536l.m120484d(this.f61140e, watchList.f61140e) && this.f61141f == watchList.f61141f;
    }

    public int hashCode() {
        return (((this.f61139d.hashCode() * 31) + this.f61140e.hashCode()) * 31) + this.f61141f;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f61139d;
        String str = this.f61140e;
        int i = this.f61141f;
        return "WatchList(id=" + bigDecimal + ", name=" + str + ", symbolQuantity=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.f61139d);
        parcel.writeString(this.f61140e);
        parcel.writeInt(this.f61141f);
    }
}
