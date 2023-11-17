package p440gn;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardproducts.data.entity.ChildInfoApiModel;
import p524mn.C16801b;

/* renamed from: gn.a */
public final class C15362a {
    /* renamed from: a */
    public final C16801b mo42452a(ChildInfoApiModel childInfoApiModel) {
        C41536l.m120489i(childInfoApiModel, "entity");
        return new C16801b(childInfoApiModel.getBirthDate(), childInfoApiModel.getClientKey(), childInfoApiModel.getFinancialPhone(), childInfoApiModel.getFirstName(), childInfoApiModel.getFirstNameInt(), childInfoApiModel.getLastName(), childInfoApiModel.getLastNameInt(), childInfoApiModel.getPin());
    }
}
