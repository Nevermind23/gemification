package p341ge.bog.sso_client.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import sso.queery.GetResetFlowContactsQuery;
import sso.queery.GetResetFlowTransactionsQuery;

/* renamed from: ge.bog.sso_client.models.k */
public abstract class C35946k {
    /* renamed from: a */
    public static final C35960p m106977a(GetResetFlowContactsQuery.GetPasswordRecoveryContacts getPasswordRecoveryContacts) {
        List list;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        List<GetResetFlowContactsQuery.Contact> contacts;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String lastNameInt;
        if (getPasswordRecoveryContacts == null || (contacts = getPasswordRecoveryContacts.getContacts()) == null) {
            list = null;
        } else {
            list = new ArrayList(C41343r.m119925u(contacts, 10));
            for (GetResetFlowContactsQuery.Contact contact : contacts) {
                if (contact == null || (str = contact.getFirstName()) == null) {
                    str = "";
                }
                if (contact == null || (str2 = contact.getFirstNameInt()) == null) {
                    str2 = "";
                }
                if (contact == null || (str3 = contact.getHashId()) == null) {
                    str3 = "";
                }
                if (contact == null || (str4 = contact.getLastName()) == null) {
                    str4 = "";
                }
                if (contact == null || (lastNameInt = contact.getLastNameInt()) == null) {
                    str5 = "";
                } else {
                    str5 = lastNameInt;
                }
                list.add(new C35935c(str, str2, str3, str4, str5));
            }
        }
        if (list == null) {
            list = C41341q.m119907j();
        }
        if (getPasswordRecoveryContacts == null || (bigDecimal = getPasswordRecoveryContacts.getMaxChooseLimit()) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        C41536l.m120488h(bigDecimal, "this?.maxChooseLimit ?: BigDecimal.ZERO");
        if (getPasswordRecoveryContacts == null || (bigDecimal2 = getPasswordRecoveryContacts.getChooseTimeLimit()) == null) {
            bigDecimal2 = BigDecimal.ZERO;
        }
        C41536l.m120488h(bigDecimal2, "this?.chooseTimeLimit ?: BigDecimal.ZERO");
        return new C35960p(list, bigDecimal, bigDecimal2);
    }

    /* renamed from: b */
    public static final C35961q m106978b(GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions getPasswordRecoveryTransactions) {
        List list;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        List<GetResetFlowTransactionsQuery.Contact> contacts;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j;
        String str8;
        String title;
        BigDecimal operationDate;
        if (getPasswordRecoveryTransactions == null || (contacts = getPasswordRecoveryTransactions.getContacts()) == null) {
            list = null;
        } else {
            list = new ArrayList(C41343r.m119925u(contacts, 10));
            for (GetResetFlowTransactionsQuery.Contact contact : contacts) {
                if (contact == null || (str = contact.getAmount()) == null) {
                    str = "";
                }
                if (contact == null || (str2 = contact.getCcy()) == null) {
                    str2 = "";
                }
                if (contact == null || (str3 = contact.getDescription()) == null) {
                    str3 = "";
                }
                if (contact == null || (str4 = contact.getEntryGroup()) == null) {
                    str4 = "";
                }
                if (contact == null || (str5 = contact.getGroupNameGe()) == null) {
                    str5 = "";
                }
                if (contact == null || (str6 = contact.getGroupNameInt()) == null) {
                    str6 = "";
                }
                if (contact == null || (str7 = contact.getIdHash()) == null) {
                    str7 = "";
                }
                if (contact == null || (operationDate = contact.getOperationDate()) == null) {
                    j = 0;
                } else {
                    j = operationDate.longValue();
                }
                if (contact == null || (title = contact.getTitle()) == null) {
                    str8 = "";
                } else {
                    str8 = title;
                }
                list.add(new C35964t(str, str2, str3, str4, str5, str6, str7, j, str8));
            }
        }
        if (list == null) {
            list = C41341q.m119907j();
        }
        if (getPasswordRecoveryTransactions == null || (bigDecimal = getPasswordRecoveryTransactions.getMaxChooseLimit()) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        C41536l.m120488h(bigDecimal, "this?.maxChooseLimit ?: BigDecimal.ZERO");
        if (getPasswordRecoveryTransactions == null || (bigDecimal2 = getPasswordRecoveryTransactions.getChooseTimeLimit()) == null) {
            bigDecimal2 = BigDecimal.ZERO;
        }
        C41536l.m120488h(bigDecimal2, "this?.chooseTimeLimit ?: BigDecimal.ZERO");
        return new C35961q(list, bigDecimal, bigDecimal2);
    }
}
