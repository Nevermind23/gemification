package p007a6;

import android.os.Bundle;
import com.google.android.gms.common.api.C3847a;
import p024b6.C2164a;
import p038c7.C2273e;
import p065e6.C6036a;
import p078f6.C6160a;
import p091g6.C6233f;
import p182n6.C7258g;

/* renamed from: a6.a */
public abstract class C0054a {

    /* renamed from: a */
    public static final C3847a f93a = C0057b.f109a;

    /* renamed from: b */
    public static final C3847a f94b;

    /* renamed from: c */
    public static final C3847a f95c;

    /* renamed from: d */
    public static final C6036a f96d = C0057b.f110b;

    /* renamed from: e */
    public static final C2164a f97e = new C2273e();

    /* renamed from: f */
    public static final C6160a f98f = new C6233f();

    /* renamed from: g */
    public static final C3847a.C3856g f99g;

    /* renamed from: h */
    public static final C3847a.C3856g f100h;

    /* renamed from: i */
    private static final C3847a.C3848a f101i;

    /* renamed from: j */
    private static final C3847a.C3848a f102j;

    /* renamed from: a6.a$a */
    public static class C0055a implements C3847a.C3851d, C3847a.C3851d.C3853b {

        /* renamed from: g */
        public static final C0055a f103g = new C0055a(new C0056a());
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String f104d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final boolean f105e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final String f106f;

        /* renamed from: a6.a$a$a */
        public static class C0056a {

            /* renamed from: a */
            protected Boolean f107a = Boolean.FALSE;

            /* renamed from: b */
            protected String f108b;

            public C0056a() {
            }

            /* renamed from: a */
            public final C0056a mo112a(String str) {
                this.f108b = str;
                return this;
            }

            public C0056a(C0055a aVar) {
                String unused = aVar.f104d;
                this.f107a = Boolean.valueOf(aVar.f105e);
                this.f108b = aVar.f106f;
            }
        }

        public C0055a(C0056a aVar) {
            this.f105e = aVar.f107a.booleanValue();
            this.f106f = aVar.f108b;
        }

        /* renamed from: a */
        public final Bundle mo109a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", (String) null);
            bundle.putBoolean("force_save_dialog", this.f105e);
            bundle.putString("log_session_id", this.f106f);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0055a)) {
                return false;
            }
            C0055a aVar = (C0055a) obj;
            String str = aVar.f104d;
            if (!C7258g.m27880a((Object) null, (Object) null) || this.f105e != aVar.f105e || !C7258g.m27880a(this.f106f, aVar.f106f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C7258g.m27881b(null, Boolean.valueOf(this.f105e), this.f106f);
        }
    }

    static {
        C3847a.C3856g gVar = new C3847a.C3856g();
        f99g = gVar;
        C3847a.C3856g gVar2 = new C3847a.C3856g();
        f100h = gVar2;
        C0059d dVar = new C0059d();
        f101i = dVar;
        C0060e eVar = new C0060e();
        f102j = eVar;
        f94b = new C3847a("Auth.CREDENTIALS_API", dVar, gVar);
        f95c = new C3847a("Auth.GOOGLE_SIGN_IN_API", eVar, gVar2);
    }
}
