package p341ge.bog.designsystem.components.gyroanimation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: ge.bog.designsystem.components.gyroanimation.GyroAnimationFrame */
public final class GyroAnimationFrame implements Parcelable {
    public static final Parcelable.Creator<GyroAnimationFrame> CREATOR = new C13334a();

    /* renamed from: d */
    private final Image f39525d;

    /* renamed from: e */
    private final int f39526e;

    /* renamed from: f */
    private final int f39527f;

    /* renamed from: g */
    private final int f39528g;

    /* renamed from: h */
    private final int f39529h;

    /* renamed from: ge.bog.designsystem.components.gyroanimation.GyroAnimationFrame$a */
    public static final class C13334a implements Parcelable.Creator {
        /* renamed from: a */
        public final GyroAnimationFrame createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new GyroAnimationFrame((Image) parcel.readParcelable(GyroAnimationFrame.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final GyroAnimationFrame[] newArray(int i) {
            return new GyroAnimationFrame[i];
        }
    }

    public GyroAnimationFrame(Image image, int i, int i2, int i3, int i4) {
        C41536l.m120489i(image, "image");
        this.f39525d = image;
        this.f39526e = i;
        this.f39527f = i2;
        this.f39528g = i3;
        this.f39529h = i4;
    }

    /* renamed from: a */
    public final Image mo35766a() {
        return this.f39525d;
    }

    /* renamed from: b */
    public final int mo35767b() {
        return this.f39528g;
    }

    /* renamed from: d */
    public final int mo35768d() {
        return this.f39529h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo35770e() {
        return this.f39526e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GyroAnimationFrame)) {
            return false;
        }
        GyroAnimationFrame gyroAnimationFrame = (GyroAnimationFrame) obj;
        return C41536l.m120484d(this.f39525d, gyroAnimationFrame.f39525d) && this.f39526e == gyroAnimationFrame.f39526e && this.f39527f == gyroAnimationFrame.f39527f && this.f39528g == gyroAnimationFrame.f39528g && this.f39529h == gyroAnimationFrame.f39529h;
    }

    /* renamed from: f */
    public final int mo35772f() {
        return this.f39527f;
    }

    public int hashCode() {
        return (((((((this.f39525d.hashCode() * 31) + this.f39526e) * 31) + this.f39527f) * 31) + this.f39528g) * 31) + this.f39529h;
    }

    public String toString() {
        Image image = this.f39525d;
        int i = this.f39526e;
        int i2 = this.f39527f;
        int i3 = this.f39528g;
        int i4 = this.f39529h;
        return "GyroAnimationFrame(image=" + image + ", minPixelX=" + i + ", minPixelY=" + i2 + ", maxPixelX=" + i3 + ", maxPixelY=" + i4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeParcelable(this.f39525d, i);
        parcel.writeInt(this.f39526e);
        parcel.writeInt(this.f39527f);
        parcel.writeInt(this.f39528g);
        parcel.writeInt(this.f39529h);
    }
}
