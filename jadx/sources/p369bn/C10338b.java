package p369bn;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.helper.ImageSource;

/* renamed from: bn.b */
public final class C10338b {

    /* renamed from: a */
    private final String f29512a;

    /* renamed from: b */
    private final ImageSource f29513b;

    /* renamed from: c */
    private final int f29514c;

    public C10338b(String str, ImageSource imageSource, int i) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(imageSource, "image");
        this.f29512a = str;
        this.f29513b = imageSource;
        this.f29514c = i;
    }

    /* renamed from: a */
    public final ImageSource mo26933a() {
        return this.f29513b;
    }

    /* renamed from: b */
    public final int mo26934b() {
        return this.f29514c;
    }

    /* renamed from: c */
    public final String mo26935c() {
        return this.f29512a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10338b)) {
            return false;
        }
        C10338b bVar = (C10338b) obj;
        return C41536l.m120484d(this.f29512a, bVar.f29512a) && C41536l.m120484d(this.f29513b, bVar.f29513b) && this.f29514c == bVar.f29514c;
    }

    public int hashCode() {
        return (((this.f29512a.hashCode() * 31) + this.f29513b.hashCode()) * 31) + this.f29514c;
    }

    public String toString() {
        String str = this.f29512a;
        ImageSource imageSource = this.f29513b;
        int i = this.f29514c;
        return "OrderCardHeader(title=" + str + ", image=" + imageSource + ", placeHolderResId=" + i + ")";
    }
}
