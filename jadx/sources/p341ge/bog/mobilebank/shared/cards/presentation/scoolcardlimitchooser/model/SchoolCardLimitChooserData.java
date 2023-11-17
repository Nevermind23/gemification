package p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.SchoolCardLimitChooserData */
public final class SchoolCardLimitChooserData implements Parcelable {
    public static final Parcelable.Creator<SchoolCardLimitChooserData> CREATOR = new C34634a();

    /* renamed from: d */
    private final List f83699d;

    /* renamed from: e */
    private String f83700e;

    /* renamed from: f */
    private boolean f83701f;

    /* renamed from: g */
    private String f83702g;

    /* renamed from: h */
    private Long f83703h;

    /* renamed from: ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.SchoolCardLimitChooserData$a */
    public static final class C34634a implements Parcelable.Creator {
        /* renamed from: a */
        public final SchoolCardLimitChooserData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CardDailyLimitUiModel.CREATOR.createFromParcel(parcel));
            }
            return new SchoolCardLimitChooserData(arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final SchoolCardLimitChooserData[] newArray(int i) {
            return new SchoolCardLimitChooserData[i];
        }
    }

    public SchoolCardLimitChooserData(List list, String str, boolean z, String str2, Long l) {
        C41536l.m120489i(list, "limits");
        C41536l.m120489i(str2, "actionSheetTitle");
        this.f83699d = list;
        this.f83700e = str;
        this.f83701f = z;
        this.f83702g = str2;
        this.f83703h = l;
    }

    /* renamed from: a */
    public final String mo84245a() {
        return this.f83702g;
    }

    /* renamed from: b */
    public final Long mo84246b() {
        return this.f83703h;
    }

    /* renamed from: d */
    public final List mo84247d() {
        return this.f83699d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo84249e() {
        return this.f83701f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolCardLimitChooserData)) {
            return false;
        }
        SchoolCardLimitChooserData schoolCardLimitChooserData = (SchoolCardLimitChooserData) obj;
        return C41536l.m120484d(this.f83699d, schoolCardLimitChooserData.f83699d) && C41536l.m120484d(this.f83700e, schoolCardLimitChooserData.f83700e) && this.f83701f == schoolCardLimitChooserData.f83701f && C41536l.m120484d(this.f83702g, schoolCardLimitChooserData.f83702g) && C41536l.m120484d(this.f83703h, schoolCardLimitChooserData.f83703h);
    }

    /* renamed from: f */
    public final String mo84251f() {
        return this.f83700e;
    }

    public int hashCode() {
        int hashCode = this.f83699d.hashCode() * 31;
        String str = this.f83700e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f83701f;
        if (z) {
            z = true;
        }
        int hashCode3 = (((hashCode2 + (z ? 1 : 0)) * 31) + this.f83702g.hashCode()) * 31;
        Long l = this.f83703h;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        List list = this.f83699d;
        String str = this.f83700e;
        boolean z = this.f83701f;
        String str2 = this.f83702g;
        Long l = this.f83703h;
        return "SchoolCardLimitChooserData(limits=" + list + ", selectedLimitType=" + str + ", saveButtonVisible=" + z + ", actionSheetTitle=" + str2 + ", cardId=" + l + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<CardDailyLimitUiModel> list = this.f83699d;
        parcel.writeInt(list.size());
        for (CardDailyLimitUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f83700e);
        parcel.writeInt(this.f83701f ? 1 : 0);
        parcel.writeString(this.f83702g);
        Long l = this.f83703h;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SchoolCardLimitChooserData(List list, String str, boolean z, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "text.card.applications.choose.daily.limit.type" : str2, (i & 16) != 0 ? null : l);
    }
}
