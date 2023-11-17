package db1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import sso.queery.GetClientInfoQuery;
import sso.type.UserContactType;
import xa1.C39832a;

/* renamed from: db1.b */
public final class C31552b {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final db1.C31551a m93640a(sso.queery.GetClientInfoQuery.ClientContact r8) {
        /*
            r7 = this;
            db1.a r0 = new db1.a
            java.lang.String r1 = r8.getId()
            kotlin.jvm.internal.C41536l.m120486f(r1)
            java.lang.String r2 = r8.getContact()
            kotlin.jvm.internal.C41536l.m120486f(r2)
            java.lang.Boolean r3 = r8.getFinancial()
            r4 = 0
            if (r3 == 0) goto L_0x001c
            boolean r3 = r3.booleanValue()
            goto L_0x001d
        L_0x001c:
            r3 = r4
        L_0x001d:
            r5 = 1
            if (r3 != 0) goto L_0x0031
            java.lang.Boolean r3 = r8.getPreSelected()
            if (r3 == 0) goto L_0x002b
            boolean r3 = r3.booleanValue()
            goto L_0x002c
        L_0x002b:
            r3 = r4
        L_0x002c:
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = r4
            goto L_0x0032
        L_0x0031:
            r3 = r5
        L_0x0032:
            java.lang.Boolean r6 = r8.getFinancial()
            if (r6 == 0) goto L_0x003d
            boolean r6 = r6.booleanValue()
            goto L_0x003e
        L_0x003d:
            r6 = r4
        L_0x003e:
            if (r6 != 0) goto L_0x004f
            java.lang.Boolean r8 = r8.getPreSelected()
            if (r8 == 0) goto L_0x004b
            boolean r8 = r8.booleanValue()
            goto L_0x004c
        L_0x004b:
            r8 = r4
        L_0x004c:
            if (r8 != 0) goto L_0x004f
            r4 = r5
        L_0x004f:
            r0.<init>(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: db1.C31552b.m93640a(sso.queery.GetClientInfoQuery$ClientContact):db1.a");
    }

    /* renamed from: b */
    public final C31553c mo71966b(C39832a aVar) {
        C41536l.m120489i(aVar, "data");
        return new C31553c(mo71967c(aVar.mo93531c()), aVar.mo93530b(), aVar.mo93529a());
    }

    /* renamed from: c */
    public final C31554d mo71967c(GetClientInfoQuery.GetClientInfo getClientInfo) {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        C41536l.m120489i(getClientInfo, "info");
        List<GetClientInfoQuery.ClientContact> clientContacts = getClientInfo.getClientContacts();
        if (clientContacts == null || (list = C41358y.m120004T(clientContacts)) == null) {
            list = C41341q.m119907j();
        }
        String username = getClientInfo.getUsername();
        if (username == null) {
            str = "";
        } else {
            str = username;
        }
        String firstName = getClientInfo.getFirstName();
        if (firstName == null) {
            str2 = "";
        } else {
            str2 = firstName;
        }
        String lastName = getClientInfo.getLastName();
        if (lastName == null) {
            str3 = "";
        } else {
            str3 = lastName;
        }
        String imageURL = getClientInfo.getImageURL();
        boolean d = C41536l.m120484d(getClientInfo.getProfilePictureStatus(), Boolean.TRUE);
        ArrayList<GetClientInfoQuery.ClientContact> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((GetClientInfoQuery.ClientContact) next).getType() == UserContactType.PHONE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (GetClientInfoQuery.ClientContact a : arrayList) {
            arrayList2.add(m93640a(a));
        }
        ArrayList<GetClientInfoQuery.ClientContact> arrayList3 = new ArrayList<>();
        for (Object next2 : list) {
            if (((GetClientInfoQuery.ClientContact) next2).getType() == UserContactType.MAIL) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(arrayList3, 10));
        for (GetClientInfoQuery.ClientContact a2 : arrayList3) {
            arrayList4.add(m93640a(a2));
        }
        String address = getClientInfo.getAddress();
        if (address == null) {
            str4 = "";
        } else {
            str4 = address;
        }
        return new C31554d(str, str2, str3, imageURL, d, arrayList2, arrayList4, str4, C41536l.m120484d(getClientInfo.isDefaultImage(), Boolean.TRUE));
    }
}
