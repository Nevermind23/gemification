package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import p182n6.C7258g;
import p195o6.C7461a;

public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C3955c();

    /* renamed from: d */
    final int f12594d;

    /* renamed from: e */
    private final Uri f12595e;

    /* renamed from: f */
    private final int f12596f;

    /* renamed from: g */
    private final int f12597g;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f12594d = i;
        this.f12595e = uri;
        this.f12596f = i2;
        this.f12597g = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (C7258g.m27880a(this.f12595e, webImage.f12595e) && this.f12596f == webImage.f12596f && this.f12597g == webImage.f12597g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int getHeight() {
        return this.f12597g;
    }

    public int getWidth() {
        return this.f12596f;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12595e, Integer.valueOf(this.f12596f), Integer.valueOf(this.f12597g));
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f12596f), Integer.valueOf(this.f12597g), this.f12595e.toString()});
    }

    /* renamed from: v */
    public Uri mo12183v() {
        return this.f12595e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12594d);
        C7461a.m28390v(parcel, 2, mo12183v(), i, false);
        C7461a.m28383o(parcel, 3, getWidth());
        C7461a.m28383o(parcel, 4, getHeight());
        C7461a.m28370b(parcel, a);
    }
}
