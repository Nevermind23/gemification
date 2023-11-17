package jz0;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p380ck.C10463g;
import p380ck.C10464h;

/* renamed from: jz0.d */
public abstract class C36852d {

    /* renamed from: e */
    public static final C36855c f88939e = new C36855c((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f88940a;

    /* renamed from: b */
    private final String f88941b;

    /* renamed from: c */
    private final Bundle f88942c;

    /* renamed from: d */
    private final C10464h.C10465a f88943d;

    /* renamed from: jz0.d$a */
    public static final class C36853a extends C36852d {

        /* renamed from: f */
        public static final C36853a f88944f = new C36853a();

        private C36853a() {
            super("click_cancellation", "account_details", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE, 4, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: jz0.d$b */
    public static final class C36854b extends C36852d {

        /* renamed from: f */
        public static final C36854b f88945f = new C36854b();

        private C36854b() {
            super("impression", "success", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE, 4, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: jz0.d$c */
    public static final class C36855c {
        private C36855c() {
        }

        public /* synthetic */ C36855c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: jz0.d$d */
    public static final class C36856d extends C36852d {

        /* renamed from: f */
        private final C36857e f88946f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36856d(C36857e eVar) {
            super("click", eVar.mo89782b(), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE, 4, (DefaultConstructorMarker) null);
            C41536l.m120489i(eVar, "selectedOption");
            this.f88946f = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36856d) && this.f88946f == ((C36856d) obj).f88946f;
        }

        public int hashCode() {
            return this.f88946f.hashCode();
        }

        public String toString() {
            C36857e eVar = this.f88946f;
            return "ConfirmationDialogEvent(selectedOption=" + eVar + ")";
        }
    }

    /* renamed from: jz0.d$e */
    public enum C36857e {
        YES("yes"),
        NO("no"),
        X("X");
        

        /* renamed from: d */
        private final String f88951d;

        private C36857e(String str) {
            this.f88951d = str;
        }

        /* renamed from: b */
        public final String mo89782b() {
            return this.f88951d;
        }
    }

    /* renamed from: jz0.d$f */
    public static final class C36858f extends C36852d {

        /* renamed from: f */
        private final String f88952f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36858f(String str) {
            super("click_dialog_button", str, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE, 4, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "warning");
            this.f88952f = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36858f) && C41536l.m120484d(this.f88952f, ((C36858f) obj).f88952f);
        }

        public int hashCode() {
            return this.f88952f.hashCode();
        }

        public String toString() {
            String str = this.f88952f;
            return "WarningDialogEvent(warning=" + str + ")";
        }
    }

    public /* synthetic */ C36852d(String str, String str2, Bundle bundle, C10464h.C10465a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle, aVar);
    }

    /* renamed from: a */
    public final void mo89778a(C10463g gVar) {
        C41536l.m120489i(gVar, "analytics");
        gVar.mo27137H("account_cancellation", this.f88940a, this.f88941b, this.f88942c, this.f88943d);
    }

    private C36852d(String str, String str2, Bundle bundle, C10464h.C10465a aVar) {
        this.f88940a = str;
        this.f88941b = str2;
        this.f88942c = bundle;
        this.f88943d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36852d(String str, String str2, Bundle bundle, C10464h.C10465a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bundle, aVar, (DefaultConstructorMarker) null);
    }
}
