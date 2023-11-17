package android.support.p013v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0112a();

    /* renamed from: d */
    private final int f963d;

    /* renamed from: e */
    private final float f964e;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0112a implements Parcelable.Creator {
        C0112a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f963d = i;
        this.f964e = f;
    }

    public int describeContents() {
        return this.f963d;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f963d);
        sb.append(" rating=");
        float f = this.f964e;
        if (f < Utils.FLOAT_EPSILON) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f963d);
        parcel.writeFloat(this.f964e);
    }
}
