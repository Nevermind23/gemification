package p341ge.bog.mobilebank.categorypackages.presentation.application.result.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem */
public interface DetailsItem extends Parcelable {

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailHeader */
    public static final class DetailHeader implements DetailsItem {
        public static final Parcelable.Creator<DetailHeader> CREATOR = new C14513a();

        /* renamed from: d */
        private final String f42352d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailHeader$a */
        public static final class C14513a implements Parcelable.Creator {
            /* renamed from: a */
            public final DetailHeader createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new DetailHeader(parcel.readString());
            }

            /* renamed from: b */
            public final DetailHeader[] newArray(int i) {
                return new DetailHeader[i];
            }
        }

        public DetailHeader(String str) {
            C41536l.m120489i(str, "title");
            this.f42352d = str;
        }

        /* renamed from: a */
        public final String mo40746a() {
            return this.f42352d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DetailHeader) && C41536l.m120484d(this.f42352d, ((DetailHeader) obj).f42352d);
        }

        public int hashCode() {
            return this.f42352d.hashCode();
        }

        public String toString() {
            String str = this.f42352d;
            return "DetailHeader(title=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f42352d);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue */
    public static final class DetailsKeyValue implements DetailsItem {
        public static final Parcelable.Creator<DetailsKeyValue> CREATOR = new C14514a();

        /* renamed from: d */
        private final String f42353d;

        /* renamed from: e */
        private final String f42354e;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.model.DetailsItem$DetailsKeyValue$a */
        public static final class C14514a implements Parcelable.Creator {
            /* renamed from: a */
            public final DetailsKeyValue createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new DetailsKeyValue(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final DetailsKeyValue[] newArray(int i) {
                return new DetailsKeyValue[i];
            }
        }

        public DetailsKeyValue(String str, String str2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            this.f42353d = str;
            this.f42354e = str2;
        }

        /* renamed from: a */
        public final String mo40756a() {
            return this.f42353d;
        }

        /* renamed from: b */
        public final String mo40757b() {
            return this.f42354e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailsKeyValue)) {
                return false;
            }
            DetailsKeyValue detailsKeyValue = (DetailsKeyValue) obj;
            return C41536l.m120484d(this.f42353d, detailsKeyValue.f42353d) && C41536l.m120484d(this.f42354e, detailsKeyValue.f42354e);
        }

        public int hashCode() {
            return (this.f42353d.hashCode() * 31) + this.f42354e.hashCode();
        }

        public String toString() {
            String str = this.f42353d;
            String str2 = this.f42354e;
            return "DetailsKeyValue(title=" + str + ", value=" + str2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f42353d);
            parcel.writeString(this.f42354e);
        }
    }
}
