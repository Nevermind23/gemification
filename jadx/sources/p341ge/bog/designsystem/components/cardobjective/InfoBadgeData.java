package p341ge.bog.designsystem.components.cardobjective;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;

/* renamed from: ge.bog.designsystem.components.cardobjective.InfoBadgeData */
public final class InfoBadgeData implements Parcelable {
    public static final Parcelable.Creator<InfoBadgeData> CREATOR = new C13215a();

    /* renamed from: d */
    private final String f38997d;

    /* renamed from: e */
    private final Image f38998e;

    /* renamed from: f */
    private final InfoBadgeView.C13345a f38999f;

    /* renamed from: ge.bog.designsystem.components.cardobjective.InfoBadgeData$a */
    public static final class C13215a implements Parcelable.Creator {
        /* renamed from: a */
        public final InfoBadgeData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new InfoBadgeData(parcel.readString(), (Image) parcel.readParcelable(InfoBadgeData.class.getClassLoader()), InfoBadgeView.C13345a.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final InfoBadgeData[] newArray(int i) {
            return new InfoBadgeData[i];
        }
    }

    public InfoBadgeData() {
        this((String) null, (Image) null, (InfoBadgeView.C13345a) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final Image mo35086a() {
        return this.f38998e;
    }

    /* renamed from: b */
    public final InfoBadgeView.C13345a mo35087b() {
        return this.f38999f;
    }

    /* renamed from: d */
    public final String mo35088d() {
        return this.f38997d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoBadgeData)) {
            return false;
        }
        InfoBadgeData infoBadgeData = (InfoBadgeData) obj;
        return C41536l.m120484d(this.f38997d, infoBadgeData.f38997d) && C41536l.m120484d(this.f38998e, infoBadgeData.f38998e) && this.f38999f == infoBadgeData.f38999f;
    }

    public int hashCode() {
        String str = this.f38997d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.f38998e;
        if (image != null) {
            i = image.hashCode();
        }
        return ((hashCode + i) * 31) + this.f38999f.hashCode();
    }

    public String toString() {
        String str = this.f38997d;
        Image image = this.f38998e;
        InfoBadgeView.C13345a aVar = this.f38999f;
        return "InfoBadgeData(badgeText=" + str + ", badgeIcon=" + image + ", badgeSize=" + aVar + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f38997d);
        parcel.writeParcelable(this.f38998e, i);
        parcel.writeString(this.f38999f.name());
    }

    public InfoBadgeData(String str, Image image, InfoBadgeView.C13345a aVar) {
        C41536l.m120489i(aVar, "badgeSize");
        this.f38997d = str;
        this.f38998e = image;
        this.f38999f = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoBadgeData(String str, Image image, InfoBadgeView.C13345a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : image, (i & 4) != 0 ? InfoBadgeView.C13345a.LARGE : aVar);
    }
}
