package p341ge.bog.mobilebank.transfers.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.C0430g1;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.TransferTemplateObject;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10320i;
import p366bk.C10325n;
import p366bk.C10328q;
import q81.C38163b;

/* renamed from: ge.bog.mobilebank.transfers.activities.OwnTemplateDetailsActivity */
public class OwnTemplateDetailsActivity extends C34904e {

    /* renamed from: X0 */
    protected TemplateBasketItem f84220X0;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public boolean f84221Y0;

    /* renamed from: Z0 */
    private File f84222Z0;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public C38163b f84223a1 = null;

    /* renamed from: b1 */
    protected Client f84224b1;
    /* access modifiers changed from: private */

    /* renamed from: c1 */
    public View.OnClickListener f84225c1 = new C34871a();

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnTemplateDetailsActivity$a */
    class C34871a implements View.OnClickListener {
        C34871a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m102589c() {
            OwnTemplateDetailsActivity ownTemplateDetailsActivity = OwnTemplateDetailsActivity.this;
            ownTemplateDetailsActivity.f84279M.setIconResource(C10320i.ic_upload_image, ownTemplateDetailsActivity.f84225c1);
            OwnTemplateDetailsActivity.this.f84221Y0 = true;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m102590d(DialogInterface dialogInterface) {
            OwnTemplateDetailsActivity.this.f84223a1 = null;
        }

        public void onClick(View view) {
            TemplateBasketItem templateBasketItem = OwnTemplateDetailsActivity.this.f84220X0;
            if (templateBasketItem == null || templateBasketItem.getTemplateImage() == null || OwnTemplateDetailsActivity.this.f84221Y0) {
                OwnTemplateDetailsActivity.this.f84223a1 = new C38163b(OwnTemplateDetailsActivity.this);
                OwnTemplateDetailsActivity.this.f84223a1.show();
                return;
            }
            OwnTemplateDetailsActivity.this.f84223a1 = new C38163b(OwnTemplateDetailsActivity.this, new int[]{1, 2, 3});
            OwnTemplateDetailsActivity.this.f84223a1.mo91690j(new Runnable[]{null, new C34929y(this)});
            OwnTemplateDetailsActivity.this.f84223a1.setOnDismissListener(new C34930z(this));
            OwnTemplateDetailsActivity.this.f84223a1.show();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnTemplateDetailsActivity$b */
    class C34872b implements C0430g1.C0433c {

        /* renamed from: d */
        final /* synthetic */ boolean f84227d;

        C34872b(boolean z) {
            this.f84227d = z;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String charSequence = menuItem.getTitle().toString();
            String string = OwnTemplateDetailsActivity.this.getResources().getString(C10328q.f28948Wc);
            String string2 = OwnTemplateDetailsActivity.this.getResources().getString(C10328q.settings_menu_text_delete);
            if (charSequence.equals(string)) {
                OwnTemplateDetailsActivity ownTemplateDetailsActivity = OwnTemplateDetailsActivity.this;
                ownTemplateDetailsActivity.f84310r0 = TransferForm.OPERATION_EDIT;
                ownTemplateDetailsActivity.mo85333u3(this.f84227d);
                return true;
            } else if (!charSequence.equals(string2)) {
                return true;
            } else {
                OwnTemplateDetailsActivity.this.mo85334x3("");
                return true;
            }
        }
    }

    /* renamed from: f4 */
    private void m102577f4() {
        String str;
        TransferTemplateObject S3 = mo85290S3(this.f84220X0);
        S3.setTemplateName((String) this.f84311s0.get(0));
        Client client = this.f84224b1;
        File file = this.f84222Z0;
        if (this.f84221Y0) {
            str = BankApi.OPERATION_KEY_REMOVE_IMAGE;
        } else {
            str = null;
        }
        client.modifyTransferTemplate(true, S3, file, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        if (getIntent().hasExtra("TEMPLATE_ITEM")) {
            this.f84220X0 = (TemplateBasketItem) C42035e.m122119a(getIntent().getParcelableExtra("TEMPLATE_ITEM"));
        }
        super.mo37451O1(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public void mo85236P2() {
        boolean z;
        Iterator it = mo85283V3().iterator();
        boolean z2 = true;
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            } else if (TextUtils.isEmpty((CharSequence) this.f84311s0.get(((Integer) it.next()).intValue()))) {
                z2 = false;
            }
        }
        if (mo85315S2() <= Utils.DOUBLE_EPSILON) {
            z2 = false;
        }
        if (mo85323e3()) {
            z2 = false;
        }
        if (!TransferForm.OPERATION_VIEW.equals(this.f84310r0) || mo85312O2(mo85291W3())) {
            z = z2;
        }
        this.f84276J.f68595L.f70288l.setOrange(z, z, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V3 */
    public ArrayList mo85283V3() {
        ArrayList V3 = super.mo85283V3();
        String str = this.f84310r0;
        str.hashCode();
        if (!str.equals(TransferForm.OPERATION_VIEW)) {
            V3.add(new Integer(0));
        }
        return V3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W2 */
    public long mo85238W2() {
        TemplateBasketItem templateBasketItem = this.f84220X0;
        if (templateBasketItem != null) {
            return templateBasketItem.getId();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l3 */
    public void mo85246l3(boolean z) {
        super.mo85246l3(z);
        if (z) {
            this.f84222Z0 = null;
            this.f84221Y0 = false;
            TextTypeView textTypeView = this.f84279M;
            if (textTypeView != null) {
                textTypeView.setIconResource(C10320i.ic_upload_image, this.f84225c1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 139 || i == 140) {
            C38163b bVar = this.f84223a1;
            if (bVar != null) {
                bVar.mo91683c(i, intent);
            }
        } else if (i == 10002) {
            File file = new File(intent.getStringExtra("CROPPED_PATH"));
            this.f84222Z0 = file;
            this.f84279M.setIconFile(file);
            this.f84221Y0 = false;
        }
    }

    public void onBackPressed() {
        if (TransferForm.OPERATION_EDIT.equals(this.f84310r0)) {
            this.f84310r0 = TransferForm.OPERATION_VIEW;
            mo85333u3(false);
            return;
        }
        super.onBackPressed();
    }

    public void onClick(View view) {
        BogButton bogButton = this.f84276J.f68595L.f70288l;
        if (view != bogButton) {
            Intent X3 = mo85292X3(view);
            X3.putExtra("IS_TEMPLATE", TransferForm.MODULE_TEMPLATE.equals(this.f84308p0));
            DomesticTransferWizardActivity.m106485w4(this, X3, 10008);
        } else if (bogButton.isOrange()) {
            String str = this.f84310r0;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 2123274:
                    if (str.equals(TransferForm.OPERATION_EDIT)) {
                        c = 0;
                        break;
                    }
                    break;
                case 2634405:
                    if (str.equals(TransferForm.OPERATION_VIEW)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1996002556:
                    if (str.equals("CREATE")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 2:
                    m102577f4();
                    return;
                case 1:
                    super.onClick(view);
                    return;
                default:
                    return;
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C38163b bVar = this.f84223a1;
        if (bVar != null) {
            bVar.mo91684d(i);
        }
    }

    /* renamed from: s3 */
    public void mo85240s3(boolean z) {
        super.mo85240s3(z);
        String str = this.f84310r0;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 2123274:
                if (str.equals(TransferForm.OPERATION_EDIT)) {
                    c = 0;
                    break;
                }
                break;
            case 2634405:
                if (str.equals(TransferForm.OPERATION_VIEW)) {
                    c = 1;
                    break;
                }
                break;
            case 1996002556:
                if (str.equals("CREATE")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                mo85335z3(false);
                return;
            case 1:
                mo85335z3(true);
                mo85310H3(true);
                mo85326n3(C10325n.template_menu, new C34872b(z));
                TemplateBasketItem templateBasketItem = this.f84220X0;
                if (templateBasketItem != null) {
                    mo85309G3(true, templateBasketItem.getTemplateName());
                    if (!TextUtils.isEmpty(this.f84220X0.getTemplateImage(true))) {
                        mo85305C3(true, this.f84220X0.getTemplateImage(true));
                        return;
                    } else if (this.f84220X0.getImageRes() > 0) {
                        mo85304B3(true, this.f84220X0.getImageRes(), false);
                        return;
                    } else if (!TextUtils.isEmpty(this.f84220X0.getTransferInitials())) {
                        mo85303A3(false);
                        mo85307E3(true, this.f84220X0.getTransferInitials());
                        return;
                    } else {
                        mo85304B3(true, C10320i.ic_transfer_between_accs, true);
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: t3 */
    public void mo85241t3() {
        mo85331q3();
        String str = this.f84310r0;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 2123274:
                if (str.equals(TransferForm.OPERATION_EDIT)) {
                    c = 0;
                    break;
                }
                break;
            case 2634405:
                if (str.equals(TransferForm.OPERATION_VIEW)) {
                    c = 1;
                    break;
                }
                break;
            case 1996002556:
                if (str.equals("CREATE")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f84276J.f68595L.f70288l.setText(getString(C10328q.button_text_save_remember));
                return;
            case 1:
                super.mo85241t3();
                return;
            case 2:
                this.f84276J.f68595L.f70288l.setText(getString(C10328q.button_text_save));
                return;
            default:
                return;
        }
    }

    /* renamed from: v3 */
    public void mo85242v3(boolean z) {
        super.mo85242v3(z);
        String str = this.f84310r0;
        str.hashCode();
        if (str.equals(TransferForm.OPERATION_EDIT) || str.equals("CREATE")) {
            this.f84280N.setValueTextIgnoringEmpty((String) this.f84311s0.get(0));
            this.f84279M.setOnClickListener(this.f84225c1);
            TemplateBasketItem templateBasketItem = this.f84220X0;
            if (templateBasketItem == null || templateBasketItem.getTemplateImage() == null || this.f84221Y0) {
                this.f84279M.setIconResource(C10320i.ic_upload_image, this.f84225c1);
            } else {
                this.f84279M.setIconResource(C32289b0.m95093e(this.f84220X0.getTemplateImage()), this.f84225c1);
            }
        }
        File file = this.f84222Z0;
        if (file != null) {
            this.f84279M.setIconFile(file);
            this.f84221Y0 = false;
        }
    }

    /* renamed from: y3 */
    public void mo85243y3() {
        super.mo85243y3();
        String str = this.f84310r0;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 2123274:
                if (str.equals(TransferForm.OPERATION_EDIT)) {
                    c = 0;
                    break;
                }
                break;
            case 2634405:
                if (str.equals(TransferForm.OPERATION_VIEW)) {
                    c = 1;
                    break;
                }
                break;
            case 1996002556:
                if (str.equals("CREATE")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                this.f84276J.f68584A.addView(this.f84279M);
                this.f84276J.f68640w.addView(this.f84280N);
                return;
            case 1:
                this.f84276J.f68640w.removeAllViews();
                this.f84276J.f68584A.removeAllViews();
                return;
            default:
                return;
        }
    }
}
