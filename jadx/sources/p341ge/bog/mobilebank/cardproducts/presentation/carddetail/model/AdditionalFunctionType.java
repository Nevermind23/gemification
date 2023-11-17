package p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p426fn.C12927a;
import p426fn.C12928b;
import p426fn.C12932f;

/* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType */
public abstract class AdditionalFunctionType implements Parcelable {

    /* renamed from: j */
    public static final C14390a f42114j = new C14390a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final StringSource f42115d;

    /* renamed from: e */
    private final int f42116e;

    /* renamed from: f */
    private final int f42117f;

    /* renamed from: g */
    private final int f42118g;

    /* renamed from: h */
    private final StringSource f42119h;

    /* renamed from: i */
    private final StringSource f42120i;

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$ActivateScoolApp */
    public static final class ActivateScoolApp extends AdditionalFunctionType {
        public static final Parcelable.Creator<ActivateScoolApp> CREATOR = new C14380a();

        /* renamed from: k */
        public static final ActivateScoolApp f42121k = new ActivateScoolApp();

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$ActivateScoolApp$a */
        public static final class C14380a implements Parcelable.Creator {
            /* renamed from: a */
            public final ActivateScoolApp createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return ActivateScoolApp.f42121k;
            }

            /* renamed from: b */
            public final ActivateScoolApp[] newArray(int i) {
                return new ActivateScoolApp[i];
            }
        }

