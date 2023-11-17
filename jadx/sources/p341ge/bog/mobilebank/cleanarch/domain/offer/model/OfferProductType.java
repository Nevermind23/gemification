package p341ge.bog.mobilebank.cleanarch.domain.offer.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType */
public abstract class OfferProductType implements Parcelable {

    /* renamed from: e */
    public static final C21033a f56483e = new C21033a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final String f56484d;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType$CREDIT_CARD */
    public static final class CREDIT_CARD extends OfferProductType {
        public static final Parcelable.Creator<CREDIT_CARD> CREATOR = new C21030a();

        /* renamed from: f */
        public static final CREDIT_CARD f56485f = new CREDIT_CARD();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType$CREDIT_CARD$a */
        public static final class C21030a implements Parcelable.Creator {
            /* renamed from: a */
            public final CREDIT_CARD createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return CREDIT_CARD.f56485f;
            }

            /* renamed from: b */
            public final CREDIT_CARD[] newArray(int i) {
                return new CREDIT_CARD[i];
            }
        }

        private CREDIT_CARD() {
            super("CREDITCARD", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType$LOAN */
    public static final class LOAN extends OfferProductType {
        public static final Parcelable.Creator<LOAN> CREATOR = new C21031a();

        /* renamed from: f */
        public static final LOAN f56486f = new LOAN();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType$LOAN$a */
        public static final class C21031a implements Parcelable.Creator {
            /* renamed from: a */
            public final LOAN createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return LOAN.f56486f;
            }

            /* renamed from: b */
            public final LOAN[] newArray(int i) {
                return new LOAN[i];
            }
        }

        private LOAN() {
            super("LOAN", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType$Unknown */
    public static final class Unknown extends OfferProductType {
        public static final Parcelable.Creator<Unknown> CREATOR = new C21032a();

        /* renamed from: f */
        private final String f56487f;

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType$Unknown$a */
        public static final class C21032a implements Parcelable.Creator {
            /* renamed from: a */
            public final Unknown createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            /* renamed from: b */
            public final Unknown[] newArray(int i) {
                return new Unknown[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Unknown(String str) {
            super(str, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            this.f56487f = str;
        }

        /* renamed from: a */
        public String mo52056a() {
            return this.f56487f;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && C41536l.m120484d(this.f56487f, ((Unknown) obj).f56487f);
        }

        public int hashCode() {
            return this.f56487f.hashCode();
        }

        public String toString() {
            String str = this.f56487f;
            return "Unknown(value=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f56487f);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType$a */
    public static final class C21033a {
        private C21033a() {
        }

        public /* synthetic */ C21033a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OfferProductType mo52078a(String str) {
            for (OfferProductType offerProductType : mo52079b()) {
                if (C41536l.m120484d(offerProductType.mo52056a(), str)) {
                    return offerProductType;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final OfferProductType[] mo52079b() {
            return new OfferProductType[]{LOAN.f56486f, CREDIT_CARD.f56485f};
        }
    }

    public /* synthetic */ OfferProductType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public String mo52056a() {
        return this.f56484d;
    }

    private OfferProductType(String str) {
        this.f56484d = str;
    }
}
