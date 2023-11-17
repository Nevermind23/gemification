package p341ge.bog.mobilebank.endyearcampaign2022.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import rd0.C28002c;

/* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel */
public abstract class EndYearPopUpDataUiModel implements Parcelable {

    /* renamed from: d */
    private final int f60927d;

    /* renamed from: e */
    private final StringSource f60928e;

    /* renamed from: f */
    private final StringSource f60929f;

    /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$GBPrize */
    public static final class GBPrize extends EndYearPopUpDataUiModel {
        public static final Parcelable.Creator<GBPrize> CREATOR = new C23296a();

        /* renamed from: g */
        private final long f60930g;

        /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$GBPrize$a */
        public static final class C23296a implements Parcelable.Creator {
            /* renamed from: a */
            public final GBPrize createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new GBPrize(parcel.readLong());
            }

            /* renamed from: b */
            public final GBPrize[] newArray(int i) {
                return new GBPrize[i];
            }
        }

        public GBPrize(long j) {
            super(C28002c.anim_prize_gb, C34646b.m101748b("end.year.campaign.popup.prize.gb.title", Long.valueOf(j)), C34646b.m101748b("end.year.campaign.popup.prize.gb.message", new Object[0]), (DefaultConstructorMarker) null);
            this.f60930g = j;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GBPrize) && this.f60930g == ((GBPrize) obj).f60930g;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f60930g);
        }

        public String toString() {
            long j = this.f60930g;
            return "GBPrize(amount=" + j + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f60930g);
        }
    }

    /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$GelPrize */
    public static final class GelPrize extends EndYearPopUpDataUiModel {
        public static final Parcelable.Creator<GelPrize> CREATOR = new C23297a();

        /* renamed from: g */
        private final long f60931g;

        /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$GelPrize$a */
        public static final class C23297a implements Parcelable.Creator {
            /* renamed from: a */
            public final GelPrize createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new GelPrize(parcel.readLong());
            }

            /* renamed from: b */
            public final GelPrize[] newArray(int i) {
                return new GelPrize[i];
            }
        }

        public GelPrize(long j) {
            super(C28002c.anim_prize_gel, C34646b.m101748b("end.year.campaign.popup.prize.gel.title", Long.valueOf(j)), C34646b.m101748b("end.year.campaign.popup.prize.gel.message", new Object[0]), (DefaultConstructorMarker) null);
            this.f60931g = j;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GelPrize) && this.f60931g == ((GelPrize) obj).f60931g;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f60931g);
        }

        public String toString() {
            long j = this.f60931g;
            return "GelPrize(amount=" + j + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f60931g);
        }
    }

    /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$NoPrizePopup */
    public static final class NoPrizePopup extends EndYearPopUpDataUiModel {
        public static final Parcelable.Creator<NoPrizePopup> CREATOR = new C23298a();

        /* renamed from: g */
        public static final NoPrizePopup f60932g = new NoPrizePopup();

        /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$NoPrizePopup$a */
        public static final class C23298a implements Parcelable.Creator {
            /* renamed from: a */
            public final NoPrizePopup createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return NoPrizePopup.f60932g;
            }

            /* renamed from: b */
            public final NoPrizePopup[] newArray(int i) {
                return new NoPrizePopup[i];
            }
        }

        private NoPrizePopup() {
            super(C28002c.anim_no_prize, C34646b.m101748b("end.year.campaign.popup.no.prize.title", new Object[0]), C34646b.m101748b("end.year.campaign.popup.no.prize.message", new Object[0]), (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$PlusPrizeRegular */
    public static final class PlusPrizeRegular extends EndYearPopUpDataUiModel {
        public static final Parcelable.Creator<PlusPrizeRegular> CREATOR = new C23299a();

        /* renamed from: g */
        private final long f60933g;

        /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$PlusPrizeRegular$a */
        public static final class C23299a implements Parcelable.Creator {
            /* renamed from: a */
            public final PlusPrizeRegular createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new PlusPrizeRegular(parcel.readLong());
            }

            /* renamed from: b */
            public final PlusPrizeRegular[] newArray(int i) {
                return new PlusPrizeRegular[i];
            }
        }

        public PlusPrizeRegular(long j) {
            super(C28002c.anim_prize_plus, C34646b.m101748b("end.year.campaign.popup.prize.plus.title", Long.valueOf(j)), C34646b.m101748b("end.year.campaign.popup.prize.plus.message", new Object[0]), (DefaultConstructorMarker) null);
            this.f60933g = j;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlusPrizeRegular) && this.f60933g == ((PlusPrizeRegular) obj).f60933g;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f60933g);
        }

        public String toString() {
            long j = this.f60933g;
            return "PlusPrizeRegular(amount=" + j + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f60933g);
        }
    }

    /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$PlusPrizeSuper */
    public static final class PlusPrizeSuper extends EndYearPopUpDataUiModel {
        public static final Parcelable.Creator<PlusPrizeSuper> CREATOR = new C23300a();

        /* renamed from: g */
        private final long f60934g;

        /* renamed from: ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel$PlusPrizeSuper$a */
        public static final class C23300a implements Parcelable.Creator {
            /* renamed from: a */
            public final PlusPrizeSuper createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new PlusPrizeSuper(parcel.readLong());
            }

            /* renamed from: b */
            public final PlusPrizeSuper[] newArray(int i) {
                return new PlusPrizeSuper[i];
            }
        }

        public PlusPrizeSuper(long j) {
            super(C28002c.anim_prize_plus_super, C34646b.m101748b("end.year.campaign.popup.superprize.title", Long.valueOf(j)), C34646b.m101748b("end.year.campaign.popup.superprize.message", new Object[0]), (DefaultConstructorMarker) null);
            this.f60934g = j;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlusPrizeSuper) && this.f60934g == ((PlusPrizeSuper) obj).f60934g;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f60934g);
        }

        public String toString() {
            long j = this.f60934g;
            return "PlusPrizeSuper(amount=" + j + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f60934g);
        }
    }

    public /* synthetic */ EndYearPopUpDataUiModel(int i, StringSource stringSource, StringSource stringSource2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, stringSource, stringSource2);
    }

    /* renamed from: a */
    public int mo58318a() {
        return this.f60927d;
    }

    /* renamed from: b */
    public StringSource mo58319b() {
        return this.f60929f;
    }

    /* renamed from: d */
    public StringSource mo58320d() {
        return this.f60928e;
    }

    private EndYearPopUpDataUiModel(int i, StringSource stringSource, StringSource stringSource2) {
        this.f60927d = i;
        this.f60928e = stringSource;
        this.f60929f = stringSource2;
    }
}
