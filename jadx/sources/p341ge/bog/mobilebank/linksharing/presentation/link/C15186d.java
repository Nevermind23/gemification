package p341ge.bog.mobilebank.linksharing.presentation.link;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7593r;
import wo0.C18652b;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.d */
public abstract class C15186d {

    /* renamed from: a */
    public static final C15188b f43515a = new C15188b((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.d$a */
    private static final class C15187a implements C7593r {

        /* renamed from: a */
        private final int f43516a;

        /* renamed from: b */
        private final int f43517b = C18652b.action_p2PLinkSharingFragment_to_chooseAccountDialogFragment;

        public C15187a(int i) {
            this.f43516a = i;
        }

        /* renamed from: a */
        public int mo22014a() {
            return this.f43517b;
        }

        /* renamed from: b */
        public Bundle mo22015b() {
            Bundle bundle = new Bundle();
            bundle.putInt("selectedAccountPosition", this.f43516a);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15187a) && this.f43516a == ((C15187a) obj).f43516a;
        }

        public int hashCode() {
            return this.f43516a;
        }

        public String toString() {
            int i = this.f43516a;
            return "ActionP2PLinkSharingFragmentToChooseAccountDialogFragment(selectedAccountPosition=" + i + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.d$b */
    public static final class C15188b {
        private C15188b() {
        }

        public /* synthetic */ C15188b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7593r mo42232a(int i) {
            return new C15187a(i);
        }
    }
}
