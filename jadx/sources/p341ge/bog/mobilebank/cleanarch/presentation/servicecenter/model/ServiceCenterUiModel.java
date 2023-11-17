package p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel */
public final class ServiceCenterUiModel implements Parcelable {
    public static final Parcelable.Creator<ServiceCenterUiModel> CREATOR = new C22439a();

    /* renamed from: d */
    private final long f59392d;

    /* renamed from: e */
    private final long f59393e;

    /* renamed from: f */
    private final String f59394f;

    /* renamed from: g */
    private final String f59395g;

    /* renamed from: h */
    private final String f59396h;

    /* renamed from: i */
    private String f59397i;

    /* renamed from: j */
    private final String f59398j;

    /* renamed from: k */
    private final String f59399k;

    /* renamed from: l */
    private final List f59400l;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel$a */
    public static final class C22439a implements Parcelable.Creator {
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
        this.f59392d = j;
        this.f59393e = j2;
        this.f59394f = str;
        this.f59395g = str2;
        this.f59396h = str3;
        this.f59397i = str4;
        this.f59398j = str5;
        this.f59399k = str6;
        this.f59400l = list;
    }

    /* renamed from: a */
    public final long mo55422a() {
        return this.f59392d;
    }

    /* renamed from: b */
    public final long mo55423b() {
        return this.f59393e;
    }

    /* renamed from: d */
    public final String mo55424d() {
        String str = this.f59397i;
        if (str == null) {
            return this.f59396h;
        }
        C41536l.m120487g(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo55426e() {
        return this.f59395g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceCenterUiModel)) {
            return false;
        }
        ServiceCenterUiModel serviceCenterUiModel = (ServiceCenterUiModel) obj;
        return this.f59392d == serviceCenterUiModel.f59392d && this.f59393e == serviceCenterUiModel.f59393e && C41536l.m120484d(this.f59394f, serviceCenterUiModel.f59394f) && C41536l.m120484d(this.f59395g, serviceCenterUiModel.f59395g) && C41536l.m120484d(this.f59396h, serviceCenterUiModel.f59396h) && C41536l.m120484d(this.f59397i, serviceCenterUiModel.f59397i) && C41536l.m120484d(this.f59398j, serviceCenterUiModel.f59398j) && C41536l.m120484d(this.f59399k, serviceCenterUiModel.f59399k) && C41536l.m120484d(this.f59400l, serviceCenterUiModel.f59400l);
    }

    /* renamed from: f */
    public final String mo55428f() {
        return this.f59396h;
    }

    /* renamed from: g */
    public final List mo55429g() {
        return this.f59400l;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f59392d) * 31) + C7397t.m28148a(this.f59393e)) * 31) + this.f59394f.hashCode()) * 31) + this.f59395g.hashCode()) * 31) + this.f59396h.hashCode()) * 31;
        String str = this.f59397i;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f59398j.hashCode()) * 31) + this.f59399k.hashCode()) * 31;
        List list = this.f59400l;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f59392d;
        long j2 = this.f59393e;
        String str = this.f59394f;
        String str2 = this.f59395g;
        String str3 = this.f59396h;
        String str4 = this.f59397i;
        String str5 = this.f59398j;
        String str6 = this.f59399k;
        List list = this.f59400l;
        return "ServiceCenterUiModel(id=" + j + ", parentId=" + j2 + ", langCode=" + str + ", pointType=" + str2 + ", pointValue=" + str3 + ", pointDesc=" + str4 + ", hasSoloSc=" + str5 + ", customerType=" + str6 + ", points=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f59392d);
        parcel.writeLong(this.f59393e);
        parcel.writeString(this.f59394f);
        parcel.writeString(this.f59395g);
        parcel.writeString(this.f59396h);
        parcel.writeString(this.f59397i);
        parcel.writeString(this.f59398j);
        parcel.writeString(this.f59399k);
        List<ServiceCenterUiModel> list = this.f59400l;
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
