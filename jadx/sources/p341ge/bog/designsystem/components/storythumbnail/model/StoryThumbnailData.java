package p341ge.bog.designsystem.components.storythumbnail.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: ge.bog.designsystem.components.storythumbnail.model.StoryThumbnailData */
public final class StoryThumbnailData implements Parcelable {
    public static final Parcelable.Creator<StoryThumbnailData> CREATOR = new C13522a();

    /* renamed from: d */
    private final String f40370d;

    /* renamed from: e */
    private final Image f40371e;

    /* renamed from: f */
    private final boolean f40372f;

    /* renamed from: g */
    private final Image f40373g;

    /* renamed from: h */
    private final Color f40374h;

    /* renamed from: ge.bog.designsystem.components.storythumbnail.model.StoryThumbnailData$a */
    public static final class C13522a implements Parcelable.Creator {
        /* renamed from: a */
        public final StoryThumbnailData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Class<StoryThumbnailData> cls = StoryThumbnailData.class;
            return new StoryThumbnailData(parcel.readString(), (Image) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, (Image) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()));
        }

        /* renamed from: b */
        public final StoryThumbnailData[] newArray(int i) {
            return new StoryThumbnailData[i];
        }
    }

    public StoryThumbnailData() {
        this((String) null, (Image) null, false, (Image) null, (Color) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ StoryThumbnailData m50719b(StoryThumbnailData storyThumbnailData, String str, Image image, boolean z, Image image2, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storyThumbnailData.f40370d;
        }
        if ((i & 2) != 0) {
            image = storyThumbnailData.f40371e;
        }
        Image image3 = image;
        if ((i & 4) != 0) {
            z = storyThumbnailData.f40372f;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            image2 = storyThumbnailData.f40373g;
        }
        Image image4 = image2;
        if ((i & 16) != 0) {
            color = storyThumbnailData.f40374h;
        }
        return storyThumbnailData.mo36801a(str, image3, z2, image4, color);
    }

    /* renamed from: a */
    public final StoryThumbnailData mo36801a(String str, Image image, boolean z, Image image2, Color color) {
        return new StoryThumbnailData(str, image, z, image2, color);
    }

    /* renamed from: d */
    public final Image mo36802d() {
        return this.f40373g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Color mo36804e() {
        return this.f40374h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryThumbnailData)) {
            return false;
        }
        StoryThumbnailData storyThumbnailData = (StoryThumbnailData) obj;
        return C41536l.m120484d(this.f40370d, storyThumbnailData.f40370d) && C41536l.m120484d(this.f40371e, storyThumbnailData.f40371e) && this.f40372f == storyThumbnailData.f40372f && C41536l.m120484d(this.f40373g, storyThumbnailData.f40373g) && C41536l.m120484d(this.f40374h, storyThumbnailData.f40374h);
    }

    /* renamed from: f */
    public final Image mo36806f() {
        return this.f40371e;
    }

    /* renamed from: g */
    public final boolean mo36807g() {
        return this.f40372f;
    }

    /* renamed from: h */
    public final String mo36808h() {
        return this.f40370d;
    }

    public int hashCode() {
        String str = this.f40370d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.f40371e;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        boolean z = this.f40372f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Image image2 = this.f40373g;
        int hashCode3 = (i2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Color color = this.f40374h;
        if (color != null) {
            i = color.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f40370d;
        Image image = this.f40371e;
        boolean z = this.f40372f;
        Image image2 = this.f40373g;
        Color color = this.f40374h;
        return "StoryThumbnailData(text=" + str + ", image=" + image + ", seen=" + z + ", badge=" + image2 + ", badgeTint=" + color + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f40370d);
        parcel.writeParcelable(this.f40371e, i);
        parcel.writeInt(this.f40372f ? 1 : 0);
        parcel.writeParcelable(this.f40373g, i);
        parcel.writeParcelable(this.f40374h, i);
    }

    public StoryThumbnailData(String str, Image image, boolean z, Image image2, Color color) {
        this.f40370d = str;
        this.f40371e = image;
        this.f40372f = z;
        this.f40373g = image2;
        this.f40374h = color;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoryThumbnailData(java.lang.String r5, p341ge.bog.designsystem.components.common.Image r6, boolean r7, p341ge.bog.designsystem.components.common.Image r8, p341ge.bog.designsystem.components.common.Color r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
            if (r5 == 0) goto L_0x0014
            r7 = 0
        L_0x0014:
            r2 = r7
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001b
            r3 = r0
            goto L_0x001c
        L_0x001b:
            r3 = r8
        L_0x001c:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0022
            r10 = r0
            goto L_0x0023
        L_0x0022:
            r10 = r9
        L_0x0023:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.storythumbnail.model.StoryThumbnailData.<init>(java.lang.String, ge.bog.designsystem.components.common.Image, boolean, ge.bog.designsystem.components.common.Image, ge.bog.designsystem.components.common.Color, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
