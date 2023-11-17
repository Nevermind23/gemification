package p341ge.bog.mobilebank.rest.model.otpparameter;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.ChangePasswordParams_Factory */
public final class ChangePasswordParams_Factory implements C41084a {
    private final C41084a newPasswordProvider;
    private final C41084a oldPasswordProvider;
    private final C41084a operationReferenceProvider;
    private final C41084a scaAuthCodeProvider;
    private final C41084a serviceIdProvider;

    public ChangePasswordParams_Factory(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5) {
        this.oldPasswordProvider = aVar;
        this.newPasswordProvider = aVar2;
        this.serviceIdProvider = aVar3;
        this.operationReferenceProvider = aVar4;
        this.scaAuthCodeProvider = aVar5;
    }

    public static ChangePasswordParams_Factory create(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5) {
        return new ChangePasswordParams_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static ChangePasswordParams newInstance(String str, String str2, String str3, String str4, String str5) {
        return new ChangePasswordParams(str, str2, str3, str4, str5);
    }

    public ChangePasswordParams get() {
        return newInstance((String) this.oldPasswordProvider.get(), (String) this.newPasswordProvider.get(), (String) this.serviceIdProvider.get(), (String) this.operationReferenceProvider.get(), (String) this.scaAuthCodeProvider.get());
    }
}
