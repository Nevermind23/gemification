package p341ge.bog.mobilebank.stories.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel */
public final class StoryDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<StoryDetailsUiModel> CREATOR = new C34837a();

    /* renamed from: d */
    private final long f84098d;

    /* renamed from: e */
    private final StringSource f84099e;

    /* renamed from: f */
    private final StringSource f84100f;

    /* renamed from: g */
    private final StringSource f84101g;

    /* renamed from: h */
    private final Image f84102h;

    /* renamed from: i */
    private final StoryContentLinkUiModel f84103i;

    /* renamed from: j */
    private final String f84104j;

    /* renamed from: k */
    private final String f84105k;

    /* renamed from: l */
    private final String f84106l;

    /* renamed from: m */
    private final Long f84107m;

    /* renamed from: n */
    private final boolean f84108n;

    /* renamed from: ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel$a */
    public static final class C34837a implements Parcelable.Creator {
        /* renamed from: a */
        public final StoryDetailsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Class<StoryDetailsUiModel> cls = StoryDetailsUiModel.class;
            return new StoryDetailsUiModel(parcel.readLong(), (StringSource) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()), (Image) parcel.readParcelable(cls.getClassLoader()), (StoryContentLinkUiModel) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final StoryDetailsUiModel[] newArray(int i) {
            return new StoryDetailsUiModel[i];
        }
    }

    public StoryDetailsUiModel(long j, StringSource stringSource, StringSource stringSource2, StringSource stringSource3, Image image, StoryContentLinkUiModel storyContentLinkUiModel, String str, String str2, String str3, Long l, boolean z) {
        this.f84098d = j;
        this.f84099e = stringSource;
        this.f84100f = stringSource2;
        this.f84101g = stringSource3;
        this.f84102h = image;
        this.f84103i = storyContentLinkUiModel;
        this.f84104j = str;
        this.f84105k = str2;
        this.f84106l = str3;
        this.f84107m = l;
        this.f84108n = z;
    }

    /* renamed from: a */
    public final Image mo85077a() {
        return this.f84102h;
    }

    /* renamed from: b */
    public final StringSource mo85078b() {
        return this.f84101g;
    }

    /* renamed from: d */
    public final StoryContentLinkUiModel mo85079d() {
        return this.f84103i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final StringSource mo85081e() {
        return this.f84100f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryDetailsUiModel)) {
            return false;
        }
        StoryDetailsUiModel storyDetailsUiModel = (StoryDetailsUiModel) obj;
        return this.f84098d == storyDetailsUiModel.f84098d && C41536l.m120484d(this.f84099e, storyDetailsUiModel.f84099e) && C41536l.m120484d(this.f84100f, storyDetailsUiModel.f84100f) && C41536l.m120484d(this.f84101g, storyDetailsUiModel.f84101g) && C41536l.m120484d(this.f84102h, storyDetailsUiModel.f84102h) && C41536l.m120484d(this.f84103i, storyDetailsUiModel.f84103i) && C41536l.m120484d(this.f84104j, storyDetailsUiModel.f84104j) && C41536l.m120484d(this.f84105k, storyDetailsUiModel.f84105k) && C41536l.m120484d(this.f84106l, storyDetailsUiModel.f84106l) && C41536l.m120484d(this.f84107m, storyDetailsUiModel.f84107m) && this.f84108n == storyDetailsUiModel.f84108n;
    }

    /* renamed from: f */
    public final Long mo85083f() {
        return this.f84107m;
    }

    /* renamed from: g */
    public final String mo85084g() {
        return this.f84105k;
    }

    /* renamed from: h */
    public final String mo85085h() {
        return this.f84104j;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f84098d) * 31;
        StringSource stringSource = this.f84099e;
        int i = 0;
        int hashCode = (a + (stringSource == null ? 0 : stringSource.hashCode())) * 31;
        StringSource stringSource2 = this.f84100f;
        int hashCode2 = (hashCode + (stringSource2 == null ? 0 : stringSource2.hashCode())) * 31;
        StringSource stringSource3 = this.f84101g;
        int hashCode3 = (hashCode2 + (stringSource3 == null ? 0 : stringSource3.hashCode())) * 31;
        Image image = this.f84102h;
        int hashCode4 = (hashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        StoryContentLinkUiModel storyContentLinkUiModel = this.f84103i;
        int hashCode5 = (hashCode4 + (storyContentLinkUiModel == null ? 0 : storyContentLinkUiModel.hashCode())) * 31;
        String str = this.f84104j;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84105k;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84106l;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f84107m;
        if (l != null) {
            i = l.hashCode();
        }
        int i2 = (hashCode8 + i) * 31;
        boolean z = this.f84108n;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo85087i() {
        return this.f84106l;
    }

    /* renamed from: j */
    public final long mo85088j() {
        return this.f84098d;
    }

    /* renamed from: k */
    public final StringSource mo85089k() {
        return this.f84099e;
    }

    /* renamed from: l */
    public final boolean mo85090l() {
        return this.f84108n;
    }

    public String toString() {
        long j = this.f84098d;
        StringSource stringSource = this.f84099e;
        StringSource stringSource2 = this.f84100f;
        StringSource stringSource3 = this.f84101g;
        Image image = this.f84102h;
        StoryContentLinkUiModel storyContentLinkUiModel = this.f84103i;
        String str = this.f84104j;
        String str2 = this.f84105k;
        String str3 = this.f84106l;
        Long l = this.f84107m;
        boolean z = this.f84108n;
        return "StoryDetailsUiModel(id=" + j + ", title=" + stringSource + ", description=" + stringSource2 + ", buttonText=" + stringSource3 + ", background=" + image + ", contentLink=" + storyContentLinkUiModel + ", eventCloseName=" + str + ", eventButtonClickName=" + str2 + ", eventViewName=" + str3 + ", duration=" + l + ", isSeen=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f84098d);
        parcel.writeParcelable(this.f84099e, i);
        parcel.writeParcelable(this.f84100f, i);
        parcel.writeParcelable(this.f84101g, i);
        parcel.writeParcelable(this.f84102h, i);
        parcel.writeParcelable(this.f84103i, i);
        parcel.writeString(this.f84104j);
        parcel.writeString(this.f84105k);
        parcel.writeString(this.f84106l);
        Long l = this.f84107m;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.f84108n ? 1 : 0);
    }
}
