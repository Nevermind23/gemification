package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p411em.C12486c;
import p669xh.C18763a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem */
public abstract class CardRenewalListItem implements Parcelable {

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem$CardRenewalCardItem */
    public static final class CardRenewalCardItem extends CardRenewalListItem {
        public static final Parcelable.Creator<CardRenewalCardItem> CREATOR = new C14204a();

        /* renamed from: d */
        private final long f41651d;

        /* renamed from: e */
        private final String f41652e;

        /* renamed from: f */
        private final String f41653f;

        /* renamed from: g */
        private final String f41654g;

        /* renamed from: h */
        private final int f41655h;

        /* renamed from: i */
        private final C18763a f41656i;

        /* renamed from: j */
        private final CreditCardView.C13273e f41657j;

        /* renamed from: k */
        private final String f41658k;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem$CardRenewalCardItem$a */
        public static final class C14204a implements Parcelable.Creator {
            /* renamed from: a */
            public final CardRenewalCardItem createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new CardRenewalCardItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), C18763a.valueOf(parcel.readString()), CreditCardView.C13273e.valueOf(parcel.readString()), parcel.readString());
            }

            /* renamed from: b */
            public final CardRenewalCardItem[] newArray(int i) {
                return new CardRenewalCardItem[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CardRenewalCardItem(long j, String str, String str2, String str3, int i, C18763a aVar, CreditCardView.C13273e eVar, String str4) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "lastFour");
            C41536l.m120489i(str3, "expireDate");
            C41536l.m120489i(aVar, "cardType");
            C41536l.m120489i(eVar, "themeType");
            this.f41651d = j;
            this.f41652e = str;
            this.f41653f = str2;
            this.f41654g = str3;
            this.f41655h = i;
            this.f41656i = aVar;
            this.f41657j = eVar;
            this.f41658k = str4;
        }

        /* renamed from: a */
        public final int mo39424a() {
            return this.f41655h;
        }

        /* renamed from: b */
        public final String mo39425b() {
            return this.f41658k;
        }

        /* renamed from: d */
        public final long mo39426d() {
            return this.f41651d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final C18763a mo39428e() {
            return this.f41656i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardRenewalCardItem)) {
                return false;
            }
            CardRenewalCardItem cardRenewalCardItem = (CardRenewalCardItem) obj;
            return this.f41651d == cardRenewalCardItem.f41651d && C41536l.m120484d(this.f41652e, cardRenewalCardItem.f41652e) && C41536l.m120484d(this.f41653f, cardRenewalCardItem.f41653f) && C41536l.m120484d(this.f41654g, cardRenewalCardItem.f41654g) && this.f41655h == cardRenewalCardItem.f41655h && this.f41656i == cardRenewalCardItem.f41656i && this.f41657j == cardRenewalCardItem.f41657j && C41536l.m120484d(this.f41658k, cardRenewalCardItem.f41658k);
        }

        /* renamed from: f */
        public final String mo39430f() {
            return this.f41654g;
        }

        /* renamed from: g */
        public final String mo39431g() {
            return this.f41653f;
        }

        /* renamed from: h */
        public final CreditCardView.C13273e mo39432h() {
            return this.f41657j;
        }

        public int hashCode() {
            int a = ((((((((((((C7397t.m28148a(this.f41651d) * 31) + this.f41652e.hashCode()) * 31) + this.f41653f.hashCode()) * 31) + this.f41654g.hashCode()) * 31) + this.f41655h) * 31) + this.f41656i.hashCode()) * 31) + this.f41657j.hashCode()) * 31;
            String str = this.f41658k;
            return a + (str == null ? 0 : str.hashCode());
        }

        /* renamed from: i */
        public final String mo39434i() {
            return this.f41652e;
        }

        public String toString() {
            long j = this.f41651d;
            String str = this.f41652e;
            String str2 = this.f41653f;
            String str3 = this.f41654g;
            int i = this.f41655h;
            C18763a aVar = this.f41656i;
            CreditCardView.C13273e eVar = this.f41657j;
            String str4 = this.f41658k;
            return "CardRenewalCardItem(cardId=" + j + ", title=" + str + ", lastFour=" + str2 + ", expireDate=" + str3 + ", backgroundResId=" + i + ", cardType=" + aVar + ", themeType=" + eVar + ", backgroundUrl=" + str4 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f41651d);
            parcel.writeString(this.f41652e);
            parcel.writeString(this.f41653f);
            parcel.writeString(this.f41654g);
            parcel.writeInt(this.f41655h);
            parcel.writeString(this.f41656i.name());
            parcel.writeString(this.f41657j.name());
            parcel.writeString(this.f41658k);
        }
    }

    private CardRenewalListItem() {
    }

    public /* synthetic */ CardRenewalListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem$CardRenewalHeader */
    public static final class CardRenewalHeader extends CardRenewalListItem {
        public static final Parcelable.Creator<CardRenewalHeader> CREATOR = new C14205a();

        /* renamed from: d */
        private final String f41659d;

        /* renamed from: e */
        private final int f41660e;

        /* renamed from: f */
        private final int f41661f;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem$CardRenewalHeader$a */
        public static final class C14205a implements Parcelable.Creator {
            /* renamed from: a */
            public final CardRenewalHeader createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new CardRenewalHeader(parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            /* renamed from: b */
            public final CardRenewalHeader[] newArray(int i) {
                return new CardRenewalHeader[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CardRenewalHeader(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i3 & 4) != 0 ? C12486c.f37158a : i2);
        }

        /* renamed from: a */
        public final int mo39441a() {
            return this.f41660e;
        }

        /* renamed from: b */
        public final String mo39442b() {
            return this.f41659d;
        }

        /* renamed from: d */
        public final int mo39443d() {
            return this.f41661f;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardRenewalHeader)) {
                return false;
            }
            CardRenewalHeader cardRenewalHeader = (CardRenewalHeader) obj;
            return C41536l.m120484d(this.f41659d, cardRenewalHeader.f41659d) && this.f41660e == cardRenewalHeader.f41660e && this.f41661f == cardRenewalHeader.f41661f;
        }

        public int hashCode() {
            return (((this.f41659d.hashCode() * 31) + this.f41660e) * 31) + this.f41661f;
        }

        public String toString() {
            String str = this.f41659d;
            int i = this.f41660e;
            int i2 = this.f41661f;
            return "CardRenewalHeader(text=" + str + ", iconResId=" + i + ", tintColor=" + i2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f41659d);
            parcel.writeInt(this.f41660e);
            parcel.writeInt(this.f41661f);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CardRenewalHeader(String str, int i, int i2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "text");
            this.f41659d = str;
            this.f41660e = i;
            this.f41661f = i2;
        }
    }
}
