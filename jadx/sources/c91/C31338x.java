package c91;

import a91.C30865a;
import a91.C30879d;
import a91.C30886g;
import a91.C30894i;
import a91.C30905n;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.C5030m;
import com.google.android.material.datepicker.CalendarConstraints;
import f91.C31971a;
import f91.C31972b;
import g91.C32290b1;
import g91.C32297d;
import g91.C32303f;
import g91.C32321n;
import g91.C32335t0;
import g91.C32342w0;
import g91.C32343x;
import g91.C32355x0;
import g91.C32359z0;
import i91.C36368b;
import i91.C36370c;
import iu0.C36546y;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jg1.C41452l;
import l81.C37104a;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferBeneficiaryEvent;
import p341ge.bog.mobilebank.model.Beneficiary;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.TransferNomination;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.account.AccountLoveDebit;
import p341ge.bog.mobilebank.model.account.OtherAccountDetails;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogEditText;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p341ge.bog.mobilebank.util.MinMaxDateValidator;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10328q;
import p380ck.C10464h;
import p90.C27357l4;
import r90.C27950a;

/* renamed from: c91.x */
public class C31338x extends C31355y implements C30865a.C30869d, C36370c.C36372b {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public DecimalFormat f77814A;

    /* renamed from: B */
    private boolean f77815B;

    /* renamed from: C */
    private ArrayList f77816C;

    /* renamed from: D */
    private ArrayList f77817D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f77818E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f77819F;

    /* renamed from: G */
    private boolean f77820G = false;

    /* renamed from: H */
    private boolean f77821H = false;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C31354o f77822I;

    /* renamed from: J */
    private C36370c f77823J;

    /* renamed from: K */
    private C30879d f77824K;

    /* renamed from: L */
    private boolean f77825L;

    /* renamed from: M */
    private AtomicBoolean f77826M = new AtomicBoolean(false);

    /* renamed from: N */
    private InputFilter f77827N;

    /* renamed from: O */
    private InputFilter f77828O = new C32321n(2, 2);

    /* renamed from: P */
    private InputFilter f77829P;

    /* renamed from: Q */
    private InputFilter f77830Q;

    /* renamed from: R */
    private TransferBeneficiaryEvent f77831R;

    /* renamed from: S */
    private String f77832S;

    /* renamed from: T */
    private boolean f77833T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public SimpleDateFormat f77834U;

    /* renamed from: V */
    C30894i f77835V;

    /* renamed from: W */
    private C37104a f77836W;

    /* renamed from: X */
    private AccountLovEvent f77837X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public double f77838Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f77839Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public String f77840a0;

    /* renamed from: b0 */
    private boolean f77841b0;

    /* renamed from: c0 */
    boolean f77842c0;

    /* renamed from: d0 */
    private View.OnClickListener f77843d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C5030m f77844e0;

    /* renamed from: f0 */
    boolean f77845f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public TextWatcher f77846g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public TextWatcher f77847h0;

    /* renamed from: i0 */
    boolean f77848i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public TextWatcher f77849j0;

    /* renamed from: k0 */
    private TransferForm.TRANSFERTYPE f77850k0;

    /* renamed from: l0 */
    private boolean f77851l0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C27357l4 f77852v;

    /* renamed from: w */
    protected BogEditText f77853w;

    /* renamed from: x */
    protected BogTextView f77854x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C30865a f77855y;

    /* renamed from: z */
    private DecimalFormat f77856z;

    /* renamed from: c91.x$a */
    class C31339a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f77857d;

        C31339a(String str) {
            this.f77857d = str;
        }

