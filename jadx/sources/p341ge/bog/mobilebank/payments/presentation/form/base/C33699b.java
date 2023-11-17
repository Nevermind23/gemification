package p341ge.bog.mobilebank.payments.presentation.form.base;

import dy0.C31621d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import s31.C38422b;
import s31.C38423c;
import s31.C38425e;

/* renamed from: ge.bog.mobilebank.payments.presentation.form.base.b */
public class C33699b implements C33702d {

    /* renamed from: d */
    private final C38425e f82105d;

    /* renamed from: e */
    private final C38422b f82106e;

    /* renamed from: f */
    private final boolean f82107f;

    /* renamed from: g */
    private final C33702d.C33703a f82108g;

    public C33699b(C38425e eVar, C38422b bVar, boolean z, C33702d.C33703a aVar) {
        C41536l.m120489i(aVar, "elementType");
        this.f82105d = eVar;
        this.f82106e = bVar;
        this.f82107f = z;
        this.f82108g = aVar;
    }

    /* renamed from: a */
    public boolean mo80313a() {
        Boolean a;
        C38422b bVar = this.f82106e;
        if (bVar == null || (a = bVar.mo91956a()) == null) {
            return true;
        }
        return a.booleanValue();
    }

    /* renamed from: b */
    public C33702d.C33703a mo80314b() {
        return this.f82108g;
    }

    /* renamed from: c */
    public String mo80315c() {
        C38422b bVar = this.f82106e;
        if (bVar != null) {
            return bVar.mo91957b();
        }
        return null;
    }

    /* renamed from: d */
    public String mo80316d() {
        C38422b bVar = this.f82106e;
        if (bVar != null) {
            return bVar.mo91958c();
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo80317e() {
        C38422b bVar = this.f82106e;
        if (bVar != null) {
            return bVar.mo91963g();
        }
        return true;
    }

    /* renamed from: f */
    public String mo80318f() {
        C38422b bVar = this.f82106e;
        if (bVar != null) {
            return bVar.mo91964h();
        }
        return null;
    }

    /* renamed from: g */
    public String mo80319g() {
        String e;
        C38422b bVar = this.f82106e;
        if (bVar != null && (e = bVar.mo91960e()) != null) {
            return e;
        }
        C38425e eVar = this.f82105d;
        if (eVar != null) {
            return eVar.mo91987d();
        }
        return null;
    }

    /* renamed from: h */
    public List mo80320h() {
        List<C38423c> f;
        int i;
        C38422b bVar = this.f82106e;
        if (bVar == null || (f = bVar.mo91962f()) == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(f, 10));
        for (C38423c cVar : f) {
            List f2 = this.f82106e.mo91962f();
            if (f2 != null) {
                i = f2.indexOf(cVar);
            } else {
                i = 0;
            }
            arrayList.add(C31621d.m93738a(cVar, i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final C38425e mo80321i() {
        return this.f82105d;
    }

    /* renamed from: j */
    public String mo80322j() {
        C38422b bVar = this.f82106e;
        if (bVar != null) {
            return bVar.mo91967j();
        }
        return null;
    }

    /* renamed from: k */
    public String mo80323k() {
        C38422b bVar = this.f82106e;
        if (bVar != null) {
            return bVar.mo91970m();
        }
        return null;
    }

    /* renamed from: l */
    public String mo80324l() {
        C38422b bVar = this.f82106e;
        if (bVar != null) {
            return bVar.mo91971n();
        }
        return null;
    }

    /* renamed from: m */
    public boolean mo80325m() {
        C38425e eVar = this.f82105d;
        if (eVar != null) {
            return C41536l.m120484d(eVar.mo91991g(), Boolean.TRUE);
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo80326n() {
        C38425e eVar = this.f82105d;
        if (eVar != null) {
            return C41536l.m120484d(eVar.mo91986c(), Boolean.TRUE);
        }
        return false;
    }

    /* renamed from: o */
    public boolean mo80327o() {
        C38422b bVar = this.f82106e;
        if (bVar != null) {
            return C41536l.m120484d(bVar.mo91972o(), Boolean.TRUE);
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo80328p() {
        return this.f82107f;
    }

    /* renamed from: q */
    public boolean mo80329q() {
        C38422b bVar = this.f82106e;
        if (bVar != null) {
            return bVar.mo91968k();
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33699b(C38425e eVar, C38422b bVar, boolean z, C33702d.C33703a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? false : z, aVar);
    }
}
