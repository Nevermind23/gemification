package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import androidx.lifecycle.C1613n0;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel_ViewModel_HiltModules */
public final class MoreViewModel_ViewModel_HiltModules {

    /* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel_ViewModel_HiltModules$BindsModule */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract C1613n0 binds(MoreViewModel.ViewModel viewModel);
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel_ViewModel_HiltModules$KeyModule */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel$ViewModel";
        }
    }

    private MoreViewModel_ViewModel_HiltModules() {
    }
}
