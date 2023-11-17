package p341ge.bog.mobilebank.deposits.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.shared.helper.ImageSource;

/* renamed from: ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel */
public final class SavingGoalUiModel implements Parcelable {
    public static final Parcelable.Creator<SavingGoalUiModel> CREATOR = new C23181a();

    /* renamed from: d */
    private final ImageSource f60703d;

    /* renamed from: e */
    private final long f60704e;

    /* renamed from: f */
    private final Long f60705f;

    /* renamed from: g */
    private final String f60706g;

    /* renamed from: h */
    private final String f60707h;

    /* renamed from: i */
    private final String f60708i;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel$a */
    public static final class C23181a implements Parcelable.Creator {
        /* renamed from: a */
        public final SavingGoalUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SavingGoalUiModel((ImageSource) parcel.readParcelable(SavingGoalUiModel.class.getClassLoader()), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final SavingGoalUiModel[] newArray(int i) {
            return new SavingGoalUiModel[i];
        }
    }

    public SavingGoalUiModel(ImageSource imageSource, long j, Long l, String str, String str2, String str3) {
        C41536l.m120489i(imageSource, "icon");
        C41536l.m120489i(str, "lookupName");
        C41536l.m120489i(str2, "lookupValue");
        C41536l.m120489i(str3, "dictionaryKey");
        this.f60703d = imageSource;
        this.f60704e = j;
        this.f60705f = l;
        this.f60706g = str;
        this.f60707h = str2;
        this.f60708i = str3;
    }

    /* renamed from: a */
    public final String mo57863a() {
        return this.f60708i;
    }

    /* renamed from: b */
    public final ImageSource mo57864b() {
        return this.f60703d;
    }

    /* renamed from: d */
    public final long mo57865d() {
        return this.f60704e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingGoalUiModel)) {
            return false;
        }
        SavingGoalUiModel savingGoalUiModel = (SavingGoalUiModel) obj;
        return C41536l.m120484d(this.f60703d, savingGoalUiModel.f60703d) && this.f60704e == savingGoalUiModel.f60704e && C41536l.m120484d(this.f60705f, savingGoalUiModel.f60705f) && C41536l.m120484d(this.f60706g, savingGoalUiModel.f60706g) && C41536l.m120484d(this.f60707h, savingGoalUiModel.f60707h) && C41536l.m120484d(this.f60708i, savingGoalUiModel.f60708i);
    }

    public int hashCode() {
        int hashCode = ((this.f60703d.hashCode() * 31) + C7397t.m28148a(this.f60704e)) * 31;
        Long l = this.f60705f;
        return ((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.f60706g.hashCode()) * 31) + this.f60707h.hashCode()) * 31) + this.f60708i.hashCode();
    }

    public String toString() {
        ImageSource imageSource = this.f60703d;
        long j = this.f60704e;
        Long l = this.f60705f;
        String str = this.f60706g;
        String str2 = this.f60707h;
        String str3 = this.f60708i;
        return "SavingGoalUiModel(icon=" + imageSource + ", savingGoalId=" + j + ", id=" + l + ", lookupName=" + str + ", lookupValue=" + str2 + ", dictionaryKey=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeParcelable(this.f60703d, i);
        parcel.writeLong(this.f60704e);
        Long l = this.f60705f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f60706g);
        parcel.writeString(this.f60707h);
        parcel.writeString(this.f60708i);
    }
}
