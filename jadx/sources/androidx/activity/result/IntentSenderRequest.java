package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0170a();

    /* renamed from: d */
    private final IntentSender f1068d;

    /* renamed from: e */
    private final Intent f1069e;

    /* renamed from: f */
    private final int f1070f;

    /* renamed from: g */
    private final int f1071g;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    class C0170a implements Parcelable.Creator {
        C0170a() {
        }

        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    public static final class C0171b {

        /* renamed from: a */
        private IntentSender f1072a;

        /* renamed from: b */
        private Intent f1073b;

        /* renamed from: c */
        private int f1074c;

        /* renamed from: d */
        private int f1075d;

        public C0171b(IntentSender intentSender) {
            this.f1072a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest mo400a() {
            return new IntentSenderRequest(this.f1072a, this.f1073b, this.f1074c, this.f1075d);
        }

        /* renamed from: b */
        public C0171b mo401b(Intent intent) {
            this.f1073b = intent;
            return this;
        }

        /* renamed from: c */
        public C0171b mo402c(int i, int i2) {
            this.f1075d = i;
            this.f1074c = i2;
            return this;
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f1068d = intentSender;
        this.f1069e = intent;
        this.f1070f = i;
        this.f1071g = i2;
    }

    /* renamed from: a */
    public Intent mo390a() {
        return this.f1069e;
    }

    /* renamed from: b */
    public int mo391b() {
        return this.f1070f;
    }

    /* renamed from: d */
    public int mo392d() {
        return this.f1071g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public IntentSender mo394e() {
        return this.f1068d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1068d, i);
        parcel.writeParcelable(this.f1069e, i);
        parcel.writeInt(this.f1070f);
        parcel.writeInt(this.f1071g);
    }

    IntentSenderRequest(Parcel parcel) {
        this.f1068d = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f1069e = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f1070f = parcel.readInt();
        this.f1071g = parcel.readInt();
    }
}
