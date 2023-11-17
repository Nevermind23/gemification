package mp0;

import cf1.C40419j;
import g91.C32343x;
import he1.C41224m;
import he1.C41233s;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.C13368e;

/* renamed from: mp0.s */
public interface C16907s {

    /* renamed from: mp0.s$a */
    public static final class C16908a implements C16907s {

        /* renamed from: a */
        public static final C16909a f47236a = new C16909a((DefaultConstructorMarker) null);

        /* renamed from: b */
        private static final C40419j f47237b = new C40419j("^[A-Za-z0-9_]{4,40}$");

        /* renamed from: c */
        private static final C40419j f47238c = new C40419j("^[A-Za-z].*");

        /* renamed from: mp0.s$a$a */
        public static final class C16909a {
            private C16909a() {
            }

            public /* synthetic */ C16909a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public List mo44063a(String str) {
            boolean z;
            C13368e eVar;
            C13368e eVar2;
            C41536l.m120489i(str, "nickname");
            C41224m[] mVarArr = new C41224m[2];
            boolean z2 = false;
            String F = C32343x.m95388F("text.p2p.link.customize.link.length.validation", new Object[0]);
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                eVar = C13368e.INFORMATION;
            } else if (f47237b.mo94489f(str)) {
                eVar = C13368e.POSITIVE;
            } else {
                eVar = C13368e.NEGATIVE;
            }
            mVarArr[0] = C41233s.m119492a(F, eVar);
            String F2 = C32343x.m95388F("text.p2p.link.customize.link.input.validation", new Object[0]);
            if (str.length() == 0) {
                z2 = true;
            }
            if (z2) {
                eVar2 = C13368e.INFORMATION;
            } else if (f47238c.mo94489f(str)) {
                eVar2 = C13368e.POSITIVE;
            } else {
                eVar2 = C13368e.NEGATIVE;
            }
            mVarArr[1] = C41233s.m119492a(F2, eVar2);
            return C41341q.m119910m(mVarArr);
        }
    }

    /* renamed from: a */
    List mo44063a(String str);
}
