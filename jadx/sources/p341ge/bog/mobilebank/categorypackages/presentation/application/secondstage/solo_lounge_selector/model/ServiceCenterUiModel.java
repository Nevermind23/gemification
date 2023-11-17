package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.ServiceCenterUiModel */
public final class ServiceCenterUiModel implements Parcelable {
    public static final Parcelable.Creator<ServiceCenterUiModel> CREATOR = new C14566a();

    /* renamed from: d */
    private final long f42434d;

    /* renamed from: e */
    private final long f42435e;

    /* renamed from: f */
    private final String f42436f;

    /* renamed from: g */
    private final String f42437g;

    /* renamed from: h */
    private final String f42438h;

    /* renamed from: i */
    private String f42439i;

    /* renamed from: j */
    private final String f42440j;

    /* renamed from: k */
    private final String f42441k;

    /* renamed from: l */
    private final List f42442l;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.ServiceCenterUiModel$a */
    public static final class C14566a implements Parcelable.Creator {
        /* renamed from: a */
        public final ServiceCenterUiModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(ServiceCenterUiModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ServiceCenterUiModel(readLong, readLong2, readString, readString2, readString3, readString4, readString5, readString6, arrayList);
        }

        /* renamed from: b */
        public final ServiceCenterUiModel[] newArray(int i) {
            return new ServiceCenterUiModel[i];
        }
    }

    public ServiceCenterUiModel(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C41536l.m120489i(str, "langCode");
        C41536l.m120489i(str2, "pointType");
        C41536l.m120489i(str3, "pointValue");
        C41536l.m120489i(str5, "hasSoloSc");
        C41536l.m120489i(str6, "customerType");
        this.f42434d = j;
        this.f42435e = j2;
        this.f42436f = str;
        this.f42437g = str2;
        this.f42438h = str3;
        this.f42439i = str4;
        this.f42440j = str5;
        this.f42441k = str6;
        this.f42442l = list;
    }

    /* renamed from: a */
    public final long mo40876a() {
        return this.f42434d;
    }

    /* renamed from: b */
    public final String mo40877b() {
        return this.f42439i;
    }

    /* renamed from: d */
    public final String mo40878d() {
        String str = this.f42439i;
        if (str == null) {
            return this.f42438h;
        }
        C41536l.m120487g(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo40880e() {
        return this.f42437g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceCenterUiModel)) {
            return false;
        }
        ServiceCenterUiModel serviceCenterUiModel = (ServiceCenterUiModel) obj;
        return this.f42434d == serviceCenterUiModel.f42434d && this.f42435e == serviceCenterUiModel.f42435e && C41536l.m120484d(this.f42436f, serviceCenterUiModel.f42436f) && C41536l.m120484d(this.f42437g, serviceCenterUiModel.f42437g) && C41536l.m120484d(this.f42438h, serviceCenterUiModel.f42438h) && C41536l.m120484d(this.f42439i, serviceCenterUiModel.f42439i) && C41536l.m120484d(this.f42440j, serviceCenterUiModel.f42440j) && C41536l.m120484d(this.f42441k, serviceCenterUiModel.f42441k) && C41536l.m120484d(this.f42442l, serviceCenterUiModel.f42442l);
    }

    /* renamed from: f */
    public final String mo40882f() {
        return this.f42438h;
    }

    /* renamed from: g */
    public final List mo40883g() {
        return this.f42442l;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f42434d) * 31) + C7397t.m28148a(this.f42435e)) * 31) + this.f42436f.hashCode()) * 31) + this.f42437g.hashCode()) * 31) + this.f42438h.hashCode()) * 31;
        String str = this.f42439i;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f42440j.hashCode()) * 31) + this.f42441k.hashCode()) * 31;
        List list = this.f42442l;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f42434d;
        long j2 = this.f42435e;
        String str = this.f42436f;
        String str2 = this.f42437g;
        String str3 = this.f42438h;
        String str4 = this.f42439i;
        String str5 = this.f42440j;
        String str6 = this.f42441k;
        List list = this.f42442l;
        return "ServiceCenterUiModel(id=" + j + ", parentId=" + j2 + ", langCode=" + str + ", pointType=" + str2 + ", pointValue=" + str3 + ", pointDesc=" + str4 + ", hasSoloSc=" + str5 + ", customerType=" + str6 + ", points=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f42434d);
        parcel.writeLong(this.f42435e);
        parcel.writeString(this.f42436f);
        parcel.writeString(this.f42437g);
        parcel.writeString(this.f42438h);
        parcel.writeString(this.f42439i);
        parcel.writeString(this.f42440j);
        parcel.writeString(this.f42441k);
        List<ServiceCenterUiModel> list = this.f42442l;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (ServiceCenterUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
