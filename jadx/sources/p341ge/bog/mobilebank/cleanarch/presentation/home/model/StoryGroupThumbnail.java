package p341ge.bog.mobilebank.cleanarch.presentation.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail */
public final class StoryGroupThumbnail implements Parcelable {
    public static final Parcelable.Creator<StoryGroupThumbnail> CREATOR = new C21713a();

    /* renamed from: d */
    private final long f57991d;

    /* renamed from: e */
    private final Image f57992e;

    /* renamed from: f */
    private final StringSource f57993f;

    /* renamed from: g */
    private final boolean f57994g;

    /* renamed from: h */
    private final String f57995h;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail$a */
    public static final class C21713a implements Parcelable.Creator {
        /* renamed from: a */
        public final StoryGroupThumbnail createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Class<StoryGroupThumbnail> cls = StoryGroupThumbnail.class;
            return new StoryGroupThumbnail(parcel.readLong(), (Image) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        /* renamed from: b */
        public final StoryGroupThumbnail[] newArray(int i) {
            return new StoryGroupThumbnail[i];
        }
    }

    public StoryGroupThumbnail(long j, Image image, StringSource stringSource, boolean z, String str) {
        this.f57991d = j;
        this.f57992e = image;
        this.f57993f = stringSource;
        this.f57994g = z;
        this.f57995h = str;
    }

    /* renamed from: a */
    public final String mo54187a() {
        return this.f57995h;
    }

    /* renamed from: b */
    public final long mo54188b() {
        return this.f57991d;
    }

    /* renamed from: d */
    public final Image mo54189d() {
        return this.f57992e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final StringSource mo54191e() {
        return this.f57993f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryGroupThumbnail)) {
            return false;
        }
        StoryGroupThumbnail storyGroupThumbnail = (StoryGroupThumbnail) obj;
        return this.f57991d == storyGroupThumbnail.f57991d && C41536l.m120484d(this.f57992e, storyGroupThumbnail.f57992e) && C41536l.m120484d(this.f57993f, storyGroupThumbnail.f57993f) && this.f57994g == storyGroupThumbnail.f57994g && C41536l.m120484d(this.f57995h, storyGroupThumbnail.f57995h);
    }

    /* renamed from: f */
    public final boolean mo54193f() {
        return this.f57994g;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f57991d) * 31;
        Image image = this.f57992e;
        int i = 0;
        int hashCode = (a + (image == null ? 0 : image.hashCode())) * 31;
        StringSource stringSource = this.f57993f;
        int hashCode2 = (hashCode + (stringSource == null ? 0 : stringSource.hashCode())) * 31;
        boolean z = this.f57994g;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str = this.f57995h;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        long j = this.f57991d;
        Image image = this.f57992e;
        StringSource stringSource = this.f57993f;
        boolean z = this.f57994g;
        String str = this.f57995h;
        return "StoryGroupThumbnail(id=" + j + ", thumbnailImage=" + image + ", title=" + stringSource + ", isSeen=" + z + ", eventClickName=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f57991d);
        parcel.writeParcelable(this.f57992e, i);
        parcel.writeParcelable(this.f57993f, i);
        parcel.writeInt(this.f57994g ? 1 : 0);
        parcel.writeString(this.f57995h);
    }
}