        public void run() {
            C32290b1.m95115e(C31338x.this.f77882e.getEditText());
            C32359z0.m95573i0(C31338x.this.f77882e.getEditText(), 11);
            if (!TextUtils.isEmpty(this.f77857d)) {
                C31338x.this.m93093M3(this.f77857d);
            }
        }
    }

    /* renamed from: c91.x$b */
    class C31340b implements Runnable {
        C31340b() {
        }

        public void run() {
            C31338x xVar = C31338x.this;
            xVar.m93094S3(xVar.mo71611z1());
        }
    }

    /* renamed from: c91.x$c */
    class C31341c implements TextWatcher {
        C31341c() {
        }

        public void afterTextChanged(Editable editable) {
            if (C31338x.this.mo71675r3()) {
                C35862c cVar = C31338x.this.f77883f;
                if (cVar instanceof DomesticTransferWizardActivity) {
                    if (((DomesticTransferWizardActivity) cVar).mo87902m4()) {
                        if (C31338x.this.m93092M2(editable.toString()).isEmpty() || C31338x.this.m93092M2(editable.toString()).equals(".")) {
                            C31338x.this.m93096e4("");
                        } else {
                            C31338x.this.mo71668l3(true);
                        }
                    }
                    ((DomesticTransferWizardActivity) C31338x.this.f77883f).mo87909x4();
                } else if (cVar instanceof BankTransferWizardActivity) {
                    ((BankTransferWizardActivity) cVar).mo87850B5();
                }
            }
            C35862c cVar2 = C31338x.this.f77883f;
            if ((cVar2 instanceof BankTransferWizardActivity) && !((BankTransferWizardActivity) cVar2).mo87865a5()) {
                C31338x xVar = C31338x.this;
                if (((BankTransferWizardActivity) xVar.f77883f).mo87863Y4(xVar)) {
                    C31338x.this.f77883f.mo87955L2().setRight((Drawable) new ColorDrawable(C0767a.m2893c(C31338x.this.f77883f, C10318g.f28624I0)), false, C31338x.this.f77883f.mo87955L2().getAccountName(), C31338x.this.f77882e.getValue(), true);
                    C31338x.this.f77883f.mo87955L2().setTextColorIds(C10318g.f28630R0, false);
                }
            }
            if (C31338x.this.getActivity() != null && (C31338x.this.getActivity() instanceof C35862c)) {
                ((C35862c) C31338x.this.getActivity()).mo87860S2();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C31338x.this.f77845f0 = i3 == 0;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            boolean z;
            boolean z2;
            String str;
            boolean z3;
            boolean z4 = false;
            boolean z5 = true;
            if (C31338x.this.mo71673q3()) {
                String charSequence3 = charSequence.toString();
                if (C31338x.this.mo71676s3()) {
                    String L2 = C31338x.this.mo71635L2(charSequence3.trim());
                    if (L2.length() == 11) {
                        C31338x.this.f77883f.mo87965p3(true);
                        ((BankTransferWizardActivity) C31338x.this.f77883f).mo87853G4(L2.replace("-", ""), true);
                        charSequence2 = charSequence;
                    } else {
                        C31338x.this.f77883f.mo87965p3(false);
                        charSequence2 = charSequence;
                    }
                } else if (C31338x.this.m93109k3() == TransferForm.TRANSFERTYPE.ACCOUNT) {
                    if (charSequence3.length() >= 6) {
                        if (charSequence3.length() == 22 || charSequence3.length() == 25) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C31338x.this.f77883f.mo87965p3(true);
                        ((BankTransferWizardActivity) C31338x.this.f77883f).mo87854H4(charSequence3, false, z);
                    } else {
                        C31338x.this.f77883f.mo87965p3(false);
                        C31338x.this.mo71717U1(charSequence3);
                        ((BankTransferWizardActivity) C31338x.this.f77883f).mo87873n5(charSequence3);
                    }
                    C31338x.this.mo71682v4(charSequence3);
                    charSequence2 = charSequence;
                } else if (C31338x.this.m93109k3() == TransferForm.TRANSFERTYPE.PHONE) {
                    C35862c cVar = C31338x.this.f77883f;
                    if (charSequence3.trim().length() > 1) {
                        z4 = true;
                    }
                    cVar.mo87965p3(z4);
                    C31338x.this.m93114m3(charSequence.toString());
                    C31338x.this.mo71717U1(charSequence.toString());
                    ((BankTransferWizardActivity) C31338x.this.f77883f).mo87871l5();
                    charSequence2 = charSequence;
                } else {
                    C35862c cVar2 = C31338x.this.f77883f;
                    if (charSequence3.trim().length() <= 1) {
                        z5 = false;
                    }
                    cVar2.mo87965p3(z5);
                    if (charSequence3.length() == 11) {
                        ((BankTransferWizardActivity) C31338x.this.f77883f).mo87853G4(charSequence3, false);
                        charSequence2 = charSequence;
                    } else {
                        C31338x.this.mo71717U1(charSequence3);
                        ((BankTransferWizardActivity) C31338x.this.f77883f).mo87872m5();
                        charSequence2 = charSequence;
                    }
                }
            } else if (C31338x.this.mo71675r3()) {
                C31338x.this.mo71731p1();
                try {
                    C31338x xVar = C31338x.this;
                    C35862c cVar3 = xVar.f77883f;
                    if (Double.parseDouble(xVar.m93100h3(charSequence.toString())) <= Utils.DOUBLE_EPSILON) {
                        z5 = false;
                    }
                    cVar3.mo87965p3(z5);
                    charSequence2 = charSequence;
                } catch (Exception unused) {
                    C31338x.this.f77883f.mo87965p3(false);
                    charSequence2 = charSequence;
                }
            } else {
                if (!C31338x.this.f77818E || charSequence.toString().matches("[A-Za-z0-9/\\-?:().,'+ ]*")) {
                    z2 = true;
                    str = charSequence;
                } else {
                    String charSequence4 = charSequence.toString();
                    C31338x.this.f77882e.getEditText().removeTextChangedListener(C31338x.this.f77846g0);
                    String replaceAll = charSequence4.replaceAll("[^A-Za-z0-9/\\-?:().,'+ ]", "");
                    C31338x.this.f77882e.getEditText().setText(replaceAll);
                    C31338x.this.f77882e.getEditText().setSelection(replaceAll.length());
                    C31338x.this.f77882e.getEditText().addTextChangedListener(C31338x.this.f77846g0);
                    C31338x xVar2 = C31338x.this;
                    C32297d.m95154b(xVar2.f77883f, xVar2.getString(C10328q.f28934O4));
                    z2 = false;
                    str = replaceAll;
                }
                if (C31338x.this.f77822I != null) {
                    C31338x xVar3 = C31338x.this;
                    xVar3.f77883f.mo87965p3(xVar3.f77822I.mo71704a(str.toString(), z2));
                } else {
                    C35862c cVar4 = C31338x.this.f77883f;
                    if (str.toString().length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar4.mo87965p3(z3);
                }
                charSequence2 = str;
                if (C31338x.this.f77819F) {
                    int i4 = 0;
                    boolean z6 = false;
                    while (i4 < str.length()) {
                        int i5 = i4 + 1;
                        if (str.subSequence(i4, i5).toString().matches("[A-Za-zა-ჰ]")) {
                            z6 = true;
                        }
                        i4 = i5;
                    }
                    if (C31338x.this.f77822I != null) {
                        C31338x xVar4 = C31338x.this;
                        C35862c cVar5 = xVar4.f77883f;
                        if (xVar4.f77822I.mo71704a(str.toString(), z2) && z6) {
                            z4 = true;
                        }
                        cVar5.mo87965p3(z4);
                        charSequence2 = str;
                    } else {
                        C35862c cVar6 = C31338x.this.f77883f;
                        if (str.toString().length() > 0 && z6) {
                            z4 = true;
                        }
                        cVar6.mo87965p3(z4);
                        charSequence2 = str;
                    }
                }
            }
            if (C31338x.this.mo71676s3()) {
                C31338x xVar5 = C31338x.this;
                if (!xVar5.f77845f0) {
                    xVar5.m93093M3(xVar5.mo71635L2(charSequence2.toString()));
                }
            }
            C31338x.this.mo71717U1(charSequence2.toString());
        }
    }

    /* renamed from: c91.x$d */
    class C31342d implements TextWatcher {
        C31342d() {
        }

        public void afterTextChanged(Editable editable) {
            if (C31338x.this.mo71675r3()) {
                C35862c cVar = C31338x.this.f77883f;
                if ((cVar instanceof DomesticTransferWizardActivity) && ((DomesticTransferWizardActivity) cVar).mo87902m4()) {
                    C31338x xVar = C31338x.this;
                    xVar.mo71732q1(xVar.f77852v.f69245u);
                    if (C31338x.this.m93092M2(editable.toString()).isEmpty() || C31338x.this.m93092M2(editable.toString()).equals(".")) {
                        C31338x.this.m93094S3("");
                    } else {
                        C31338x.this.mo71668l3(false);
                    }
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() > 0) {
                C31338x.this.f77883f.mo87965p3(true);
            }
        }
    }

    /* renamed from: c91.x$e */
    class C31343e implements TextWatcher {
        C31343e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C31338x.this.f77848i0 = i3 == 0;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() > 0 && !charSequence.toString().equals(".") && !charSequence.toString().substring(charSequence.length() - 1).equals(".")) {
                C35862c cVar = C31338x.this.f77883f;
                if ((cVar instanceof DomesticTransferWizardActivity) && ((DomesticTransferWizardActivity) cVar).mo87902m4() && C31338x.this.mo71675r3()) {
                    C31338x xVar = C31338x.this;
                    if (!TextUtils.isEmpty(xVar.m93095a3(xVar.f77853w))) {
                        try {
                            C31338x xVar2 = C31338x.this;
                            xVar2.f77838Y = Double.parseDouble(xVar2.m93095a3(xVar2.f77853w));
                            C31338x.this.f77853w.formatWithNonSelectable();
                            C31338x.this.mo71668l3(true);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c91.x$f */
    class C31344f implements C37104a {

        /* renamed from: d */
        final /* synthetic */ ArrayList f77863d;

        C31344f(ArrayList arrayList) {
            this.f77863d = arrayList;
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            if (C31338x.this.m93109k3() == TransferForm.TRANSFERTYPE.PIN) {
                C31338x.this.mo71717U1(((OtherAccountDetails) this.f77863d.get(i)).f81299id);
            } else if (C31338x.this.m93109k3() == TransferForm.TRANSFERTYPE.ACCOUNT || C31338x.this.m93109k3() == TransferForm.TRANSFERTYPE.PHONE) {
                C31338x.this.mo71717U1(((OtherAccountDetails) this.f77863d.get(i)).acctNo);
            }
            ((BankTransferWizardActivity) C31338x.this.f77883f).mo87880u5();
            C31338x.this.f77883f.mo87864a3();
        }
    }

    /* renamed from: c91.x$g */
    class C31345g implements C37104a {
        C31345g() {
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            boolean z;
            List w = C31338x.this.f77835V.mo71099w();
            int v = C31338x.this.f77835V.mo71098v();
            C35862c cVar = C31338x.this.f77883f;
            if (v > 0) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo87965p3(z);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < v; i2++) {
                sb.append((String) w.get(i2));
                sb.append("_");
            }
            C31338x.this.mo71717U1(sb.toString());
            C31338x.this.m93107j4(sb.toString().split("_"));
        }
    }

    /* renamed from: c91.x$h */
    class C31346h implements C37104a {
        C31346h() {
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            C31338x.this.mo71717U1(String.valueOf(i));
            if (C31338x.this.mo71684x3()) {
                C35862c cVar = C31338x.this.f77883f;
                if (cVar instanceof DomesticTransferWizardActivity) {
                    ((DomesticTransferWizardActivity) cVar).mo87891T3();
                }
            }
            C31338x.this.f77883f.mo87965p3(true);
            if (C31338x.this.mo71650V2() != null) {
                C31338x xVar = C31338x.this;
                ((BankTransferWizardActivity) xVar.f77883f).mo87869g5((TransferNomination) xVar.mo71650V2().get(i));
            }
            C31338x.this.f77883f.mo87864a3();
        }
    }

    /* renamed from: c91.x$i */
    class C31347i implements View.OnClickListener {
        C31347i() {
        }

        public void onClick(View view) {
            if (C31338x.this.getActivity() != null && (C31338x.this.getActivity() instanceof BankTransferWizardActivity)) {
                try {
                    ((BankTransferWizardActivity) C31338x.this.getActivity()).mo87870j5(((KeyValue) view.getTag()).getKey(), ((KeyValue) view.getTag()).getValue());
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: c91.x$j */
    class C31348j extends RecyclerView.C1756u {
        C31348j() {
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            super.mo5740e(recyclerView, i, i2);
            if (i2 != 0) {
                C31338x.this.mo71729m1();
            }
        }
    }

    /* renamed from: c91.x$k */
    class C31349k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c91.x$k$a */
        class C31350a implements Runnable {
            C31350a() {
            }

            public void run() {
                C31338x.this.f77855y.mo71036E();
            }
        }

        C31349k() {
        }

        public void onGlobalLayout() {
            LinearLayoutManager linearLayoutManager;
            if (C31338x.this.f77852v.f69233i != null && (linearLayoutManager = (LinearLayoutManager) C31338x.this.f77852v.f69233i.getLayoutManager()) != null) {
                int q2 = linearLayoutManager.mo5223q2();
                int i = 0;
                ViewPropertyAnimator viewPropertyAnimator = null;
                for (int n2 = linearLayoutManager.mo5219n2(); n2 <= q2; n2++) {
                    C30865a.C30870e eVar = (C30865a.C30870e) C31338x.this.f77852v.f69233i.mo5320e0(n2);
                    if (eVar != null) {
                        eVar.f89287d.setAlpha(Utils.FLOAT_EPSILON);
                        eVar.f89287d.setScaleX(0.95f);
                        eVar.f89287d.setScaleY(0.95f);
                        viewPropertyAnimator = eVar.f89287d.animate().setStartDelay((long) (i * 100)).alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
                        if (eVar.f89287d.getHeight() != 0) {
                            i++;
                        }
                    }
                }
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.withEndAction(new C31350a());
                } else {
                    C31338x.this.f77855y.mo71036E();
                }
                C32355x0.m95523n(C31338x.this.f77852v.f69233i, this);
            }
        }
    }

    /* renamed from: c91.x$l */
    class C31351l implements Runnable {

        /* renamed from: d */
        final /* synthetic */ BigDecimal f77871d;

        /* renamed from: e */
        final /* synthetic */ BigDecimal f77872e;

        /* renamed from: f */
        final /* synthetic */ String f77873f;

        /* renamed from: g */
        final /* synthetic */ String f77874g;

        /* renamed from: h */
        final /* synthetic */ String f77875h;

        /* renamed from: i */
        final /* synthetic */ String f77876i;

        C31351l(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, String str4) {
            this.f77871d = bigDecimal;
            this.f77872e = bigDecimal2;
            this.f77873f = str;
            this.f77874g = str2;
            this.f77875h = str3;
            this.f77876i = str4;
        }

        public void run() {
            C31338x xVar = C31338x.this;
            BogInputLayout bogInputLayout = xVar.f77882e;
            if (bogInputLayout != null) {
                bogInputLayout.setHintText(xVar.getString(C10328q.transfers_title_to_sell));
            }
            if (C31338x.this.mo71654X2() == 1) {
                C31338x.this.mo71663c4(0);
                C31338x.this.f77852v.f69245u.requestFocus();
            }
            if (!C31338x.this.f77852v.f69245u.isVisible()) {
                C31338x.this.f77852v.f69245u.showLayout();
            }
            if (!C31338x.this.f77852v.f69229e.isVisible()) {
                C31338x.this.f77852v.f69229e.showLayout();
            }
            double doubleValue = this.f77871d.doubleValue();
            double doubleValue2 = this.f77872e.doubleValue();
            C31338x xVar2 = C31338x.this;
            if (doubleValue == 1.0d) {
                doubleValue = doubleValue2;
            }
            xVar2.f77838Y = doubleValue;
            C31338x xVar3 = C31338x.this;
            xVar3.f77853w.removeTextChangedListener(xVar3.f77849j0);
            String format = C31338x.this.f77814A.format(C31338x.this.f77838Y);
            C31338x.this.f77853w.setText(format);
            C31338x.this.f77853w.setSelection(format.length());
            C31338x.this.f77839Z = this.f77873f;
            C31338x.this.f77840a0 = this.f77874g;
            C31338x xVar4 = C31338x.this;
            xVar4.f77853w.addTextChangedListener(xVar4.f77849j0);
            C31338x.this.f77853w.setNonSelectableString(C32303f.m95198i(this.f77874g, true));
            C31338x.this.f77853w.formatWithNonSelectable();
            C31338x.this.f77882e.getEditText().setText(C31338x.this.mo71611z1());
            C31338x.this.f77882e.getEditText().setNonSelectableString(C32303f.m95198i(this.f77875h, true));
            C31338x.this.f77852v.f69245u.getEditText().setNonSelectableString(C32303f.m95198i(this.f77876i, true));
            C31338x xVar5 = C31338x.this;
            xVar5.mo71732q1(xVar5.f77852v.f69245u);
            C31338x.this.f77852v.f69245u.getEditText().removeTextChangedListener(C31338x.this.f77847h0);
            C31338x.this.f77852v.f69245u.getEditText().addTextChangedListener(C31338x.this.f77847h0);
            C31338x.this.f77882e.getEditText().setSelection(C31338x.this.f77882e.getEditText().getText().length());
        }
    }

    /* renamed from: c91.x$m */
    class C31352m implements View.OnClickListener {
        C31352m() {
        }

        public void onClick(View view) {
            Long l;
            if (C31338x.this.getContext() != null) {
                C31338x.this.mo71729m1();
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    Date parse = C31338x.this.f77834U.parse(C31338x.this.mo71611z1());
                    Objects.requireNonNull(parse);
                    currentTimeMillis = parse.getTime();
                } catch (Exception unused) {
                }
                try {
                    Date parse2 = C31338x.this.f77834U.parse(C31338x.this.mo71646T2());
                    Objects.requireNonNull(parse2);
                    l = Long.valueOf(parse2.getTime());
                } catch (Exception unused2) {
                    l = null;
                }
                CalendarConstraints.C4986b c = new CalendarConstraints.C4986b().mo16158e(new MinMaxDateValidator(l, (Long) null)).mo16156c(currentTimeMillis);
                if (l != null) {
                    c.mo16157d(l.longValue());
                }
                C5023l a = C5023l.C5029f.m19565c().mo16276e(c.mo16154a()).mo16278g(Long.valueOf(currentTimeMillis)).mo16275a();
                a.mo16267J1(C31338x.this.f77844e0);
                a.mo4576A1(C31338x.this.getChildFragmentManager(), "Alert");
            }
        }
    }

    /* renamed from: c91.x$n */
    class C31353n implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f77879d;

        C31353n(String str) {
            this.f77879d = str;
        }

        public void run() {
            C31338x.this.mo71607t1().getEditText().setSelection(this.f77879d.length());
        }
    }

    /* renamed from: c91.x$o */
    public interface C31354o {
        /* renamed from: a */
        boolean mo71704a(String str, boolean z);
    }

    public C31338x() {
        Locale locale = Locale.US;
        this.f77856z = new DecimalFormat("0.##", new DecimalFormatSymbols(locale));
        this.f77814A = new DecimalFormat("0.########", new DecimalFormatSymbols(locale));
        C32342w0 w0Var = new C32342w0();
        this.f77829P = w0Var;
        this.f77830Q = w0Var;
        this.f77834U = new SimpleDateFormat("dd.MM.yyyy");
        this.f77836W = new C31345g();
        this.f77843d0 = new C31352m();
        this.f77844e0 = new C31335u(this);
        this.f77846g0 = new C31341c();
        this.f77847h0 = new C31342d();
        this.f77849j0 = new C31343e();
        this.f77850k0 = TransferForm.TRANSFERTYPE.ACCOUNT;
        this.f77851l0 = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m93084A3(C36368b bVar) {
        this.f77882e.getEditText().setText(bVar.mo89098b().replace("+995", ""));
        this.f77882e.getEditText().setSelection(this.f77882e.getText().length());
        C36546y.m108282F().mo27137H("transfers", "select_addressbook_contact", "other_transfer_phone", (Bundle) null, C10464h.C10465a.FIREBASE);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ boolean m93086B3(String str) {
        Matcher matcher = Pattern.compile("[\\s\\S]*(GE\\d{2}BG\\d{16}(?:GEL)?)[\\s\\S]*", 2).matcher(str);
        if (matcher.matches()) {
            this.f77882e.getEditText().setText(matcher.group(1));
        } else {
            this.f77882e.getEditText().setText(str);
        }
        return true;
    }

    /* renamed from: H2 */
    private void m93091H2() {
        this.f77852v.f69233i.getViewTreeObserver().addOnGlobalLayoutListener(new C31349k());
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public String m93092M2(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith(".")) {
            str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE + str;
        }
        return str.replaceAll("[^0-9.]", "");
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public void m93093M3(String str) {
        this.f77882e.getEditText().removeTextChangedListener(this.f77846g0);
        this.f77882e.getEditText().setText(str);
        this.f77882e.getEditText().setSelection(str.length());
        this.f77882e.getEditText().addTextChangedListener(this.f77846g0);
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public void m93094S3(String str) {
        this.f77882e.getEditText().removeTextChangedListener(this.f77846g0);
        if (!mo67196J1()) {
            try {
                this.f77882e.getEditText().setText(this.f77856z.format(Double.parseDouble(str)));
            } catch (NumberFormatException unused) {
                this.f77882e.getEditText().setText(str);
            }
        } else {
            this.f77882e.getEditText().setText(str);
        }
        this.f77882e.getEditText().setSelection(str.length());
        mo71717U1(str);
        mo71731p1();
        this.f77882e.getEditText().setSelection(this.f77882e.getEditText().toString().length());
        this.f77882e.getEditText().addTextChangedListener(this.f77846g0);
        ArrayList arrayList = this.f77817D;
        if (arrayList != null) {
            mo71679t4(arrayList, mo71611z1());
            this.f77817D = null;
            return;
        }
        ArrayList arrayList2 = this.f77816C;
        if (arrayList2 != null) {
            mo71677s4(arrayList2);
            this.f77816C = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public String m93095a3(BogEditText bogEditText) {
        return m93100h3(bogEditText.getText().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public void m93096e4(String str) {
        this.f77852v.f69245u.getEditText().removeTextChangedListener(this.f77847h0);
        try {
            this.f77852v.f69245u.getEditText().setText(this.f77856z.format(Double.parseDouble(str)));
        } catch (NumberFormatException unused) {
            this.f77852v.f69245u.getEditText().setText(str);
        }
        this.f77852v.f69245u.getEditText().setSelection(str.length());
        mo71732q1(this.f77852v.f69245u);
        this.f77852v.f69245u.getEditText().addTextChangedListener(this.f77847h0);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public String m93100h3(String str) {
        return str.replaceAll("[^\\d.]", "");
    }

    /* renamed from: h4 */
    private void m93101h4() {
        mo71729m1();
        this.f77852v.f69244t.setVisibility(8);
        this.f77852v.f69238n.setVisibility(8);
        this.f77852v.f69233i.setVisibility(0);
        this.f77852v.f69233i.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    /* renamed from: i3 */
    private ArrayList m93103i3() {
        int j3 = m93106j3();
        if (j3 == 1) {
            return this.f77837X.getAccountLovContainer().getBank().getSrc();
        }
        if (j3 == 2) {
            return this.f77837X.getAccountLovContainer().getGeorgia().getSrc();
        }
        if (j3 != 3) {
            if (j3 == 5) {
                return C31972b.m94376a(this.f77837X.getAccountLovContainer().getGeorgia().getSrc());
            }
            if (mo71686y3()) {
                return this.f77837X.getAccountLovContainer().getDomestic().getSrc();
            }
            return this.f77837X.getAccountLovContainer().getDomestic().getDst();
        } else if (mo71686y3()) {
            return this.f77837X.getAccountLovContainer().getConversion().getSrc();
        } else {
            return this.f77837X.getAccountLovContainer().getConversion().getDst();
        }
    }

    /* renamed from: i4 */
    private void m93104i4() {
        mo71729m1();
        mo71607t1().setInputType(mo71610y1());
        this.f77852v.f69238n.setVisibility(8);
        BogInputLayout bogInputLayout = this.f77882e;
        if (bogInputLayout != null) {
            bogInputLayout.setRightDrawable(C10320i.ic_calendar, this.f77843d0);
        }
        this.f77882e.getEditText().setSaveEnabled(false);
        if (this.f77852v.f69245u.getEditText() != null) {
            this.f77852v.f69245u.getEditText().setSaveEnabled(false);
        }
        this.f77882e.setOnClickListener(this.f77843d0);
        this.f77882e.getEditText().setText(mo71611z1());
        this.f77882e.getEditText().setOnClickListener(this.f77843d0);
        this.f77882e.getEditText().requestFocus();
        this.f77882e.getEditText().setFocusable(false);
    }

    /* renamed from: j3 */
    private int m93106j3() {
        C35862c cVar = this.f77883f;
        if (cVar instanceof DomesticTransferWizardActivity) {
            if (((DomesticTransferWizardActivity) cVar).mo87902m4()) {
                return 3;
            }
        } else if (cVar instanceof BankTransferWizardActivity) {
            if (((BankTransferWizardActivity) cVar).mo87862X4()) {
                return 5;
            }
            if (((BankTransferWizardActivity) this.f77883f).mo87865a5()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2 = new android.graphics.drawable.ColorDrawable(androidx.core.content.C0767a.m2893c(getActivity(), p366bk.C10318g.f28625J0));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00e2 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2 A[Catch:{ Exception -> 0x0128 }, LOOP:2: B:12:0x004e->B:28:0x00a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1 A[SYNTHETIC] */
    /* renamed from: j4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m93107j4(java.lang.String[] r23) {
        /*
            r22 = this;
            r0 = r23
            java.util.ArrayList r1 = r22.mo71638O2()
            androidx.fragment.app.h r2 = r22.getActivity()
            if (r2 == 0) goto L_0x0150
            androidx.fragment.app.h r2 = r22.getActivity()
            boolean r2 = r2 instanceof p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity
            if (r2 == 0) goto L_0x0150
            r3 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128 }
            r5.<init>()     // Catch:{ Exception -> 0x0128 }
            androidx.fragment.app.h r6 = r22.getActivity()     // Catch:{ Exception -> 0x0128 }
            ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity r6 = (p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity) r6     // Catch:{ Exception -> 0x0128 }
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r6 = r6.mo87893Y3()     // Catch:{ Exception -> 0x0128 }
            int r7 = r0.length     // Catch:{ Exception -> 0x0128 }
            r8 = 0
            r9 = r3
        L_0x0027:
            if (r9 >= r7) goto L_0x00b0
            r10 = r0[r9]     // Catch:{ Exception -> 0x0128 }
            ge.bog.mobilebank.model.account.AccountLovContainer r11 = r6.getAccountLovContainer()     // Catch:{ Exception -> 0x0128 }
            ge.bog.mobilebank.model.account.AccountLovHolder r11 = r11.getDomestic()     // Catch:{ Exception -> 0x0128 }
            java.util.ArrayList<ge.bog.mobilebank.model.account.AccountLov> r11 = r11.src     // Catch:{ Exception -> 0x0128 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x0128 }
            r12 = r3
        L_0x003a:
            boolean r13 = r11.hasNext()     // Catch:{ Exception -> 0x0128 }
            if (r13 == 0) goto L_0x00aa
            java.lang.Object r13 = r11.next()     // Catch:{ Exception -> 0x0128 }
            ge.bog.mobilebank.model.account.AccountLov r13 = (p341ge.bog.mobilebank.model.account.AccountLov) r13     // Catch:{ Exception -> 0x0128 }
            java.util.ArrayList r14 = r13.getSubAccounts()     // Catch:{ Exception -> 0x0128 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x0128 }
        L_0x004e:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x0128 }
            if (r15 == 0) goto L_0x00a4
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x0128 }
            ge.bog.mobilebank.model.account.AccountLov r15 = (p341ge.bog.mobilebank.model.account.AccountLov) r15     // Catch:{ Exception -> 0x0128 }
            long r16 = r15.getId()     // Catch:{ Exception -> 0x0128 }
            java.lang.Long r18 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0128 }
            long r18 = r18.longValue()     // Catch:{ Exception -> 0x0128 }
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 != 0) goto L_0x009e
            if (r8 != 0) goto L_0x006d
            r8 = r13
        L_0x006d:
            java.util.Iterator r16 = r1.iterator()     // Catch:{ Exception -> 0x0128 }
        L_0x0071:
            boolean r17 = r16.hasNext()     // Catch:{ Exception -> 0x0128 }
            if (r17 == 0) goto L_0x009e
            java.lang.Object r17 = r16.next()     // Catch:{ Exception -> 0x0128 }
            r2 = r17
            ge.bog.mobilebank.model.account.AccountLoveDebit r2 = (p341ge.bog.mobilebank.model.account.AccountLoveDebit) r2     // Catch:{ Exception -> 0x0128 }
            r19 = r5
            long r4 = r2.acctKey     // Catch:{ Exception -> 0x0128 }
            long r20 = r15.getId()     // Catch:{ Exception -> 0x0128 }
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x009b
            java.lang.String r2 = f91.C31972b.m94382g(r2, r3)     // Catch:{ Exception -> 0x0128 }
            r4 = r19
            r4.append(r2)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r2 = ", "
            r4.append(r2)     // Catch:{ Exception -> 0x0128 }
            r12 = 1
            goto L_0x009f
        L_0x009b:
            r5 = r19
            goto L_0x0071
        L_0x009e:
            r4 = r5
        L_0x009f:
            if (r12 == 0) goto L_0x00a2
            goto L_0x00a5
        L_0x00a2:
            r5 = r4
            goto L_0x004e
        L_0x00a4:
            r4 = r5
        L_0x00a5:
            if (r12 == 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r5 = r4
            goto L_0x003a
        L_0x00aa:
            r4 = r5
        L_0x00ab:
            int r9 = r9 + 1
            r5 = r4
            goto L_0x0027
        L_0x00b0:
            r4 = r5
            int r0 = r4.length()     // Catch:{ Exception -> 0x0128 }
            r1 = 1
            if (r0 <= r1) goto L_0x00cb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128 }
            int r1 = r4.length()     // Catch:{ Exception -> 0x0128 }
            int r1 = r1 + -2
            java.lang.String r1 = r4.substring(r3, r1)     // Catch:{ Exception -> 0x0128 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0128 }
            r5 = r0
            r0 = r22
            goto L_0x00ce
        L_0x00cb:
            r0 = r22
            r5 = r4
        L_0x00ce:
            ge.bog.mobilebank.model.Client r1 = r0.mClient     // Catch:{ Exception -> 0x012a }
            ge.bog.mobilebank.model.account.ProductProperties r1 = p341ge.bog.mobilebank.model.account.ProductProperties.getProperties(r8, r1, r3)     // Catch:{ Exception -> 0x012a }
            androidx.fragment.app.h r2 = r22.getActivity()     // Catch:{ Exception -> 0x00e2 }
            int r4 = r1.getBackgroundImageId()     // Catch:{ Exception -> 0x00e2 }
            android.graphics.drawable.Drawable r2 = androidx.core.content.C0767a.m2895e(r2, r4)     // Catch:{ Exception -> 0x00e2 }
        L_0x00e0:
            r7 = r2
            goto L_0x00f2
        L_0x00e2:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable     // Catch:{ Exception -> 0x012a }
            androidx.fragment.app.h r4 = r22.getActivity()     // Catch:{ Exception -> 0x012a }
            int r6 = p366bk.C10318g.f28625J0     // Catch:{ Exception -> 0x012a }
            int r4 = androidx.core.content.C0767a.m2893c(r4, r6)     // Catch:{ Exception -> 0x012a }
            r2.<init>(r4)     // Catch:{ Exception -> 0x012a }
            goto L_0x00e0
        L_0x00f2:
            androidx.fragment.app.h r2 = r22.getActivity()     // Catch:{ Exception -> 0x012a }
            ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity r2 = (p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity) r2     // Catch:{ Exception -> 0x012a }
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r6 = r2.mo87955L2()     // Catch:{ Exception -> 0x012a }
            r8 = 0
            java.lang.String r9 = r5.toString()     // Catch:{ Exception -> 0x012a }
            r10 = 0
            r11 = 0
            r6.setLeft((android.graphics.drawable.Drawable) r7, (boolean) r8, (java.lang.String) r9, (java.lang.String) r10, (boolean) r11)     // Catch:{ Exception -> 0x012a }
            androidx.fragment.app.h r2 = r22.getActivity()     // Catch:{ Exception -> 0x012a }
            ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity r2 = (p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity) r2     // Catch:{ Exception -> 0x012a }
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r2 = r2.mo87955L2()     // Catch:{ Exception -> 0x012a }
            int r1 = r1.getTitleColorId()     // Catch:{ Exception -> 0x012a }
            r4 = 1
            r2.setTextColorIds(r1, r4)     // Catch:{ Exception -> 0x012a }
            androidx.fragment.app.h r1 = r22.getActivity()     // Catch:{ Exception -> 0x012a }
            ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity r1 = (p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity) r1     // Catch:{ Exception -> 0x012a }
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r1 = r1.mo87955L2()     // Catch:{ Exception -> 0x012a }
            r2 = 11
            r1.setLeftFrameState(r2)     // Catch:{ Exception -> 0x012a }
            goto L_0x0152
        L_0x0128:
            r0 = r22
        L_0x012a:
            androidx.fragment.app.h r1 = r22.getActivity()
            ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity r1 = (p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity) r1
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r1 = r1.mo87955L2()
            r2 = 11
            r1.resetLeft(r2)
            androidx.fragment.app.h r1 = r22.getActivity()
            ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity r1 = (p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity) r1
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r1 = r1.mo87955L2()
            android.content.Context r2 = r22.getContext()
            r4 = 1
            int r2 = g91.C32335t0.m95359d(r2, r4)
            r1.setLeftColor(r2, r3, r4)
            goto L_0x0152
        L_0x0150:
            r0 = r22
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c91.C31338x.m93107j4(java.lang.String[]):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public TransferForm.TRANSFERTYPE m93109k3() {
        return this.f77850k0;
    }

    /* renamed from: k4 */
    private void m93110k4() {
        this.f77882e.setOriginalInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE);
        if (C36370c.m107927h(getActivity())) {
            this.f77882e.setOriginalInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            m93121p3();
            return;
        }
        C36370c.m107933n(this, getString(C10328q.contacts_permission_for_transfer_desc));
    }

    /* renamed from: l4 */
    private void m93112l4() {
        int u1 = mo71735u1();
        if (u1 == 0) {
            m93101h4();
        } else if (u1 == 1) {
            m93119o4();
        } else if (u1 == 2) {
            m93122p4();
        } else if (u1 == 3) {
            m93104i4();
        } else if (u1 == 4) {
            m93115m4();
        } else if (u1 == 5) {
            if (m93109k3() == TransferForm.TRANSFERTYPE.PIN || this.f77851l0) {
                m93117n4();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public void m93114m3(String str) {
        boolean z = true;
        this.f77883f.mo87965p3(true);
        String replace = str.replace("[\\s]", "");
        if (replace.matches("[/+]*[0-9]+") && (replace.length() == 9 || replace.length() == 13)) {
            ((BankTransferWizardActivity) this.f77883f).mo87853G4(replace, false);
            ((BankTransferWizardActivity) this.f77883f).mo87877q5(true, true);
        } else if (!replace.matches("[/+]*[0-9]+")) {
            this.f77883f.mo87965p3(false);
        }
        if (str.length() < 0 || !this.f77825L) {
            m93132w4();
            return;
        }
        if (!this.f77884g) {
            m93132w4();
        }
        String text = this.f77882e.getText();
        C36370c cVar = this.f77823J;
        if (this.f77882e.getLastInputType() == 305) {
            z = false;
        }
        cVar.mo89114o(text, z);
        this.f77824K.mo71073k(this.f77823J.mo89113g());
        RecyclerView.C1736h adapter = this.f77852v.f69234j.getAdapter();
        C30879d dVar = this.f77824K;
        if (adapter != dVar) {
            this.f77852v.f69234j.setAdapter(dVar);
        }
        C30879d dVar2 = this.f77824K;
        if (dVar2 == null || dVar2.getItemCount() == 0) {
            m93132w4();
        }
    }

    /* renamed from: m4 */
    private void m93115m4() {
        int i;
        AccountLoveDebit accountLoveDebit;
        mo71729m1();
        mo71607t1().setVisibility(8);
        this.f77885h.setVisibility(0);
        this.f77852v.f69243s.setVisibility(0);
        this.f77852v.f69240p.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f77852v.f69242r.setText(getString(C10328q.common_text_from));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList O2 = mo71638O2();
        Iterator it = O2.iterator();
        while (it.hasNext()) {
            AccountLoveDebit accountLoveDebit2 = (AccountLoveDebit) it.next();
            arrayList.add(C31972b.m94382g(accountLoveDebit2, true));
            arrayList2.add(String.valueOf(accountLoveDebit2.acctKey));
        }
        String z1 = mo71611z1();
        String[] strArr = new String[0];
        if (z1 != null) {
            strArr = z1.split("_");
            int i2 = 0;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (!TextUtils.isEmpty(strArr[i3])) {
                    Iterator it2 = O2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            accountLoveDebit = null;
                            break;
                        }
                        accountLoveDebit = (AccountLoveDebit) it2.next();
                        if (accountLoveDebit.acctKey == Long.valueOf(strArr[i3]).longValue()) {
                            break;
                        }
                    }
                    O2.remove(accountLoveDebit);
                    O2.add(i3, accountLoveDebit);
                    i2++;
                }
            }
            i = i2;
        } else {
            i = 0;
        }
        String[] strArr2 = strArr;
        C30894i iVar = new C30894i(arrayList, arrayList2, i, this.f77852v.f69240p, this.f77836W, 3);
        this.f77835V = iVar;
        this.f77852v.f69240p.setAdapter(iVar);
        m93107j4(strArr2);
    }

    /* renamed from: n4 */
    private void m93117n4() {
        int i;
        mo71729m1();
        mo71607t1().setVisibility(8);
        this.f77885h.setVisibility(0);
        this.f77852v.f69243s.setVisibility(0);
        this.f77852v.f69240p.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f77852v.f69242r.setText(getString(C10328q.transfers_title_receiver_account));
        ArrayList F4 = ((BankTransferWizardActivity) getActivity()).mo87852F4();
        if (F4 != null) {
            i = -1;
            for (int i2 = 0; i2 < F4.size(); i2++) {
                OtherAccountDetails otherAccountDetails = (OtherAccountDetails) F4.get(i2);
                if (((m93109k3() == TransferForm.TRANSFERTYPE.ACCOUNT || m93109k3() == TransferForm.TRANSFERTYPE.PHONE) && otherAccountDetails.acctNo.equals(mo71611z1())) || (m93109k3() == TransferForm.TRANSFERTYPE.PIN && otherAccountDetails.f81299id.equals(mo71611z1()))) {
                    i = i2;
                }
            }
        } else {
            F4 = new ArrayList();
            i = -1;
        }
        if (i > -1) {
            ((C35862c) getActivity()).mo87965p3(true);
        } else if (F4.size() == 1) {
            if (m93109k3() == TransferForm.TRANSFERTYPE.PIN) {
                mo71717U1(((OtherAccountDetails) F4.get(0)).f81299id);
            } else if (m93109k3() == TransferForm.TRANSFERTYPE.ACCOUNT || m93109k3() == TransferForm.TRANSFERTYPE.PHONE) {
                mo71717U1(((OtherAccountDetails) F4.get(0)).acctNo);
            }
            ((C35862c) getActivity()).mo87965p3(true);
            i = 0;
        } else {
            mo71717U1((String) null);
        }
        C30905n nVar = new C30905n(i, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, F4);
        nVar.mo71125j(new C31344f(F4));
        this.f77852v.f69240p.setAdapter(nVar);
        C30865a aVar = this.f77855y;
        if (aVar != null) {
            aVar.mo71034C();
        }
    }

    /* renamed from: o4 */
    private void m93119o4() {
        int i;
        mo71729m1();
        mo71607t1().setVisibility(8);
        this.f77885h.setVisibility(0);
        this.f77852v.f69243s.setVisibility(0);
        this.f77852v.f69240p.setLayoutManager(new LinearLayoutManager(getContext()));
        String z1 = mo71611z1();
        if (!TextUtils.isEmpty(z1)) {
            i = Integer.parseInt(z1);
            this.f77854x.setVisibility(0);
            ((C35862c) getActivity()).mo87965p3(true);
        } else {
            i = -1;
        }
        int i2 = i;
        String string = getString(C10328q.transfer_wizard_choose_transfer_type);
        if (mo71640P2() != null) {
            string = getString(C10328q.sto_title_select_transfer_type);
            this.f77854x.setVisibility(8);
        }
        if (mo71652W2() != null) {
            string = getString(C10328q.sto_title_select_period);
            this.f77854x.setVisibility(8);
        }
        if (mo71650V2() != null) {
            string = getString(C10328q.transfers_title_subject);
            this.f77854x.setVisibility(8);
        }
        if (mo71643R2() != null) {
            this.f77854x.setVisibility(8);
        }
        this.f77852v.f69242r.setText(string);
        C30905n nVar = new C30905n(i2, mo71643R2(), mo71652W2(), mo71640P2(), mo71650V2(), (ArrayList) null);
        nVar.mo71125j(new C31346h());
        this.f77852v.f69240p.setAdapter(nVar);
        C30865a aVar = this.f77855y;
        if (aVar != null) {
            aVar.mo71034C();
        }
    }

    /* renamed from: p3 */
    private void m93121p3() {
        if (!this.f77825L) {
            if (this.f77824K == null || this.f77823J == null) {
                C36370c f = C36370c.m107926f(C36546y.m108285N());
                this.f77823J = f;
                f.mo89115q(this);
            }
            if (!this.f77823J.mo89116r()) {
                mo71571D();
            }
        }
    }

    /* renamed from: p4 */
    private void m93122p4() {
        String z1 = mo71611z1();
        if (!mo71676s3()) {
            mo71607t1().getEditText().setText(z1);
        }
        if (mo71675r3()) {
            if (this.f77882e.getEditText().getNonSelectableString() == null && this.f77888k != null) {
                mo71607t1().getEditText().setNonSelectableString(this.f77888k);
            }
            mo71731p1();
            this.f77852v.f69245u.setInputType(BogInputLayout.INPUT_TYPE_NUM_REAL);
        }
        if (mo71683w3()) {
            this.f77852v.f69245u.setInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE);
            if (TextUtils.isEmpty(mo71611z1())) {
                mo71717U1(getString(C10328q.mobile_number_prefix));
            }
        }
        mo71607t1().setInputType(mo71610y1());
        this.f77852v.f69238n.setVisibility(8);
        if (z1 != null && z1.length() > 0) {
            mo71607t1().postDelayed(new C31353n(z1), 300);
        }
        mo71685x4();
        this.f77882e.getEditText().setSaveEnabled(false);
        if (this.f77852v.f69245u.getEditText() != null) {
            this.f77852v.f69245u.getEditText().setSaveEnabled(false);
        }
        if (mo71676s3()) {
            this.f77882e.postDelayed(new C31339a(z1), 100);
        }
        if (this.f77815B) {
            mo71729m1();
        }
        if (mo71673q3() && !mo71676s3() && m93109k3() == TransferForm.TRANSFERTYPE.ACCOUNT) {
            this.f77882e.getEditText().setClipboardPasteTextListener(new C31337w(this));
        }
    }

    /* renamed from: r4 */
    private void m93125r4() {
        C35862c cVar;
        String I4;
        if (!(!this.f77851l0 || (cVar = this.f77883f) == null || (I4 = ((BankTransferWizardActivity) cVar).mo87855I4()) == null)) {
            this.f77852v.f69242r.setText(String.format(getString(C10328q.transfer_to_account_title), new Object[]{I4}));
        }
        if (this.f77883f != null && mo71684x3()) {
            C35862c cVar2 = this.f77883f;
            if ((cVar2 instanceof DomesticTransferWizardActivity) && ((DomesticTransferWizardActivity) cVar2).mo87902m4() && mo71675r3()) {
                this.f77852v.f69246v.setVisibility(0);
                this.f77852v.f69246v.setText(C27950a.m86284a("text.sto.create.conversion.description"));
                return;
            }
        }
        this.f77852v.f69246v.setVisibility(8);
    }

    /* renamed from: u4 */
    private void m93129u4() {
        ArrayList K2 = mo71633K2();
        if (K2 != null && K2.size() > 0) {
            mo71679t4(K2, this.f77832S);
        }
    }

    /* renamed from: w4 */
    private void m93132w4() {
        RecyclerView recyclerView;
        if (this.f77850k0 == TransferForm.TRANSFERTYPE.PHONE && (recyclerView = this.f77852v.f69234j) != null) {
            recyclerView.setVisibility(0);
            if (C36370c.m107927h(getActivity())) {
                m93121p3();
            }
            C30879d dVar = this.f77824K;
            if (dVar == null || dVar.getItemCount() == 0) {
                this.f77852v.f69234j.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m93136z3(Long l) {
        String format = this.f77834U.format(new Date(l.longValue()));
        this.f77882e.getEditText().setText(format);
        mo71717U1(format);
        this.f77883f.mo87848A3();
        this.f77883f.mo87965p3(true);
    }

    /* renamed from: C3 */
    public void mo71622C3() {
        this.f77821H = true;
    }

    /* renamed from: D */
    public void mo71571D() {
        mo71624E3();
        m93132w4();
    }

    /* renamed from: D3 */
    public void mo71623D3() {
        this.f77820G = true;
    }

    /* renamed from: E3 */
    public void mo71624E3() {
        if (this.f77850k0 == TransferForm.TRANSFERTYPE.PHONE && this.f77852v != null) {
            boolean z = true;
            this.f77825L = true;
            if (this.f77824K == null) {
                C36370c cVar = this.f77823J;
                if (this.f77882e.getLastInputType() == 305) {
                    z = false;
                }
                cVar.mo89114o("", z);
                C30879d dVar = new C30879d(this.f77823J.mo89113g());
                this.f77824K = dVar;
                dVar.mo71072j(new C31336v(this));
            }
            RecyclerView.C1736h adapter = this.f77852v.f69234j.getAdapter();
            C30879d dVar2 = this.f77824K;
            if (adapter != dVar2 && dVar2.getItemCount() > 0) {
                this.f77852v.f69234j.setAdapter(this.f77824K);
                this.f77852v.f69234j.setLayoutManager(new LinearLayoutManager(getContext()));
            }
            this.f77824K.mo71073k(this.f77823J.mo89113g());
        }
    }

    /* renamed from: F1 */
    public boolean mo71625F1() {
        return mo71735u1() == 3;
    }

    /* renamed from: F3 */
    public void mo71626F3() {
        BogInputLayout bogInputLayout = this.f77882e;
        if (bogInputLayout != null && bogInputLayout.getEditText() != null) {
            this.f77882e.getEditText().setText(mo71611z1());
        }
    }

    /* renamed from: G1 */
    public boolean mo71549G1() {
        return mo71735u1() == 1 || mo71735u1() == 4 || mo71735u1() == 5;
    }

    /* renamed from: G3 */
    public void mo71627G3(boolean z) {
        mo71733r1().putString("TRANSFER_WIZARD_EXCHANGED", this.f77852v.f69245u.getText());
        mo71733r1().putBoolean("TRANSFER_WIZARD_EXCHANGED_BUY", !z);
    }

    /* renamed from: H3 */
    public void mo71628H3(boolean z) {
        mo71733r1().putBoolean("WIZARD_ACCOUNT_TEXT_INPUT_FRAGMENT", z);
    }

    /* renamed from: I2 */
    public String mo71629I2() {
        return mo71611z1().replaceAll("[^0-9.]", "");
    }

    /* renamed from: I3 */
    public void mo71630I3(boolean z) {
        mo71733r1().putBoolean("WIZARD_AMOUNT_IS_FRAGMENT", z);
    }

    /* renamed from: J1 */
    public boolean mo67196J1() {
        return mo71735u1() == 2;
    }

    /* renamed from: J2 */
    public int mo71631J2() {
        return mo71733r1().getInt("TRANSFER_WIZARD_RIGHT_IMAGE_RES_ID", -1);
    }

    /* renamed from: J3 */
    public void mo71632J3(boolean z) {
        this.f77819F = z;
    }

    /* renamed from: K2 */
    public ArrayList mo71633K2() {
        TransferBeneficiaryEvent transferBeneficiaryEvent = this.f77831R;
        if (transferBeneficiaryEvent != null) {
            return transferBeneficiaryEvent.beneficiaries;
        }
        return null;
    }

    /* renamed from: K3 */
    public void mo71634K3(int i) {
        mo71733r1().putInt("TRANSFER_WIZARD_RIGHT_IMAGE_RES_ID", i);
    }

    /* renamed from: L2 */
    public String mo71635L2(String str) {
        StringBuilder sb = new StringBuilder(str.replaceAll("-", ""));
        if (str.length() >= 2) {
            sb.insert(2, "-");
        }
        if (str.length() >= 6) {
            sb.insert(6, "-");
        }
        return sb.toString();
    }

    /* renamed from: L3 */
    public void mo71636L3(boolean z) {
        mo71733r1().putBoolean("TRANSFER_WIZARD_BANK_TRANSFER", z);
    }

    /* renamed from: N3 */
    public void mo71637N3(boolean z) {
        mo71733r1().putBoolean("TRANSFER_FORCE_BUDGET", z);
    }

    /* renamed from: O2 */
    public ArrayList mo71638O2() {
        return (ArrayList) C42035e.m122119a(mo71733r1().getParcelable("TRANSFER_WIZARD_STO_CREDIT_BILL_ACCOUNTS"));
    }

    /* renamed from: O3 */
    public void mo71639O3(ArrayList arrayList) {
        mo71733r1().putParcelable("TRANSFER_WIZARD_STO_CREDIT_BILL_ACCOUNTS", C42035e.m122121c(arrayList));
    }

    /* renamed from: P2 */
    public ArrayList mo71640P2() {
        return (ArrayList) C42035e.m122119a(mo71733r1().getParcelable("TRANSFER_WIZARD_STO_CREDIT_TYPES"));
    }

    /* renamed from: P3 */
    public void mo71641P3(ArrayList arrayList) {
        mo71733r1().putParcelable("TRANSFER_WIZARD_STO_CREDIT_TYPES", C42035e.m122121c(arrayList));
    }

    /* renamed from: Q3 */
    public void mo71642Q3(InputFilter inputFilter) {
        this.f77830Q = inputFilter;
    }

    /* renamed from: R2 */
    public ArrayList mo71643R2() {
        return (ArrayList) C42035e.m122119a(mo71733r1().getParcelable("TRANSFER_WIZARD_DISPATCH_TYPES"));
    }

    /* renamed from: R3 */
    public void mo71644R3(ArrayList arrayList) {
        mo71733r1().putParcelable("TRANSFER_WIZARD_DISPATCH_TYPES", C42035e.m122121c(arrayList));
    }

    /* renamed from: S0 */
    public void mo71576S0() {
        this.f77825L = false;
        m93132w4();
    }

    /* renamed from: S2 */
    public InputFilter mo71645S2() {
        return this.f77830Q;
    }

    /* renamed from: T2 */
    public String mo71646T2() {
        return mo71733r1().getString("TRANSFER_WIZARD_STO_MIND_CALENDAR_DATE");
    }

    /* renamed from: T3 */
    public void mo71647T3(C31354o oVar) {
        this.f77822I = oVar;
    }

    /* renamed from: U2 */
    public double mo71648U2() {
        return this.f77838Y;
    }

    /* renamed from: U3 */
    public void mo71649U3(boolean z) {
        mo71733r1().putBoolean("TRANSFER_WIZARD_IS_NEW_STO", z);
    }

    /* renamed from: V2 */
    public ArrayList mo71650V2() {
        return (ArrayList) C42035e.m122119a(mo71733r1().getParcelable("TRANSFER_WIZARD_NOMINATION_LIST"));
    }

    /* renamed from: V3 */
    public void mo71651V3(boolean z) {
        this.f77851l0 = z;
    }

    /* renamed from: W2 */
    public ArrayList mo71652W2() {
        return (ArrayList) C42035e.m122119a(mo71733r1().getParcelable("TRANSFER_WIZARD_STO_PERIOD_TYPES"));
    }

    /* renamed from: W3 */
    public void mo71653W3(String str) {
        mo71733r1().putString("TRANSFER_WIZARD_STO_MIND_CALENDAR_DATE", str);
    }

    /* renamed from: X2 */
    public int mo71654X2() {
        return mo71733r1().getInt("TRANSFER_RATE_FOCUS_INDEX", 0);
    }

    /* renamed from: X3 */
    public void mo71655X3(ArrayList arrayList) {
        mo71733r1().putParcelable("TRANSFER_WIZARD_NOMINATION_LIST", C42035e.m122121c(arrayList));
    }

    /* renamed from: Y2 */
    public String mo71656Y2() {
        return mo71733r1().getString("TRANSFER_WIZARD_EXCHANGED");
    }

    /* renamed from: Y3 */
    public void mo71657Y3(boolean z) {
        mo71733r1().putBoolean("TRANSFER_WIZARD_ONLY_CREDIT_CARDS", z);
    }

    /* renamed from: Z2 */
    public String mo71658Z2() {
        return this.f77855y.mo71043y().getCcy();
    }

    /* renamed from: Z3 */
    public void mo71659Z3(boolean z) {
        this.f77818E = z;
    }

    /* renamed from: a4 */
    public void mo71660a4(ArrayList arrayList) {
        mo71733r1().putParcelable("TRANSFER_WIZARD_STO_PERIOD_TYPES", C42035e.m122121c(arrayList));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public void mo71661b2(View view) {
        super.mo71661b2(view);
        this.f77885h = (LinearLayout) view.findViewById(C10322k.transfer_wizard_selector_recycler_layout);
        this.f77854x = (BogTextView) view.findViewById(C10322k.transfer_wizard_selector_details);
        BogEditText editText = this.f77852v.f69229e.getEditText();
        this.f77853w = editText;
        editText.setFilters(new InputFilter[]{new C32321n(10, 0)});
        InputFilter inputFilter = this.f77827N;
        if (inputFilter != null) {
            this.f77830Q = inputFilter;
        } else if (mo71675r3()) {
            this.f77830Q = this.f77828O;
        } else {
            this.f77830Q = this.f77829P;
        }
        this.f77882e.getEditText().setFilters(new InputFilter[]{this.f77830Q});
        this.f77852v.f69245u.getEditText().setFilters(new InputFilter[]{new C32321n(2, 2)});
        m93112l4();
    }

    /* renamed from: b4 */
    public void mo71662b4(boolean z) {
        this.f77841b0 = z;
    }

    /* renamed from: c4 */
    public void mo71663c4(int i) {
        mo71733r1().putInt("TRANSFER_RATE_FOCUS_INDEX", i);
    }

    /* renamed from: d4 */
    public void mo71664d4(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, String str4, BigDecimal bigDecimal3) {
        if (mo71675r3()) {
            C27357l4 l4Var = this.f77852v;
            if (l4Var != null) {
                l4Var.f69245u.post(new C31351l(bigDecimal, bigDecimal2, str3, str4, str, str2));
                return;
            }
            return;
        }
    }

    /* renamed from: f4 */
    public void mo71665f4(boolean z) {
        mo71733r1().putBoolean("TRANSFER_WIZARD_SRC_PICKER", z);
    }

    /* renamed from: g */
    public void mo71050g(int i, int i2, boolean z) {
        if (z) {
            mo71717U1(String.valueOf(this.f77855y.mo71044z()));
            AccountLov accountLov = ((AccountLov) m93103i3().get(i)).getSubAccounts().get(i2);
            if (mo71686y3()) {
                C35862c cVar = this.f77883f;
                if (cVar instanceof BankTransferWizardActivity) {
                    ((BankTransferWizardActivity) cVar).mo87876p5(accountLov.getCcy());
                    ((BankTransferWizardActivity) this.f77883f).mo87880u5();
                    ((BankTransferWizardActivity) this.f77883f).mo87850B5();
                } else if (cVar instanceof DomesticTransferWizardActivity) {
                    ((DomesticTransferWizardActivity) cVar).mo87907t4(accountLov.getCcy(), true);
                    ((DomesticTransferWizardActivity) this.f77883f).mo87909x4();
                }
            }
            if (mo71684x3()) {
                C35862c cVar2 = this.f77883f;
                if (cVar2 instanceof DomesticTransferWizardActivity) {
                    ((DomesticTransferWizardActivity) cVar2).mo87891T3();
                }
            }
            C35862c cVar3 = this.f77883f;
            if (cVar3 instanceof BankTransferWizardActivity) {
                ((BankTransferWizardActivity) cVar3).mo87881v5(true);
            }
            C35862c cVar4 = this.f77883f;
            if (cVar4 instanceof DomesticTransferWizardActivity) {
                ((DomesticTransferWizardActivity) cVar4).mo87905r4(true, true);
                ((DomesticTransferWizardActivity) this.f77883f).mo87897c4();
            } else if (cVar4 instanceof BankTransferWizardActivity) {
                ((BankTransferWizardActivity) cVar4).mo87874o5(true, true);
            }
            this.f77883f.mo87965p3(true);
        } else {
            if (mo71686y3()) {
                this.f77883f.mo87955L2().setLeftColor(C32335t0.m95359d(getContext(), true), true, true);
                this.f77883f.mo87955L2().setLeftFrameState(11);
            } else {
                C35862c cVar5 = this.f77883f;
                if (cVar5 instanceof DomesticTransferWizardActivity) {
                    cVar5.mo87955L2().setRightColor(C32335t0.m95359d(getContext(), true), true, true);
                    this.f77883f.mo87955L2().setRightFrameState(11);
                }
            }
            this.f77883f.mo87955L2().setTextColorIds(C10318g.f28647k1, mo71686y3());
            mo71717U1("");
            this.f77883f.mo87965p3(false);
        }
        C35862c cVar6 = this.f77883f;
        if (cVar6 instanceof DomesticTransferWizardActivity) {
            ((DomesticTransferWizardActivity) cVar6).mo87904q4();
        }
        if (getActivity() != null && (getActivity() instanceof C35862c)) {
            ((C35862c) getActivity()).mo87860S2();
        }
    }

    /* renamed from: g4 */
    public void mo71666g4(TransferForm.TRANSFERTYPE transfertype) {
        this.f77850k0 = transfertype;
    }

    /* renamed from: i1 */
    public void mo71667i1(ArrayList arrayList) {
        if (mo71678t3()) {
            String z1 = mo71611z1();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C31355y yVar = (C31355y) it.next();
                if (yVar instanceof C31338x) {
                    C31338x xVar = (C31338x) yVar;
                    if (xVar.mo71680u3() && C32359z0.m95571h0(xVar.mo71611z1(), z1)) {
                        mo71717U1("");
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: l3 */
    public void mo71668l3(boolean z) {
        BogInputLayout bogInputLayout;
        if (!this.f77882e.getText().isEmpty() || !this.f77852v.f69245u.getText().isEmpty()) {
            DomesticTransferWizardActivity domesticTransferWizardActivity = (DomesticTransferWizardActivity) this.f77883f;
            String str = this.f77838Y + "";
            if (z) {
                bogInputLayout = this.f77882e;
            } else {
                bogInputLayout = this.f77852v.f69245u;
            }
            domesticTransferWizardActivity.mo87898d4(str, m93092M2(bogInputLayout.getText()), z);
        }
    }

    /* renamed from: n3 */
    public boolean mo71669n3(boolean z) {
        String z1 = mo71611z1();
        C31354o oVar = this.f77822I;
        if (oVar != null) {
            return oVar.mo71704a(z1, z);
        }
        return !TextUtils.isEmpty(z1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public void mo71558o1() {
        super.mo71558o1();
        if (mo71735u1() == 2 && !this.f77815B) {
            mo71726e2();
        }
    }

    /* renamed from: o3 */
    public void mo71670o3() {
        C27357l4 l4Var = this.f77852v;
        if (l4Var != null) {
            l4Var.f69234j.setVisibility(8);
        }
    }

    @C41452l
    public void onAccountsLovEvent(AccountLovEvent accountLovEvent) {
        AccountLovEvent copy = accountLovEvent.copy();
        if (copy.getState() == 20) {
            if (mo71681v3()) {
                ArrayList<AccountLov> dst = copy.getAccountLovContainer().getDomestic().getDst();
                ArrayList<AccountLov> arrayList = new ArrayList<>();
                Iterator<AccountLov> it = dst.iterator();
                while (it.hasNext()) {
                    AccountLov next = it.next();
                    if (next.isCreditCard()) {
                        arrayList.add(next);
                    }
                }
                copy.getAccountLovContainer().getDomestic().dst = arrayList;
                copy.getAccountLovContainer().getConversion().dst = arrayList;
            }
            this.f77837X = copy;
            if (mo71735u1() == 0) {
                String z1 = mo71611z1();
                if (!TextUtils.isEmpty(z1) && TextUtils.isDigitsOnly(z1)) {
                    C31971a c = C31972b.m94378c(copy.getAccountLovContainer(), Long.parseLong(z1), m93106j3(), mo71686y3());
                    this.f77855y.mo71041J(c.mo72461d());
                    this.f77855y.mo71040I(c.mo72459b());
                }
            }
            this.f77855y.mo71035D(m93103i3());
            this.f77852v.f69233i.setAdapter(this.f77855y);
            this.f77855y.mo71034C();
            m93091H2();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        this.f77855y = new C30865a(this.f77852v.f69233i, this.mClient);
        if (getActivity() instanceof DomesticTransferWizardActivity) {
            if (mo71686y3()) {
                this.f77855y.mo71038G(((DomesticTransferWizardActivity) getActivity()).mo87899e4());
                this.f77855y.mo71039H("");
            } else {
                this.f77855y.mo71038G(((DomesticTransferWizardActivity) getActivity()).mo87895a4());
                this.f77855y.mo71039H(((DomesticTransferWizardActivity) getActivity()).mo87896b4());
            }
        }
        this.f77855y.mo71037F(this);
        C35862c cVar = this.f77883f;
        if ((cVar instanceof DomesticTransferWizardActivity) && ((DomesticTransferWizardActivity) cVar).mo87902m4() && mo71675r3()) {
            ((DomesticTransferWizardActivity) this.f77883f).mo87894Z3();
        }
        if (mo71675r3()) {
            try {
                C35862c cVar2 = this.f77883f;
                if (Double.parseDouble(m93100h3(mo71611z1())) > Utils.DOUBLE_EPSILON) {
                    z = true;
                } else {
                    z = false;
                }
                cVar2.mo87965p3(z);
            } catch (Exception unused) {
                this.f77883f.mo87965p3(false);
            }
        }
        if (this.f77822I != null) {
            this.f77883f.mo87965p3(mo71669n3(true));
        }
        m93125r4();
    }

    @C41452l
    public void onBeneficieriesEvent(TransferBeneficiaryEvent transferBeneficiaryEvent) {
        if (transferBeneficiaryEvent != this.f77831R) {
            this.f77831R = transferBeneficiaryEvent;
            if (transferBeneficiaryEvent.getState() == 20 && this.f77833T) {
                m93129u4();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27357l4 d = C27357l4.m84738d(layoutInflater, viewGroup, false);
        this.f77852v = d;
        return d.mo3946b();
    }

    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.mEventBus, this);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77852v = null;
    }

    public void onPause() {
        super.onPause();
        this.f77842c0 = true;
        this.mEventBus.mo96186s(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 9898 && C32303f.m95190a(iArr)) {
            this.f77882e.setOriginalInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            if (!this.f77826M.get()) {
                m93121p3();
                this.f77826M.set(true);
            }
        }
    }

    public void onResume() {
        super.onResume();
        C32343x.m95423W0(this.mEventBus, this);
        if (mo71735u1() == 0) {
            this.mClient.requestAccountLovs();
        }
        if (this.f77833T) {
            this.mClient.requestBeneficiaries(false);
        }
    }

    public void onStart() {
        View.OnClickListener onClickListener;
        super.onStart();
        if (mo71625F1() && TextUtils.isEmpty(mo71611z1()) && (onClickListener = this.f77843d0) != null) {
            onClickListener.onClick((View) null);
        }
        if (this.f77850k0 == TransferForm.TRANSFERTYPE.PHONE) {
            this.f77883f.mo87970x3(true);
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f77850k0 == TransferForm.TRANSFERTYPE.PHONE) {
            this.f77883f.mo87970x3(false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f77853w.setText("");
        if (mo71735u1() == 2 && mo71607t1().getEditText() != null) {
            if (this.f77888k != null) {
                mo71607t1().getEditText().setNonSelectableString(this.f77888k);
            }
            this.f77882e.getEditText().removeTextChangedListener(this.f77846g0);
        }
        if (mo71735u1() != 0) {
            mo71730n1();
        }
        mo71607t1().getEditText().post(new C31340b());
        if (this.f77850k0 == TransferForm.TRANSFERTYPE.PHONE) {
            m93110k4();
        }
        m93125r4();
    }

    /* renamed from: q3 */
    public boolean mo71673q3() {
        return mo71733r1().getBoolean("WIZARD_ACCOUNT_TEXT_INPUT_FRAGMENT", false);
    }

    /* renamed from: q4 */
    public void mo71674q4(boolean z, String str, String str2) {
        if (!z || this.f77882e.getText().isEmpty()) {
            m93094S3(str);
        }
        if (z || this.f77852v.f69245u.getText().isEmpty()) {
            m93096e4(str2);
        }
        mo71627G3(z);
    }

    /* renamed from: r3 */
    public boolean mo71675r3() {
        return mo71733r1().getBoolean("WIZARD_AMOUNT_IS_FRAGMENT", false);
    }

    /* renamed from: s3 */
    public boolean mo71676s3() {
        return mo71733r1().getBoolean("TRANSFER_FORCE_BUDGET", false);
    }

    /* renamed from: s4 */
    public void mo71677s4(ArrayList arrayList) {
        this.f77816C = arrayList;
        if (this.f77852v != null) {
            C30886g gVar = new C30886g(arrayList);
            this.f77852v.f69234j.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f77852v.f69234j.setAdapter(gVar);
            this.f77852v.f69234j.setVisibility(0);
        }
    }

    /* renamed from: t3 */
    public boolean mo71678t3() {
        return this.f77821H;
    }

    /* renamed from: t4 */
    public void mo71679t4(ArrayList arrayList, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        this.f77817D = arrayList;
        if (this.f77852v != null) {
            ArrayList arrayList2 = new ArrayList();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Beneficiary beneficiary = (Beneficiary) it.next();
                    if (str == null || (((str2 = beneficiary.beneficiaryName) != null && str2.toLowerCase().contains(str.toLowerCase())) || (((str3 = beneficiary.benefName) != null && str3.toLowerCase().contains(str.toLowerCase())) || (((str4 = beneficiary.benefNameInt) != null && str4.toLowerCase().contains(str.toLowerCase())) || ((str5 = beneficiary.benefAcctNo) != null && str5.toLowerCase().contains(str.toLowerCase())))))) {
                        arrayList2.add(beneficiary);
                    }
                }
            }
            C30886g gVar = new C30886g(arrayList2, str, new C31347i());
            this.f77852v.f69234j.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f77852v.f69234j.setAdapter(gVar);
            this.f77852v.f69234j.setVisibility(0);
            this.f77852v.f69234j.mo5363n(new C31348j());
        }
    }

    /* renamed from: u3 */
    public boolean mo71680u3() {
        return this.f77820G;
    }

    /* renamed from: v3 */
    public boolean mo71681v3() {
        return mo71733r1().getBoolean("TRANSFER_WIZARD_ONLY_CREDIT_CARDS", false);
    }

    /* renamed from: v4 */
    public void mo71682v4(String str) {
        if (m93109k3() == TransferForm.TRANSFERTYPE.PIN) {
            str = "";
        }
        if (m93109k3() == TransferForm.TRANSFERTYPE.PHONE) {
            mo71670o3();
            return;
        }
        this.f77833T = true;
        this.f77832S = str;
        TransferBeneficiaryEvent transferBeneficiaryEvent = this.f77831R;
        if (transferBeneficiaryEvent == null || transferBeneficiaryEvent.beneficiaries == null) {
            Client client = this.mClient;
            if (client != null) {
                client.requestBeneficiaries(false);
                return;
            }
            return;
        }
        m93129u4();
    }

    /* renamed from: w3 */
    public boolean mo71683w3() {
        return this.f77841b0;
    }

    /* renamed from: x3 */
    public boolean mo71684x3() {
        return mo71733r1().getBoolean("TRANSFER_WIZARD_IS_NEW_STO", false);
    }

    /* renamed from: x4 */
    public void mo71685x4() {
        BogInputLayout bogInputLayout = this.f77882e;
        if (bogInputLayout != null) {
            bogInputLayout.loadRightPhotoDrawable(mo71631J2());
        }
    }

    /* renamed from: y3 */
    public boolean mo71686y3() {
        return mo71733r1().getBoolean("TRANSFER_WIZARD_SRC_PICKER", false);
    }

    /* renamed from: z1 */
    public String mo71611z1() {
        String z1 = super.mo71611z1();
        if (!mo71675r3()) {
            return z1;
        }
        return m93092M2(z1);
    }
}
