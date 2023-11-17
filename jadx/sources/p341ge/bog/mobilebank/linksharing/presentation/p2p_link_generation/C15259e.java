package p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7520a;
import p202p0.C7593r;
import wo0.C18652b;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.e */
public abstract class C15259e {

    /* renamed from: a */
    public static final C15261b f43634a = new C15261b((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.e$a */
    private static final class C15260a implements C7593r {

        /* renamed from: a */
        private final int f43635a;

        /* renamed from: b */
        private final int f43636b = C18652b.action_p2PLinkGenerationFragment_to_chooseAccountDialogFragment;

        public C15260a(int i) {
            this.f43635a = i;
        }

        /* renamed from: a */
        public int mo22014a() {
            return this.f43636b;
        }

        /* renamed from: b */
        public Bundle mo22015b() {
            Bundle bundle = new Bundle();
            bundle.putInt("selectedAccountPosition", this.f43635a);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15260a) && this.f43635a == ((C15260a) obj).f43635a;
        }

        public int hashCode() {
            return this.f43635a;
        }

        public String toString() {
            int i = this.f43635a;
            return "ActionP2PLinkGenerationFragmentToChooseAccountDialogFragment(selectedAccountPosition=" + i + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.e$b */
    public static final class C15261b {
        private C15261b() {
        }

        public /* synthetic */ C15261b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7593r mo42321a(int i) {
            return new C15260a(i);
        }

        /* renamed from: b */
        public final C7593r mo42322b() {
            return new C7520a(C18652b.action_p2PLinkGenerationFragment_to_p2PLinkSharingRouter);
        }
    }
}
