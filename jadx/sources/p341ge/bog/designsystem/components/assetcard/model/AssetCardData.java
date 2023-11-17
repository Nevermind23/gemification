package p341ge.bog.designsystem.components.assetcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: ge.bog.designsystem.components.assetcard.model.AssetCardData */
public final class AssetCardData implements Parcelable {
    public static final Parcelable.Creator<AssetCardData> CREATOR = new C13159a();

    /* renamed from: d */
    private final String f38774d;

    /* renamed from: e */
    private final String f38775e;

    /* renamed from: f */
    private final Image f38776f;

    /* renamed from: g */
    private final Amount f38777g;

    /* renamed from: h */
    private final Double f38778h;

    /* renamed from: ge.bog.designsystem.components.assetcard.model.AssetCardData$a */
    public static final class C13159a implements Parcelable.Creator {
        /* renamed from: a */
        public final AssetCardData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new AssetCardData(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(AssetCardData.class.getClassLoader()), parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* renamed from: b */
        public final AssetCardData[] newArray(int i) {
            return new AssetCardData[i];
        }
    }

    public AssetCardData() {
        this((String) null, (String) null, (Image) null, (Amount) null, (Double) null, 31, (DefaultConstructorMarker) null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetCardData)) {
            return false;
        }
        AssetCardData assetCardData = (AssetCardData) obj;
        return C41536l.m120484d(this.f38774d, assetCardData.f38774d) && C41536l.m120484d(this.f38775e, assetCardData.f38775e) && C41536l.m120484d(this.f38776f, assetCardData.f38776f) && C41536l.m120484d(this.f38777g, assetCardData.f38777g) && C41536l.m120484d(this.f38778h, assetCardData.f38778h);
    }

    public int hashCode() {
        String str = this.f38774d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38775e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.f38776f;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Amount amount = this.f38777g;
        int hashCode4 = (hashCode3 + (amount == null ? 0 : amount.hashCode())) * 31;
        Double d = this.f38778h;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f38774d;
        String str2 = this.f38775e;
        Image image = this.f38776f;
        Amount amount = this.f38777g;
        Double d = this.f38778h;
        return "AssetCardData(title=" + str + ", subtitle=" + str2 + ", icon=" + image + ", amount=" + amount + ", change=" + d + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f38774d);
        parcel.writeString(this.f38775e);
        parcel.writeParcelable(this.f38776f, i);
        Amount amount = this.f38777g;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, i);
        }
        Double d = this.f38778h;
        if (d == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d.doubleValue());
    }

    public AssetCardData(String str, String str2, Image image, Amount amount, Double d) {
        this.f38774d = str;
        this.f38775e = str2;
        this.f38776f = image;
        this.f38777g = amount;
        this.f38778h = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AssetCardData(java.lang.String r5, java.lang.String r6, p341ge.bog.designsystem.components.common.Image r7, p341ge.bog.designsystem.components.Amount r8, java.lang.Double r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.assetcard.model.AssetCardData.<init>(java.lang.String, java.lang.String, ge.bog.designsystem.components.common.Image, ge.bog.designsystem.components.Amount, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
