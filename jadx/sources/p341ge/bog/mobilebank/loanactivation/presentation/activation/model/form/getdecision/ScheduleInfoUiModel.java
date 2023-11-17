package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.ScheduleInfoUiModel */
public final class ScheduleInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<ScheduleInfoUiModel> CREATOR = new C32485a();

    /* renamed from: d */
    private final String f80052d;

    /* renamed from: e */
    private final String f80053e;

    /* renamed from: f */
    private final String f80054f;

    /* renamed from: g */
    private final String f80055g;

    /* renamed from: h */
    private final String f80056h;

    /* renamed from: i */
    private final String f80057i;

    /* renamed from: j */
    private final String f80058j;

    /* renamed from: k */
    private final String f80059k;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.ScheduleInfoUiModel$a */
    public static final class C32485a implements Parcelable.Creator {
        /* renamed from: a */
        public final ScheduleInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ScheduleInfoUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ScheduleInfoUiModel[] newArray(int i) {
            return new ScheduleInfoUiModel[i];
        }
    }

    public ScheduleInfoUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f80052d = str;
        this.f80053e = str2;
        this.f80054f = str3;
        this.f80055g = str4;
        this.f80056h = str5;
        this.f80057i = str6;
        this.f80058j = str7;
        this.f80059k = str8;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleInfoUiModel)) {
            return false;
        }
        ScheduleInfoUiModel scheduleInfoUiModel = (ScheduleInfoUiModel) obj;
        return C41536l.m120484d(this.f80052d, scheduleInfoUiModel.f80052d) && C41536l.m120484d(this.f80053e, scheduleInfoUiModel.f80053e) && C41536l.m120484d(this.f80054f, scheduleInfoUiModel.f80054f) && C41536l.m120484d(this.f80055g, scheduleInfoUiModel.f80055g) && C41536l.m120484d(this.f80056h, scheduleInfoUiModel.f80056h) && C41536l.m120484d(this.f80057i, scheduleInfoUiModel.f80057i) && C41536l.m120484d(this.f80058j, scheduleInfoUiModel.f80058j) && C41536l.m120484d(this.f80059k, scheduleInfoUiModel.f80059k);
    }

    public int hashCode() {
        String str = this.f80052d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f80053e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80054f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f80055g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f80056h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f80057i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f80058j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f80059k;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.f80052d;
        String str2 = this.f80053e;
        String str3 = this.f80054f;
        String str4 = this.f80055g;
        String str5 = this.f80056h;
        String str6 = this.f80057i;
        String str7 = this.f80058j;
        String str8 = this.f80059k;
        return "ScheduleInfoUiModel(ccy=" + str + ", comAmount=" + str2 + ", insAmount=" + str3 + ", intAmount=" + str4 + ", outAmount=" + str5 + ", payDate=" + str6 + ", priAmount=" + str7 + ", sumAmount=" + str8 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80052d);
        parcel.writeString(this.f80053e);
        parcel.writeString(this.f80054f);
        parcel.writeString(this.f80055g);
        parcel.writeString(this.f80056h);
        parcel.writeString(this.f80057i);
        parcel.writeString(this.f80058j);
        parcel.writeString(this.f80059k);
    }
}
