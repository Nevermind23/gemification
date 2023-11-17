package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0164a();

    /* renamed from: d */
    private final int f1044d;

    /* renamed from: e */
    private final Intent f1045e;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    class C0164a implements Parcelable.Creator {
        C0164a() {
        }

        /* renamed from: a */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        /* renamed from: b */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f1044d = i;
        this.f1045e = intent;
    }

    /* renamed from: d */
    public static String m422d(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent mo370a() {
        return this.f1045e;
    }

    /* renamed from: b */
    public int mo371b() {
        return this.f1044d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m422d(this.f1044d) + ", data=" + this.f1045e + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f1044d);
        if (this.f1045e == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.f1045e;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f1044d = parcel.readInt();
        this.f1045e = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
