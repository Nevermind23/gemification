package i11;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import h11.C36142a;
import j51.C36735g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m11.C37202b;
import m11.C37203c;
import m51.C37228a;
import md0.C26186e;
import nd0.C26453c;
import o11.C37585a;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;
import pd0.C27503h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: i11.b */
public final class C36340b implements C37585a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C36735g f87705d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C36142a f87706e;

    /* renamed from: f */
    private final C27503h f87707f = new C27503h();

    /* renamed from: i11.b$a */
    static final class C36341a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36340b f87708d;

        /* renamed from: i11.b$a$a */
        static final class C36342a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C36342a f87709d = new C36342a();

            C36342a() {
                super(1);
            }

            /* renamed from: a */
            public final C37203c invoke(ExternalFileEntity externalFileEntity) {
                C37202b bVar;
                boolean z;
                C41536l.m120489i(externalFileEntity, "it");
                String fileUrl = externalFileEntity.getFileUrl();
                if (fileUrl != null) {
                    if (externalFileEntity.isDark() == YesNoApiEntity.YES) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar = new C37202b(fileUrl, z, externalFileEntity.getFileSubType());
                } else {
                    bVar = null;
                }
                return new C37203c(bVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36341a(C36340b bVar) {
            super(0);
            this.f87708d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C37203c m107851c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C37203c) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40749p invoke() {
            C36142a a4 = this.f87708d.f87706e;
            C37228a a = this.f87708d.f87705d.mo89562a();
            C40749p k0 = a4.mo88895a(String.valueOf(a != null ? Long.valueOf(a.mo90305b()) : null)).mo95026k0(new C36339a(C36342a.f87709d));
            C41536l.m120488h(k0, "service.getPreLoginImage… })\n                    }");
            return k0;
        }
    }

    public C36340b(C36735g gVar, C36142a aVar) {
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(aVar, "service");
        this.f87705d = gVar;
        this.f87706e = aVar;
    }

    /* renamed from: c3 */
    public C40734b mo89053c3(String str) {
        Long l;
        C36142a aVar = this.f87706e;
        C37228a a = this.f87705d.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        return aVar.mo88896b(String.valueOf(l), str);
    }

    public void clean() {
        this.f87707f.mo66811l();
    }

    /* renamed from: l3 */
    public C40762x mo89054l3(boolean z) {
        C40762x h = C26186e.m81990h(C26453c.m82747e(this.f87707f.mo66812m()));
        this.f87707f.mo66814o(z, new C36341a(this)).mo94979E0();
        return h;
    }
}
