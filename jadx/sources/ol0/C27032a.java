package ol0;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p380ck.C10463g;
import p380ck.C10464h;

/* renamed from: ol0.a */
public abstract class C27032a {

    /* renamed from: e */
    public static final C27033a f67898e = new C27033a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f67899a;

    /* renamed from: b */
    private final String f67900b;

    /* renamed from: c */
    private final Bundle f67901c;

    /* renamed from: d */
    private final C10464h.C10465a f67902d;

    /* renamed from: ol0.a$a */
    public static final class C27033a {
        private C27033a() {
        }

        public /* synthetic */ C27033a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ol0.a$b */
    public static final class C27034b extends C27032a {

        /* renamed from: f */
        public static final C27034b f67903f = new C27034b();

        private C27034b() {
            super("next_someone_else", "travel_Insurance", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE, 4, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ol0.a$c */
    public static final class C27035c extends C27032a {

        /* renamed from: f */
        public static final C27035c f67904f = new C27035c();

        private C27035c() {
            super("click_for_whom", "travel_Insurance", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE, 4, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ol0.a$d */
    public static final class C27036d extends C27032a {

        /* renamed from: f */
        private final String f67905f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27036d(String str) {
            super("choose_for_whom", str, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE, 4, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "selectedType");
            this.f67905f = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27036d) && C41536l.m120484d(this.f67905f, ((C27036d) obj).f67905f);
        }

        public int hashCode() {
            return this.f67905f.hashCode();
        }

        public String toString() {
            String str = this.f67905f;
            return "InsuredPersonTypeSelectedEvent(selectedType=" + str + ")";
        }
    }

    /* renamed from: ol0.a$e */
    public static final class C27037e extends C27032a {

        /* renamed from: f */
        private final String f67906f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27037e(String str) {
            super("choose_suggestion", str, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE, 4, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "personPIN");
            this.f67906f = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27037e) && C41536l.m120484d(this.f67906f, ((C27037e) obj).f67906f);
        }

        public int hashCode() {
            return this.f67906f.hashCode();
        }

        public String toString() {
            String str = this.f67906f;
            return "SuggestedPersonClickEvent(personPIN=" + str + ")";
        }
    }

    public /* synthetic */ C27032a(String str, String str2, Bundle bundle, C10464h.C10465a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle, aVar);
    }

    /* renamed from: a */
    public final void mo66262a(C10463g gVar) {
        C41536l.m120489i(gVar, "analytics");
        gVar.mo27137H("travel_Insurance", this.f67899a, this.f67900b, this.f67901c, this.f67902d);
    }

    private C27032a(String str, String str2, Bundle bundle, C10464h.C10465a aVar) {
        this.f67899a = str;
        this.f67900b = str2;
        this.f67901c = bundle;
        this.f67902d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27032a(String str, String str2, Bundle bundle, C10464h.C10465a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bundle, aVar, (DefaultConstructorMarker) null);
    }
}
