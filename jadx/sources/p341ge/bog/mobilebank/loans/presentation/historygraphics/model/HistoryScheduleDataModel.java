package p341ge.bog.mobilebank.loans.presentation.historygraphics.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs0.C31181a;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel */
public final class HistoryScheduleDataModel implements Parcelable {
    public static final Parcelable.Creator<HistoryScheduleDataModel> CREATOR = new C32675a();

    /* renamed from: d */
    private final long f80427d;

    /* renamed from: e */
    private final C31181a f80428e;

    /* renamed from: f */
    private final String f80429f;

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel$a */
    public static final class C32675a implements Parcelable.Creator {
        /* renamed from: a */
        public final HistoryScheduleDataModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new HistoryScheduleDataModel(parcel.readLong(), C31181a.valueOf(parcel.readString()), parcel.readString());
        }

        /* renamed from: b */
        public final HistoryScheduleDataModel[] newArray(int i) {
            return new HistoryScheduleDataModel[i];
        }
    }

    public HistoryScheduleDataModel(long j, C31181a aVar, String str) {
        C41536l.m120489i(aVar, "type");
        C41536l.m120489i(str, "loanName");
        this.f80427d = j;
        this.f80428e = aVar;
        this.f80429f = str;
    }

    /* renamed from: a */
    public final long mo74280a() {
        return this.f80427d;
    }

    /* renamed from: b */
    public final String mo74281b() {
        return this.f80429f;
    }

    /* renamed from: d */
    public final C31181a mo74282d() {
        return this.f80428e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryScheduleDataModel)) {
            return false;
        }
        HistoryScheduleDataModel historyScheduleDataModel = (HistoryScheduleDataModel) obj;
        return this.f80427d == historyScheduleDataModel.f80427d && this.f80428e == historyScheduleDataModel.f80428e && C41536l.m120484d(this.f80429f, historyScheduleDataModel.f80429f);
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f80427d) * 31) + this.f80428e.hashCode()) * 31) + this.f80429f.hashCode();
    }

    public String toString() {
        long j = this.f80427d;
        C31181a aVar = this.f80428e;
        String str = this.f80429f;
        return "HistoryScheduleDataModel(loanKey=" + j + ", type=" + aVar + ", loanName=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f80427d);
        parcel.writeString(this.f80428e.name());
        parcel.writeString(this.f80429f);
    }
}
