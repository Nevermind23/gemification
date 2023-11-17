package p341ge.bog.sso_client.models;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sso.type.StrongAuthMethod;

/* renamed from: ge.bog.sso_client.models.RelatedCompany */
public final class RelatedCompany implements Parcelable {
    public static final Parcelable.Creator<RelatedCompany> CREATOR = new C35928a();

    /* renamed from: d */
    private final String f86899d;

    /* renamed from: e */
    private final String f86900e;

    /* renamed from: f */
    private final String f86901f;

    /* renamed from: g */
    private final Boolean f86902g;

    /* renamed from: h */
    private final StrongAuthMethod f86903h;

    /* renamed from: i */
    private transient SoftReference f86904i;

    /* renamed from: ge.bog.sso_client.models.RelatedCompany$a */
    public static final class C35928a implements Parcelable.Creator {
        /* renamed from: a */
        public final RelatedCompany createFromParcel(Parcel parcel) {
            Boolean bool;
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RelatedCompany(readString, readString2, readString3, bool, parcel.readInt() == 0 ? null : StrongAuthMethod.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final RelatedCompany[] newArray(int i) {
            return new RelatedCompany[i];
        }
    }

    public RelatedCompany() {
        this((String) null, (String) null, (String) null, (Boolean) null, (StrongAuthMethod) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final Bitmap mo88299a() {
        if (this.f86904i == null) {
            byte[] decode = Base64.decode(this.f86901f, 0);
            this.f86904i = new SoftReference(BitmapFactory.decodeByteArray(decode, 0, decode.length));
        }
        SoftReference softReference = this.f86904i;
        if (softReference != null) {
            return (Bitmap) softReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final String mo88300b() {
        return this.f86899d;
    }

    /* renamed from: d */
    public final String mo88301d() {
        return this.f86900e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final StrongAuthMethod mo88303e() {
        return this.f86903h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedCompany)) {
            return false;
        }
        RelatedCompany relatedCompany = (RelatedCompany) obj;
        return C41536l.m120484d(this.f86899d, relatedCompany.f86899d) && C41536l.m120484d(this.f86900e, relatedCompany.f86900e) && C41536l.m120484d(this.f86901f, relatedCompany.f86901f) && C41536l.m120484d(this.f86902g, relatedCompany.f86902g) && this.f86903h == relatedCompany.f86903h;
    }

    /* renamed from: f */
    public final Boolean mo88305f() {
        return this.f86902g;
    }

    public int hashCode() {
        String str = this.f86899d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86900e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86901f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f86902g;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        StrongAuthMethod strongAuthMethod = this.f86903h;
        if (strongAuthMethod != null) {
            i = strongAuthMethod.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "RelatedCompany(clientKey=" + this.f86899d + ", clientName=" + this.f86900e + ", clientIcon=" + this.f86901f + ", isStrongAuthRequired=" + this.f86902g + ", strongAuthMethod=" + this.f86903h + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f86899d);
        parcel.writeString(this.f86900e);
        parcel.writeString(this.f86901f);
        Boolean bool = this.f86902g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        StrongAuthMethod strongAuthMethod = this.f86903h;
        if (strongAuthMethod == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(strongAuthMethod.name());
    }

    public RelatedCompany(String str, String str2, String str3, Boolean bool, StrongAuthMethod strongAuthMethod) {
        this.f86899d = str;
        this.f86900e = str2;
        this.f86901f = str3;
        this.f86902g = bool;
        this.f86903h = strongAuthMethod;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RelatedCompany(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Boolean r8, sso.type.StrongAuthMethod r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.sso_client.models.RelatedCompany.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, sso.type.StrongAuthMethod, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
