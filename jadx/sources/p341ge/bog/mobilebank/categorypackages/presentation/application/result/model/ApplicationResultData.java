package p341ge.bog.mobilebank.categorypackages.presentation.application.result.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.pagestate.PageStateType;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.model.ApplicationResultData */
public final class ApplicationResultData implements Parcelable {
    public static final Parcelable.Creator<ApplicationResultData> CREATOR = new C14512a();

    /* renamed from: d */
    private final String f42348d;

    /* renamed from: e */
    private final String f42349e;

    /* renamed from: f */
    private final PageStateType f42350f;

    /* renamed from: g */
    private final List f42351g;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.model.ApplicationResultData$a */
    public static final class C14512a implements Parcelable.Creator {
        /* renamed from: a */
        public final ApplicationResultData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Class<ApplicationResultData> cls = ApplicationResultData.class;
            PageStateType pageStateType = (PageStateType) parcel.readParcelable(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(parcel.readParcelable(cls.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new ApplicationResultData(readString, readString2, pageStateType, arrayList);
        }

        /* renamed from: b */
        public final ApplicationResultData[] newArray(int i) {
            return new ApplicationResultData[i];
        }
    }

    public ApplicationResultData(String str, String str2, PageStateType pageStateType, List list) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "newPackageName");
        C41536l.m120489i(pageStateType, "pageState");
        this.f42348d = str;
        this.f42349e = str2;
        this.f42350f = pageStateType;
        this.f42351g = list;
    }

    /* renamed from: a */
    public final List mo40733a() {
        return this.f42351g;
    }

    /* renamed from: b */
    public final String mo40734b() {
        return this.f42349e;
    }

    /* renamed from: d */
    public final PageStateType mo40735d() {
        return this.f42350f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo40737e() {
        return this.f42348d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationResultData)) {
            return false;
        }
        ApplicationResultData applicationResultData = (ApplicationResultData) obj;
        return C41536l.m120484d(this.f42348d, applicationResultData.f42348d) && C41536l.m120484d(this.f42349e, applicationResultData.f42349e) && C41536l.m120484d(this.f42350f, applicationResultData.f42350f) && C41536l.m120484d(this.f42351g, applicationResultData.f42351g);
    }

    public int hashCode() {
        int hashCode = ((((this.f42348d.hashCode() * 31) + this.f42349e.hashCode()) * 31) + this.f42350f.hashCode()) * 31;
        List list = this.f42351g;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.f42348d;
        String str2 = this.f42349e;
        PageStateType pageStateType = this.f42350f;
        List list = this.f42351g;
        return "ApplicationResultData(title=" + str + ", newPackageName=" + str2 + ", pageState=" + pageStateType + ", details=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f42348d);
        parcel.writeString(this.f42349e);
        parcel.writeParcelable(this.f42350f, i);
        List<Parcelable> list = this.f42351g;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
