package p973zz;

import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.data.entity.NewLoanAllowedEntity;
import p717bs.C19401a;

/* renamed from: zz.b */
public final class C30417b {
    /* renamed from: a */
    public final boolean mo70773a(NewLoanAllowedEntity newLoanAllowedEntity) {
        C41536l.m120489i(newLoanAllowedEntity, "newLoanAllowedEntity");
        if (C19401a.m64892a(newLoanAllowedEntity.getValue()) == C24978b.YES) {
            return true;
        }
        return false;
    }
}
