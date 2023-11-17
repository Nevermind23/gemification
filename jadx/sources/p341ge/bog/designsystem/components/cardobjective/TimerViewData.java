package p341ge.bog.designsystem.components.cardobjective;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p631uj.C18174a;

/* renamed from: ge.bog.designsystem.components.cardobjective.TimerViewData */
public final class TimerViewData implements Parcelable {
    public static final Parcelable.Creator<TimerViewData> CREATOR = new C13216a();

    /* renamed from: d */
    private final String f39000d;

    /* renamed from: e */
    private final C18174a f39001e;

    /* renamed from: ge.bog.designsystem.components.cardobjective.TimerViewData$a */
    public static final class C13216a implements Parcelable.Creator {
        /* renamed from: a */
        public final TimerViewData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new TimerViewData(parcel.readString(), C18174a.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final TimerViewData[] newArray(int i) {
            return new TimerViewData[i];
        }
    }

    public TimerViewData(String str, C18174a aVar) {
        C41536l.m120489i(str, "timerText");
        C41536l.m120489i(aVar, "timerState");
        this.f39000d = str;
        this.f39001e = aVar;
    }

    /* renamed from: a */
    public final C18174a mo35098a() {
        return this.f39001e;
    }

    /* renamed from: b */
    public final String mo35099b() {
        return this.f39000d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimerViewData)) {
            return false;
        }
        TimerViewData timerViewData = (TimerViewData) obj;
        return C41536l.m120484d(this.f39000d, timerViewData.f39000d) && this.f39001e == timerViewData.f39001e;
    }

    public int hashCode() {
        return (this.f39000d.hashCode() * 31) + this.f39001e.hashCode();
    }

    public String toString() {
        String str = this.f39000d;
        C18174a aVar = this.f39001e;
        return "TimerViewData(timerText=" + str + ", timerState=" + aVar + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f39000d);
        parcel.writeString(this.f39001e.name());
    }
}
