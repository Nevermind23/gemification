package android.support.p013v4.p014os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.p014os.C0129a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0126a();

    /* renamed from: d */
    final boolean f992d = false;

    /* renamed from: e */
    final Handler f993e = null;

    /* renamed from: f */
    C0129a f994f;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0126a implements Parcelable.Creator {
        C0126a() {
        }

        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0127b extends C0129a.C0130a {
        C0127b() {
        }

        /* renamed from: e1 */
        public void mo275e1(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f993e;
            if (handler != null) {
                handler.post(new C0128c(i, bundle));
            } else {
                resultReceiver.mo189a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    class C0128c implements Runnable {

        /* renamed from: d */
        final int f996d;

        /* renamed from: e */
        final Bundle f997e;

        C0128c(int i, Bundle bundle) {
            this.f996d = i;
            this.f997e = bundle;
        }

        public void run() {
            ResultReceiver.this.mo189a(this.f996d, this.f997e);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f994f = C0129a.C0130a.m372k(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo189a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f994f == null) {
                this.f994f = new C0127b();
            }
            parcel.writeStrongBinder(this.f994f.asBinder());
        }
    }
}
