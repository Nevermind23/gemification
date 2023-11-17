package p341ge.bog.mobilebank.giftcards.presentation.activity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode */
public interface GiftCardFlowMode extends Parcelable {

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode$GiveAwayGiftCard */
    public static final class GiveAwayGiftCard implements GiftCardFlowMode {
        public static final Parcelable.Creator<GiveAwayGiftCard> CREATOR = new C24062a();

        /* renamed from: d */
        public static final GiveAwayGiftCard f62412d = new GiveAwayGiftCard();

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode$GiveAwayGiftCard$a */
        public static final class C24062a implements Parcelable.Creator {
            /* renamed from: a */
            public final GiveAwayGiftCard createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return GiveAwayGiftCard.f62412d;
            }

            /* renamed from: b */
            public final GiveAwayGiftCard[] newArray(int i) {
                return new GiveAwayGiftCard[i];
            }
        }

        private GiveAwayGiftCard() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode$PurchaseGiftCard */
    public static final class PurchaseGiftCard implements GiftCardFlowMode {
        public static final Parcelable.Creator<PurchaseGiftCard> CREATOR = new C24063a();

        /* renamed from: d */
        public static final PurchaseGiftCard f62413d = new PurchaseGiftCard();

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode$PurchaseGiftCard$a */
        public static final class C24063a implements Parcelable.Creator {
            /* renamed from: a */
            public final PurchaseGiftCard createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return PurchaseGiftCard.f62413d;
            }

            /* renamed from: b */
            public final PurchaseGiftCard[] newArray(int i) {
                return new PurchaseGiftCard[i];
            }
        }

        private PurchaseGiftCard() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }
}
