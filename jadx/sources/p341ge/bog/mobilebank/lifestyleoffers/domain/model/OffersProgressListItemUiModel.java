package p341ge.bog.mobilebank.lifestyleoffers.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.cardobjective.TimerViewData;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel */
public final class OffersProgressListItemUiModel implements Parcelable {
    public static final Parcelable.Creator<OffersProgressListItemUiModel> CREATOR = new C14935a();

    /* renamed from: d */
    private final String f43085d;

    /* renamed from: e */
    private final String f43086e;

    /* renamed from: f */
    private final String f43087f;

    /* renamed from: g */
    private final String f43088g;

    /* renamed from: h */
    private final Integer f43089h;

    /* renamed from: i */
    private final String f43090i;

    /* renamed from: j */
    private final TextProgressBarView.ProgressModel.Progress f43091j;

    /* renamed from: k */
    private final String f43092k;

    /* renamed from: l */
    private final List f43093l;

    /* renamed from: m */
    private final List f43094m;

    /* renamed from: n */
    private final TimerViewData f43095n;

    /* renamed from: o */
    private final String f43096o;

    /* renamed from: p */
    private final String f43097p;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel$a */
    public static final class C14935a implements Parcelable.Creator {
        /* renamed from: a */
        public final OffersProgressListItemUiModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            Class<OffersProgressListItemUiModel> cls = OffersProgressListItemUiModel.class;
            TextProgressBarView.ProgressModel.Progress progress = (TextProgressBarView.ProgressModel.Progress) parcel2.readParcelable(cls.getClassLoader());
            String readString6 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel2.readParcelable(cls.getClassLoader()));
                }
            }
            return new OffersProgressListItemUiModel(readString, readString2, readString3, readString4, valueOf, readString5, progress, readString6, createStringArrayList, arrayList, (TimerViewData) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final OffersProgressListItemUiModel[] newArray(int i) {
            return new OffersProgressListItemUiModel[i];
        }
    }

    public OffersProgressListItemUiModel(String str, String str2, String str3, String str4, Integer num, String str5, TextProgressBarView.ProgressModel.Progress progress, String str6, List list, List list2, TimerViewData timerViewData, String str7, String str8) {
        C41536l.m120489i(str, "benefType");
        C41536l.m120489i(progress, "progress");
        this.f43085d = str;
        this.f43086e = str2;
        this.f43087f = str3;
        this.f43088g = str4;
        this.f43089h = num;
        this.f43090i = str5;
        this.f43091j = progress;
        this.f43092k = str6;
        this.f43093l = list;
        this.f43094m = list2;
        this.f43095n = timerViewData;
        this.f43096o = str7;
        this.f43097p = str8;
    }

    /* renamed from: a */
    public final String mo41842a() {
        return this.f43097p;
    }

    /* renamed from: b */
    public final String mo41843b() {
        return this.f43085d;
    }

    /* renamed from: d */
    public final String mo41844d() {
        return this.f43096o;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo41846e() {
        return this.f43092k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersProgressListItemUiModel)) {
            return false;
        }
        OffersProgressListItemUiModel offersProgressListItemUiModel = (OffersProgressListItemUiModel) obj;
        return C41536l.m120484d(this.f43085d, offersProgressListItemUiModel.f43085d) && C41536l.m120484d(this.f43086e, offersProgressListItemUiModel.f43086e) && C41536l.m120484d(this.f43087f, offersProgressListItemUiModel.f43087f) && C41536l.m120484d(this.f43088g, offersProgressListItemUiModel.f43088g) && C41536l.m120484d(this.f43089h, offersProgressListItemUiModel.f43089h) && C41536l.m120484d(this.f43090i, offersProgressListItemUiModel.f43090i) && C41536l.m120484d(this.f43091j, offersProgressListItemUiModel.f43091j) && C41536l.m120484d(this.f43092k, offersProgressListItemUiModel.f43092k) && C41536l.m120484d(this.f43093l, offersProgressListItemUiModel.f43093l) && C41536l.m120484d(this.f43094m, offersProgressListItemUiModel.f43094m) && C41536l.m120484d(this.f43095n, offersProgressListItemUiModel.f43095n) && C41536l.m120484d(this.f43096o, offersProgressListItemUiModel.f43096o) && C41536l.m120484d(this.f43097p, offersProgressListItemUiModel.f43097p);
    }

    /* renamed from: f */
    public final List mo41848f() {
        return this.f43094m;
    }

    /* renamed from: g */
    public final List mo41849g() {
        return this.f43093l;
    }

    /* renamed from: h */
    public final String mo41850h() {
        return this.f43090i;
    }

    public int hashCode() {
        int hashCode = this.f43085d.hashCode() * 31;
        String str = this.f43086e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f43087f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f43088g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f43089h;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f43090i;
        int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f43091j.hashCode()) * 31;
        String str5 = this.f43092k;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f43093l;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f43094m;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TimerViewData timerViewData = this.f43095n;
        int hashCode10 = (hashCode9 + (timerViewData == null ? 0 : timerViewData.hashCode())) * 31;
        String str6 = this.f43096o;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f43097p;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode11 + i;
    }

    /* renamed from: i */
    public final Integer mo41852i() {
        return this.f43089h;
    }

    /* renamed from: j */
    public final TextProgressBarView.ProgressModel.Progress mo41853j() {
        return this.f43091j;
    }

    /* renamed from: k */
    public final String mo41854k() {
        return this.f43086e;
    }

    /* renamed from: l */
    public final TimerViewData mo41855l() {
        return this.f43095n;
    }

    public String toString() {
        String str = this.f43085d;
        String str2 = this.f43086e;
        String str3 = this.f43087f;
        String str4 = this.f43088g;
        Integer num = this.f43089h;
        String str5 = this.f43090i;
        TextProgressBarView.ProgressModel.Progress progress = this.f43091j;
        String str6 = this.f43092k;
        List list = this.f43093l;
        List list2 = this.f43094m;
        TimerViewData timerViewData = this.f43095n;
        String str7 = this.f43096o;
        String str8 = this.f43097p;
        return "OffersProgressListItemUiModel(benefType=" + str + ", templateDesc=" + str2 + ", valueType=" + str3 + ", clientStatus=" + str4 + ", ofrId=" + num + ", offerDetailDesc=" + str5 + ", progress=" + progress + ", infoTitle=" + str6 + ", merchantsList=" + list + ", merchants=" + list2 + ", timer=" + timerViewData + ", benefValue=" + str7 + ", benefBadge=" + str8 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f43085d);
        parcel.writeString(this.f43086e);
        parcel.writeString(this.f43087f);
        parcel.writeString(this.f43088g);
        Integer num = this.f43089h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f43090i);
        parcel.writeParcelable(this.f43091j, i);
        parcel.writeString(this.f43092k);
        parcel.writeStringList(this.f43093l);
        List<Parcelable> list = this.f43094m;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeParcelable(this.f43095n, i);
        parcel.writeString(this.f43096o);
        parcel.writeString(this.f43097p);
    }
}
