package android.support.p013v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0113a;
import android.support.p013v4.media.C0115b;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0109a();

    /* renamed from: d */
    private final String f941d;

    /* renamed from: e */
    private final CharSequence f942e;

    /* renamed from: f */
    private final CharSequence f943f;

    /* renamed from: g */
    private final CharSequence f944g;

    /* renamed from: h */
    private final Bitmap f945h;

    /* renamed from: i */
    private final Uri f946i;

    /* renamed from: j */
    private final Bundle f947j;

    /* renamed from: k */
    private final Uri f948k;

    /* renamed from: l */
    private Object f949l;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0109a implements Parcelable.Creator {
        C0109a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m316a(C0113a.m333a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0110b {

        /* renamed from: a */
        private String f950a;

        /* renamed from: b */
        private CharSequence f951b;

        /* renamed from: c */
        private CharSequence f952c;

        /* renamed from: d */
        private CharSequence f953d;

        /* renamed from: e */
        private Bitmap f954e;

        /* renamed from: f */
        private Uri f955f;

        /* renamed from: g */
        private Bundle f956g;

        /* renamed from: h */
        private Uri f957h;

        /* renamed from: a */
        public MediaDescriptionCompat mo205a() {
            return new MediaDescriptionCompat(this.f950a, this.f951b, this.f952c, this.f953d, this.f954e, this.f955f, this.f956g, this.f957h);
        }

        /* renamed from: b */
        public C0110b mo206b(CharSequence charSequence) {
            this.f953d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0110b mo207c(Bundle bundle) {
            this.f956g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0110b mo208d(Bitmap bitmap) {
            this.f954e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0110b mo209e(Uri uri) {
            this.f955f = uri;
            return this;
        }

        /* renamed from: f */
        public C0110b mo210f(String str) {
            this.f950a = str;
            return this;
        }

        /* renamed from: g */
        public C0110b mo211g(Uri uri) {
            this.f957h = uri;
            return this;
        }

        /* renamed from: h */
        public C0110b mo212h(CharSequence charSequence) {
            this.f952c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0110b mo213i(CharSequence charSequence) {
            this.f951b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f941d = str;
        this.f942e = charSequence;
        this.f943f = charSequence2;
        this.f944g = charSequence3;
        this.f945h = bitmap;
        this.f946i = uri;
        this.f947j = bundle;
        this.f948k = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p013v4.media.MediaDescriptionCompat m316a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0074
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.p013v4.media.C0113a.m338f(r8)
            r1.mo210f(r2)
            java.lang.CharSequence r2 = android.support.p013v4.media.C0113a.m340h(r8)
            r1.mo213i(r2)
            java.lang.CharSequence r2 = android.support.p013v4.media.C0113a.m339g(r8)
            r1.mo212h(r2)
            java.lang.CharSequence r2 = android.support.p013v4.media.C0113a.m334b(r8)
            r1.mo206b(r2)
            android.graphics.Bitmap r2 = android.support.p013v4.media.C0113a.m336d(r8)
            r1.mo208d(r2)
            android.net.Uri r2 = android.support.p013v4.media.C0113a.m337e(r8)
            r1.mo209e(r2)
            android.os.Bundle r2 = android.support.p013v4.media.C0113a.m335c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0044
            android.support.p013v4.media.session.MediaSessionCompat.m353a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 == 0) goto L_0x005d
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0057
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x0057
            goto L_0x005e
        L_0x0057:
            r2.remove(r3)
            r2.remove(r5)
        L_0x005d:
            r0 = r2
        L_0x005e:
            r1.mo207c(r0)
            if (r4 == 0) goto L_0x0067
            r1.mo211g(r4)
            goto L_0x006e
        L_0x0067:
            android.net.Uri r0 = android.support.p013v4.media.C0115b.m351a(r8)
            r1.mo211g(r0)
        L_0x006e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo205a()
            r0.f949l = r8
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p013v4.media.MediaDescriptionCompat.m316a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object mo197b() {
        Object obj = this.f949l;
        if (obj != null) {
            return obj;
        }
        Object b = C0113a.C0114a.m343b();
        C0113a.C0114a.m348g(b, this.f941d);
        C0113a.C0114a.m350i(b, this.f942e);
        C0113a.C0114a.m349h(b, this.f943f);
        C0113a.C0114a.m344c(b, this.f944g);
        C0113a.C0114a.m346e(b, this.f945h);
        C0113a.C0114a.m347f(b, this.f946i);
        C0113a.C0114a.m345d(b, this.f947j);
        C0115b.C0116a.m352a(b, this.f948k);
        Object a = C0113a.C0114a.m342a(b);
        this.f949l = a;
        return a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f942e + ", " + this.f943f + ", " + this.f944g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0113a.m341i(mo197b(), parcel, i);
    }
}
