package p453hm;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardRegisterResultEntity;
import p537nm.C17109z;

/* renamed from: hm.a */
public abstract class C15534a {
    /* renamed from: a */
    public static final C17109z m56110a(DebitCardRegisterResultEntity debitCardRegisterResultEntity) {
        C41536l.m120489i(debitCardRegisterResultEntity, "<this>");
        return new C17109z(debitCardRegisterResultEntity.getCardId(), debitCardRegisterResultEntity.getRegisterCardResultCode());
    }
}