        private ActivateScoolApp() {
            super(C34646b.m101750d(C12932f.card_activate_scool_app, new Object[0]), C12928b.f38165b, 0, 0, (StringSource) null, (StringSource) null, 60, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$CardAdvantages */
    public static final class CardAdvantages extends AdditionalFunctionType {
        public static final Parcelable.Creator<CardAdvantages> CREATOR = new C14381a();

        /* renamed from: k */
        public static final CardAdvantages f42122k = new CardAdvantages();

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$CardAdvantages$a */
        public static final class C14381a implements Parcelable.Creator {
            /* renamed from: a */
            public final CardAdvantages createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return CardAdvantages.f42122k;
            }

            /* renamed from: b */
            public final CardAdvantages[] newArray(int i) {
                return new CardAdvantages[i];
            }
        }

        private CardAdvantages() {
            super(C34646b.m101748b("cards.detalis.functions.advantages", new Object[0]), C12928b.f38166c, 0, 0, (StringSource) null, (StringSource) null, 60, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$CloseCard */
    public static final class CloseCard extends AdditionalFunctionType {
        public static final Parcelable.Creator<CloseCard> CREATOR = new C14382a();

        /* renamed from: k */
        public static final CloseCard f42123k = new CloseCard();

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$CloseCard$a */
        public static final class C14382a implements Parcelable.Creator {
            /* renamed from: a */
            public final CloseCard createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return CloseCard.f42123k;
            }

            /* renamed from: b */
            public final CloseCard[] newArray(int i) {
                return new CloseCard[i];
            }
        }

        private CloseCard() {
            super(C34646b.m101750d(C12932f.card_close_card, new Object[0]), C12928b.f38169g, C12927a.f38162e, C12927a.f38161d, (StringSource) null, (StringSource) null, 48, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$FinancialNumber */
    public static final class FinancialNumber extends AdditionalFunctionType {
        public static final Parcelable.Creator<FinancialNumber> CREATOR = new C14383a();

        /* renamed from: k */
        private final String f42124k;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$FinancialNumber$a */
        public static final class C14383a implements Parcelable.Creator {
            /* renamed from: a */
            public final FinancialNumber createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new FinancialNumber(parcel.readString());
            }

            /* renamed from: b */
            public final FinancialNumber[] newArray(int i) {
                return new FinancialNumber[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FinancialNumber(String str) {
            super(C34646b.m101748b("cards.details.child.functions.financial.phone", new Object[0]), C12928b.ic_mobile_topup_widget_icon, C12927a.f38160c, C12927a.f38159b, C34646b.m101749c(str), (StringSource) null, 32, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "number");
            this.f42124k = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinancialNumber) && C41536l.m120484d(this.f42124k, ((FinancialNumber) obj).f42124k);
        }

        public int hashCode() {
            return this.f42124k.hashCode();
        }

        public String toString() {
            String str = this.f42124k;
            return "FinancialNumber(number=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f42124k);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$GooglePay */
    public static final class GooglePay extends AdditionalFunctionType {
        public static final Parcelable.Creator<GooglePay> CREATOR = new C14384a();

        /* renamed from: k */
        public static final GooglePay f42125k = new GooglePay();

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$GooglePay$a */
        public static final class C14384a implements Parcelable.Creator {
            /* renamed from: a */
            public final GooglePay createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return GooglePay.f42125k;
            }

            /* renamed from: b */
            public final GooglePay[] newArray(int i) {
                return new GooglePay[i];
            }
        }

        private GooglePay() {
            super(C34646b.m101748b("card.details.functions.google.pay", new Object[0]), C12928b.f38169g, 0, 0, (StringSource) null, (StringSource) null, 60, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$Insurance */
    public static final class Insurance extends AdditionalFunctionType {
        public static final Parcelable.Creator<Insurance> CREATOR = new C14385a();

        /* renamed from: k */
        public static final Insurance f42126k = new Insurance();

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$Insurance$a */
        public static final class C14385a implements Parcelable.Creator {
            /* renamed from: a */
            public final Insurance createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Insurance.f42126k;
            }

            /* renamed from: b */
            public final Insurance[] newArray(int i) {
                return new Insurance[i];
            }
        }

        private Insurance() {
            super(C34646b.m101750d(C12932f.card_insurance, new Object[0]), C12928b.icons_48_card_insurance_fill, 0, 0, (StringSource) null, (StringSource) null, 60, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$PaymentsControl */
    public static final class PaymentsControl extends AdditionalFunctionType {
        public static final Parcelable.Creator<PaymentsControl> CREATOR = new C14386a();

        /* renamed from: k */
        public static final PaymentsControl f42127k = new PaymentsControl();

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$PaymentsControl$a */
        public static final class C14386a implements Parcelable.Creator {
            /* renamed from: a */
            public final PaymentsControl createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return PaymentsControl.f42127k;
            }

            /* renamed from: b */
            public final PaymentsControl[] newArray(int i) {
                return new PaymentsControl[i];
            }
        }

        private PaymentsControl() {
            super(C34646b.m101750d(C12932f.card_payments_control, new Object[0]), C12928b.icons_48_security_security_settings_fill, 0, 0, (StringSource) null, (StringSource) null, 60, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$RecoverCard */
    public static final class RecoverCard extends AdditionalFunctionType {
        public static final Parcelable.Creator<RecoverCard> CREATOR = new C14387a();

        /* renamed from: k */
        public static final RecoverCard f42128k = new RecoverCard();

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$RecoverCard$a */
        public static final class C14387a implements Parcelable.Creator {
            /* renamed from: a */
            public final RecoverCard createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return RecoverCard.f42128k;
            }

            /* renamed from: b */
            public final RecoverCard[] newArray(int i) {
                return new RecoverCard[i];
            }
        }

        private RecoverCard() {
            super(C34646b.m101748b("text.debitcard.details.card.recovery", new Object[0]), C12928b.f38168f, 0, 0, C34646b.m101748b("text.debitcard.details.card.recovery.description", new Object[0]), (StringSource) null, 44, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$RecoverExpiringCard */
    public static final class RecoverExpiringCard extends AdditionalFunctionType {
        public static final Parcelable.Creator<RecoverExpiringCard> CREATOR = new C14388a();

        /* renamed from: k */
        public static final RecoverExpiringCard f42129k = new RecoverExpiringCard();

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$RecoverExpiringCard$a */
        public static final class C14388a implements Parcelable.Creator {
            /* renamed from: a */
            public final RecoverExpiringCard createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return RecoverExpiringCard.f42129k;
            }

            /* renamed from: b */
            public final RecoverExpiringCard[] newArray(int i) {
                return new RecoverExpiringCard[i];
            }
        }

        private RecoverExpiringCard() {
            super(C34646b.m101748b("text.debitcard.details.card.recovery", new Object[0]), C12928b.f38168f, C12927a.f38163f, C12927a.f38164g, C34646b.m101748b("text.debitcard.details.card.recovery.description", new Object[0]), (StringSource) null, 32, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$Security */
    public static final class Security extends AdditionalFunctionType {
        public static final Parcelable.Creator<Security> CREATOR = new C14389a();

        /* renamed from: k */
        public static final Security f42130k = new Security();

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$Security$a */
        public static final class C14389a implements Parcelable.Creator {
            /* renamed from: a */
            public final Security createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Security.f42130k;
            }

            /* renamed from: b */
            public final Security[] newArray(int i) {
                return new Security[i];
            }
        }

        private Security() {
            super(C34646b.m101750d(C12932f.card_3d_security, new Object[0]), C12928b.icons_48_security_2_factor_auth_fill, 0, 0, (StringSource) null, (StringSource) null, 60, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType$a */
    public static final class C14390a {
        private C14390a() {
        }

        public /* synthetic */ C14390a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AdditionalFunctionType(StringSource stringSource, int i, int i2, int i3, StringSource stringSource2, StringSource stringSource3, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource, i, i2, i3, stringSource2, stringSource3);
    }

    /* renamed from: a */
    public final StringSource mo40180a() {
        return this.f42120i;
    }

    /* renamed from: b */
    public final StringSource mo40181b() {
        return this.f42119h;
    }

    /* renamed from: d */
    public final int mo40182d() {
        return this.f42118g;
    }

    /* renamed from: e */
    public final int mo40183e() {
        return this.f42116e;
    }

    /* renamed from: f */
    public final int mo40184f() {
        return this.f42117f;
    }

    /* renamed from: g */
    public final StringSource mo40185g() {
        return this.f42115d;
    }

    private AdditionalFunctionType(StringSource stringSource, int i, int i2, int i3, StringSource stringSource2, StringSource stringSource3) {
        this.f42115d = stringSource;
        this.f42116e = i;
        this.f42117f = i2;
        this.f42118g = i3;
        this.f42119h = stringSource2;
        this.f42120i = stringSource3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdditionalFunctionType(StringSource stringSource, int i, int i2, int i3, StringSource stringSource2, StringSource stringSource3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource, i, (i4 & 4) != 0 ? C12927a.f38158a : i2, (i4 & 8) != 0 ? C12927a.f38159b : i3, (i4 & 16) != 0 ? null : stringSource2, (i4 & 32) != 0 ? C34646b.m101750d(C12932f.card_function_active, new Object[0]) : stringSource3, (DefaultConstructorMarker) null);
    }
}
