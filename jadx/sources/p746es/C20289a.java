package p746es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.contact.entity.ContactAccountApiModel;
import p341ge.bog.mobilebank.cleanarch.data.contact.entity.ContactApiModel;
import p891su.C28261a;
import p891su.C28262b;
import p891su.C28267d;
import p891su.C28269e;

/* renamed from: es.a */
public final class C20289a {
    /* renamed from: a */
    public final List mo48767a(List list) {
        C41536l.m120489i(list, "contacts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo48768b((ContactApiModel) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C28261a mo48768b(ContactApiModel contactApiModel) {
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C41536l.m120489i(contactApiModel, "contact");
        long id = contactApiModel.getId();
        String fullName = contactApiModel.getFullName();
        String fullNameGe = contactApiModel.getFullNameGe();
        String fullNameEn = contactApiModel.getFullNameEn();
        String nickName = contactApiModel.getNickName();
        String profilePicture = contactApiModel.getProfilePicture();
        C28267d a = C28267d.f71752e.mo67881a(contactApiModel.getBank());
        List<ContactAccountApiModel> accounts = contactApiModel.getAccounts();
        if (accounts != null) {
            list = new ArrayList(C41343r.m119925u(accounts, 10));
            for (ContactAccountApiModel c : accounts) {
                list.add(mo48769c(c));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = C41341q.m119907j();
        }
        C28269e a2 = C28269e.f71756e.mo67883a(contactApiModel.getConnectionType());
        long firstInteractionDate = contactApiModel.getFirstInteractionDate();
        boolean z5 = false;
        if (contactApiModel.getLinkImageId() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean canRequestMoney = contactApiModel.getCanRequestMoney();
        Boolean isTrusted = contactApiModel.isTrusted();
        if (isTrusted != null) {
            z2 = isTrusted.booleanValue();
        } else {
            z2 = false;
        }
        Boolean isPrimary = contactApiModel.isPrimary();
        if (isPrimary != null) {
            z3 = isPrimary.booleanValue();
        } else {
            z3 = false;
        }
        String phoneNumber = contactApiModel.getPhoneNumber();
        Boolean isPhoneChangeAvailable = contactApiModel.isPhoneChangeAvailable();
        if (isPhoneChangeAvailable != null) {
            z5 = isPhoneChangeAvailable.booleanValue();
        }
        boolean z6 = z5;
        Boolean canTrust = contactApiModel.getCanTrust();
        if (canTrust != null) {
            z4 = canTrust.booleanValue();
        } else {
            z4 = true;
        }
        return new C28261a(id, fullName, fullNameGe, fullNameEn, nickName, profilePicture, a, list, a2, firstInteractionDate, z, canRequestMoney, z2, z3, phoneNumber, z6, z4);
    }

    /* renamed from: c */
    public final C28262b mo48769c(ContactAccountApiModel contactAccountApiModel) {
        C41536l.m120489i(contactAccountApiModel, "account");
        return new C28262b(contactAccountApiModel.getId(), contactAccountApiModel.getAcctNo(), contactAccountApiModel.getBank(), contactAccountApiModel.isDefault(), contactAccountApiModel.getAcctName());
    }
}
