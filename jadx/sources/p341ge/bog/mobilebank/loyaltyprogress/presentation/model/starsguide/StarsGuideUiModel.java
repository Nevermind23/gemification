package p341ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide;

import android.os.Parcel;
import android.os.Parcelable;
import eu0.C31812a;
import hd0.C24978b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide.StarsGuideUiModel */
public final class StarsGuideUiModel implements Parcelable {
    public static final Parcelable.Creator<StarsGuideUiModel> CREATOR = new C33170a();

    /* renamed from: d */
    private final String f81241d;

    /* renamed from: e */
    private final String f81242e;

    /* renamed from: f */
    private final C24978b f81243f;

    /* renamed from: g */
    private final C31812a f81244g;

    /* renamed from: h */
    private final int f81245h;

    /* renamed from: i */
    private final C24978b f81246i;

    /* renamed from: j */
    private final int f81247j;

    /* renamed from: k */
    private final List f81248k;

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide.StarsGuideUiModel$a */
    public static final class C33170a implements Parcelable.Creator {
        /* renamed from: a */
        public final StarsGuideUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            C24978b valueOf = C24978b.valueOf(parcel.readString());
            ArrayList arrayList = null;
            C31812a valueOf2 = parcel.readInt() == 0 ? null : C31812a.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            C24978b valueOf3 = C24978b.valueOf(parcel.readString());
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                for (int i = 0; i != readInt3; i++) {
                    arrayList.add(SubProductUiModel.CREATOR.createFromParcel(parcel));
                }
            }
            return new StarsGuideUiModel(readString, readString2, valueOf, valueOf2, readInt, valueOf3, readInt2, arrayList);
        }

        /* renamed from: b */
        public final StarsGuideUiModel[] newArray(int i) {
            return new StarsGuideUiModel[i];
        }
    }

    public StarsGuideUiModel(String str, String str2, C24978b bVar, C31812a aVar, int i, C24978b bVar2, int i2, List list) {
        C41536l.m120489i(str, "labelCategoryName");
        C41536l.m120489i(str2, "labelCategoryDesc");
        C41536l.m120489i(bVar, "isActive");
        C41536l.m120489i(bVar2, "hasDetails");
        this.f81241d = str;
        this.f81242e = str2;
        this.f81243f = bVar;
        this.f81244g = aVar;
        this.f81245h = i;
        this.f81246i = bVar2;
        this.f81247j = i2;
        this.f81248k = list;
    }

    /* renamed from: a */
    public final List mo75402a() {
        return this.f81248k;
    }

    /* renamed from: b */
    public final C24978b mo75403b() {
        return this.f81246i;
    }

    /* renamed from: d */
    public final String mo75404d() {
        return this.f81242e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo75406e() {
        return this.f81241d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarsGuideUiModel)) {
            return false;
        }
        StarsGuideUiModel starsGuideUiModel = (StarsGuideUiModel) obj;
        return C41536l.m120484d(this.f81241d, starsGuideUiModel.f81241d) && C41536l.m120484d(this.f81242e, starsGuideUiModel.f81242e) && this.f81243f == starsGuideUiModel.f81243f && this.f81244g == starsGuideUiModel.f81244g && this.f81245h == starsGuideUiModel.f81245h && this.f81246i == starsGuideUiModel.f81246i && this.f81247j == starsGuideUiModel.f81247j && C41536l.m120484d(this.f81248k, starsGuideUiModel.f81248k);
    }

    /* renamed from: f */
    public final C31812a mo75408f() {
        return this.f81244g;
    }

    /* renamed from: g */
    public final int mo75409g() {
        return this.f81247j;
    }

    /* renamed from: h */
    public final C24978b mo75410h() {
        return this.f81243f;
    }

    public int hashCode() {
        int hashCode = ((((this.f81241d.hashCode() * 31) + this.f81242e.hashCode()) * 31) + this.f81243f.hashCode()) * 31;
        C31812a aVar = this.f81244g;
        int i = 0;
        int hashCode2 = (((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f81245h) * 31) + this.f81246i.hashCode()) * 31) + this.f81247j) * 31;
        List list = this.f81248k;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f81241d;
        String str2 = this.f81242e;
        C24978b bVar = this.f81243f;
        C31812a aVar = this.f81244g;
        int i = this.f81245h;
        C24978b bVar2 = this.f81246i;
        int i2 = this.f81247j;
        List list = this.f81248k;
        return "StarsGuideUiModel(labelCategoryName=" + str + ", labelCategoryDesc=" + str2 + ", isActive=" + bVar + ", productIcon=" + aVar + ", orderId=" + i + ", hasDetails=" + bVar2 + ", scoreNew=" + i2 + ", children=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81241d);
        parcel.writeString(this.f81242e);
        parcel.writeString(this.f81243f.name());
        C31812a aVar = this.f81244g;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeInt(this.f81245h);
        parcel.writeString(this.f81246i.name());
        parcel.writeInt(this.f81247j);
        List<SubProductUiModel> list = this.f81248k;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (SubProductUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
