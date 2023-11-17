package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p537nm.C17071b;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel */
public final class CardApplicationTypeDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<CardApplicationTypeDetailsUiModel> CREATOR = new C14199a();

    /* renamed from: d */
    private final C17071b f41629d;

    /* renamed from: e */
    private final String f41630e;

    /* renamed from: f */
    private final String f41631f;

    /* renamed from: g */
    private final boolean f41632g;

    /* renamed from: h */
    private final boolean f41633h;

    /* renamed from: i */
    private final List f41634i;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel$a */
    public static final class C14199a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardApplicationTypeDetailsUiModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C41536l.m120489i(parcel, "parcel");
            C17071b valueOf = C17071b.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(RegionUiModel.CREATOR.createFromParcel(parcel));
                }
            }
            return new CardApplicationTypeDetailsUiModel(valueOf, readString, readString2, z, z2, arrayList);
        }

        /* renamed from: b */
        public final CardApplicationTypeDetailsUiModel[] newArray(int i) {
            return new CardApplicationTypeDetailsUiModel[i];
        }
    }

    public CardApplicationTypeDetailsUiModel(C17071b bVar, String str, String str2, boolean z, boolean z2, List list) {
        C41536l.m120489i(bVar, "type");
        this.f41629d = bVar;
        this.f41630e = str;
        this.f41631f = str2;
        this.f41632g = z;
        this.f41633h = z2;
        this.f41634i = list;
    }

    /* renamed from: b */
    public static /* synthetic */ CardApplicationTypeDetailsUiModel m52534b(CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel, C17071b bVar, String str, String str2, boolean z, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = cardApplicationTypeDetailsUiModel.f41629d;
        }
        if ((i & 2) != 0) {
            str = cardApplicationTypeDetailsUiModel.f41630e;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = cardApplicationTypeDetailsUiModel.f41631f;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = cardApplicationTypeDetailsUiModel.f41632g;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = cardApplicationTypeDetailsUiModel.f41633h;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            list = cardApplicationTypeDetailsUiModel.f41634i;
        }
        return cardApplicationTypeDetailsUiModel.mo39362a(bVar, str3, str4, z3, z4, list);
    }

    /* renamed from: a */
    public final CardApplicationTypeDetailsUiModel mo39362a(C17071b bVar, String str, String str2, boolean z, boolean z2, List list) {
        C41536l.m120489i(bVar, "type");
        return new CardApplicationTypeDetailsUiModel(bVar, str, str2, z, z2, list);
    }

    /* renamed from: d */
    public final String mo39363d() {
        return this.f41630e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo39365e() {
        return this.f41634i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardApplicationTypeDetailsUiModel)) {
            return false;
        }
        CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel = (CardApplicationTypeDetailsUiModel) obj;
        return this.f41629d == cardApplicationTypeDetailsUiModel.f41629d && C41536l.m120484d(this.f41630e, cardApplicationTypeDetailsUiModel.f41630e) && C41536l.m120484d(this.f41631f, cardApplicationTypeDetailsUiModel.f41631f) && this.f41632g == cardApplicationTypeDetailsUiModel.f41632g && this.f41633h == cardApplicationTypeDetailsUiModel.f41633h && C41536l.m120484d(this.f41634i, cardApplicationTypeDetailsUiModel.f41634i);
    }

    /* renamed from: f */
    public final String mo39367f() {
        return this.f41631f;
    }

    /* renamed from: g */
    public final C17071b mo39368g() {
        return this.f41629d;
    }

    /* renamed from: h */
    public final boolean mo39369h() {
        return this.f41633h;
    }

    public int hashCode() {
        int hashCode = this.f41629d.hashCode() * 31;
        String str = this.f41630e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41631f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f41632g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f41633h;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        List list = this.f41634i;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    /* renamed from: i */
    public final boolean mo39371i() {
        return this.f41632g;
    }

    public String toString() {
        C17071b bVar = this.f41629d;
        String str = this.f41630e;
        String str2 = this.f41631f;
        boolean z = this.f41632g;
        boolean z2 = this.f41633h;
        List list = this.f41634i;
        return "CardApplicationTypeDetailsUiModel(type=" + bVar + ", descriptionKey=" + str + ", titleKey=" + str2 + ", isLoading=" + z + ", isEnabled=" + z2 + ", regions=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41629d.name());
        parcel.writeString(this.f41630e);
        parcel.writeString(this.f41631f);
        parcel.writeInt(this.f41632g ? 1 : 0);
        parcel.writeInt(this.f41633h ? 1 : 0);
        List<RegionUiModel> list = this.f41634i;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (RegionUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardApplicationTypeDetailsUiModel(C17071b bVar, String str, String str2, boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, list);
    }
}
