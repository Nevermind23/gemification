package p692zc;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import p485kc.C16347e;

/* renamed from: zc.g */
public final class C19005g {

    /* renamed from: a */
    private final C18998b f53072a;

    /* renamed from: b */
    private final C18997a f53073b;

    /* renamed from: c */
    private final C19007h f53074c;

    /* renamed from: zc.g$a */
    public static final class C19006a {

        /* renamed from: a */
        private final int f53075a;

        /* renamed from: b */
        private final Bundle f53076b;

        public C19006a(int i, Bundle bundle) {
            this.f53075a = i;
            this.f53076b = bundle;
        }

        /* renamed from: a */
        public final Bundle mo47131a() {
            return this.f53076b;
        }

        /* renamed from: b */
        public final int mo47132b() {
            return this.f53075a;
        }
    }

    public C19005g(C18998b bVar, C18997a aVar, C19007h hVar) {
        C41536l.m120489i(bVar, "flags");
        C41536l.m120489i(aVar, "documentTypes");
        C41536l.m120489i(hVar, "selected");
        this.f53072a = bVar;
        this.f53073b = aVar;
        this.f53074c = hVar;
    }

    /* renamed from: f */
    private final C19006a m64223f(int i) {
        return new C19006a(i, (Bundle) null);
    }

    /* renamed from: a */
    public final C19006a mo47125a() {
        if (this.f53072a.mo47068q()) {
            return mo47126b();
        }
        return m64223f(C16347e.agreementFragment);
    }

    /* renamed from: b */
    public final C19006a mo47126b() {
        if (C41536l.m120484d(this.f53072a.mo47067p(), "human")) {
            return m64223f(C16347e.flowFragment);
        }
        if (C41536l.m120484d(this.f53072a.mo47067p(), "human_with_flow")) {
            return m64223f(C16347e.flowFragment);
        }
        if (this.f53072a.mo47069r()) {
            return mo47128d();
        }
        if (this.f53073b.mo47049a().size() != 1) {
            return m64223f(C16347e.documentTypesFragment);
        }
        this.f53074c.mo47135c(((Number) this.f53073b.mo47049a().get(0)).intValue());
        return mo47130g();
    }

    /* renamed from: c */
    public final C19006a mo47127c() {
        if (this.f53072a.mo47070s()) {
            return m64223f(-1);
        }
        if (!this.f53072a.mo47065n()) {
            return m64223f(C16347e.matchPhotoFragment);
        }
        if (this.f53072a.mo47057f()) {
            return m64223f(C16347e.cascadingFragment);
        }
        return m64223f(C16347e.livenessFragment);
    }

    /* renamed from: d */
    public final C19006a mo47128d() {
        if (this.f53072a.mo47063l()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("general", true);
            if (this.f53072a.mo47053b() && !this.f53072a.mo47054c()) {
                return new C19006a(C16347e.scanDocumentFragment, bundle);
            }
            if (!this.f53072a.mo47053b() && this.f53072a.mo47054c()) {
                return new C19006a(C16347e.uploadDocumentFragment, bundle);
            }
            if (this.f53072a.mo47053b() && this.f53072a.mo47054c()) {
                return new C19006a(C16347e.uploadTypesFragment, bundle);
            }
        }
        return mo47129e();
    }

    /* renamed from: e */
    public final C19006a mo47129e() {
        if (this.f53072a.mo47066o()) {
            return m64223f(C16347e.holdDocumentFragment);
        }
        return mo47127c();
    }

    /* renamed from: g */
    public final C19006a mo47130g() {
        if (this.f53072a.mo47052a() || this.f53072a.mo47055d()) {
            return m64223f(C16347e.uploadTypesFragment);
        }
        return new C19006a(C16347e.scanDocumentFragment, (Bundle) null);
    }
}
