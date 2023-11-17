package y91;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: y91.c */
public final class C40038c {

    /* renamed from: a */
    private final Image f95134a;

    /* renamed from: b */
    private final String f95135b;

    public C40038c(Image image, String str) {
        C41536l.m120489i(str, "productCode");
        this.f95134a = image;
        this.f95135b = str;
    }

    /* renamed from: a */
    public final Image mo93895a() {
        return this.f95134a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40038c)) {
            return false;
        }
        C40038c cVar = (C40038c) obj;
        return C41536l.m120484d(this.f95134a, cVar.f95134a) && C41536l.m120484d(this.f95135b, cVar.f95135b);
    }

    public int hashCode() {
        Image image = this.f95134a;
        return ((image == null ? 0 : image.hashCode()) * 31) + this.f95135b.hashCode();
    }

    public String toString() {
        Image image = this.f95134a;
        String str = this.f95135b;
        return "WishCampaignCardUiModel(background=" + image + ", productCode=" + str + ")";
    }
}
