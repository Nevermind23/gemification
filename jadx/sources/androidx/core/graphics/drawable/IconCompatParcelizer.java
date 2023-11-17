package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3470a = versionedParcel.mo6454p(iconCompat.f3470a, 1);
        iconCompat.f3472c = versionedParcel.mo6448j(iconCompat.f3472c, 2);
        iconCompat.f3473d = versionedParcel.mo6456r(iconCompat.f3473d, 3);
        iconCompat.f3474e = versionedParcel.mo6454p(iconCompat.f3474e, 4);
        iconCompat.f3475f = versionedParcel.mo6454p(iconCompat.f3475f, 5);
        iconCompat.f3476g = (ColorStateList) versionedParcel.mo6456r(iconCompat.f3476g, 6);
        iconCompat.f3478i = versionedParcel.mo6458t(iconCompat.f3478i, 7);
        iconCompat.f3479j = versionedParcel.mo6458t(iconCompat.f3479j, 8);
        iconCompat.mo3306j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo6462x(true, true);
        iconCompat.mo3307k(versionedParcel.mo6444f());
        int i = iconCompat.f3470a;
        if (-1 != i) {
            versionedParcel.mo6434F(i, 1);
        }
        byte[] bArr = iconCompat.f3472c;
        if (bArr != null) {
            versionedParcel.mo6430B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3473d;
        if (parcelable != null) {
            versionedParcel.mo6436H(parcelable, 3);
        }
        int i2 = iconCompat.f3474e;
        if (i2 != 0) {
            versionedParcel.mo6434F(i2, 4);
        }
        int i3 = iconCompat.f3475f;
        if (i3 != 0) {
            versionedParcel.mo6434F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3476g;
        if (colorStateList != null) {
            versionedParcel.mo6436H(colorStateList, 6);
        }
        String str = iconCompat.f3478i;
        if (str != null) {
            versionedParcel.mo6438J(str, 7);
        }
        String str2 = iconCompat.f3479j;
        if (str2 != null) {
            versionedParcel.mo6438J(str2, 8);
        }
    }
}
