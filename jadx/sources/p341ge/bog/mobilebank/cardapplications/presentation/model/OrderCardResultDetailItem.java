package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResultDetailItem */
public abstract class OrderCardResultDetailItem implements Parcelable {

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResultDetailItem$DetailItem */
    public static final class DetailItem extends OrderCardResultDetailItem {
        public static final Parcelable.Creator<DetailItem> CREATOR = new C14227a();

        /* renamed from: d */
        private final String f41745d;

        /* renamed from: e */
        private final String f41746e;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResultDetailItem$DetailItem$a */
        public static final class C14227a implements Parcelable.Creator {
            /* renamed from: a */
            public final DetailItem createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new DetailItem(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final DetailItem[] newArray(int i) {
                return new DetailItem[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DetailItem(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "text");
            this.f41745d = str;
            this.f41746e = str2;
        }

        /* renamed from: a */
        public final String mo39769a() {
            return this.f41746e;
        }

        /* renamed from: b */
        public final String mo39770b() {
            return this.f41745d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailItem)) {
                return false;
            }
            DetailItem detailItem = (DetailItem) obj;
            return C41536l.m120484d(this.f41745d, detailItem.f41745d) && C41536l.m120484d(this.f41746e, detailItem.f41746e);
        }

        public int hashCode() {
            return (this.f41745d.hashCode() * 31) + this.f41746e.hashCode();
        }

        public String toString() {
            String str = this.f41745d;
            String str2 = this.f41746e;
            return "DetailItem(title=" + str + ", text=" + str2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f41745d);
            parcel.writeString(this.f41746e);
        }
    }

    private OrderCardResultDetailItem() {
    }

    public /* synthetic */ OrderCardResultDetailItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
