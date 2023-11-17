package p341ge.bog.mobilebank.shared.helper;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.shared.helper.ImageSource */
public abstract class ImageSource implements Parcelable {

    /* renamed from: ge.bog.mobilebank.shared.helper.ImageSource$Resource */
    public static final class Resource extends ImageSource {
        public static final Parcelable.Creator<Resource> CREATOR = new C34639a();

        /* renamed from: d */
        private final int f83733d;

        /* renamed from: ge.bog.mobilebank.shared.helper.ImageSource$Resource$a */
        public static final class C34639a implements Parcelable.Creator {
            /* renamed from: a */
            public final Resource createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Resource(parcel.readInt());
            }

            /* renamed from: b */
            public final Resource[] newArray(int i) {
                return new Resource[i];
            }
        }

        public Resource(int i) {
            super((DefaultConstructorMarker) null);
            this.f83733d = i;
        }

        /* renamed from: a */
        public final int mo84372a() {
            return this.f83733d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resource) && this.f83733d == ((Resource) obj).f83733d;
        }

        public int hashCode() {
            return this.f83733d;
        }

        public String toString() {
            int i = this.f83733d;
            return "Resource(resId=" + i + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f83733d);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.helper.ImageSource$Url */
    public static final class Url extends ImageSource {
        public static final Parcelable.Creator<Url> CREATOR = new C34640a();

        /* renamed from: d */
        private final String f83734d;

        /* renamed from: e */
        private final Integer f83735e;

        /* renamed from: f */
        private final Integer f83736f;

        /* renamed from: ge.bog.mobilebank.shared.helper.ImageSource$Url$a */
        public static final class C34640a implements Parcelable.Creator {
            /* renamed from: a */
            public final Url createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                Integer num = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new Url(readString, valueOf, num);
            }

            /* renamed from: b */
            public final Url[] newArray(int i) {
                return new Url[i];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Url(java.lang.String r1, java.lang.Integer r2, java.lang.Integer r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto L_0x0005
                r2 = 0
            L_0x0005:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x000a
                r3 = r2
            L_0x000a:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared.helper.ImageSource.Url.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: a */
        public final Integer mo84382a() {
            return this.f83736f;
        }

        /* renamed from: b */
        public final Integer mo84383b() {
            return this.f83735e;
        }

        /* renamed from: d */
        public final String mo84384d() {
            return this.f83734d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return C41536l.m120484d(this.f83734d, url.f83734d) && C41536l.m120484d(this.f83735e, url.f83735e) && C41536l.m120484d(this.f83736f, url.f83736f);
        }

        public int hashCode() {
            int hashCode = this.f83734d.hashCode() * 31;
            Integer num = this.f83735e;
            int i = 0;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f83736f;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.f83734d;
            Integer num = this.f83735e;
            Integer num2 = this.f83736f;
            return "Url(url=" + str + ", placeHolder=" + num + ", error=" + num2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f83734d);
            Integer num = this.f83735e;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.f83736f;
            if (num2 == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Url(String str, Integer num, Integer num2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f83734d = str;
            this.f83735e = num;
            this.f83736f = num2;
        }
    }

    private ImageSource() {
    }

    public /* synthetic */ ImageSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
