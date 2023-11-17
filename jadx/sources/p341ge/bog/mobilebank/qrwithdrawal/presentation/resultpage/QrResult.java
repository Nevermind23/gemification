package p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResult */
public abstract class QrResult implements Parcelable {

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResult$Error */
    public static final class Error extends QrResult {
        public static final Parcelable.Creator<Error> CREATOR = new C34431a();

        /* renamed from: d */
        private final StringSource f83447d;

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResult$Error$a */
        public static final class C34431a implements Parcelable.Creator {
            /* renamed from: a */
            public final Error createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Error((StringSource) parcel.readParcelable(Error.class.getClassLoader()));
            }

            /* renamed from: b */
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(StringSource stringSource) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "errorText");
            this.f83447d = stringSource;
        }

        /* renamed from: a */
        public final StringSource mo83016a() {
            return this.f83447d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && C41536l.m120484d(this.f83447d, ((Error) obj).f83447d);
        }

        public int hashCode() {
            return this.f83447d.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f83447d;
            return "Error(errorText=" + stringSource + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f83447d, i);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResult$Success */
    public static final class Success extends QrResult {
        public static final Parcelable.Creator<Success> CREATOR = new C34432a();

        /* renamed from: d */
        private final List f83448d;

        /* renamed from: e */
        private final boolean f83449e;

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResult$Success$a */
        public static final class C34432a implements Parcelable.Creator {
            /* renamed from: a */
            public final Success createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                boolean z = false;
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Details.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new Success(arrayList, z);
            }

            /* renamed from: b */
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(List list, boolean z) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "qrDetails");
            this.f83448d = list;
            this.f83449e = z;
        }

        /* renamed from: a */
        public final List mo83026a() {
            return this.f83448d;
        }

        /* renamed from: b */
        public final boolean mo83027b() {
            return this.f83449e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return C41536l.m120484d(this.f83448d, success.f83448d) && this.f83449e == success.f83449e;
        }

        public int hashCode() {
            int hashCode = this.f83448d.hashCode() * 31;
            boolean z = this.f83449e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            List list = this.f83448d;
            boolean z = this.f83449e;
            return "Success(qrDetails=" + list + ", isAmex=" + z + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            List<Details> list = this.f83448d;
            parcel.writeInt(list.size());
            for (Details writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.f83449e ? 1 : 0);
        }
    }

    private QrResult() {
    }

    public /* synthetic */ QrResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
