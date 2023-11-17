package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.LoyaltyListAction */
public abstract class LoyaltyListAction {

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.LoyaltyListAction$Finish */
    public static final class Finish extends LoyaltyListAction implements Parcelable {
        public static final Parcelable.Creator<Finish> CREATOR = new C21145a();

        /* renamed from: d */
        public static final Finish f56803d = new Finish();

        /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.LoyaltyListAction$Finish$a */
        public static final class C21145a implements Parcelable.Creator {
            /* renamed from: a */
            public final Finish createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Finish.f56803d;
            }

            /* renamed from: b */
            public final Finish[] newArray(int i) {
                return new Finish[i];
            }
        }

        private Finish() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.LoyaltyListAction$OpenProduct */
    public static final class OpenProduct extends LoyaltyListAction implements Parcelable {
        public static final Parcelable.Creator<OpenProduct> CREATOR = new C21146a();

        /* renamed from: d */
        private final int f56804d;

        /* renamed from: e */
        private final String f56805e;

        /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.LoyaltyListAction$OpenProduct$a */
        public static final class C21146a implements Parcelable.Creator {
            /* renamed from: a */
            public final OpenProduct createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new OpenProduct(parcel.readInt(), parcel.readString());
            }

            /* renamed from: b */
            public final OpenProduct[] newArray(int i) {
                return new OpenProduct[i];
            }
        }

        public OpenProduct(int i, String str) {
            super((DefaultConstructorMarker) null);
            this.f56804d = i;
            this.f56805e = str;
        }

        /* renamed from: a */
        public final String mo52832a() {
            return this.f56805e;
        }

        /* renamed from: b */
        public final int mo52833b() {
            return this.f56804d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenProduct)) {
                return false;
            }
            OpenProduct openProduct = (OpenProduct) obj;
            return this.f56804d == openProduct.f56804d && C41536l.m120484d(this.f56805e, openProduct.f56805e);
        }

        public int hashCode() {
            int i = this.f56804d * 31;
            String str = this.f56805e;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            int i = this.f56804d;
            String str = this.f56805e;
            return "OpenProduct(product=" + i + ", category=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f56804d);
            parcel.writeString(this.f56805e);
        }
    }

    private LoyaltyListAction() {
    }

    public /* synthetic */ LoyaltyListAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
