package p341ge.bog.sso_client.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.sso_client.models.SessionUserInfo */
public final class SessionUserInfo {
    private final String avatarUrl;
    private final String firstName;
    private final String lastName;
    private final List<UserContact> mails;
    private final List<UserContact> phones;
    private final String username;

    public SessionUserInfo(String str, String str2, String str3, String str4, List<UserContact> list, List<UserContact> list2) {
        this.username = str;
        this.avatarUrl = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.phones = list;
        this.mails = list2;
    }

    public static /* synthetic */ SessionUserInfo copy$default(SessionUserInfo sessionUserInfo, String str, String str2, String str3, String str4, List<UserContact> list, List<UserContact> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionUserInfo.username;
        }
        if ((i & 2) != 0) {
            str2 = sessionUserInfo.avatarUrl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = sessionUserInfo.firstName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = sessionUserInfo.lastName;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = sessionUserInfo.phones;
        }
        List<UserContact> list3 = list;
        if ((i & 32) != 0) {
            list2 = sessionUserInfo.mails;
        }
        return sessionUserInfo.copy(str, str5, str6, str7, list3, list2);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final List<UserContact> component5() {
        return this.phones;
    }

    public final List<UserContact> component6() {
        return this.mails;
    }

    public final SessionUserInfo copy(String str, String str2, String str3, String str4, List<UserContact> list, List<UserContact> list2) {
        return new SessionUserInfo(str, str2, str3, str4, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionUserInfo)) {
            return false;
        }
        SessionUserInfo sessionUserInfo = (SessionUserInfo) obj;
        return C41536l.m120484d(this.username, sessionUserInfo.username) && C41536l.m120484d(this.avatarUrl, sessionUserInfo.avatarUrl) && C41536l.m120484d(this.firstName, sessionUserInfo.firstName) && C41536l.m120484d(this.lastName, sessionUserInfo.lastName) && C41536l.m120484d(this.phones, sessionUserInfo.phones) && C41536l.m120484d(this.mails, sessionUserInfo.mails);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFullName() {
        boolean z;
        String str = this.firstName;
        boolean z2 = false;
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str2 = this.lastName;
            if (str2 == null || C40439w.m117118v(str2)) {
                z2 = true;
            }
            if (z2) {
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        String str3 = this.firstName;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        sb.append(str3);
        sb.append(' ');
        String str5 = this.lastName;
        if (str5 != null) {
            str4 = str5;
        }
        sb.append(str4);
        return sb.toString();
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final List<UserContact> getMails() {
        return this.mails;
    }

    public final List<UserContact> getPhones() {
        return this.phones;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatarUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<UserContact> list = this.phones;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<UserContact> list2 = this.mails;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "SessionUserInfo(username=" + this.username + ", avatarUrl=" + this.avatarUrl + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", phones=" + this.phones + ", mails=" + this.mails + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SessionUserInfo(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List r11, java.util.List r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r9
        L_0x000f:
            r3 = r13 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r10
        L_0x0016:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r11
        L_0x001d:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r12
        L_0x0023:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.sso_client.models.SessionUserInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
