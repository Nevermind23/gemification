package p341ge.bog.mobilebank.giftcards.presentation.offersandapplications;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.giftcards.presentation.details_sheet.GiftCardDetailsActionSheetUiModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p420fh.C12902d;
import p420fh.C12910e;
import ri0.C28044a;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.d */
public interface C24321d {

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.d$a */
    public static final class C24322a implements C24321d {

        /* renamed from: a */
        private final GiftCardDetailsActionSheetUiModel f62845a;

        public C24322a(GiftCardDetailsActionSheetUiModel giftCardDetailsActionSheetUiModel) {
            C41536l.m120489i(giftCardDetailsActionSheetUiModel, "uiModel");
            this.f62845a = giftCardDetailsActionSheetUiModel;
        }

        /* renamed from: a */
        public void mo62015a(C1505h hVar, C35651n1 n1Var, FragmentManager fragmentManager) {
            C41536l.m120489i(hVar, "requireActivity");
            C41536l.m120489i(n1Var, "fragment");
            C41536l.m120489i(fragmentManager, "fragmentManager");
            C28044a.f71394I.mo67586a(this.f62845a).mo4576A1(fragmentManager, (String) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24322a) && C41536l.m120484d(this.f62845a, ((C24322a) obj).f62845a);
        }

        public int hashCode() {
            return this.f62845a.hashCode();
        }

        public String toString() {
            GiftCardDetailsActionSheetUiModel giftCardDetailsActionSheetUiModel = this.f62845a;
            return "OpenDetailsSheet(uiModel=" + giftCardDetailsActionSheetUiModel + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.d$b */
    public static final class C24323b implements C24321d {

        /* renamed from: a */
        private final String f62846a;

        public C24323b(String str) {
            C41536l.m120489i(str, "link");
            this.f62846a = str;
        }

        /* renamed from: a */
        public void mo62015a(C1505h hVar, C35651n1 n1Var, FragmentManager fragmentManager) {
            C41536l.m120489i(hVar, "requireActivity");
            C41536l.m120489i(n1Var, "fragment");
            C41536l.m120489i(fragmentManager, "fragmentManager");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f62846a));
            PackageManager packageManager = hVar.getPackageManager();
            if (packageManager != null && intent.resolveActivity(packageManager) != null) {
                hVar.startActivity(intent);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24323b) && C41536l.m120484d(this.f62846a, ((C24323b) obj).f62846a);
        }

        public int hashCode() {
            return this.f62846a.hashCode();
        }

        public String toString() {
            String str = this.f62846a;
            return "OpenTerms(link=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.d$c */
    public static final class C24324c implements C24321d {

        /* renamed from: a */
        private final Throwable f62847a;

        public C24324c(Throwable th) {
            C41536l.m120489i(th, "throwable");
            this.f62847a = th;
        }

        /* renamed from: a */
        public void mo62015a(C1505h hVar, C35651n1 n1Var, FragmentManager fragmentManager) {
            C41536l.m120489i(hVar, "requireActivity");
            C41536l.m120489i(n1Var, "fragment");
            C41536l.m120489i(fragmentManager, "fragmentManager");
            n1Var.handleError(this.f62847a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24324c) && C41536l.m120484d(this.f62847a, ((C24324c) obj).f62847a);
        }

        public int hashCode() {
            return this.f62847a.hashCode();
        }

        public String toString() {
            Throwable th = this.f62847a;
            return "ResendFailed(throwable=" + th + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.d$d */
    public static final class C24325d implements C24321d {

        /* renamed from: a */
        private final String f62848a;

        public C24325d(String str) {
            C41536l.m120489i(str, "successText");
            this.f62848a = str;
        }

        /* renamed from: a */
        public void mo62015a(C1505h hVar, C35651n1 n1Var, FragmentManager fragmentManager) {
            C41536l.m120489i(hVar, "requireActivity");
            C41536l.m120489i(n1Var, "fragment");
            C41536l.m120489i(fragmentManager, "fragmentManager");
            C12910e.m48797o(hVar, this.f62848a, (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24325d) && C41536l.m120484d(this.f62848a, ((C24325d) obj).f62848a);
        }

        public int hashCode() {
            return this.f62848a.hashCode();
        }

        public String toString() {
            String str = this.f62848a;
            return "ResendSuccessful(successText=" + str + ")";
        }
    }

    /* renamed from: a */
    void mo62015a(C1505h hVar, C35651n1 n1Var, FragmentManager fragmentManager);
}
