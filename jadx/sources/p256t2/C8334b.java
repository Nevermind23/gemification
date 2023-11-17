package p256t2;

import kotlin.jvm.internal.C41536l;
import p217q2.C7823b;
import p217q2.C7850l;
import p217q2.C7851m;
import p243s2.C8106f;
import p243s2.C8108g;
import ue1.C43075l;

/* renamed from: t2.b */
public final class C8334b implements C8108g {

    /* renamed from: a */
    private final C8341f f23720a;

    /* renamed from: b */
    private final C7851m f23721b;

    /* renamed from: t2.b$a */
    private static final class C8335a implements C8108g.C8111b {

        /* renamed from: a */
        private final C8341f f23722a;

        /* renamed from: b */
        private final C7851m f23723b;

        public C8335a(C8341f fVar, C7851m mVar) {
            C41536l.m120490j(fVar, "jsonWriter");
            C41536l.m120490j(mVar, "scalarTypeAdapters");
            this.f23722a = fVar;
            this.f23723b = mVar;
        }

        /* renamed from: a */
        public void mo23298a(String str) {
            if (str == null) {
                this.f23722a.mo23509R();
            } else {
                this.f23722a.mo23519q0(str);
            }
        }

        /* renamed from: b */
        public void mo23299b(C8106f fVar) {
            if (fVar == null) {
                this.f23722a.mo23509R();
                return;
            }
            this.f23722a.mo23513k();
            fVar.marshal(new C8334b(this.f23722a, this.f23723b));
            this.f23722a.mo23516o();
        }
    }

    public C8334b(C8341f fVar, C7851m mVar) {
        C41536l.m120490j(fVar, "jsonWriter");
        C41536l.m120490j(mVar, "scalarTypeAdapters");
        this.f23720a = fVar;
        this.f23721b = mVar;
    }

    /* renamed from: a */
    public void mo23291a(String str, String str2) {
        C41536l.m120490j(str, "fieldName");
        if (str2 == null) {
            this.f23720a.mo23508Q(str).mo23509R();
        } else {
            this.f23720a.mo23508Q(str).mo23519q0(str2);
        }
    }

    /* renamed from: b */
    public void mo23292b(String str, C7850l lVar, Object obj) {
        C41536l.m120490j(str, "fieldName");
        C41536l.m120490j(lVar, "scalarType");
        if (obj == null) {
            this.f23720a.mo23508Q(str).mo23509R();
            return;
        }
        C7823b a = this.f23721b.mo22821a(lVar).mo22742a(obj);
        if (a instanceof C7823b.C7829f) {
            mo23291a(str, (String) ((C7823b.C7829f) a).f22746a);
        } else if (a instanceof C7823b.C7825b) {
            mo23295e(str, (Boolean) ((C7823b.C7825b) a).f22746a);
        } else if (a instanceof C7823b.C7828e) {
            mo23505g(str, (Number) ((C7823b.C7828e) a).f22746a);
        } else if (a instanceof C7823b.C7827d) {
            C8348h.m31406a(((C7823b.C7827d) a).f22746a, this.f23720a.mo23508Q(str));
        } else if (a instanceof C7823b.C7826c) {
            C8348h.m31406a(((C7823b.C7826c) a).f22746a, this.f23720a.mo23508Q(str));
        }
    }

    /* renamed from: c */
    public void mo23293c(String str, C8106f fVar) {
        C41536l.m120490j(str, "fieldName");
        if (fVar == null) {
            this.f23720a.mo23508Q(str).mo23509R();
            return;
        }
        this.f23720a.mo23508Q(str).mo23513k();
        fVar.marshal(this);
        this.f23720a.mo23516o();
    }

    /* renamed from: d */
    public /* synthetic */ void mo23294d(String str, C43075l lVar) {
        C41536l.m120490j(str, "fieldName");
        C41536l.m120490j(lVar, "block");
        C8108g.C8109a.m30664a(this, str, lVar);
    }

    /* renamed from: e */
    public void mo23295e(String str, Boolean bool) {
        C41536l.m120490j(str, "fieldName");
        if (bool == null) {
            this.f23720a.mo23508Q(str).mo23509R();
        } else {
            this.f23720a.mo23508Q(str).mo23517o0(bool);
        }
    }

    /* renamed from: f */
    public void mo23296f(String str, C8108g.C8112c cVar) {
        C41536l.m120490j(str, "fieldName");
        if (cVar == null) {
            this.f23720a.mo23508Q(str).mo23509R();
            return;
        }
        this.f23720a.mo23508Q(str).mo23510a();
        cVar.write(new C8335a(this.f23720a, this.f23721b));
        this.f23720a.mo23514n();
    }

    /* renamed from: g */
    public void mo23505g(String str, Number number) {
        C41536l.m120490j(str, "fieldName");
        if (number == null) {
            this.f23720a.mo23508Q(str).mo23509R();
        } else {
            this.f23720a.mo23508Q(str).mo23518p0(number);
        }
    }
}
