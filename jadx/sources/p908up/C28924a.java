package p908up;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.application.data.entity.ApplicationTypeEntity;
import p941xp.C29821a;
import p941xp.C29822b;

/* renamed from: up.a */
public abstract class C28924a {
    /* renamed from: a */
    public static final C29822b m88560a(ApplicationTypeEntity applicationTypeEntity) {
        C41536l.m120489i(applicationTypeEntity, "<this>");
        String appType = applicationTypeEntity.getAppType();
        if (appType == null) {
            return null;
        }
        try {
            C29821a valueOf = C29821a.valueOf(appType);
            if (valueOf == null) {
                return null;
            }
            return new C29822b(valueOf, applicationTypeEntity.getDictionaryKey());
        } catch (Exception unused) {
            return null;
        }
    }
}
