package android.support.p013v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0108a();

    /* renamed from: d */
    private final int f939d;

    /* renamed from: e */
    private final MediaDescriptionCompat f940e;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    static class C0108a implements Parcelable.Creator {
        C0108a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f939d = parcel.readInt();
        this.f940e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f939d + ", mDescription=" + this.f940e + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f939d);
        this.f940e.writeToParcel(parcel, i);
    }
}
