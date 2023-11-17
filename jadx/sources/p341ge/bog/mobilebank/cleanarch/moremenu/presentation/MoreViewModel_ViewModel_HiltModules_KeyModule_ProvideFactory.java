package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import ge1.C41084a;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel_ViewModel_HiltModules;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel_ViewModel_HiltModules_KeyModule_ProvideFactory */
public final class MoreViewModel_ViewModel_HiltModules_KeyModule_ProvideFactory implements C41084a {

    /* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel_ViewModel_HiltModules_KeyModule_ProvideFactory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MoreViewModel_ViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new MoreViewModel_ViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static MoreViewModel_ViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) C18329d.m62677d(MoreViewModel_ViewModel_HiltModules.KeyModule.provide());
    }

    public String get() {
        return provide();
    }
}
