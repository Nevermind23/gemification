package android.support.p013v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0121a();

    /* renamed from: d */
    public int f972d;

    /* renamed from: e */
    public int f973e;

    /* renamed from: f */
    public int f974f;

    /* renamed from: g */
    public int f975g;

    /* renamed from: h */
    public int f976h;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0121a implements Parcelable.Creator {
        C0121a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f972d = parcel.readInt();
        this.f974f = parcel.readInt();
        this.f975g = parcel.readInt();
        this.f976h = parcel.readInt();
        this.f973e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f972d);
        parcel.writeInt(this.f974f);
        parcel.writeInt(this.f975g);
        parcel.writeInt(this.f976h);
        parcel.writeInt(this.f973e);
    }
}
