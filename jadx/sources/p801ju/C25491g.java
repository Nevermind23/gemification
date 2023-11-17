package p801ju;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p653wf.C18583l;

/* renamed from: ju.g */
public final class C25491g implements C18583l {

    /* renamed from: a */
    private final boolean f65154a;

    /* renamed from: b */
    private final String f65155b;

    /* renamed from: c */
    private final String f65156c;

    public C25491g(PreferencesApiManager preferencesApiManager, TargetEnvironment targetEnvironment) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(targetEnvironment, "environment");
        this.f65154a = preferencesApiManager.isHttpRequestsLoggingEnabled();
        this.f65155b = targetEnvironment.getChatRest();
        this.f65156c = targetEnvironment.getChatSocket();
    }

    /* renamed from: a */
    public String mo46434a() {
        return this.f65155b;
    }

    /* renamed from: b */
    public boolean mo46435b() {
        return this.f65154a;
    }

    /* renamed from: c */
    public String mo46436c() {
        return this.f65156c;
    }
}
