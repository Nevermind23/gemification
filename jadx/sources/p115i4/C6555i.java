package p115i4;

import p128j4.C6699a;
import p167m4.C7093a;
import p206p4.C7700c;
import p232r4.C8061a;
import p297w4.C8808k;
import p297w4.C8817m;
import p297w4.C8819n;
import p334z4.C9207a;

/* renamed from: i4.i */
public abstract class C6555i {

    /* renamed from: i4.i$a */
    static class C6556a implements C8819n.C8824e {

        /* renamed from: i4.i$a$a */
        class C6557a implements C8808k.C8811c {
            C6557a() {
            }

            /* renamed from: a */
            public void mo8159a(boolean z) {
                if (z) {
                    C6699a.m26133c();
                }
            }
        }

        /* renamed from: i4.i$a$b */
        class C6558b implements C8808k.C8811c {
            C6558b() {
            }

            /* renamed from: a */
            public void mo8159a(boolean z) {
                if (z) {
                    C8061a.m30562a();
                }
            }
        }

        /* renamed from: i4.i$a$c */
        class C6559c implements C8808k.C8811c {
            C6559c() {
            }

            /* renamed from: a */
            public void mo8159a(boolean z) {
                if (z) {
                    C7700c.m29249g();
                }
            }
        }

        /* renamed from: i4.i$a$d */
        class C6560d implements C8808k.C8811c {
            C6560d() {
            }

            /* renamed from: a */
            public void mo8159a(boolean z) {
                if (z) {
                    C7093a.m27380a();
                }
            }
        }

        C6556a() {
        }

        /* renamed from: a */
        public void mo20543a() {
        }

        /* renamed from: b */
        public void mo20544b(C8817m mVar) {
            C8808k.m32791a(C8808k.C8812d.AAM, new C6557a());
            C8808k.m32791a(C8808k.C8812d.RestrictiveDataFiltering, new C6558b());
            C8808k.m32791a(C8808k.C8812d.PrivacyProtection, new C6559c());
            C8808k.m32791a(C8808k.C8812d.EventDeactivation, new C6560d());
        }
    }

    /* renamed from: a */
    public static void m25876a() {
        Class<C6555i> cls = C6555i.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C8819n.m32841h(new C6556a());
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}
