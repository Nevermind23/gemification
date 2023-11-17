package h51;

import java.util.ArrayList;
import java.util.List;
import p341ge.bog.sso_client.models.UserContact;

/* renamed from: h51.a */
public final class C36153a {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 == false) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k51.C36873a mo88907a(p341ge.bog.sso_client.models.UserContact r8) {
        /*
            r7 = this;
            java.lang.String r0 = "mail"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            k51.a r0 = new k51.a
            java.lang.String r2 = r8.mo88420d()
            kotlin.jvm.internal.C41536l.m120486f(r2)
            java.lang.String r3 = r8.mo88418a()
            kotlin.jvm.internal.C41536l.m120486f(r3)
            java.lang.Boolean r1 = r8.mo88419b()
            r4 = 0
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.booleanValue()
            goto L_0x0022
        L_0x0021:
            r1 = r4
        L_0x0022:
            r5 = 1
            if (r1 != 0) goto L_0x0036
            java.lang.Boolean r1 = r8.mo88422e()
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.booleanValue()
            goto L_0x0031
        L_0x0030:
            r1 = r4
        L_0x0031:
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            java.lang.Boolean r1 = r8.mo88419b()
            if (r1 == 0) goto L_0x0042
            boolean r1 = r1.booleanValue()
            goto L_0x0043
        L_0x0042:
            r1 = r4
        L_0x0043:
            if (r1 != 0) goto L_0x0054
            java.lang.Boolean r1 = r8.mo88422e()
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.booleanValue()
            goto L_0x0051
        L_0x0050:
            r1 = r4
        L_0x0051:
            if (r1 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r5 = r4
        L_0x0055:
            java.lang.Boolean r8 = r8.mo88419b()
            if (r8 == 0) goto L_0x0060
            boolean r8 = r8.booleanValue()
            goto L_0x0061
        L_0x0060:
            r8 = r4
        L_0x0061:
            r1 = r0
            r4 = r6
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h51.C36153a.mo88907a(ge.bog.sso_client.models.UserContact):k51.a");
    }

    /* renamed from: b */
    public final List mo88908b(List list) {
        ArrayList arrayList;
        boolean z;
        if (list != null) {
            ArrayList<UserContact> arrayList2 = new ArrayList<>();
            for (Object next : list) {
                UserContact userContact = (UserContact) next;
                if (userContact.mo88418a() == null || userContact.mo88420d() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (UserContact a : arrayList2) {
                arrayList.add(mo88907a(a));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return C41341q.m119907j();
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 == false) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k51.C36874b mo88909c(p341ge.bog.sso_client.models.UserContact r8) {
        /*
            r7 = this;
            java.lang.String r0 = "phone"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            k51.b r0 = new k51.b
            java.lang.String r2 = r8.mo88420d()
            kotlin.jvm.internal.C41536l.m120486f(r2)
            java.lang.String r3 = r8.mo88418a()
            kotlin.jvm.internal.C41536l.m120486f(r3)
            java.lang.Boolean r1 = r8.mo88419b()
            r4 = 0
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.booleanValue()
            goto L_0x0022
        L_0x0021:
            r1 = r4
        L_0x0022:
            r5 = 1
            if (r1 != 0) goto L_0x0036
            java.lang.Boolean r1 = r8.mo88422e()
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.booleanValue()
            goto L_0x0031
        L_0x0030:
            r1 = r4
        L_0x0031:
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            java.lang.Boolean r1 = r8.mo88419b()
            if (r1 == 0) goto L_0x0042
            boolean r1 = r1.booleanValue()
            goto L_0x0043
        L_0x0042:
            r1 = r4
        L_0x0043:
            if (r1 != 0) goto L_0x0054
            java.lang.Boolean r1 = r8.mo88422e()
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.booleanValue()
            goto L_0x0051
        L_0x0050:
            r1 = r4
        L_0x0051:
            if (r1 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r5 = r4
        L_0x0055:
            java.lang.Boolean r8 = r8.mo88419b()
            if (r8 == 0) goto L_0x0060
            boolean r8 = r8.booleanValue()
            goto L_0x0061
        L_0x0060:
            r8 = r4
        L_0x0061:
            r1 = r0
            r4 = r6
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h51.C36153a.mo88909c(ge.bog.sso_client.models.UserContact):k51.b");
    }

    /* renamed from: d */
    public final List mo88910d(List list) {
        ArrayList arrayList;
        boolean z;
        if (list != null) {
            ArrayList<UserContact> arrayList2 = new ArrayList<>();
            for (Object next : list) {
                UserContact userContact = (UserContact) next;
                if (userContact.mo88418a() == null || userContact.mo88420d() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (UserContact c : arrayList2) {
                arrayList.add(mo88909c(c));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return C41341q.m119907j();
        }
        return arrayList;
    }
}
