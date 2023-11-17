package p341ge.bog.mobilebank.cleanarch.domain.offer.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode */
public abstract class OfferProductCode implements Parcelable {

    /* renamed from: e */
    public static final C21029a f56465e = new C21029a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final String f56466d;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$AC */
    public static final class C21000AC extends OfferProductCode {
        public static final Parcelable.Creator<C21000AC> CREATOR = new C21001a();

        /* renamed from: f */
        public static final C21000AC f56467f = new C21000AC();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$AC$a */
        public static final class C21001a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21000AC createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21000AC.f56467f;
            }

            /* renamed from: b */
            public final C21000AC[] newArray(int i) {
                return new C21000AC[i];
            }
        }

        private C21000AC() {
            super("AC", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$BA */
    public static final class C21002BA extends OfferProductCode {
        public static final Parcelable.Creator<C21002BA> CREATOR = new C21003a();

        /* renamed from: f */
        public static final C21002BA f56468f = new C21002BA();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$BA$a */
        public static final class C21003a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21002BA createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21002BA.f56468f;
            }

            /* renamed from: b */
            public final C21002BA[] newArray(int i) {
                return new C21002BA[i];
            }
        }

        private C21002BA() {
            super("BA", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$BE */
    public static final class C21004BE extends OfferProductCode {
        public static final Parcelable.Creator<C21004BE> CREATOR = new C21005a();

        /* renamed from: f */
        public static final C21004BE f56469f = new C21004BE();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$BE$a */
        public static final class C21005a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21004BE createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21004BE.f56469f;
            }

            /* renamed from: b */
            public final C21004BE[] newArray(int i) {
                return new C21004BE[i];
            }
        }

        private C21004BE() {
            super("BE", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$BL */
    public static final class C21006BL extends OfferProductCode {
        public static final Parcelable.Creator<C21006BL> CREATOR = new C21007a();

        /* renamed from: f */
        public static final C21006BL f56470f = new C21006BL();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$BL$a */
        public static final class C21007a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21006BL createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21006BL.f56470f;
            }

            /* renamed from: b */
            public final C21006BL[] newArray(int i) {
                return new C21006BL[i];
            }
        }

        private C21006BL() {
            super("BL", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$CL */
    public static final class C21008CL extends OfferProductCode {
        public static final Parcelable.Creator<C21008CL> CREATOR = new C21009a();

        /* renamed from: f */
        public static final C21008CL f56471f = new C21008CL();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$CL$a */
        public static final class C21009a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21008CL createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21008CL.f56471f;
            }

            /* renamed from: b */
            public final C21008CL[] newArray(int i) {
                return new C21008CL[i];
            }
        }

        private C21008CL() {
            super("CL", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EC */
    public static final class C21010EC extends OfferProductCode {
        public static final Parcelable.Creator<C21010EC> CREATOR = new C21011a();

        /* renamed from: f */
        public static final C21010EC f56472f = new C21010EC();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EC$a */
        public static final class C21011a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21010EC createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21010EC.f56472f;
            }

            /* renamed from: b */
            public final C21010EC[] newArray(int i) {
                return new C21010EC[i];
            }
        }

        private C21010EC() {
            super("EC", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EL */
    public static final class C21012EL extends OfferProductCode {
        public static final Parcelable.Creator<C21012EL> CREATOR = new C21013a();

        /* renamed from: f */
        public static final C21012EL f56473f = new C21012EL();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EL$a */
        public static final class C21013a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21012EL createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21012EL.f56473f;
            }

            /* renamed from: b */
            public final C21012EL[] newArray(int i) {
                return new C21012EL[i];
            }
        }

        private C21012EL() {
            super("EL", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EX */
    public static final class C21014EX extends OfferProductCode {
        public static final Parcelable.Creator<C21014EX> CREATOR = new C21015a();

        /* renamed from: f */
        public static final C21014EX f56474f = new C21014EX();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EX$a */
        public static final class C21015a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21014EX createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21014EX.f56474f;
            }

            /* renamed from: b */
            public final C21014EX[] newArray(int i) {
                return new C21014EX[i];
            }
        }

        private C21014EX() {
            super("EX", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EXP_LOAN */
    public static final class EXP_LOAN extends OfferProductCode {
        public static final Parcelable.Creator<EXP_LOAN> CREATOR = new C21016a();

        /* renamed from: f */
        public static final EXP_LOAN f56475f = new EXP_LOAN();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EXP_LOAN$a */
        public static final class C21016a implements Parcelable.Creator {
            /* renamed from: a */
            public final EXP_LOAN createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return EXP_LOAN.f56475f;
            }

            /* renamed from: b */
            public final EXP_LOAN[] newArray(int i) {
                return new EXP_LOAN[i];
            }
        }

        private EXP_LOAN() {
            super("EXP_LOAN", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$LC */
    public static final class C21017LC extends OfferProductCode {
        public static final Parcelable.Creator<C21017LC> CREATOR = new C21018a();

        /* renamed from: f */
        public static final C21017LC f56476f = new C21017LC();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$LC$a */
        public static final class C21018a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21017LC createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21017LC.f56476f;
            }

            /* renamed from: b */
            public final C21017LC[] newArray(int i) {
                return new C21017LC[i];
            }
        }

        private C21017LC() {
            super("LC", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$ML */
    public static final class C21019ML extends OfferProductCode {
        public static final Parcelable.Creator<C21019ML> CREATOR = new C21020a();

        /* renamed from: f */
        public static final C21019ML f56477f = new C21019ML();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$ML$a */
        public static final class C21020a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21019ML createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21019ML.f56477f;
            }

            /* renamed from: b */
            public final C21019ML[] newArray(int i) {
                return new C21019ML[i];
            }
        }

        private C21019ML() {
            super("ML", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$PL */
    public static final class C21021PL extends OfferProductCode {
        public static final Parcelable.Creator<C21021PL> CREATOR = new C21022a();

        /* renamed from: f */
        public static final C21021PL f56478f = new C21021PL();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$PL$a */
        public static final class C21022a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21021PL createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21021PL.f56478f;
            }

            /* renamed from: b */
            public final C21021PL[] newArray(int i) {
                return new C21021PL[i];
            }
        }

        private C21021PL() {
            super("PL", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$RL */
    public static final class C21023RL extends OfferProductCode {
        public static final Parcelable.Creator<C21023RL> CREATOR = new C21024a();

        /* renamed from: f */
        public static final C21023RL f56479f = new C21023RL();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$RL$a */
        public static final class C21024a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21023RL createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21023RL.f56479f;
            }

            /* renamed from: b */
            public final C21023RL[] newArray(int i) {
                return new C21023RL[i];
            }
        }

        private C21023RL() {
            super("RL", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$SL */
    public static final class C21025SL extends OfferProductCode {
        public static final Parcelable.Creator<C21025SL> CREATOR = new C21026a();

        /* renamed from: f */
        public static final C21025SL f56480f = new C21025SL();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$SL$a */
        public static final class C21026a implements Parcelable.Creator {
            /* renamed from: a */
            public final C21025SL createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return C21025SL.f56480f;
            }

            /* renamed from: b */
            public final C21025SL[] newArray(int i) {
                return new C21025SL[i];
            }
        }

        private C21025SL() {
            super("SL", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$SMS_LOAN */
    public static final class SMS_LOAN extends OfferProductCode {
        public static final Parcelable.Creator<SMS_LOAN> CREATOR = new C21027a();

        /* renamed from: f */
        public static final SMS_LOAN f56481f = new SMS_LOAN();

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$SMS_LOAN$a */
        public static final class C21027a implements Parcelable.Creator {
            /* renamed from: a */
            public final SMS_LOAN createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return SMS_LOAN.f56481f;
            }

            /* renamed from: b */
            public final SMS_LOAN[] newArray(int i) {
                return new SMS_LOAN[i];
            }
        }

        private SMS_LOAN() {
            super("SMS_LOAN", (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$Unknown */
    public static final class Unknown extends OfferProductCode {
        public static final Parcelable.Creator<Unknown> CREATOR = new C21028a();

        /* renamed from: f */
        private final String f56482f;

        /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$Unknown$a */
        public static final class C21028a implements Parcelable.Creator {
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
            this.f56482f = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && C41536l.m120484d(this.f56482f, ((Unknown) obj).f56482f);
        }

        public int hashCode() {
            return this.f56482f.hashCode();
        }

        public String toString() {
            String str = this.f56482f;
            return "Unknown(value=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f56482f);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$a */
    public static final class C21029a {
        private C21029a() {
        }

        public /* synthetic */ C21029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OfferProductCode mo52054a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            for (OfferProductCode offerProductCode : mo52055b()) {
                if (C41536l.m120484d(offerProductCode.mo51954a(), str)) {
                    return offerProductCode;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final OfferProductCode[] mo52055b() {
            return new OfferProductCode[]{SMS_LOAN.f56481f, EXP_LOAN.f56475f, C21021PL.f56478f, C21019ML.f56477f, C21025SL.f56480f, C21000AC.f56467f, C21008CL.f56471f, C21006BL.f56470f, C21012EL.f56473f, C21014EX.f56474f, C21010EC.f56472f, C21004BE.f56469f, C21002BA.f56468f, C21023RL.f56479f, C21017LC.f56476f};
        }
    }

    public /* synthetic */ OfferProductCode(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public String mo51954a() {
        return this.f56466d;
    }

    private OfferProductCode(String str) {
        this.f56466d = str;
    }
}
