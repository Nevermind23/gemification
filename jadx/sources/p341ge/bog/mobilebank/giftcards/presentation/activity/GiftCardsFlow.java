package p341ge.bog.mobilebank.giftcards.presentation.activity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh0.C27010e;
import p190o1.C7397t;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel;
import p341ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationDetailsUiModel;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow */
public abstract class GiftCardsFlow implements Parcelable {

    /* renamed from: d */
    private final int f62419d;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$Filter */
    public static final class Filter extends GiftCardsFlow {
        public static final Parcelable.Creator<Filter> CREATOR = new C24068a();

        /* renamed from: e */
        private final boolean f62423e;

        /* renamed from: f */
        private final Set f62424f;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$Filter$a */
        public static final class C24068a implements Parcelable.Creator {
            /* renamed from: a */
            public final Filter createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(Long.valueOf(parcel.readLong()));
                }
                return new Filter(z, linkedHashSet);
            }

            /* renamed from: b */
            public final Filter[] newArray(int i) {
                return new Filter[i];
            }
        }

        public Filter() {
            this(false, (Set) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final Set mo61599b() {
            return this.f62424f;
        }

        /* renamed from: d */
        public final boolean mo61600d() {
            return this.f62423e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) obj;
            return this.f62423e == filter.f62423e && C41536l.m120484d(this.f62424f, filter.f62424f);
        }

        public int hashCode() {
            boolean z = this.f62423e;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f62424f.hashCode();
        }

        public String toString() {
            boolean z = this.f62423e;
            Set set = this.f62424f;
            return "Filter(fromHome=" + z + ", filteredCategories=" + set + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f62423e ? 1 : 0);
            Set<Number> set = this.f62424f;
            parcel.writeInt(set.size());
            for (Number longValue : set) {
                parcel.writeLong(longValue.longValue());
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Filter(boolean z, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C41357x0.m119985e() : set);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Filter(boolean z, Set set) {
            super(C27010e.giftCardsFilterFragment, (DefaultConstructorMarker) null);
            C41536l.m120489i(set, "filteredCategories");
            this.f62423e = z;
            this.f62424f = set;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$FilteredOffers */
    public static final class FilteredOffers extends GiftCardsFlow {
        public static final Parcelable.Creator<FilteredOffers> CREATOR = new C24069a();

        /* renamed from: e */
        private final boolean f62425e;

        /* renamed from: f */
        private final Set f62426f;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$FilteredOffers$a */
        public static final class C24069a implements Parcelable.Creator {
            /* renamed from: a */
            public final FilteredOffers createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(Long.valueOf(parcel.readLong()));
                }
                return new FilteredOffers(z, linkedHashSet);
            }

            /* renamed from: b */
            public final FilteredOffers[] newArray(int i) {
                return new FilteredOffers[i];
            }
        }

        public FilteredOffers() {
            this(false, (Set) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final Set mo61610b() {
            return this.f62426f;
        }

        /* renamed from: d */
        public final boolean mo61611d() {
            return this.f62425e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilteredOffers)) {
                return false;
            }
            FilteredOffers filteredOffers = (FilteredOffers) obj;
            return this.f62425e == filteredOffers.f62425e && C41536l.m120484d(this.f62426f, filteredOffers.f62426f);
        }

        public int hashCode() {
            boolean z = this.f62425e;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f62426f.hashCode();
        }

        public String toString() {
            boolean z = this.f62425e;
            Set set = this.f62426f;
            return "FilteredOffers(fromHome=" + z + ", filteredCategories=" + set + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f62425e ? 1 : 0);
            Set<Number> set = this.f62426f;
            parcel.writeInt(set.size());
            for (Number longValue : set) {
                parcel.writeLong(longValue.longValue());
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FilteredOffers(boolean z, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C41357x0.m119985e() : set);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FilteredOffers(boolean z, Set set) {
            super(C27010e.giftCardsFilteredOffersFragment, (DefaultConstructorMarker) null);
            C41536l.m120489i(set, "filteredCategories");
            this.f62425e = z;
            this.f62426f = set;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$GiftCardDetails */
    public static final class GiftCardDetails extends GiftCardsFlow {
        public static final Parcelable.Creator<GiftCardDetails> CREATOR = new C24070a();

        /* renamed from: e */
        private final boolean f62427e;

        /* renamed from: f */
        private final long f62428f;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$GiftCardDetails$a */
        public static final class C24070a implements Parcelable.Creator {
            /* renamed from: a */
            public final GiftCardDetails createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new GiftCardDetails(parcel.readInt() != 0, parcel.readLong());
            }

            /* renamed from: b */
            public final GiftCardDetails[] newArray(int i) {
                return new GiftCardDetails[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GiftCardDetails(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, j);
        }

        /* renamed from: b */
        public final long mo61621b() {
            return this.f62428f;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GiftCardDetails)) {
                return false;
            }
            GiftCardDetails giftCardDetails = (GiftCardDetails) obj;
            return this.f62427e == giftCardDetails.f62427e && this.f62428f == giftCardDetails.f62428f;
        }

        public int hashCode() {
            boolean z = this.f62427e;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + C7397t.m28148a(this.f62428f);
        }

        public String toString() {
            boolean z = this.f62427e;
            long j = this.f62428f;
            return "GiftCardDetails(fromHome=" + z + ", cardId=" + j + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f62427e ? 1 : 0);
            parcel.writeLong(this.f62428f);
        }

        public GiftCardDetails(boolean z, long j) {
            super(C27010e.giftCardsDetailsFragment, (DefaultConstructorMarker) null);
            this.f62427e = z;
            this.f62428f = j;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$GiftCardIntroduction */
    public static final class GiftCardIntroduction extends GiftCardsFlow {
        public static final Parcelable.Creator<GiftCardIntroduction> CREATOR = new C24071a();

        /* renamed from: e */
        private final boolean f62429e;

        /* renamed from: f */
        private final boolean f62430f;

        /* renamed from: g */
        private final long f62431g;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$GiftCardIntroduction$a */
        public static final class C24071a implements Parcelable.Creator {
            /* renamed from: a */
            public final GiftCardIntroduction createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                boolean z = true;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new GiftCardIntroduction(z2, z, parcel.readLong());
            }

            /* renamed from: b */
            public final GiftCardIntroduction[] newArray(int i) {
                return new GiftCardIntroduction[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GiftCardIntroduction(boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, j);
        }

        /* renamed from: b */
        public final long mo61631b() {
            return this.f62431g;
        }

        /* renamed from: d */
        public final boolean mo61632d() {
            return this.f62430f;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GiftCardIntroduction)) {
                return false;
            }
            GiftCardIntroduction giftCardIntroduction = (GiftCardIntroduction) obj;
            return this.f62429e == giftCardIntroduction.f62429e && this.f62430f == giftCardIntroduction.f62430f && this.f62431g == giftCardIntroduction.f62431g;
        }

        public int hashCode() {
            boolean z = this.f62429e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f62430f;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + C7397t.m28148a(this.f62431g);
        }

        public String toString() {
            boolean z = this.f62429e;
            boolean z2 = this.f62430f;
            long j = this.f62431g;
            return "GiftCardIntroduction(fromHome=" + z + ", fromDetails=" + z2 + ", cardId=" + j + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f62429e ? 1 : 0);
            parcel.writeInt(this.f62430f ? 1 : 0);
            parcel.writeLong(this.f62431g);
        }

        public GiftCardIntroduction(boolean z, boolean z2, long j) {
            super(C27010e.giftCardsTermsAndConditionsFragment, (DefaultConstructorMarker) null);
            this.f62429e = z;
            this.f62430f = z2;
            this.f62431g = j;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$GiftCardOffersAndApplicationsDetails */
    public static final class GiftCardOffersAndApplicationsDetails extends GiftCardsFlow {
        public static final Parcelable.Creator<GiftCardOffersAndApplicationsDetails> CREATOR = new C24072a();

        /* renamed from: e */
        private final boolean f62432e;

        /* renamed from: f */
        private final OffersAndApplicationDetailsUiModel f62433f;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$GiftCardOffersAndApplicationsDetails$a */
        public static final class C24072a implements Parcelable.Creator {
            /* renamed from: a */
            public final GiftCardOffersAndApplicationsDetails createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new GiftCardOffersAndApplicationsDetails(parcel.readInt() != 0, OffersAndApplicationDetailsUiModel.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final GiftCardOffersAndApplicationsDetails[] newArray(int i) {
                return new GiftCardOffersAndApplicationsDetails[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GiftCardOffersAndApplicationsDetails(boolean z, OffersAndApplicationDetailsUiModel offersAndApplicationDetailsUiModel) {
            super(C27010e.giftCardsOffersAndApplications, (DefaultConstructorMarker) null);
            C41536l.m120489i(offersAndApplicationDetailsUiModel, "model");
            this.f62432e = z;
            this.f62433f = offersAndApplicationDetailsUiModel;
        }

        /* renamed from: b */
        public final OffersAndApplicationDetailsUiModel mo61642b() {
            return this.f62433f;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GiftCardOffersAndApplicationsDetails)) {
                return false;
            }
            GiftCardOffersAndApplicationsDetails giftCardOffersAndApplicationsDetails = (GiftCardOffersAndApplicationsDetails) obj;
            return this.f62432e == giftCardOffersAndApplicationsDetails.f62432e && C41536l.m120484d(this.f62433f, giftCardOffersAndApplicationsDetails.f62433f);
        }

        public int hashCode() {
            boolean z = this.f62432e;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f62433f.hashCode();
        }

        public String toString() {
            boolean z = this.f62432e;
            OffersAndApplicationDetailsUiModel offersAndApplicationDetailsUiModel = this.f62433f;
            return "GiftCardOffersAndApplicationsDetails(fromHome=" + z + ", model=" + offersAndApplicationDetailsUiModel + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f62432e ? 1 : 0);
            this.f62433f.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GiftCardsFlow(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* renamed from: a */
    public final int mo61587a() {
        return this.f62419d;
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$Animations */
    public static final class Animations extends GiftCardsFlow {
        public static final Parcelable.Creator<Animations> CREATOR = new C24067a();

        /* renamed from: e */
        private final boolean f62420e;

        /* renamed from: f */
        private final GiftCardsMerchantAnimationsModel f62421f;

        /* renamed from: g */
        private final GiftCardFlowMode f62422g;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$Animations$a */
        public static final class C24067a implements Parcelable.Creator {
            /* renamed from: a */
            public final Animations createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Animations(parcel.readInt() != 0, GiftCardsMerchantAnimationsModel.CREATOR.createFromParcel(parcel), (GiftCardFlowMode) parcel.readParcelable(Animations.class.getClassLoader()));
            }

            /* renamed from: b */
            public final Animations[] newArray(int i) {
                return new Animations[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Animations(boolean z, GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel, GiftCardFlowMode giftCardFlowMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, giftCardsMerchantAnimationsModel, (i & 4) != 0 ? GiftCardFlowMode.PurchaseGiftCard.f62413d : giftCardFlowMode);
        }

        /* renamed from: b */
        public final GiftCardFlowMode mo61588b() {
            return this.f62422g;
        }

        /* renamed from: d */
        public final GiftCardsMerchantAnimationsModel mo61589d() {
            return this.f62421f;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Animations)) {
                return false;
            }
            Animations animations = (Animations) obj;
            return this.f62420e == animations.f62420e && C41536l.m120484d(this.f62421f, animations.f62421f) && C41536l.m120484d(this.f62422g, animations.f62422g);
        }

        public int hashCode() {
            boolean z = this.f62420e;
            if (z) {
                z = true;
            }
            return ((((z ? 1 : 0) * true) + this.f62421f.hashCode()) * 31) + this.f62422g.hashCode();
        }

        public String toString() {
            boolean z = this.f62420e;
            GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel = this.f62421f;
            GiftCardFlowMode giftCardFlowMode = this.f62422g;
            return "Animations(fromHome=" + z + ", model=" + giftCardsMerchantAnimationsModel + ", flowMode=" + giftCardFlowMode + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f62420e ? 1 : 0);
            this.f62421f.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f62422g, i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Animations(boolean z, GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel, GiftCardFlowMode giftCardFlowMode) {
            super(C27010e.giftCardsANimationsFragment, (DefaultConstructorMarker) null);
            C41536l.m120489i(giftCardsMerchantAnimationsModel, "model");
            C41536l.m120489i(giftCardFlowMode, "flowMode");
            this.f62420e = z;
            this.f62421f = giftCardsMerchantAnimationsModel;
            this.f62422g = giftCardFlowMode;
        }
    }

    private GiftCardsFlow(int i) {
        this.f62419d = i;
    }
}
