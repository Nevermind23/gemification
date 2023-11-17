package a11;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: a11.a */
public final class C30466a {

    /* renamed from: a */
    private final Image f76456a;

    /* renamed from: b */
    private final String f76457b;

    /* renamed from: c */
    private final String f76458c;

    /* renamed from: d */
    private final String f76459d;

    public C30466a(Image image, String str, String str2, String str3) {
        C41536l.m120489i(image, "image");
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "description");
        C41536l.m120489i(str3, "nextButtonName");
        this.f76456a = image;
        this.f76457b = str;
        this.f76458c = str2;
        this.f76459d = str3;
    }

    /* renamed from: a */
    public final String mo70794a() {
        return this.f76458c;
    }

    /* renamed from: b */
    public final Image mo70795b() {
        return this.f76456a;
    }

    /* renamed from: c */
    public final String mo70796c() {
        return this.f76459d;
    }

    /* renamed from: d */
    public final String mo70797d() {
        return this.f76457b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30466a)) {
            return false;
        }
        C30466a aVar = (C30466a) obj;
        return C41536l.m120484d(this.f76456a, aVar.f76456a) && C41536l.m120484d(this.f76457b, aVar.f76457b) && C41536l.m120484d(this.f76458c, aVar.f76458c) && C41536l.m120484d(this.f76459d, aVar.f76459d);
    }

    public int hashCode() {
        return (((((this.f76456a.hashCode() * 31) + this.f76457b.hashCode()) * 31) + this.f76458c.hashCode()) * 31) + this.f76459d.hashCode();
    }

    public String toString() {
        Image image = this.f76456a;
        String str = this.f76457b;
        String str2 = this.f76458c;
        String str3 = this.f76459d;
        return "FeatureUiState(image=" + image + ", title=" + str + ", description=" + str2 + ", nextButtonName=" + str3 + ")";
    }
}
