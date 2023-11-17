package p341ge.bog.sso_client.onboarding.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.sso_client.onboarding.model.StringSource */
public abstract class StringSource implements Parcelable {

    /* renamed from: ge.bog.sso_client.onboarding.model.StringSource$Dictionary */
    public static final class Dictionary extends StringSource {
        public static final Parcelable.Creator<Dictionary> CREATOR = new C35987a();

        /* renamed from: d */
        private final String f87072d;

        /* renamed from: ge.bog.sso_client.onboarding.model.StringSource$Dictionary$a */
        public static final class C35987a implements Parcelable.Creator {
            /* renamed from: a */
            public final Dictionary createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Dictionary(parcel.readString());
            }

            /* renamed from: b */
            public final Dictionary[] newArray(int i) {
                return new Dictionary[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Dictionary(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "key");
            this.f87072d = str;
        }

        /* renamed from: a */
        public final String mo88661a() {
            return this.f87072d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dictionary) && C41536l.m120484d(this.f87072d, ((Dictionary) obj).f87072d);
        }

        public int hashCode() {
            return this.f87072d.hashCode();
        }

        public String toString() {
            return "Dictionary(key=" + this.f87072d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f87072d);
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.model.StringSource$Raw */
    public static final class Raw extends StringSource {
        public static final Parcelable.Creator<Raw> CREATOR = new C35988a();

        /* renamed from: d */
        private final CharSequence f87073d;

        /* renamed from: ge.bog.sso_client.onboarding.model.StringSource$Raw$a */
        public static final class C35988a implements Parcelable.Creator {
            /* renamed from: a */
            public final Raw createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Raw((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final Raw[] newArray(int i) {
                return new Raw[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Raw(CharSequence charSequence) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(charSequence, "text");
            this.f87073d = charSequence;
        }

        /* renamed from: a */
        public final CharSequence mo88671a() {
            return this.f87073d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Raw) && C41536l.m120484d(this.f87073d, ((Raw) obj).f87073d);
        }

        public int hashCode() {
            return this.f87073d.hashCode();
        }

        public String toString() {
            return "Raw(text=" + this.f87073d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            TextUtils.writeToParcel(this.f87073d, parcel, i);
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.model.StringSource$Resource */
    public static final class Resource extends StringSource {
        public static final Parcelable.Creator<Resource> CREATOR = new C35989a();

        /* renamed from: d */
        private final int f87074d;

        /* renamed from: ge.bog.sso_client.onboarding.model.StringSource$Resource$a */
        public static final class C35989a implements Parcelable.Creator {
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
            this.f87074d = i;
        }

        /* renamed from: a */
        public final int mo88681a() {
            return this.f87074d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resource) && this.f87074d == ((Resource) obj).f87074d;
        }

        public int hashCode() {
            return this.f87074d;
        }

        public String toString() {
            return "Resource(resId=" + this.f87074d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f87074d);
        }
    }

    private StringSource() {
    }

    public /* synthetic */ StringSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
