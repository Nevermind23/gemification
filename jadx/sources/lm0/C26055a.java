package lm0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.junior.data.model.ChildApprovalEntity;
import p341ge.bog.mobilebank.junior.data.model.ChildOtpRequestEntity;
import p341ge.bog.mobilebank.junior.data.model.ChildRequestApproveEntity;
import p341ge.bog.mobilebank.junior.data.model.JuniorRequestDataEntity;
import sm0.C28249a;
import sm0.C28250b;
import sm0.C28251c;

/* renamed from: lm0.a */
public final class C26055a {
    /* renamed from: a */
    public final C28249a mo64950a(ChildApprovalEntity childApprovalEntity) {
        C41536l.m120489i(childApprovalEntity, "entity");
        return new C28249a(childApprovalEntity.isNewUser(), childApprovalEntity.getNeedApproveContact(), childApprovalEntity.getOperationReference(), childApprovalEntity.getRetryCount());
    }

    /* renamed from: b */
    public final C28250b mo64951b(ChildOtpRequestEntity childOtpRequestEntity) {
        C41536l.m120489i(childOtpRequestEntity, "entity");
        return new C28250b(childOtpRequestEntity.getNotificationId(), childOtpRequestEntity.getValidationRequestId());
    }

    /* renamed from: c */
    public final C28251c mo64952c(ChildRequestApproveEntity childRequestApproveEntity) {
        boolean z;
        C41536l.m120489i(childRequestApproveEntity, "entity");
        long childClientKey = childRequestApproveEntity.getChildClientKey();
        String childFirstNameInt = childRequestApproveEntity.getChildFirstNameInt();
        int resultCode = childRequestApproveEntity.getResultCode();
        if (childRequestApproveEntity.getHasSchoolCard() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        return new C28251c(childClientKey, childFirstNameInt, resultCode, z, childRequestApproveEntity.getChildLastName(), childRequestApproveEntity.getChildFirstName(), childRequestApproveEntity.getChildLastNameInt(), childRequestApproveEntity.getChildRequestId());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003d, code lost:
        if (r14.mo63390c() == true) goto L_0x0041;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sm0.C28252d mo64953d(p341ge.bog.mobilebank.junior.data.model.JuniorRequestDataEntity r14) {
        /*
            r13 = this;
            java.lang.String r0 = "entity"
            kotlin.jvm.internal.C41536l.m120489i(r14, r0)
            sm0.d r0 = new sm0.d
            long r2 = r14.getId()
            java.lang.String r4 = r14.getChildPin()
            java.lang.Long r5 = r14.getChildClientKey()
            java.lang.String r6 = r14.getChildFirstName()
            java.lang.String r7 = r14.getChildLastName()
            java.lang.Long r8 = r14.getChildBirthDate()
            java.lang.String r9 = r14.getChildMobileNumber()
            java.lang.Long r10 = r14.getParentClientKey()
            java.lang.String r11 = r14.getParentMobileNumber()
            ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r14 = r14.getStatus()
            r1 = 0
            if (r14 == 0) goto L_0x0040
            hd0.b r14 = p717bs.C19401a.m64892a(r14)
            if (r14 == 0) goto L_0x0040
            boolean r14 = r14.mo63390c()
            r12 = 1
            if (r14 != r12) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r12 = r1
        L_0x0041:
            r1 = r0
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lm0.C26055a.mo64953d(ge.bog.mobilebank.junior.data.model.JuniorRequestDataEntity):sm0.d");
    }

    /* renamed from: e */
    public final List mo64954e(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo64953d((JuniorRequestDataEntity) it.next()));
        }
        return arrayList;
    }
}
