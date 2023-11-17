package p341ge.bog.mobilebank.cleanarch.common.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel */
public final class ServiceCenterUiModel implements Parcelable {
    public static final Parcelable.Creator<ServiceCenterUiModel> CREATOR = new C20874a();

    /* renamed from: d */
    private final long f56172d;

    /* renamed from: e */
    private final long f56173e;

    /* renamed from: f */
    private final String f56174f;

    /* renamed from: g */
    private final String f56175g;

    /* renamed from: h */
    private final String f56176h;

    /* renamed from: i */
    private String f56177i;

    /* renamed from: j */
    private final String f56178j;

    /* renamed from: k */
    private final String f56179k;

    /* renamed from: l */
    private final List f56180l;

    /* renamed from: ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel$a */
    public static final class C20874a implements Parcelable.Creator {
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
        this.f56172d = j;
        this.f56173e = j2;
        this.f56174f = str;
        this.f56175g = str2;
        this.f56176h = str3;
        this.f56177i = str4;
        this.f56178j = str5;
        this.f56179k = str6;
        this.f56180l = list;
    }

    /* renamed from: a */
    public final long mo49703a() {
        return this.f56172d;
    }

    /* renamed from: b */
    public final String mo49704b() {
        return this.f56177i;
    }

    /* renamed from: d */
    public final String mo49705d() {
        String str = this.f56177i;
        if (str == null) {
            return this.f56176h;
        }
        C41536l.m120487g(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo49707e() {
        return this.f56176h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceCenterUiModel)) {
            return false;
        }
        ServiceCenterUiModel serviceCenterUiModel = (ServiceCenterUiModel) obj;
        return this.f56172d == serviceCenterUiModel.f56172d && this.f56173e == serviceCenterUiModel.f56173e && C41536l.m120484d(this.f56174f, serviceCenterUiModel.f56174f) && C41536l.m120484d(this.f56175g, serviceCenterUiModel.f56175g) && C41536l.m120484d(this.f56176h, serviceCenterUiModel.f56176h) && C41536l.m120484d(this.f56177i, serviceCenterUiModel.f56177i) && C41536l.m120484d(this.f56178j, serviceCenterUiModel.f56178j) && C41536l.m120484d(this.f56179k, serviceCenterUiModel.f56179k) && C41536l.m120484d(this.f56180l, serviceCenterUiModel.f56180l);
    }

    /* renamed from: f */
    public final List mo49709f() {
        return this.f56180l;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f56172d) * 31) + C7397t.m28148a(this.f56173e)) * 31) + this.f56174f.hashCode()) * 31) + this.f56175g.hashCode()) * 31) + this.f56176h.hashCode()) * 31;
        String str = this.f56177i;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f56178j.hashCode()) * 31) + this.f56179k.hashCode()) * 31;
        List list = this.f56180l;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f56172d;
        long j2 = this.f56173e;
        String str = this.f56174f;
        String str2 = this.f56175g;
        String str3 = this.f56176h;
        String str4 = this.f56177i;
        String str5 = this.f56178j;
        String str6 = this.f56179k;
        List list = this.f56180l;
        return "ServiceCenterUiModel(id=" + j + ", parentId=" + j2 + ", langCode=" + str + ", pointType=" + str2 + ", pointValue=" + str3 + ", pointDesc=" + str4 + ", hasSoloSc=" + str5 + ", customerType=" + str6 + ", points=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f56172d);
        parcel.writeLong(this.f56173e);
        parcel.writeString(this.f56174f);
        parcel.writeString(this.f56175g);
        parcel.writeString(this.f56176h);
        parcel.writeString(this.f56177i);
        parcel.writeString(this.f56178j);
        parcel.writeString(this.f56179k);
        List<ServiceCenterUiModel> list = this.f56180l;
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
