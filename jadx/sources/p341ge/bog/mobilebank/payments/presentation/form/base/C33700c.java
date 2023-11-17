package p341ge.bog.mobilebank.payments.presentation.form.base;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33697a;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;

/* renamed from: ge.bog.mobilebank.payments.presentation.form.base.c */
public interface C33700c {

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.base.c$a */
    public static final class C33701a {
        /* renamed from: a */
        public static C39491a m99050a(C33700c cVar, C33702d.C33703a aVar) {
            Object obj;
            boolean z;
            C41536l.m120489i(aVar, "elementType");
            Iterator it = cVar.mo71866t().mo80302f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C33697a.C33698a) obj).mo80308b() == aVar) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C33697a.C33698a aVar2 = (C33697a.C33698a) obj;
            if (aVar2 != null) {
                return aVar2.mo80309c();
            }
            return null;
        }

        /* renamed from: b */
        public static List m99051b(C33700c cVar) {
            List f = cVar.mo71866t().mo80302f();
            C41536l.m120487g(f, "null cannot be cast to non-null type kotlin.collections.List<ge.bog.mobilebank.payments.presentation.form.base.BaseFormManager.LayoutEntry<T of ge.bog.mobilebank.payments.presentation.form.base.FormElementResolver.getEntries>>");
            return f;
        }
    }

    /* renamed from: t */
    C33697a mo71866t();
}
