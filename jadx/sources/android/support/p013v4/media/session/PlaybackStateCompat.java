package android.support.p013v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0123a();

    /* renamed from: d */
    final int f977d;

    /* renamed from: e */
    final long f978e;

    /* renamed from: f */
    final long f979f;

    /* renamed from: g */
    final float f980g;

    /* renamed from: h */
    final long f981h;

    /* renamed from: i */
    final int f982i;

    /* renamed from: j */
    final CharSequence f983j;

    /* renamed from: k */
    final long f984k;

    /* renamed from: l */
    List f985l;

    /* renamed from: m */
    final long f986m;

    /* renamed from: n */
    final Bundle f987n;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0122a();

        /* renamed from: d */
        private final String f988d;

        /* renamed from: e */
        private final CharSequence f989e;

        /* renamed from: f */
        private final int f990f;

        /* renamed from: g */
        private final Bundle f991g;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0122a implements Parcelable.Creator {
            C0122a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f988d = parcel.readString();
            this.f989e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f990f = parcel.readInt();
            this.f991g = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f989e + ", mIcon=" + this.f990f + ", mExtras=" + this.f991g;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f988d);
            TextUtils.writeToParcel(this.f989e, parcel, i);
            parcel.writeInt(this.f990f);
            parcel.writeBundle(this.f991g);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0123a implements Parcelable.Creator {
        C0123a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f977d = parcel.readInt();
        this.f978e = parcel.readLong();
        this.f980g = parcel.readFloat();
        this.f984k = parcel.readLong();
        this.f979f = parcel.readLong();
        this.f981h = parcel.readLong();
        this.f983j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f985l = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f986m = parcel.readLong();
        this.f987n = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f982i = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f977d + ", position=" + this.f978e + ", buffered position=" + this.f979f + ", speed=" + this.f980g + ", updated=" + this.f984k + ", actions=" + this.f981h + ", error code=" + this.f982i + ", error message=" + this.f983j + ", custom actions=" + this.f985l + ", active item id=" + this.f986m + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f977d);
        parcel.writeLong(this.f978e);
        parcel.writeFloat(this.f980g);
        parcel.writeLong(this.f984k);
        parcel.writeLong(this.f979f);
        parcel.writeLong(this.f981h);
        TextUtils.writeToParcel(this.f983j, parcel, i);
        parcel.writeTypedList(this.f985l);
        parcel.writeLong(this.f986m);
        parcel.writeBundle(this.f987n);
        parcel.writeInt(this.f982i);
    }
}
