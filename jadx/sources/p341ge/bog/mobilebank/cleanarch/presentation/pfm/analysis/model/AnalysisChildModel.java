package p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel */
public final class AnalysisChildModel implements Parcelable {
    public static final Parcelable.Creator<AnalysisChildModel> CREATOR = new C22042a();

    /* renamed from: d */
    private final List f58650d;

    /* renamed from: e */
    private final String f58651e;

    /* renamed from: f */
    private final long f58652f;

    /* renamed from: g */
    private final String f58653g;

    /* renamed from: h */
    private final BigDecimal f58654h;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel$a */
    public static final class C22042a implements Parcelable.Creator {
        /* renamed from: a */
        public final AnalysisChildModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C41536l.m120489i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(AnalysisChildModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AnalysisChildModel(arrayList, parcel.readString(), parcel.readLong(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* renamed from: b */
        public final AnalysisChildModel[] newArray(int i) {
            return new AnalysisChildModel[i];
        }
    }

    public AnalysisChildModel(List list, String str, long j, String str2, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "color");
        C41536l.m120489i(str2, "titleKey");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        this.f58650d = list;
        this.f58651e = str;
        this.f58652f = j;
        this.f58653g = str2;
        this.f58654h = bigDecimal;
    }

    /* renamed from: b */
    public static /* synthetic */ AnalysisChildModel m71401b(AnalysisChildModel analysisChildModel, List list, String str, long j, String str2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            list = analysisChildModel.f58650d;
        }
        if ((i & 2) != 0) {
            str = analysisChildModel.f58651e;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            j = analysisChildModel.f58652f;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str2 = analysisChildModel.f58653g;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bigDecimal = analysisChildModel.f58654h;
        }
        return analysisChildModel.mo54776a(list, str3, j2, str4, bigDecimal);
    }

    /* renamed from: a */
    public final AnalysisChildModel mo54776a(List list, String str, long j, String str2, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "color");
        C41536l.m120489i(str2, "titleKey");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        return new AnalysisChildModel(list, str, j, str2, bigDecimal);
    }

    /* renamed from: d */
    public final List mo54777d() {
        return this.f58650d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo54779e() {
        String B = C40439w.m117103B(this.f58651e, "#", "", false, 4, (Object) null);
        return "#" + B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalysisChildModel)) {
            return false;
        }
        AnalysisChildModel analysisChildModel = (AnalysisChildModel) obj;
        return C41536l.m120484d(this.f58650d, analysisChildModel.f58650d) && C41536l.m120484d(this.f58651e, analysisChildModel.f58651e) && this.f58652f == analysisChildModel.f58652f && C41536l.m120484d(this.f58653g, analysisChildModel.f58653g) && C41536l.m120484d(this.f58654h, analysisChildModel.f58654h);
    }

    /* renamed from: f */
    public final long mo54781f() {
        return this.f58652f;
    }

    /* renamed from: g */
    public final String mo54782g() {
        return C40439w.m117103B(this.f58653g, "#", "", false, 4, (Object) null);
    }

    /* renamed from: h */
    public final BigDecimal mo54783h() {
        return this.f58654h;
    }

    public int hashCode() {
        List list = this.f58650d;
        return ((((((((list == null ? 0 : list.hashCode()) * 31) + this.f58651e.hashCode()) * 31) + C7397t.m28148a(this.f58652f)) * 31) + this.f58653g.hashCode()) * 31) + this.f58654h.hashCode();
    }

    public String toString() {
        List list = this.f58650d;
        String str = this.f58651e;
        long j = this.f58652f;
        String str2 = this.f58653g;
        BigDecimal bigDecimal = this.f58654h;
        return "AnalysisChildModel(children=" + list + ", color=" + str + ", id=" + j + ", titleKey=" + str2 + ", value=" + bigDecimal + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<AnalysisChildModel> list = this.f58650d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (AnalysisChildModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f58651e);
        parcel.writeLong(this.f58652f);
        parcel.writeString(this.f58653g);
        parcel.writeSerializable(this.f58654h);
    }
}
