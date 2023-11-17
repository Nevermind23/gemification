package ke0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.galtandtaggart.data.model.CheckGTClosableApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.IdentomatStatusApiModel;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.GTClosable;
import xe0.C29749g;

/* renamed from: ke0.c */
public final class C25714c {

    /* renamed from: a */
    public static final C25715a f65483a = new C25715a((DefaultConstructorMarker) null);

    /* renamed from: ke0.c$a */
    public static final class C25715a {
        private C25715a() {
        }

        public /* synthetic */ C25715a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List mo64282a(List list) {
        C41536l.m120489i(list, "gtCheck");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CheckGTClosableApiModel checkGTClosableApiModel = (CheckGTClosableApiModel) it.next();
            arrayList.add(new GTClosable(checkGTClosableApiModel.getFieldValue(), checkGTClosableApiModel.getFieldDictionaryKey()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C29749g mo64283b(IdentomatStatusApiModel identomatStatusApiModel) {
        C41536l.m120489i(identomatStatusApiModel, "identomatStatus");
        String status = identomatStatusApiModel.getStatus();
        if (C41536l.m120484d(status, "KYC_APPROVED")) {
            return C29749g.KYC_APPROVED;
        }
        if (C41536l.m120484d(status, "KYC_DOC_REQUIRED")) {
            return C29749g.KYC_DOC_REQUIRED;
        }
        if (status == null) {
            return C29749g.KYC_APPROVED;
        }
        return C29749g.f75208f;
    }
}
