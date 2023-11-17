package p380ck;

import android.os.Bundle;
import com.salesforce.marketingcloud.UrlHandler;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p380ck.C10464h;

/* renamed from: ck.k */
public abstract class C10478k {

    /* renamed from: b */
    public static final C10480b f29816b = new C10480b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C10464h.C10465a f29817a;

    /* renamed from: ck.k$a */
    public static final class C10479a extends C10478k {

        /* renamed from: c */
        private final String f29818c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10479a(String str) {
            super(C10464h.C10465a.FACEBOOKANDFIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "categoryName");
            this.f29818c = str;
        }

        /* renamed from: a */
        public Bundle mo27183a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "category");
            bundle.putString(UrlHandler.ACTION, "click");
            bundle.putString("category name", this.f29818c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10479a) && C41536l.m120484d(this.f29818c, ((C10479a) obj).f29818c);
        }

        public int hashCode() {
            return this.f29818c.hashCode();
        }

        public String toString() {
            String str = this.f29818c;
            return "CategoryClickEvent(categoryName=" + str + ")";
        }
    }

    /* renamed from: ck.k$b */
    public static final class C10480b {
        private C10480b() {
        }

        public /* synthetic */ C10480b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ck.k$c */
    public static final class C10481c extends C10478k {

        /* renamed from: c */
        private final String f29819c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10481c(String str) {
            super(C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "categoryName");
            this.f29819c = str;
        }

        /* renamed from: a */
        public Bundle mo27183a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "save");
            bundle.putString(UrlHandler.ACTION, "click");
            bundle.putString("category name", this.f29819c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10481c) && C41536l.m120484d(this.f29819c, ((C10481c) obj).f29819c);
        }

        public int hashCode() {
            return this.f29819c.hashCode();
        }

        public String toString() {
            String str = this.f29819c;
            return "SaveClickEvent(categoryName=" + str + ")";
        }
    }

    /* renamed from: ck.k$d */
    public static final class C10482d extends C10478k {

        /* renamed from: c */
        private final String f29820c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10482d(String str) {
            super(C10464h.C10465a.FACEBOOKANDFIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "categoryName");
            this.f29820c = str;
        }

        /* renamed from: a */
        public Bundle mo27183a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "success");
            bundle.putString(UrlHandler.ACTION, "view");
            bundle.putString("category name", this.f29820c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10482d) && C41536l.m120484d(this.f29820c, ((C10482d) obj).f29820c);
        }

        public int hashCode() {
            return this.f29820c.hashCode();
        }

        public String toString() {
            String str = this.f29820c;
            return "SuccessViewEvent(categoryName=" + str + ")";
        }
    }

    /* renamed from: ck.k$e */
    public static final class C10483e extends C10478k {

        /* renamed from: c */
        private final String f29821c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10483e(String str) {
            super(C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "fieldName");
            this.f29821c = str;
        }

        /* renamed from: a */
        public Bundle mo27183a() {
            Bundle bundle = new Bundle();
            bundle.putString("label", "sto_wizard");
            bundle.putString(UrlHandler.ACTION, "click_next");
            bundle.putString("field name", this.f29821c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10483e) && C41536l.m120484d(this.f29821c, ((C10483e) obj).f29821c);
        }

        public int hashCode() {
            return this.f29821c.hashCode();
        }

        public String toString() {
            String str = this.f29821c;
            return "WizardNextClickEvent(fieldName=" + str + ")";
        }
    }

    public /* synthetic */ C10478k(C10464h.C10465a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    public abstract Bundle mo27183a();

    /* renamed from: b */
    public final void mo27184b(C10463g gVar) {
        C41536l.m120489i(gVar, "analytics");
        Bundle a = mo27183a();
        if (a != null) {
            a.putString("event_name", "STO");
            C41238w wVar = C41238w.f97225a;
        } else {
            a = null;
        }
        gVar.mo27137H("STO", "", "", a, this.f29817a);
    }

    private C10478k(C10464h.C10465a aVar) {
        this.f29817a = aVar;
    }
}
