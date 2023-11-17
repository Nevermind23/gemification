package p380ck;

import android.os.Bundle;
import com.salesforce.marketingcloud.UrlHandler;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p380ck.C10464h;

/* renamed from: ck.j */
public abstract class C10469j {

    /* renamed from: b */
    public static final C10471b f29807b = new C10471b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C10464h.C10465a f29808a;

    /* renamed from: ck.j$a */
    public static final class C10470a extends C10469j {

        /* renamed from: c */
        private final String f29809c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10470a(String str) {
            super(C10464h.C10465a.FACEBOOKANDFIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "categoryName");
            this.f29809c = str;
        }

        /* renamed from: a */
        public Bundle mo27160a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "category");
            bundle.putString(UrlHandler.ACTION, "click");
            bundle.putString("category name", this.f29809c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10470a) && C41536l.m120484d(this.f29809c, ((C10470a) obj).f29809c);
        }

        public int hashCode() {
            return this.f29809c.hashCode();
        }

        public String toString() {
            String str = this.f29809c;
            return "CategoryClickEvent(categoryName=" + str + ")";
        }
    }

    /* renamed from: ck.j$b */
    public static final class C10471b {
        private C10471b() {
        }

        public /* synthetic */ C10471b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ck.j$c */
    public static final class C10472c extends C10469j {

        /* renamed from: c */
        private final String f29810c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10472c(String str) {
            super(C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "companyName");
            this.f29810c = str;
        }

        /* renamed from: a */
        public Bundle mo27160a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "form_view");
            bundle.putString(UrlHandler.ACTION, "view");
            bundle.putString("company name", this.f29810c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10472c) && C41536l.m120484d(this.f29810c, ((C10472c) obj).f29810c);
        }

        public int hashCode() {
            return this.f29810c.hashCode();
        }

        public String toString() {
            String str = this.f29810c;
            return "DDFormShowEvent(companyName=" + str + ")";
        }
    }

    /* renamed from: ck.j$d */
    public static final class C10473d extends C10469j {

        /* renamed from: c */
        private final String f29811c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10473d(String str) {
            super(C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "companyName");
            this.f29811c = str;
        }

        /* renamed from: a */
        public Bundle mo27160a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "provider");
            bundle.putString(UrlHandler.ACTION, "click");
            bundle.putString("company name", this.f29811c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10473d) && C41536l.m120484d(this.f29811c, ((C10473d) obj).f29811c);
        }

        public int hashCode() {
            return this.f29811c.hashCode();
        }

        public String toString() {
            String str = this.f29811c;
            return "ProviderClickEvent(companyName=" + str + ")";
        }
    }

    /* renamed from: ck.j$e */
    public static final class C10474e extends C10469j {

        /* renamed from: c */
        private final String f29812c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10474e(String str) {
            super(C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "companyName");
            this.f29812c = str;
        }

        /* renamed from: a */
        public Bundle mo27160a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "save");
            bundle.putString(UrlHandler.ACTION, "click");
            bundle.putString("company name", this.f29812c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10474e) && C41536l.m120484d(this.f29812c, ((C10474e) obj).f29812c);
        }

        public int hashCode() {
            return this.f29812c.hashCode();
        }

        public String toString() {
            String str = this.f29812c;
            return "SaveClickEvent(companyName=" + str + ")";
        }
    }

    /* renamed from: ck.j$f */
    public static final class C10475f extends C10469j {

        /* renamed from: c */
        private final String f29813c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10475f(String str) {
            super(C10464h.C10465a.FACEBOOKANDFIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "subCategoryName");
            this.f29813c = str;
        }

        /* renamed from: a */
        public Bundle mo27160a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "sub_category");
            bundle.putString(UrlHandler.ACTION, "click");
            bundle.putString("sub category name", this.f29813c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10475f) && C41536l.m120484d(this.f29813c, ((C10475f) obj).f29813c);
        }

        public int hashCode() {
            return this.f29813c.hashCode();
        }

        public String toString() {
            String str = this.f29813c;
            return "SubCategoryClickEvent(subCategoryName=" + str + ")";
        }
    }

    /* renamed from: ck.j$g */
    public static final class C10476g extends C10469j {

        /* renamed from: c */
        private final String f29814c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10476g(String str) {
            super(C10464h.C10465a.FACEBOOKANDFIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "companyName");
            this.f29814c = str;
        }

        /* renamed from: a */
        public Bundle mo27160a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "success");
            bundle.putString(UrlHandler.ACTION, "view");
            bundle.putString("company name", this.f29814c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10476g) && C41536l.m120484d(this.f29814c, ((C10476g) obj).f29814c);
        }

        public int hashCode() {
            return this.f29814c.hashCode();
        }

        public String toString() {
            String str = this.f29814c;
            return "SuccessViewEvent(companyName=" + str + ")";
        }
    }

    /* renamed from: ck.j$h */
    public static final class C10477h extends C10469j {

        /* renamed from: c */
        private final String f29815c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10477h(String str) {
            super(C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "fieldName");
            this.f29815c = str;
        }

        /* renamed from: a */
        public Bundle mo27160a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "dd_wizard");
            bundle.putString(UrlHandler.ACTION, "click_next");
            bundle.putString("field name", this.f29815c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10477h) && C41536l.m120484d(this.f29815c, ((C10477h) obj).f29815c);
        }

        public int hashCode() {
            return this.f29815c.hashCode();
        }

        public String toString() {
            String str = this.f29815c;
            return "WizardNextClickEvent(fieldName=" + str + ")";
        }
    }

    public /* synthetic */ C10469j(C10464h.C10465a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    public abstract Bundle mo27160a();

    /* renamed from: b */
    public final void mo27161b(C10463g gVar) {
        C41536l.m120489i(gVar, "analytics");
        Bundle a = mo27160a();
        if (a != null) {
            a.putString("event_name", TMXFlags.TMX_FLAG_DD_KEY);
            C41238w wVar = C41238w.f97225a;
        } else {
            a = null;
        }
        gVar.mo27137H(TMXFlags.TMX_FLAG_DD_KEY, "", "", a, this.f29808a);
    }

    private C10469j(C10464h.C10465a aVar) {
        this.f29808a = aVar;
    }
}
