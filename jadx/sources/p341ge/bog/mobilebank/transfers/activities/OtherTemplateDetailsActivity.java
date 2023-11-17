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
import p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10320i;
import p366bk.C10325n;
import p366bk.C10328q;
import q81.C38163b;

/* renamed from: ge.bog.mobilebank.transfers.activities.OtherTemplateDetailsActivity */
public class OtherTemplateDetailsActivity extends C34882b {

    /* renamed from: p1 */
    protected Client f84140p1;

    /* renamed from: q1 */
    protected TemplateBasketItem f84141q1;
    /* access modifiers changed from: private */

    /* renamed from: r1 */
    public boolean f84142r1;

    /* renamed from: s1 */
    private File f84143s1;
    /* access modifiers changed from: private */

    /* renamed from: t1 */
    public C38163b f84144t1 = null;
    /* access modifiers changed from: private */

    /* renamed from: u1 */
    public View.OnClickListener f84145u1 = new C34851a();

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTemplateDetailsActivity$a */
    class C34851a implements View.OnClickListener {
        C34851a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m102403c() {
            OtherTemplateDetailsActivity otherTemplateDetailsActivity = OtherTemplateDetailsActivity.this;
            otherTemplateDetailsActivity.f84279M.setIconResource(C10320i.ic_upload_image, otherTemplateDetailsActivity.f84145u1);
            OtherTemplateDetailsActivity.this.f84142r1 = true;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m102404d(DialogInterface dialogInterface) {
            OtherTemplateDetailsActivity.this.f84144t1 = null;
        }

        public void onClick(View view) {
            TemplateBasketItem templateBasketItem = OtherTemplateDetailsActivity.this.f84141q1;
            if (templateBasketItem == null || templateBasketItem.getTemplateImage() == null || OtherTemplateDetailsActivity.this.f84142r1) {
                OtherTemplateDetailsActivity.this.f84144t1 = new C38163b(OtherTemplateDetailsActivity.this);
                OtherTemplateDetailsActivity.this.f84144t1.show();
                return;
            }
            OtherTemplateDetailsActivity.this.f84144t1 = new C38163b(OtherTemplateDetailsActivity.this, new int[]{1, 2, 3});
            OtherTemplateDetailsActivity.this.f84144t1.mo91690j(new Runnable[]{null, new C34915k(this)});
            OtherTemplateDetailsActivity.this.f84144t1.setOnDismissListener(new C34916l(this));
            OtherTemplateDetailsActivity.this.f84144t1.show();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTemplateDetailsActivity$b */
    class C34852b implements C0430g1.C0433c {

        /* renamed from: d */
        final /* synthetic */ boolean f84147d;

        C34852b(boolean z) {
            this.f84147d = z;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String charSequence = menuItem.getTitle().toString();
            String string = OtherTemplateDetailsActivity.this.getResources().getString(C10328q.f28948Wc);
            String string2 = OtherTemplateDetailsActivity.this.getResources().getString(C10328q.settings_menu_text_delete);
            if (charSequence.equals(string)) {
                OtherTemplateDetailsActivity otherTemplateDetailsActivity = OtherTemplateDetailsActivity.this;
                otherTemplateDetailsActivity.f84310r0 = TransferForm.OPERATION_EDIT;
                otherTemplateDetailsActivity.mo85333u3(this.f84147d);
                return true;
            } else if (!charSequence.equals(string2)) {
                return true;
            } else {
                OtherTemplateDetailsActivity.this.mo85334x3("");
                return true;
            }
        }
    }

    /* renamed from: J5 */
    private void m102391J5() {
        String str = null;
        TransferTemplateObject F4 = mo85251F4(this.f84141q1, (String) null);
        F4.setTemplateName((String) this.f84311s0.get(0));
        Client client = this.f84140p1;
        File file = this.f84143s1;
        if (this.f84142r1) {
            str = BankApi.OPERATION_KEY_REMOVE_IMAGE;
        }
        client.modifyTransferTemplate(true, F4, file, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N4 */
    public ArrayList mo85235N4() {
        ArrayList N4 = super.mo85235N4();
        String str = this.f84310r0;
        str.hashCode();
        if (!str.equals(TransferForm.OPERATION_VIEW)) {
            N4.add(new Integer(0));
        }
        return N4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        this.f84182n1 = Boolean.TRUE;
        if (getIntent().hasExtra("TEMPLATE_ITEM")) {
            this.f84141q1 = (TemplateBasketItem) C42035e.m122119a(getIntent().getParcelableExtra("TEMPLATE_ITEM"));
        }
        super.mo37451O1(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public void mo85236P2() {
        boolean z;
        Iterator it = mo85235N4().iterator();
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
        if (!TransferForm.OPERATION_VIEW.equals(this.f84310r0) || mo85312O2(mo85260V4())) {
            z = z2;
        }
        this.f84276J.f68595L.f70288l.setOrange(z, z, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W2 */
    public long mo85238W2() {
        TemplateBasketItem templateBasketItem = this.f84141q1;
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
            this.f84143s1 = null;
            this.f84142r1 = false;
            TextTypeView textTypeView = this.f84279M;
            if (textTypeView != null) {
                textTypeView.setIconResource(C10320i.ic_upload_image, this.f84145u1);
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
            C38163b bVar = this.f84144t1;
            if (bVar != null) {
                bVar.mo91683c(i, intent);
            }
        } else if (i == 10002) {
            File file = new File(intent.getStringExtra("CROPPED_PATH"));
            this.f84143s1 = file;
            this.f84279M.setIconFile(file);
            this.f84142r1 = false;
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
            Intent a5 = mo85262a5(view);
            a5.putExtra("IS_TEMPLATE", TransferForm.MODULE_TEMPLATE.equals(this.f84308p0));
            BankTransferWizardActivity.m106404z5(this, a5, 10009);
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
                    m102391J5();
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
        C38163b bVar = this.f84144t1;
        if (bVar != null) {
            bVar.mo91684d(i);
        }
    }

    /* renamed from: s3 */
    public void mo85240s3(boolean z) {
        int i;
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
                mo85326n3(C10325n.template_menu, new C34852b(z));
                TemplateBasketItem templateBasketItem = this.f84141q1;
                if (templateBasketItem != null) {
                    mo85309G3(true, templateBasketItem.getTemplateName());
                    if (!TextUtils.isEmpty(this.f84141q1.getTemplateImage(true))) {
                        mo85305C3(true, this.f84141q1.getTemplateImage(true));
                        return;
                    } else if (this.f84141q1.getImageRes() > 0) {
                        mo85304B3(true, this.f84141q1.getImageRes(), false);
                        return;
                    } else if (!TextUtils.isEmpty(this.f84141q1.getTransferInitials())) {
                        mo85303A3(false);
                        mo85307E3(true, this.f84141q1.getTransferInitials());
                        return;
                    } else {
                        if (mo85263c5()) {
                            i = C10320i.ic_transfer_rs;
                        } else {
                            i = C10320i.ic_transfer_domestic;
                        }
                        mo85304B3(true, i, true);
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
            this.f84279M.setOnClickListener(this.f84145u1);
            TemplateBasketItem templateBasketItem = this.f84141q1;
            if (templateBasketItem == null || templateBasketItem.getTemplateImage() == null || this.f84142r1) {
                this.f84279M.setIconResource(C10320i.ic_upload_image, this.f84145u1);
            } else {
                this.f84279M.setIconResource(C32289b0.m95093e(this.f84141q1.getTemplateImage()), this.f84145u1);
            }
        }
        File file = this.f84143s1;
        if (file != null) {
            this.f84279M.setIconFile(file);
            this.f84142r1 = false;
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
                this.f84276J.f68640w.addView(this.f84280N);
                this.f84276J.f68584A.addView(this.f84279M);
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
