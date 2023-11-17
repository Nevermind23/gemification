package p341ge.bog.mobilebank.shared.presentation.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.shared.presentation.common.model.UrlDataUiModel */
public final class UrlDataUiModel implements Parcelable {
    public static final Parcelable.Creator<UrlDataUiModel> CREATOR = new C34648a();

    /* renamed from: d */
    private final String f83756d;

    /* renamed from: e */
    private final List f83757e;

    /* renamed from: ge.bog.mobilebank.shared.presentation.common.model.UrlDataUiModel$a */
    public static final class C34648a implements Parcelable.Creator {
        /* renamed from: a */
        public final UrlDataUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(UrlParamUiModel.CREATOR.createFromParcel(parcel));
            }
            return new UrlDataUiModel(readString, arrayList);
        }

        /* renamed from: b */
        public final UrlDataUiModel[] newArray(int i) {
            return new UrlDataUiModel[i];
        }
    }

    public UrlDataUiModel(String str, List list) {
        C41536l.m120489i(list, "params");
        this.f83756d = str;
        this.f83757e = list;
    }

    /* renamed from: a */
    public final List mo84576a() {
        return this.f83757e;
    }

    /* renamed from: b */
    public final String mo84577b() {
        return this.f83756d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlDataUiModel)) {
            return false;
        }
        UrlDataUiModel urlDataUiModel = (UrlDataUiModel) obj;
        return C41536l.m120484d(this.f83756d, urlDataUiModel.f83756d) && C41536l.m120484d(this.f83757e, urlDataUiModel.f83757e);
    }

    public int hashCode() {
        String str = this.f83756d;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f83757e.hashCode();
    }

    public String toString() {
        String str = this.f83756d;
        List list = this.f83757e;
        return "UrlDataUiModel(type=" + str + ", params=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f83756d);
        List<UrlParamUiModel> list = this.f83757e;
        parcel.writeInt(list.size());
        for (UrlParamUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
